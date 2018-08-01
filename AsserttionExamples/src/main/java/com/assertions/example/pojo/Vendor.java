package com.assertions.example.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ven_id;
	private String ven_name;
	private String main_branach;

	public int getVen_id() {
		return ven_id;
	}

	public void setVen_id(int ven_id) {
		this.ven_id = ven_id;
	}

	public String getVen_name() {
		return ven_name;
	}

	public void setVen_name(String ven_name) {
		this.ven_name = ven_name;
	}

	public String getMain_branach() {
		return main_branach;
	}

	public void setMain_branach(String main_branach) {
		this.main_branach = main_branach;
	}

}
