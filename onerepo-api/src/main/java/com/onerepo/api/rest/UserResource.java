package com.onerepo.api.rest;

import com.onerepo.api.bean.RegisterBean;
import com.onerepo.api.bean.UserBean;
import com.onerepo.api.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserResource {

  private RegistrationService registrationService;

  @PostMapping("/register")
  public ResponseEntity<UserBean> register(@RequestBody RegisterBean registerBean) {
    UserBean userBean = registrationService.register(registerBean);
    return new ResponseEntity<>(userBean, HttpStatus.CREATED);
  }
}
