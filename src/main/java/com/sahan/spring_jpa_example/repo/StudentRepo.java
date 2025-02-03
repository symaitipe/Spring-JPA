package com.sahan.spring_jpa_example.repo;

import com.sahan.spring_jpa_example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {


    @Query("select s from Student s where s.name=?1")
    List<Student> getByName(String name);

    @Query("select s from Student s where s.name=:name AND s.marks=:marks")
    Optional <Student> getByNameAndMarks(@Param("name") String name, @Param("marks") int marks);
}
