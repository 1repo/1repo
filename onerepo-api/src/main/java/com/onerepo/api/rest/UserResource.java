package com.onerepo.api.rest;

import com.onerepo.api.bean.RegisterBean;
import com.onerepo.api.bean.UserBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {

  @PostMapping("/register")
  public ResponseEntity<UserBean> register(@RequestBody RegisterBean registerBean) {
    return null;
  }
}
