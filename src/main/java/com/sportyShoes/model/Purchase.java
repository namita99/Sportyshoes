package com.sportyShoes.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "tbl_purchase")
@Setter
@Getter
@ToString
@NoArgsConstructor
@EnableTransactionManagement
public class Purchase {
	
	@Id
	@GeneratedValue
	private int purchaseId;
	@DateTimeFormat(style = "yyyy-MM-dd")
	private Date purchaseDate;
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
	@OneToMany
	private List<Product> purchasedProducts;

}
