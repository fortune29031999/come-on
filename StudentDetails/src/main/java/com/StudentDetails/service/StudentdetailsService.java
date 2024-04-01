package com.StudentDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentDetails.dao.StudentdetailsDao;
import com.StudentDetails.entity.StudentdetailsEntity;
import com.StudentDetails.exception.Agenotfound;

@Service
public class StudentdetailsService {
	@Autowired
	StudentdetailsDao studentdetailsdao;

	public String get(List<StudentdetailsEntity> a) {
		return studentdetailsdao.get(a);
	}

	public String geter(StudentdetailsEntity a) throws Exception {
		if (a.getAge() < 18) {
			return studentdetailsdao.geter(a);
		} else {
			throw new Agenotfound("age is not valid");
		}
	}

	public List<StudentdetailsEntity> getting() {
		return studentdetailsdao.getting();
	}

}
