package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {

	@Id
	private int mobileId;
	private String mobileModel;
	private String price;
	private String hardDisk;
	private String ram;

	public Mobile() {

		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int mobileId, String mobileModel, String price, String hardDisk, String ram) {
		super();

		this.mobileId = mobileId;
		this.mobileModel = mobileModel;
		this.price = price;
		this.hardDisk = hardDisk;
		this.ram = ram;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileModel() {
		return mobileModel;
	}

	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

}
