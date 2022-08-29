package com.abhi.naukari.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.naukari.dto.UserProfileDto;
import com.abhi.naukari.service.UserProfileService;

@RestController
@RequestMapping("api/v1/users")
public class UserProfileController {
	
	@Autowired
	private UserProfileService userProfileService;
	
	@PostMapping
	public Map<String,Object> saveUserProfile(UserProfileDto userProfileDto) {
         return userProfileService.saveUserProfile(userProfileDto);		
	}

}
