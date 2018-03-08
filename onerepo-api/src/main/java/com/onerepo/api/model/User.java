package com.onerepo.api.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="users")
@Data
@SequenceGenerator(name = "UserSequence", sequenceName = "users_seq")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UserSequence")
  private Long id;
  @Column(nullable = false)
  private String username;
  @Column(nullable = false)
  private String name;
  @Column(nullable = false)
  private String email;
  @Column(nullable = false)
  private String passwordHashed;
  private String token;
  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private UserStatus status;
}
