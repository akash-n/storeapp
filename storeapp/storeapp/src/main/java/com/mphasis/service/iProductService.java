package com.mphasis.service;

import java.util.List;

import com.mphasis.domain.Product;

public interface iProductService {

	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public List <Product> getAllProduct();
	public Product getProductByid(Integer id);
	public void deleteProductByid(Integer id);
	
	public List<Product> findByName(String name);
	public List<Product> findByBrand(String brand);
	public List<Product> findByPrice(double price);
	}

