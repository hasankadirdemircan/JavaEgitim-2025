package com.example.spring_data.repository;

import com.example.spring_data.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
public interface StudentRepository extends JpaRepository<Student, Long> {

    //JPQL
    @Query("SELECT s FROM Student s WHERE s.age > :age")
    List<Student> findStudentsOlderThan(@Param("age") int age);

    //NATIVE
    @Query(value = "SELECT * FROM Student s WHERE s.age > :age", nativeQuery = true)
    List<Student> findStudentsOlderThanNative(@Param("age") int age);

    //JPQL
    @Modifying
    @Transactional
    @Query("UPDATE Student SET name = :name , age = :age WHERE studentNo = :studentNo")
    int updateAgeAndName(@Param("studentNo") Long studentNo,
                                       @Param("name") String name,
                                       @Param("age") int age);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Student SET name = :name , age = :age WHERE student_no = :studentNo", nativeQuery = true)
    int updateAgeAndNameNative(@Param("studentNo") Long studentNo,
                         @Param("name") String name,
                         @Param("age") int age);
}
