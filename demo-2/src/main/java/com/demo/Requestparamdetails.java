 package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/mainpage")
public class Requestparamdetails {
	@GetMapping(value="/request/{a}/{b}")
	//("a) like a typecast that says a is assigned to e;
	public String getting(@PathVariable ("a")String e,@PathVariable String b) {
		return e.concat(b);
	}
	
	@GetMapping(value="/requestparam")
	public boolean get(@RequestParam String a,@RequestParam String b) {
		return a.contains(b);
	}
	

}
