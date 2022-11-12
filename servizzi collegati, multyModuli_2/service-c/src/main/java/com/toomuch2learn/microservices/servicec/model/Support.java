package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
/**
 * The persistent class for the support database table.
 * 
 */
@Entity
@NamedQuery(name="Support.findAll", query="SELECT s FROM Support s")
public class Support implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSupport")
	@SequenceGenerator(name="idSupport", sequenceName = "support_id_support_seq", allocationSize=1)
	@Column(name="id_support")
	private Long idSupport;
	
	@JsonIgnore
	@OneToMany(mappedBy = "support", fetch = FetchType.LAZY)
	private List<SupportAsset> supportAssets;
	
	@Column(name="date_insert")
	private Date dateInsert;

	private String note;

	private String sla;

	@Column(name="support_description")
	private String supportDescription;

	@Column(name="support")
	private String support;

	@Column(name="user_mod")
	private String userMod;

	public Support() {
	}

	public Long getIdSupport() {
		return idSupport;
	}

	public void setIdSupport(Long idSupport) {
		this.idSupport = idSupport;
	}

	public Date getDateInsert() {
		return dateInsert;
	}

	public void setDateInsert(Date dateInsert) {
		this.dateInsert = dateInsert;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSla() {
		return sla;
	}

	public void setSla(String sla) {
		this.sla = sla;
	}

	public String getSupportDescription() {
		return supportDescription;
	}

	public void setSupportDescription(String supportDescription) {
		this.supportDescription = supportDescription;
	}

	public String getSupport() {
		return support;
	}

	public void setSupport(String support) {
		this.support = support;
	}

	public String getUserMod() {
		return userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public List<SupportAsset> getSupportAssets() {
		return supportAssets;
	}

	public void setSupportAssets(List<SupportAsset> supportAssets) {
		this.supportAssets = supportAssets;
	}
}