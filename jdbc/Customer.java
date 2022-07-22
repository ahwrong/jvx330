package com.varxyz.jvx330.jdbc;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Customer {
	public Customer() {
		super();
	}
	private long cid;
	private String email;
	private String passwd;
	private String name;
	private String ssn;
	private String phone;
	private Date regDate;
}
