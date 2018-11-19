package com.netease.ntsdb.das.server.dao;

import com.netease.ntsdb.das.server.entity.User;

import java.util.List;


public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
	void save(User user);
	
	void deleteBySSO(String sso);
	
	List<User> findAllUsers();

}

