package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String SellerName;
	private Long visitited;
	private Long deals;
	
	public SaleSuccessDTO() {
		
	}
	

 	public SaleSuccessDTO(Seller seller, Long visitited, Long deals) {
		SellerName = seller.getName();
		this.visitited = visitited;
		this.deals = deals;
	}



	public String getSellerName() {
		return SellerName;
	}

	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}


	public Long getVisitited() {
		return visitited;
	}



	public void setVisitited(Long visitited) {
		this.visitited = visitited;
	}



	public Long getDeals() {
		return deals;
	}



	public void setDeals(Long deals) {
		this.deals = deals;
	}	
	
}
