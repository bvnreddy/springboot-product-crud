package com.example.product_management.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long pId;
	private String pName;
	private String pImgUrl;
	private int pQuantity;
	private int pPrice;
	private String pDesc;
	
	public Product() {
	
	}
	
	public Product(long pId, String pName, String pImgUrl, int pQuantity, int pPrice, String pDesc) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pImgUrl = pImgUrl;
		this.pQuantity = pQuantity;
		this.pPrice = pPrice;
		this.pDesc = pDesc;
	}

	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpImgUrl() {
		return pImgUrl;
	}

	public void setpImgUrl(String pImgUrl) {
		this.pImgUrl = pImgUrl;
	}

	public int getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public String getpDesc() {
		return pDesc;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pImgUrl=" + pImgUrl + ", pQuantity=" + pQuantity
				+ ", pPrice=" + pPrice + ", pDesc=" + pDesc + "]";
	}
	
	


	
	

}
