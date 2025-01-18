package com.example.spring_data.repository;

import com.example.spring_data.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {

    @Query(value = "select c.name from course c inner join student_course sc ON sc.course_id  = c.id AND sc.student_id = :studentId", nativeQuery = true)
    Optional<String> findCourseNameByStudentId(@Param("studentId") Long studentId);

    //JPQL
    @Query(value = "select c.name from Course c inner join StudentCourse sc ON sc.courseId  = c.id AND sc.studentId = :studentId")
    Optional<String> findCourseNameByStudentIdJPQL(@Param("studentId") Long studentId);
}
