package com.mphasis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="product_details")
public class Product {
	
	


	@Id
	@Column(name="product_id")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="product_name")
	private String name;
	
	@Column(name="product_brand")
	private String brand;
	
	@Column(name="product_price")
	private double price;

}
