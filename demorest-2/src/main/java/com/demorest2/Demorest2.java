package com.demorest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Demorest2 {
 @Autowired
 RestTemplate r2;
 @GetMapping("/job")
 public String get(@RequestParam String a) {
	 String c="";
	 if(a.equalsIgnoreCase("developer")) {
		 c= "65000";
	 }
	 else if (a.equalsIgnoreCase("doctor")||a.equalsIgnoreCase("entreprenuer")) {
		 c= "100000";
	 }
	 else {
		 c="25000";
	 }
	 String url="http://localhost:9000/salary?b="+c;
	 ResponseEntity<String>rip1=r2.exchange(url, HttpMethod.GET,null,String.class);
	 	String val=rip1.getBody();
	 	if(Integer.parseInt(c)>= 50000) {
	 	return val+" and you are eligible to getmarried ";
	 	}
	 	else {
	 		return val+" and you are not eligible to getmarried ";
	 	}
 }
}
