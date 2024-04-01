package com.demorest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/girls")
public class Demorest {
	@GetMapping("/type")
	public String get(@RequestParam String a) {
		if (a.equalsIgnoreCase("employed")) {
			return "girls loves you back";
		} else {
			return "you only love girls";
		}
	}

}
