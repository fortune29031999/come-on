package com.Annotations.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Annotations.Employee;

@Controller
@ResponseBody
public class EmployeeController {
	@Qualifier("junior")
  @Autowired
  Employee e;
  
  @GetMapping("/geter")
  public String getmapp() {
	  return e.getMessage();
  }
}
