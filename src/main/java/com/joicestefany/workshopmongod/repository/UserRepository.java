package com.joicestefany.workshopmongod.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joicestefany.workshopmongod.domian.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}
