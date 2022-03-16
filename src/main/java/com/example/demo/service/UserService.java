package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Role;
import com.example.demo.domain.User;

@Service
public interface UserService {

	public User saveUser(User user);
	public Role saveRole(Role role);
	public void addRoleToUser(String username, String roleName);
	public User getUser(String username);
	public List<User> getUsers();
}
