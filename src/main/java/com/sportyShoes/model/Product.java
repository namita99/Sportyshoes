package com.sportyShoes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_product")
@Setter
@Getter
@ToString
@NoArgsConstructor
@EnableTransactionManagement
public class Product {
	
	@Id
	@GeneratedValue
	private int productId;
	private String productCategory;
	private String productName;
	private int productPrice;

}
