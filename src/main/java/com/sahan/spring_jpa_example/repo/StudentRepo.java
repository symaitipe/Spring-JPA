package com.sahan.spring_jpa_example.repo;

import com.sahan.spring_jpa_example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {


	
}
