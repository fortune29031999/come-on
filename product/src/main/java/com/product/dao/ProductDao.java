package com.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Repository
public class ProductDao {
@Autowired
ProductRepository prorepo;
public String inserting(List<Product> p) {
	 prorepo.saveAll(p);
	 return "Sucessfully saved";
}
public List<Product> finding() {
	return prorepo.findAll();
}
}
