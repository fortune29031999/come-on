package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class DemoController {
	@GetMapping(value = "/getHi")
	public String getHello() {
		return "Hello World";
	}

	@GetMapping(value = "/add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

	@GetMapping(value = "/reverse/{a}")
	public String reverse(@PathVariable String a) {
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			b = a.charAt(i) + b;

		}
		return b;
	}

	@GetMapping(value = "/palindrome/{a}")
	public String palindrome(@PathVariable int a) {
		int tmep = 0;
		int o = a;
		for (; a > 0;) {
			int r = a % 10;
			tmep = (tmep * 10) + r;
			a = a / 10;
		}
		if (o == tmep) {
			return tmep + " Palindrome";
		} else {
			return "non palindrome";
		}
	}

	@GetMapping(value = "/prime/{a}/{b}")
	public List<Integer> prime(@PathVariable int a, @PathVariable int b) {
		List<Integer>f= new ArrayList<>();
		for (int i = a; i <= b; i++) {
			int r = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					r = 1;
				}
			}
			if (r == 0) {
				f.add(i);
			} 
		}
		return f;
	
}
	@GetMapping(value="/divisible/{a}/{b}")
	public List<Integer> divisible(@PathVariable int a, @PathVariable int b) {
		List<Integer>g=new ArrayList<>();
		for(int i=a;i<=b;i++) {
			if(i%7==0) {
				g.add(i);
			}
		}
		return g;
}
	@GetMapping(value="/duplicate/{a}")
	public Map<Character,Long>duplicate(@PathVariable String a) {
		Map<Character,Long>r=a.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	return r;
	}
	@GetMapping(value="/dup/{a}")
	public List<Character>dup(@PathVariable String a) {
		Map<Character,Long>r=a.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		List<Character>h=r.keySet().stream().filter(x->r.get(x)>1).toList();
		return h;
	}
	@GetMapping(value="/duplicate1/{a}")
	public Map<Character,Long>dupli(@PathVariable String a) {
		Map<Character,Long>z=a.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Map<Character,Long>z1=z.keySet().stream().filter(x->z.get(x)==1).collect(Collectors.toMap(x->x, y->z.get(y)));
		return z1;
	}
	}
	
