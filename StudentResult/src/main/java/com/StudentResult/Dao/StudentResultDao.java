package com.StudentResult.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentResult.Entity.StudentResultEntity;
import com.StudentResult.Repository.StudentResultRepository;
@Repository
public class StudentResultDao {
	@Autowired
	StudentResultRepository studentresultrepository;

	public String get(List<StudentResultEntity> a) {
		studentresultrepository.saveAll(a);
		return "inserted";
	}
public List<StudentResultEntity> find() {
		
		return studentresultrepository.findAll();
		}
}
