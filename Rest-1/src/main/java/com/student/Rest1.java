package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class Rest1 {
  @Autowired
  RestTemplate r;
  @GetMapping("/getter")
  public String gethg() {
	  String url="http://localhost:8080/gg?a=";
	  ResponseEntity<String> re=r.exchange(url, HttpMethod.GET,null,String.class);
	  String v=re.getBody();
	  return v;
  }
}
