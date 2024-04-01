package com.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Repository
public class StudentDao {
@Autowired

StudentRepository studrepo;
public String add(List<Student>a) {
	 studrepo.saveAll(a);
	 return "saved all";
}
public List<Student> get1() {
	return studrepo.findAll();
}
public String get3(int a) {
	studrepo.deleteById(a);
	return "hello";
	}
public String adder( List<Student>a) {
	 studrepo.saveAll(a);
	 return "insertion sucessfully";
	}


}

