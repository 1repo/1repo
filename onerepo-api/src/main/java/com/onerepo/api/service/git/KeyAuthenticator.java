package com.onerepo.api.service.git;

import lombok.extern.slf4j.Slf4j;
import org.apache.sshd.server.auth.pubkey.PublickeyAuthenticator;
import org.apache.sshd.server.session.ServerSession;
import org.springframework.stereotype.Service;

import java.security.PublicKey;

@Service
@Slf4j
public class KeyAuthenticator implements PublickeyAuthenticator {
  @Override
  public boolean authenticate(String username, PublicKey key, ServerSession session) {
    log.info("AUTHENTICATE {}", username);
    log.info("PUBKEY {}", key);
    return true;
  }
}
