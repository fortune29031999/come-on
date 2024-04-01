package com.employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;
import com.employee.exception.Agenotfoundexception;
import com.employee.exception.Namenotfoundexception;

@Service
public class EmployeeService   {
	@Autowired
	EmployeeDao empdao;
	Agenotfoundexception agee;

	public String addEmployee(Employee e) {
		return empdao.addEmployee(e);
	}

	public Employee addEmployee1(int e) {
		return empdao.addEmployee1(e);
	}

	public List<Employee> addEmployee2() {
		return empdao.addEmployee2();
	}

	public String addEmployee3(Employee e) {
		return empdao.addEmployee3(e);
	}

	public String addEmployee4(int e) {
		return empdao.addEmployee4(e);
	}

	public String addEmployee5(List<Employee> e) {
		return empdao.addEmployee5(e);
	}

	public List<String> addEmployee6(int a) {
		List<Employee> z = empdao.addEmployee2();
		return z.stream().filter(x -> (x.getAge() < a)).map(x -> x.getFirstName()).toList();
	}

	public List<Employee> addEmployee7(int a) {
		List<Employee> z = empdao.addEmployee2();
		return z.stream().filter(x -> (x.getSalary() > a)).toList();
	}

	public List<Employee> addEmployee8(String a)throws Exception {
		List<Employee> z = empdao.addEmployee2();
		List<Employee> y=z.stream().filter(x -> (x.getFirstName().equalsIgnoreCase(a))).toList();
		if(y.isEmpty()){
			throw new Namenotfoundexception("name not found");
		}
		else {
		return z.stream().filter(x -> (x.getFirstName().equalsIgnoreCase(a))).toList();
		}
	}

	public List<String> addEmployee9(int a) {
		List<Employee> z = empdao.addEmployee2();
		return z.stream().filter(x -> (x.getSalary() > a)).map(x -> x.getDesignation()).toList();
	}

	public List<String> addEmployee10(String a) {
		List<Employee> z = empdao.addEmployee2();
		return z.stream().filter(x -> (x.getGender().equalsIgnoreCase(a))).map(x -> x.getFirstName()).toList();
	}

	public List<Employee> addEmployee11(String a) {
		List<Employee> z = empdao.addEmployee2();
		return z.stream().filter(x -> (x.getGender().equalsIgnoreCase(a))).toList();
	}

	public List<Employee> addEmployee12(String a) {
		List<Employee> z = empdao.addEmployee2();
		return z.stream().filter(x -> (x.getDesignation().equalsIgnoreCase(a))).toList();
	}

	public List<Employee> getbetweens(int a, int b) {
		return empdao.getbetweens(a, b);
	}

	public List<Employee> getorder() {
		return empdao.getorder();
	}

	public List<Object[]> getString(String name) {
		return empdao.getString(name);
	}

	public String getnames() {
		return empdao.getnames();
	}

	public String getnamee(int a) {
		return empdao.getnamee(a);
	}

	public List<String> getnaamee(int a, int b) {
		return empdao.getnaamee(a, b);
	}

	public List<Integer> getnamees(String a) {
		return empdao.getnamees(a);
	}

	public String puttingexception(Employee a) throws Exception {
		try {
			
			if (a.getAge() < 18) {
				 throw new Agenotfoundexception();
			} else {
				return empdao.puttingexception(a);
			}
		}
		catch(Agenotfoundexception t) {
			//System.out.println("age");
			return "Age is below 18";
		}
		
	}
	public String putinvalid(List<Employee>a) throws Exception {
		try {
			int count=0;
			for(Employee x:a) {
			if(x.getAge()<18) {
				count++;
			}	
			else {
				count--;
			}
			}
			if(count==a.size()) {
				return empdao.putinvalid(a);
			}
			else {
				throw new Agenotfoundexception();
			}
		}
		catch(Agenotfoundexception e) {
			return "minor";
		}
		
	}
	public String getname(List<Employee> a)throws Exception {
		int c=0;
		for(Employee x:a) {
			if(x.getFirstName().equalsIgnoreCase("hello")) {
				c++;
			}
			else {
				
			}
		}
		if(c==a.size()) {
			return empdao.getname(a);
		}
		else {
			throw new Namenotfoundexception("name is not found");
		}
	}
	public String getnami(List<Employee> a) throws Exception {
		int c=0,b=0,d=0,e=0,f=0,g=0,h=0;
		for(Employee x:a) {
			if(x.getGender()==null||x.getGender().equals("")) {
				c++; break;
			}
			else if(x.getAge()==0) {
				b++; break;
			}
			else if(x.getSalary()==0) {
				d++; break;
			}
			else if(x.getFirstName()==null||x.getFirstName().equals("")) {
				e++; break;
			}
			else if(x.getLastName()==null||x.getLastName().equals("")) {
				f++; break;
			}
			else if(x.getDesignation()==null||x.getDesignation().equals("")) {
				g++; break;
			}
			
		}
			if(c==1) {
			
			throw new NullPointerException("gender is empty");
			
		}
			else if (b==1) {
				throw new NullPointerException("age is empty");
			}
			else if (d==1) {
				throw new NullPointerException("salary is empty");
			}
			else if (e==1) {
				throw new NullPointerException("fname is empty");
			}
			else if (f==1) {
				throw new NullPointerException("lname is empty");
			}
			else if (g==1) {
				throw new NullPointerException("designation is empty");
			}
			else {
				return empdao.getnami(a);
			}
	}
	}
