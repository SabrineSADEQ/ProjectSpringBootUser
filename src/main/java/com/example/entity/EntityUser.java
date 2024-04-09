package com.example.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class EntityUser {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable=false, unique=true, length=20) 
    private String name;
    @Column(nullable=false, unique=true, length=45) 
    private String email;
    @Column(nullable=false, unique=true, length=45)  
    private String phoneNumber;
    @Column(nullable=false, unique=true, length=45) 
    private String password;
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

   
}

