package com.StudentDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentDetails.entity.StudentdetailsEntity;

public interface StudentdetailsRepository extends JpaRepository<StudentdetailsEntity, Integer> {

}
