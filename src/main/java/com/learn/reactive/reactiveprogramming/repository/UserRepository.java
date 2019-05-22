package com.learn.reactive.reactiveprogramming.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.learn.reactive.reactiveprogramming.model.User;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String>{

}
