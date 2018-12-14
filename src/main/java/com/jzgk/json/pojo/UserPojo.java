package com.jzgk.json.pojo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @ClassName:  UserPojo   
 * @Description:用户实体类   
 * @author: LouYue 
 * @date:   2018年12月14日 下午3:26:16   
 *
 */
@Entity
@Table(name="txt_user")
public class UserPojo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="balance")
	private BigDecimal balance;
	
	public UserPojo() {
		
	}

	public UserPojo(Long id, String username, String name, Integer age, BigDecimal balance) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.age = age;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
}
