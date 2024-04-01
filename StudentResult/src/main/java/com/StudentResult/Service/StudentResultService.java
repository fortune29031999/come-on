package com.StudentResult.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentResult.Dao.StudentResultDao;
import com.StudentResult.Entity.StudentResultEntity;

import one.util.streamex.StreamEx;

@Service
public class StudentResultService {
	@Autowired
	StudentResultDao studentresultdao;

	public String get(List<StudentResultEntity> a) {

		return studentresultdao.get(a);
	}
	public List<StudentResultEntity> find(int r) {
		
		List<StudentResultEntity> a=studentresultdao.find();
		List<StudentResultEntity>d=StreamEx.of(a).sorted(Comparator.comparing(StudentResultEntity::getPercentage).reversed()).distinct(StudentResultEntity::getPercentage).limit(r).toList();
		List<StudentResultEntity>checking=new ArrayList<>();
		for(int i=0;i<d.size();i++) {
			for(int j=0;j<a.size();j++) {
			if(d.get(i).getPercentage()==a.get(j).getPercentage()) {
				checking.add(a.get(j));
			}
			}
		}
		return checking;
	}
	public List<StudentResultEntity>findbetween(float a,float b) {
		List<StudentResultEntity>list=studentresultdao.find();	
		List<StudentResultEntity>percent=list.stream().filter(x->x.getPercentage()>=a&&x.getPercentage()<=b).toList();
		return percent;
	}
	
}
