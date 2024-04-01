package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.car.dao.Cardao;
import com.car.entity.Car;

@Service
public class Carservices {
@Autowired
Cardao cardao;
public String addCar(List<Car> c) {
	return cardao.addCar(c);
}
public List<Car>addCar1(){
	return cardao.addCar1();
}
public Car addCar2(int a) {
	return cardao.addCar2(a);
}
public String addCar3(int a) {
	return cardao.addCar3(a);
}
public String addCar4( Car a) {
	return cardao.addCar4(a);
}
}
