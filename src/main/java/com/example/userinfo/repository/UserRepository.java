package com.example.userinfo.repository;

import com.example.userinfo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  User findByUserId(Integer userId);
  User findByCpf(String cpf);
}