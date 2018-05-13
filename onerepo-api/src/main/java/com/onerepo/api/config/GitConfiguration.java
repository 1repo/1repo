package com.onerepo.api.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.sshd.git.pack.GitPackCommandFactory;
import org.apache.sshd.server.SshServer;
import org.apache.sshd.server.auth.pubkey.PublickeyAuthenticator;
import org.apache.sshd.server.keyprovider.SimpleGeneratorHostKeyProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;
import java.io.IOException;

@Configuration
@Slf4j
public class GitConfiguration {

  private SshServer sshd;

  @Autowired
  private PublickeyAuthenticator publickeyAuthenticator;

  @Value("${1repo.git.dir}")
  private String gitDir;

  @PostConstruct
  public void startSshServer() throws IOException {
    File gitDirectory =  new File(this.gitDir);
    if (!gitDirectory.exists()) {
      gitDirectory.mkdirs();
    }
    log.info("Git repositories root directory: {}", gitDir);

    sshd = SshServer.setUpDefaultServer();
    sshd.setPort(1234);
    sshd.setKeyPairProvider(new SimpleGeneratorHostKeyProvider(new File("git-ssh.ser")));
    sshd.setPublickeyAuthenticator(publickeyAuthenticator);
    sshd.setCommandFactory(new GitPackCommandFactory(this.gitDir));
    sshd.start();
  }

  @PreDestroy
  public void stopSshServer() throws IOException {
    sshd.stop();
  }
}
