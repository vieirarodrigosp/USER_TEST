package com.example.userinfo.service.impl;

import com.example.userinfo.dto.UserDTO;
import com.example.userinfo.enums.StatusEnum;
import com.example.userinfo.exception.UserException;
import com.example.userinfo.repository.UserRepository;
import com.example.userinfo.service.UserService;
import com.google.common.primitives.Booleans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserRepository userRepository;
  public UserDTO findById(Integer userId) {
    return UserDTO.of(userRepository.findByUserId(userId));
  }
  public UserDTO findByCpf(String cpf) {
    var result = userRepository.findByCpf(cpf);
    if(result!=null) {
      result.setCpf(null);
      result.setUserId(null);
      return UserDTO.of(result);
    }
    throw new UserException("User not found");
  }
}