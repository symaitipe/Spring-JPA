package com.sahan.spring_jpa_example;

import com.sahan.spring_jpa_example.model.Student;
import com.sahan.spring_jpa_example.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaExampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJpaExampleApplication.class, args);
		 Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		StudentRepo repo = context.getBean(StudentRepo.class);

		s1.setRollNo(104);
		s1.setName("Navin");
		s1.setMarks(78);

		s2.setRollNo(105);
		s2.setName("Amin");
		s2.setMarks(88);

		s3.setRollNo(106);
		s3.setName("Gavin");
		s3.setMarks(85);

		repo.save(s1);

	}


}
