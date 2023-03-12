package com.sample.user.service.service;

import java.util.List;
import java.util.Optional;

import com.sample.user.service.bean.User;


public interface IUserService {
	List<User> getUsers();
	
	Optional<User> getUserById(Long id);
	
	void insertOrUpdateUser(User user);
	
	void deleteUserById(Long id);
}
