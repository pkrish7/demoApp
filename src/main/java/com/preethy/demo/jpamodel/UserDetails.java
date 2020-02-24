package com.preethy.demo.jpamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "public.USER_DETAILS")
public class UserDetails {

	@Column(name = "userid")
	private String userid;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
}
