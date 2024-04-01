package com.employee.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.Service.EmployeeService;
import com.employee.entity.Employee;
import com.student.entity.Student;

@RestController
@RequestMapping(value = "/employees")
public class Employeecontroller extends Exception {
	@Autowired
	 RestTemplate r1;
	@Autowired
	EmployeeService empser;
 
	

	@PostMapping(value = "/insert")
	public String addEmployee(@RequestBody Employee e) {
		return empser.addEmployee(e);
	}

	@GetMapping(value = "/getting/{e}")
	public Employee addEmployee1(@PathVariable int e) {
		return empser.addEmployee1(e);
	}

	@GetMapping(value = "/getter")
	public List<Employee> addEmployee2() {
		return empser.addEmployee2();
	}

	@PutMapping(value = "/insert1")
	public String addEmployee3(@RequestBody Employee e) {
		return empser.addEmployee3(e);
	}

	@DeleteMapping(value = "/delete/{e}")
	public String addEmployee4(@PathVariable int e) {
		return empser.addEmployee4(e);
	}

	@PostMapping(value = "/insertlist")
	public String addEmployee5(@RequestBody List<Employee> e) {
		return empser.addEmployee5(e);
	}

	@GetMapping(value = "/getfname/{a}")
	public List<String> addEmployee6(@PathVariable int a) {
		return empser.addEmployee6(a);
	}

	@GetMapping(value = "/getobj1/{a}")
	public List<Employee> addEmployee7(@PathVariable int a) {
		return empser.addEmployee7(a);
	}

	@GetMapping(value = "/getobj2/{a}")
	public List<Employee> addEmployee8(@PathVariable String a) throws Exception {
		return empser.addEmployee8(a);
	}

	@GetMapping(value = "/getobj3/{a}")
	public List<String> addEmployee9(@PathVariable int a) {
		return empser.addEmployee9(a);
	}

	@GetMapping(value = "/getobj4/{a}")
	public List<String> addEmployee10(@PathVariable String a) {
		return empser.addEmployee10(a);
	}

	@GetMapping(value = "/getobj5/{a}")
	public List<Employee> addEmployee11(@PathVariable String a) {
		return empser.addEmployee11(a);
	}

	@GetMapping(value = "/getobj6/{a}")
	public List<Employee> addEmployee12(@PathVariable String a) {
		return empser.addEmployee12(a);
	}

	@GetMapping("/getbetween")
	public List<Employee> getbetweens(@RequestParam int a, @RequestParam int b) {
		return empser.getbetweens(a, b);
	}

	@GetMapping("/getorder")
	public List<Employee> getorder() {
		return empser.getorder();
	}

	@GetMapping("/getname")
	public List<Object[]> getString(@RequestParam String name) {
		return empser.getString(name);
	}

	@GetMapping("/gets")
	public String getnames() {
		return empser.getnames();
	}

	@GetMapping("/getts")
	public String getnamee(@RequestParam int a) {
		return empser.getnamee(a);
	}

	@GetMapping("/get11")
	public List<String> getnaamee(@RequestParam int a, @RequestParam int b) {
		return empser.getnaamee(a, b);
	}

	@GetMapping("/getters")
	public List<Integer> getnamees(@RequestParam String a) {
		return empser.getnamees(a);
	}

	@PutMapping("/gettings")
	public String puttingexception(@RequestBody Employee a) throws Exception {
		return empser.puttingexception(a);
	}

	@PutMapping("/getteinglist")
	public String putinvalid(@RequestBody List<Employee> a) throws Exception {
		return empser.putinvalid(a);
	}

	@PutMapping("/getwhy")
	public String getname(@RequestBody List<Employee> a) throws Exception {
		return empser.getname(a);
	}

	@PutMapping("getnull")
	public String getnami(@RequestBody List<Employee> a) throws Exception {
		return empser.getnami(a);
	}

	@GetMapping("/getstudent")
	public List<Student> getingsd() {
		String url = "http://localhost:8080/student/gettings";

		ResponseEntity<List<Student>> res = r1.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Student>>() {
		} );

		return res.getBody();

	}
	@PostMapping("/insertdetails")
	public String getts(@RequestBody List<Student> d) {
		String url="http://localhost:8080/student/addingvalue";
		ResponseEntity<String> aa=r1.postForEntity("http://localhost:8080/student/addingvalue", d, String.class);
		return aa.getBody();
	}
	@PutMapping("/putting")
	public String getr(@RequestBody List<Student> d ) {
	 ResponseEntity<String>ab=r1.exchange("http://localhost:8080/student/insertvalues", HttpMethod.PUT, new HttpEntity<>(d),String.class);
	 return ab.getBody();
	} 

}
 