package com.example.one_to_one;

import com.example.one_to_one.model.Address;
import com.example.one_to_one.model.Person;
import com.example.one_to_one.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	save();
		select();
	}

	public void save() {
		Person person = new Person();
		Address address = new Address();
		address.setCity("ankara");
		address.setStreet("etimesgut");

		person.setName("hasan");
		person.setAddress(address);
		Person savedPerson = personRepository.save(person);
		System.out.println(savedPerson);
	}

	public void select() {
		Optional<Person> person = personRepository.findById(2L);
		person.ifPresent(System.out::println);
		System.out.println(person.get().getAddress().getStreet());
		System.out.println(person.get().getAddress().getCity());
	}
}
