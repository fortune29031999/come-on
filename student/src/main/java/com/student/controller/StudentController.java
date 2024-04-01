package com.student.controller;

import java.util.List;
import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
StudentService stuserv;
static Logger log=Logger.getLogger(StudentController.class);

@PostMapping("/addingvalue")
public String add(@RequestBody List<Student>a) {
	return stuserv.add(a);
}


@GetMapping("/getting")
public List<String> get(@RequestParam String a) {
	PropertyConfigurator.configure("Logger.properties");
	log.info(stuserv.get(a));
	return stuserv.get(a);
}
@DeleteMapping("/deleting/{a}")
public String get2(@PathVariable String a) {
	return stuserv.get2(a);
}
@GetMapping("/gettings")

public List<Student> get4(){
	
	return stuserv.get4();
	}
@PutMapping("/insertvalues")
public String adder(@RequestBody List<Student>a) {
	return stuserv.adder(a);
	}
}
