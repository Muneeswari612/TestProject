package com.springboot.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.person.Person;

@RestController
public class PersonController {

	@RequestMapping("hi")
	public List<Person> hello() {
		
		List<Person> person = new ArrayList<>();
		
		Person p1 = new Person();
		p1.setId(31);
		p1.setName("Muneeswari Pallamala");
		p1.setDecription("Java");
		
		Person p2 = new Person();

		p2.setId(46);
		p2.setName("Surendra Aderu");
		p2.setDecription("Microsoft Azure");
		
		person.add(p1);
		person.add(p2);

		return person;
		
	}
}
