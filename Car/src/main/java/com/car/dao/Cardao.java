package com.car.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.car.entity.Car;
import com.car.repository.Carrepository;

@Repository
public class Cardao {
@Autowired
Carrepository carrepo;
public String addCar(List<Car> c) {
 carrepo.saveAll(c);	
	return "stored everything";
}
public List<Car>addCar1(){
	return carrepo.findAll();
}
public Car addCar2(int a) {
	return carrepo.findById(a).get();
}
public String addCar3 (int a) {
	carrepo.deleteById(a);
	return "Deleted";
}
public String addCar4( Car a) {
	carrepo.save(a);
	return "updated";
}
}
