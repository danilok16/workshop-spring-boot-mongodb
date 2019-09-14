package com.projeto.workshopmongo.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.projeto.workshopmongo.user.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
