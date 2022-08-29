package com.abhi.naukari.service;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.naukari.dto.UserProfileDto;
import com.abhi.naukari.entity.UserProfile;
import com.abhi.naukari.repository.UserProfileRepository;

@Service
public class UserProfileServicImpl  implements UserProfileService{

	 @Autowired
	 private UserProfileRepository userProfileRepository;
	  
	 @Autowired
	 private ModelMapper modelMapper;
	 
	
	@Override
	public Map<String, Object> saveUserProfile(UserProfileDto userProfileDto) {
		Map<String, Object> map=new HashMap<>();
		UserProfile newUserProfile = new UserProfile();
		modelMapper.map(userProfileDto, newUserProfile);
		userProfileRepository.save(newUserProfile);
		map.put("USER_PROFILE", newUserProfile);
		return map;
	}

}
