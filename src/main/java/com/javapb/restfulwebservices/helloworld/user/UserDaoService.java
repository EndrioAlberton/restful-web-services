package com.javapb.restfulwebservices.helloworld.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"Endrio",LocalDate.now().minusYears(20)));
		users.add(new User(2,"Lucas",LocalDate.now().minusYears(35)));
		users.add(new User(1,"João",LocalDate.now().minusYears(72)));
	}

	public List<User>findAll(){
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		return users.stream().filter(predicate).findFirst().get();
	}

}
