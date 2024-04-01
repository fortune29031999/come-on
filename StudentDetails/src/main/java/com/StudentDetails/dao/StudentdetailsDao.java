package com.StudentDetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentDetails.entity.StudentdetailsEntity;
import com.StudentDetails.repository.StudentdetailsRepository;

@Repository
public class StudentdetailsDao {
	@Autowired
	StudentdetailsRepository studentdetailsrepository;

	public String get(List<StudentdetailsEntity> a) {
		studentdetailsrepository.saveAll(a);
		return "savedAll";
	}

	public String geter(StudentdetailsEntity a) {
		studentdetailsrepository.save(a);
		return "saved";
	}

	public List<StudentdetailsEntity> getting() {
		return studentdetailsrepository.findAll();
	}
}
