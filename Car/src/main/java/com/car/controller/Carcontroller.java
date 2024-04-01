package com.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.entity.Car;
import com.car.service.Carservices;

@RestController
@RequestMapping(value="/details")
public class Carcontroller {
@Autowired
Carservices carserv;
@PostMapping(value="/insert")
public String addCar(@RequestBody List<Car>c) {
return carserv.addCar(c);	
}
@GetMapping(value="/getting")
public List<Car> addCar1(){
	return carserv.addCar1();
		
}
@GetMapping(value="/getid/{a}")
public Car addCar2(@PathVariable int a) {
	return carserv.addCar2(a);
}
@DeleteMapping(value="/delete/{a}")
public String addCar3(@PathVariable int a) {
	return carserv.addCar3(a);
}
@PutMapping(value="/insert")
public String addCar4(@RequestBody Car a) {
	return carserv.addCar4(a);
}
}
