package com.onerepo.api.service;

import com.onerepo.api.bean.RegisterBean;
import com.onerepo.api.bean.UserBean;
import com.onerepo.api.bean.UserMapper;
import com.onerepo.api.model.User;
import com.onerepo.api.dao.UserDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

  private UserDAO userDAO;

  private UserMapper userMapper;

  public UserBean register(RegisterBean registerBean) {
    User user = userMapper.fromRegisterBean(registerBean);
    userDAO.save(user);
    UserBean userBean = userMapper.toUserBean(user);
    return userBean;
  }
}
