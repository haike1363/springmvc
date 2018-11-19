package com.netease.ntsdb.das.server.dao;

import com.netease.ntsdb.das.server.entity.*;
import java.util.List;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
