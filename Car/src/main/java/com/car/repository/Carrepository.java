package com.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car.entity.Car;

public interface Carrepository extends JpaRepository<Car,Integer> {

}
