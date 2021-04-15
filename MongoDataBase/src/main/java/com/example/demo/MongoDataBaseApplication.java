package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class MongoDataBaseApplication implements CommandLineRunner
{
	@Autowired
CustomerRepository cus;
	 
	public static void main(String[] args) {
		SpringApplication.run(MongoDataBaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s1=new Student(1,"Kuchu","Sisindri","7981033992");
		Student s2=new Student(2,"Lakka","Mohan","7981033992");
		Student s3=new Student(3,"Katam","Srinivas","7981033992");
		Student s4=new Student(4,"Malasani","Akhil","7981033992");
		cus.save(s1);
		cus.save(s2);
		cus.save(s3);
		cus.save(s4);
		List<Student> student=cus.findAll();
		for(Student stu:student)
		{
			System.out.println(stu.toString());
		}
	}

}
