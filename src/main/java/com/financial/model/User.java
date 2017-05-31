package com.financial.model;

import java.util.Date;
import java.sql.Timestamp;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "financial_user")
public class User {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false, length = 128, unique = true)
	private String email;

	@Column(nullable = false, length = 60)
	private String password;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;

	protected User() {}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
		this.createTime = new Timestamp(System.currentTimeMillis());
	}

	public String getEmail() {
		return email;
	}

	public Date getCreateTime() {
		return createTime;
	}
}