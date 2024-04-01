package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/main")
public class resttt {
	@GetMapping(value="/gg")
   public String genz(@RequestParam String a) {
		return a;
	} 
}
