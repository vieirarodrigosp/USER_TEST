package com.example.userinfo.service;

import com.example.userinfo.dto.UserDTO;

public interface UserService {
  UserDTO findById(Integer userId);
  UserDTO findByCpf(String cpf);
}
