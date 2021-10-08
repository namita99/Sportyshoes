package com.sportyShoes.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_user")
@Setter
@Getter
@ToString
@EnableTransactionManagement
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private String password;
	private String firstName;
	private String email;
	private Boolean isAdmin;
	@OneToMany
	private List<Purchase> listOfPurchases;
	

	public int getuserId() {
		
		return userId;
	}
	
	public String getUserName() {
		
		return userName;
	}
	public String getPassword() {
		
		return password;
	}
	public boolean getIsAdmin() {
		
		return false;
	}
	
	public String getemail() {
			
			return email;
		}
	public String getFirstName() {
		
		return firstName;
	}
	

}
