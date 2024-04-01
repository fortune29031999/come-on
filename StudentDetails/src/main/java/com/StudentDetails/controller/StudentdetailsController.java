package com.StudentDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentDetails.entity.StudentdetailsEntity;
import com.StudentDetails.service.StudentdetailsService;

@RestController
public class StudentdetailsController extends Exception {
	@Autowired
	StudentdetailsService studentdetailsservice;

	@PostMapping("/insert")
	public String get(@RequestBody List<StudentdetailsEntity> a) {
		return studentdetailsservice.get(a);
	}

	@PostMapping("/validate")
	public String geter(@RequestBody StudentdetailsEntity a) throws Exception {
		return studentdetailsservice.geter(a);
	}
	@GetMapping("/find")
	public List<StudentdetailsEntity> getting() {
		return studentdetailsservice.getting();
	}
}
