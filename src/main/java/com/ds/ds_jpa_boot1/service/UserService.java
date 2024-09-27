package com.ds.ds_jpa_boot1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.ds_jpa_boot1.entity.User;
import com.ds.ds_jpa_boot1.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

    
    public void saveUser(User user) {
    	 userRepository.save(user);
        
    }

    
}
