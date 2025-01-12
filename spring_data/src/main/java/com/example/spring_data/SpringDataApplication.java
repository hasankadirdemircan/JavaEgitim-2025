package com.example.spring_data;

import com.example.spring_data.model.Student;
import com.example.spring_data.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("test");
		//save();
		//select();
		//selectById();
		//update();
		//selectWithJPQLAndNative();
		//updateWithJPQL();
		updateWithNative();
	}

	public void updateWithNative() {
		int affectedRow = studentRepository.updateAgeAndNameNative(126L, "ABC", 100);
		System.out.println("affectedRow : " + affectedRow);
	}
	public void selectWithJPQLAndNative() {
		List<Student> jpql = studentRepository.findStudentsOlderThan(25);
		List<Student> nativeQuery = studentRepository.findStudentsOlderThanNative(25);
		System.out.println("jpql : " + jpql);
		System.out.println("nativeQuery : " + nativeQuery);
	}

	public void updateWithJPQL() {
		int affectedRow = studentRepository.updateAgeAndName(126L, "Jimmy", 80);
		System.out.println("affectedRow : " + affectedRow);
	}
	public void update() {
		Student student = new Student();
		student.setStudentNo(126L);
		student.setName("asdadsa");
		student.setLastName("dsdasdasdasdeeee");
		student.setAge(24);

		studentRepository.save(student);
	}

	public void selectById() {
		Optional<Student> student = studentRepository.findById(123L);
		System.out.println(student.orElse(new Student()));
	}

	public void select() {
		List<Student> studentList = studentRepository.findAll();
		System.out.println(studentList);
	}

	public void save() {
		Student student = new Student();
		student.setStudentNo(125L);
		student.setName("kadir");
		student.setLastName("Demircan");
		student.setAge(39);

		studentRepository.save(student);
	}
}
