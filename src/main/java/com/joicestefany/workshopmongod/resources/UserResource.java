package com.joicestefany.workshopmongod.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joicestefany.workshopmongod.domian.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User joice = new User("1", "joice", "joice@gmail.com");
		User italo = new User("2", "italo", "italo@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(joice, italo));
		return ResponseEntity.ok().body(list);
	}
}
