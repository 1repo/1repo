package com.onerepo.api.dao;

import com.onerepo.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Long> {
}
