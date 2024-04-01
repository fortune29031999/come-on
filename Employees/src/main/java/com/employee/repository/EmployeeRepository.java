package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {
@Query(value="select * from employees where salary>=? and salary<=?",nativeQuery=true)
public List<Employee>getbetweens(int a, int b);

@Query(value="select *from employees order by age",nativeQuery = true)
public List<Employee>getorder();

@Query(value="select age,designation from employees where first_name=?", nativeQuery  =true)
public List<Object[]>getString(String name);

@Query(value="select e.firstName from Employee e where e.age=(select max(e.age) from Employee e)")
public String getnames();

@Query(value="select e.lastName from Employee e where e.age=?1")
public String getnamee(int a);

@Query(value="select e.lastName from Employee e where e.age between :a and :b")
public List<String> getnaamee(int a,int b);
@Query(value="select e.salary from Employee e where e.firstName like ?1")
public List<Integer> getnamees(String a);


}
