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

import com.financial.until.EncoderUntils;

@Entity
@Table(name = "financial_user")
public class User {

	@Id
	@Column(name = "user_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false, length = 128, unique = true)
	private String email;

	@Column(nullable = false, length = 60)
	private String password;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;

	@Column(nullable = false)
	private boolean isEnabled;// Indicates whether the user is enabled or disabled.

	@Column(nullable = false)
	private String[] roles;

	protected User() {}

	public User(String email, String password, String... roles) {
		this.email = email;
		this.setPassword(password);
		this.createTime = new Timestamp(System.currentTimeMillis());
		this.isEnabled = true;
		this.roles = roles;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = EncoderUntils.encode(password);
	}

	public Date getCreateTime() {
		return createTime;
	}

	public boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String[] getRoles() {
		return roles;
	}
}