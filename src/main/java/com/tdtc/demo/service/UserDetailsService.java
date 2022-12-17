package com.tdtc.demo.service;

import java.util.List;

import com.tdtc.demo.model.UserDetails;

public interface UserDetailsService {
	List<UserDetails> getUsers();
	UserDetails findUserById(String userId);
	int delUserById(int userId);
	int insertUser(UserDetails user);
	int updateUser(String userName, int userId);
}
