package com.victor.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.workshopmongo.domain.User;
import com.victor.workshopmongo.repository.UserRepository;

@Service
public class UserSevice {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}

}
