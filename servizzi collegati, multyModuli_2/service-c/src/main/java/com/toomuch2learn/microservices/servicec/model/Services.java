package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the services database table.
 * 
 */
@Entity
@Table(name="service")
@NamedQuery(name="Services.findAll", query="SELECT s FROM Services s")
public class Services implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idService")
	@SequenceGenerator(name="idService", sequenceName = "service_id_service_seq", allocationSize=1)
	@Column(name="id_service")
	private Long idService;

	@JsonIgnore
	@OneToMany(mappedBy = "service", fetch = FetchType.LAZY)
	private List<LineInfrastructure> lineInfrastructure;
	
	@Column(name="date_insert")
	private Date dateInsert;

	private String note;

	private String service;
	
	private String customer;

	private String scope;

	@Column(name="sub_scope")
	private String subScope;
	
	@Column(name="user_mod")
	private String userMod;

	public Services() {
	}

	public Long getIdService() {
		return this.idService;
	}

	public void setIdService(Long idService) {
		this.idService = idService;
	}

	public Date getDateInsert() {
		return this.dateInsert;
	}

	public void setDateInsert(Date dateInsert) {
		this.dateInsert = dateInsert;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getSubScope() {
		return subScope;
	}

	public void setSubScope(String subScope) {
		this.subScope = subScope;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public List<LineInfrastructure> getLineInfrastructure() {
		return lineInfrastructure;
	}

	public void setLineInfrastructure(List<LineInfrastructure> lineInfrastructure) {
		this.lineInfrastructure = lineInfrastructure;
	}

}