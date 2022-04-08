package com.rms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.entity.SignUp;
import com.rms.service.SignUpService;



@RestController
public class SignUpController {
	

	@Autowired
    private SignUpService service;
	
	  @PostMapping("/addSignup")
	    public SignUp addSignUp(@RequestBody SignUp signup) {
	        return service.saveSignUp(signup);
	    }

}
