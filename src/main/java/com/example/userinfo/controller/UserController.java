package com.example.userinfo.controller;

import com.example.userinfo.dto.UserDTO;
import com.example.userinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/users")
public class UserController {
  @Autowired
  private UserService userService;
//  @GetMapping(value = "/{userId}", produces = APPLICATION_JSON_VALUE)
//  @ResponseStatus(HttpStatus.OK)
//  public UserDTO findById(@PathVariable Integer userId) {
//    return userService.findById(userId);
//  }
  @GetMapping(value = "/{cpf}", produces = APPLICATION_JSON_VALUE)
  @ResponseStatus(HttpStatus.OK)
  public UserDTO findById(@PathVariable String cpf) {
    return userService.findByCpf(cpf);
  }
}
