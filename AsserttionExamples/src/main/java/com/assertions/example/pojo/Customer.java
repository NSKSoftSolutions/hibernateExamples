package com.assertions.example.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customerInfo")
public class Customer {

	@Id
	private int cus_id;
	private String cus_name;
	private String present_add;
	private long mobile;
	@ManyToOne(targetEntity = Vendor.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ven_id")
	private Vendor vendordetails;

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getCus_id() {
		return cus_id;
	}

	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public String getPresent_add() {
		return present_add;
	}

	public void setPresent_add(String present_add) {
		this.present_add = present_add;
	}

	public Vendor getVendordetails() {
		return vendordetails;
	}

	public void setVendordetails(Vendor vendordetails) {
		this.vendordetails = vendordetails;
	}

}
