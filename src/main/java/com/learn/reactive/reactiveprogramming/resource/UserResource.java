package com.learn.reactive.reactiveprogramming.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.reactive.reactiveprogramming.model.User;
import com.learn.reactive.reactiveprogramming.repository.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/getAll")
	public Flux<User> getAllUser(){
		return userRepository.findAll();
	}
	
	@PostMapping("/saveUser")
	public Mono<User> saveUser(@RequestBody User user){
		return userRepository.save(user);
	}
	
	@GetMapping("getById/{id}")
	public Mono<User> getById(@PathVariable("id") String id){
		return userRepository.findById(id);
	}
}
