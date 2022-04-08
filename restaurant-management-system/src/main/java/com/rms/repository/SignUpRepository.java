package com.rms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rms.entity.SignUp;



public interface SignUpRepository extends JpaRepository<SignUp,Integer>{
	SignUp findByName(String name);


}
