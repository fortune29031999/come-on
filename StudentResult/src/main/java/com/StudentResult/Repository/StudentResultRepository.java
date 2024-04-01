package com.StudentResult.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.StudentResult.Entity.StudentResultEntity;

public interface StudentResultRepository extends JpaRepository<StudentResultEntity, Integer> {
	

}
