package com.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao extends Exception {
	@Autowired
	EmployeeRepository emprepo;

	public String addEmployee(Employee e) {
		emprepo.save(e);
		return "Sucessfuly saved";
	}

	public Employee addEmployee1(int e) {
		return emprepo.findById(e).get();

	}

	public List<Employee> addEmployee2() {
		return emprepo.findAll();
	}

	public String addEmployee3(Employee e) {
		emprepo.save(e);
		return "Sucessfuly updated";
	}

	public String addEmployee4(int e) {
		emprepo.deleteById(e);
		return "Sucessfully deleted";
	}

	public String addEmployee5(List<Employee> e) {
		emprepo.saveAll(e);
		return "Sucessfuly saved everything";
	}

	public List<Employee> getbetweens(int a, int b) {
		return emprepo.getbetweens(a, b);
	}

	public List<Employee> getorder() {
		return emprepo.getorder();
	}

	public List<Object[]> getString(String name) {
		return emprepo.getString(name);
	}

	public String getnames() {
		return emprepo.getnames();
	}

	public String getnamee(int a) {
		return emprepo.getnamee(a);
	}

	public List<String> getnaamee(int a, int b) {
		return emprepo.getnaamee(a, b);
	}

	public List<Integer> getnamees(String a) {
		return emprepo.getnamees(a);
	}

	public String puttingexception(Employee a) {
		emprepo.save(a);
		return "savedfully";
	}
	public String putinvalid(List<Employee> a) {
		emprepo.saveAll(a);
		return "saved everything";
	}
	public String getname(List<Employee> a) {
		emprepo.saveAll(a);
		return "all saved";
	}
	public String getnami(List<Employee> a) {
		emprepo.saveAll(a);
		return "sent";
	}

}
