package com.student.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.dao.StudentDao;
import com.student.entity.Student;

@Service
public class StudentService {
@Autowired
StudentDao studao;
public String add(List<Student>a) {
	return studao.add(a);
}
public List<String> get( String a) {
	List<Student> d=studao.get1();
	
	return d.stream().filter(x->x.getCity().equalsIgnoreCase(a)).map(x->x.getCollege() ).toList();
}
public String get2(@PathVariable String a) {
	List<Student>aa=studao.get1();
	 List<Student>ab=aa.stream().filter(x->x.getCity().equalsIgnoreCase(a)).collect(Collectors.toList());
	for(Student x: ab) {
	
	 Integer s=x.getId();
	 studao.get3(s);
	}
	return "world";
}
public List<Student> get4(){
	return studao.get1();
	}
public String adder( List<Student>a) {
	return studao.adder(a);
	}
}
