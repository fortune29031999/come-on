package com.demorest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class Demorest1 {
@Autowired
RestTemplate r1;
@GetMapping("/salary")
public String get(@RequestParam String b) {
	String c="";
	if(Integer.parseInt(b)<50000) {
	 c="jobless";
	}
	else {
		 c="employed";
	}
	
	
	String url="http://localhost:8080/girls/type?a="+c;
	ResponseEntity<String> rip=r1.exchange(url,HttpMethod.GET, null,String.class);
	String v=rip.getBody();
	return v+" if salary ="+b;
}
}
