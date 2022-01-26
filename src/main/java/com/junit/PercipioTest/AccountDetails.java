package com.junit.PercipioTest;

public class AccountDetails {
	
	private String name;
	private Double acc_num;
	private Integer cust_id;
	private Double acc_bal;
	private String acc_type;
	
	public AccountDetails(String name, Double acc_num, Integer cust_id, Double acc_bal, String acc_type) {
		super();
		this.name = name;
		this.acc_num = acc_num;
		this.cust_id = cust_id;
		this.acc_bal = acc_bal;
		this.acc_type = acc_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAcc_num() {
		return acc_num;
	}

	public void setAcc_num(Double acc_num) {
		this.acc_num = acc_num;
	}

	public Integer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}

	public Double getAcc_bal() {
		return acc_bal;
	}

	public void setAcc_bal(Double acc_bal) {
		this.acc_bal = acc_bal;
	}

	public String getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	
	
	
	
	

}
