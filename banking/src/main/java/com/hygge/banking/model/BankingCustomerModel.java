package com.hygge.banking.model;

import java.math.BigDecimal;

public class BankingCustomerModel {
	
	private String name;
	private BigDecimal actBalance;
	private int age;
	private float curBalance;
	private boolean isPrivilageCus;
	
	public BankingCustomerModel(String name, BigDecimal actBalance, int age, float curBalance){
		this.name = name;
		this.actBalance = actBalance;
		this.age = age;
		this.curBalance = curBalance;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public BigDecimal getActBalance() {
		return actBalance;
	}

	public void setActBalance(BigDecimal actBalance) {
		this.actBalance = actBalance;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public float getCurBalance(){
		return curBalance;
	}
	
	public void setCurBalance(float curBalance){
		this.curBalance = curBalance;
	}
	
	public boolean getIsPrivilageCus(){
		return isPrivilageCus;
	}
	
	public void setIsPrivilageCus(boolean isPrivilageCus){
		this.isPrivilageCus = isPrivilageCus;
	}

}
