package com.onerepo.api.bean;

import com.onerepo.api.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring")
public interface UserMapper {

  @Mapping(source = "password", target = "passwordHash")
  User fromRegisterBean(RegisterBean registerBean);

  UserBean toUserBean(User user);
}
