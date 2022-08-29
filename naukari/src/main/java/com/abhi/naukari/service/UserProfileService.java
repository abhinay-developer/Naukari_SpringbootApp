package com.abhi.naukari.service;

import java.util.Map;

import com.abhi.naukari.dto.UserProfileDto;

public interface UserProfileService {

	public Map<String,Object>  saveUserProfile(UserProfileDto userProfileDto);
}
