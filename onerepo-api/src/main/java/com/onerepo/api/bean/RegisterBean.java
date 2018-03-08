package com.onerepo.api.bean;

import lombok.Data;

@Data
public class RegisterBean {
  private String username;
  private String name;
  private String email;
  private String password;
  private String passwordRepeat;
}
