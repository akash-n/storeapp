package com.mphasis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mphasis.domain.Product;
import com.mphasis.repository.ProductRepository;

@Service(value="productService")
@Scope(value="singelton")
public class ProductService implements iProductService{
	@Autowired
	@Qualifier(value="productRepository")
private ProductRepository productRepository;
	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	@Override
	public Product updateProduct(Product product) {
		
		return productRepository.save(product);
	}
	@Override
	public List<Product> getAllProduct() {
		
		return productRepository.findAll();
	}
	@Override
	public Product getProductByid(Integer id) {
		return productRepository.findById(id).get();
	}
	@Override
	public void deleteProductByid(Integer id) {
		 productRepository.deleteById(id);
		
	}
	@Override
	public List<Product> findByName(String name) {
		return productRepository.findByName(name);
	}
	@Override
	public List<Product> findByBrand(String brand) {
		return productRepository.findByBrand(brand);
		
	}
	@Override
	public List<Product> findByPrice(double price) {
		return productRepository.findByPrice(price);
	}
	
}
