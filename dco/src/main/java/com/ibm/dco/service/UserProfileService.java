package com.ibm.dco.service;

import org.springframework.stereotype.Service;


import com.ibm.dco.entity.UserProfileEntity;

@Service
public interface UserProfileService {
	
	public String verifyAndSaveCustData(UserProfileEntity userProfileData);

	public boolean validateUserToken( int token,String identityData,String tokenType) ;
	}