package com.useproduct.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.product.entity.Product;

@RestController
public class UseproductController {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/gettingproduct")
	public List<Product> gettax() {
		String url = "http://localhost:8081/gst/gettax/";
		String url1 = "http://localhost:8080/product/finding";
//		ResponseEntity<Integer> r1 = r.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<Integer>() {
//		});
//		ResponseEntity<List<Product>> rr = r.exchange(url1, HttpMethod.GET, null,
//				new ParameterizedTypeReference<List<Product>>() {
//				});
////	return rr.getBody().stream().filter (x->x.getHsn()==hsn).map(x -> {
////		
////			x.setPrice(x.getPrice()+(x.getPrice()*r1.getBody()/100));
////			
////			return x;
////		}).collect(Collectors.toList()); 
//		return rr.getBody().stream().map(x -> {
//			Product temp = x;
//			if (x.getHsn() == hsn) {
//				x.setPrice(x.getPrice() + (x.getPrice() * r1.getBody() / 100));
//
//				temp = x;
//			}
//			return temp;
//		}).collect(Collectors.toList());
		List<Product> products = restTemplate
				.exchange(url1, HttpMethod.GET, null, new ParameterizedTypeReference<List<Product>>() {
				}).getBody();

		products.forEach(x -> {
			long hsn = x.getHsn();
			Integer percentage = restTemplate.exchange(url + hsn, HttpMethod.GET, null, Integer.class).getBody();
			int overAllAmount = x.getPrice() + x.getPrice() * percentage / 100;
			x.setPrice(overAllAmount);

		});
		return products;

	}

}
