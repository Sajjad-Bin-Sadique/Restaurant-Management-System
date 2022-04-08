package com.rms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.entity.SignUp;
import com.rms.repository.SignUpRepository;




@Service
public class SignUpService {
	
	@Autowired
	private SignUpRepository repository;
	
	 public SignUp saveSignUp(SignUp signup) {
	        return repository.save(signup);
	    }


}
