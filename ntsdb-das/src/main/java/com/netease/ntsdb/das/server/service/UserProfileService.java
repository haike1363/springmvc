package com.netease.ntsdb.das.server.service;

import com.netease.ntsdb.das.server.entity.UserProfile;

import java.util.List;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
