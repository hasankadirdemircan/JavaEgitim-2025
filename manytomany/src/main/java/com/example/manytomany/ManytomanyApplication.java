package com.example.manytomany;

import com.example.manytomany.model.Course;
import com.example.manytomany.model.Student;
import com.example.manytomany.repository.CourseRepository;
import com.example.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@SpringBootApplication
public class ManytomanyApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManytomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//insert();
	//	findStudentsCourse();
		insert2();
	}

	public void findStudentsCourse() {
		Optional<Student> student = studentRepository.findById(2L);
		student.get().getCourses();
	}


	public void insert() {
		Set<Course> courseSet = new HashSet<>();
		Course course1 = new Course();
		course1.setTitle("fizik");

		Course course2 = new Course();
		course2.setTitle("kimya");

		Course course3 = new Course();
		course3.setTitle("matematik");

		courseSet.add(course1);
		courseSet.add(course2);
		courseSet.add(course3);

		Student student = new Student();
		student.setName("hasan");
		student.setCourses(courseSet);

		studentRepository.save(student);
	}

	public void insert2() {
		Set<Course> courseSet = new HashSet<>();
		Course course1 = new Course();
		course1.setId(1L);

		Course course2 = new Course();
		course2.setId(2L);

		Course course3 = new Course();
		course3.setId(3L);

		courseSet.add(course1);
		courseSet.add(course2);
		courseSet.add(course3);

		Student student = new Student();
		student.setName("galip");
		student.setCourses(courseSet);

		studentRepository.save(student);
	}
}
