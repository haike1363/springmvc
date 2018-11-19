package com.netease.ntsdb.das.server.converter;

import com.netease.ntsdb.das.server.entity.UserProfile;
import com.netease.ntsdb.das.server.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * A converter class used in views to map id's to actual userProfile objects.
 */
@Component
public class RoleToUserProfileConverter implements Converter<Object, UserProfile> {

	@Autowired
	UserProfileService userProfileService;

	/**
	 * Gets UserProfile by Id
	 * @see org.springframework.core.convert.converter.Converter#convert(Object)
	 */
	public UserProfile convert(Object element) {
		Integer id = Integer.parseInt((String)element);
		UserProfile profile= userProfileService.findById(id);
		System.out.println("Profile : "+profile);
		return profile;
	}
	
}