package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DETTAGLIO_STATO_ROUTER database table.
 * 
 */
@Entity
@Table(name="business")
@NamedQuery(name="Business.findAll", query="SELECT b FROM Business b")
public class Business implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="business")
	private String business;

	@Id
	@Column(name="id_business")
	private Long idBusiness;

	public Business() {
	}

	
	@Override
	public String toString() {
		return "{\n\t\"business\":\"" + business + "\",\n\t\"idBusiness\":\"" + idBusiness + "\"\n}";
	}


	public String getBusiness() {
		return business;
	}


	public void setBusiness(String business) {
		this.business = business;
	}


	public Long getIdBusiness() {
		return idBusiness;
	}


	public void setIdBusiness(Long idBusiness) {
		this.idBusiness = idBusiness;
	}

}