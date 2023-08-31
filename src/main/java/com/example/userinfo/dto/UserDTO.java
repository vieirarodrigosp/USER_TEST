package com.example.userinfo.dto;

import com.example.userinfo.entity.User;
import com.example.userinfo.enums.StatusEnum;
import com.opengamma.strata.collect.ArgChecker;
import org.springframework.beans.BeanUtils;

public class UserDTO {
  private Integer userId;
  private String cpf;
  private StatusEnum status;

  public UserDTO() { }

  public UserDTO(Integer userId, String cpf, StatusEnum status) {
    this.userId = userId;
    this.cpf = cpf;
    this.status = status;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public StatusEnum getStatus() { return status; }

  public void setStatus(StatusEnum status) { this.status = status; }

  public static UserDTO of(User user) {
    ArgChecker.notNull(user, "user");
    UserDTO dto = new UserDTO();
    BeanUtils.copyProperties(user, dto);
    dto.setStatus(StatusEnum.decode(user.getStatus()));
    return dto;
  }
}