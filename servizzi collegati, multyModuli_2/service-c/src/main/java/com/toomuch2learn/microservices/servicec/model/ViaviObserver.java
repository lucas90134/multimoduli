package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
/**
 * The persistent class for the viavi_observer database table.
 * 
 */
@Entity
@Table(name="viavi_observer")
@NamedQuery(name="ViaviObserver.findAll", query="SELECT v FROM ViaviObserver v")
public class ViaviObserver implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idViaviObserver")
	@SequenceGenerator(name="idViaviObserver", sequenceName = "viavi_observer_id_viavi_observer_seq", allocationSize=1)
	@Column(name="id_viavi_observer")
	private Long idViaviObserver;

	@Column(name="date_insert")
	private Date dateInsert;

	@Column(name="id_asset")
	private Long idAsset;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_asset",insertable=false,updatable=false)
	private Asset asset;
	
	@Column(name="identification_number")
	private String identificationNumber;

	@Column(name="license_number")
	private String licenseNumber;

	private String note;

	@Column(name="user_mod")
	private String userMod;

	public ViaviObserver() {
	}

	public Long getIdViaviObserver() {
		return this.idViaviObserver;
	}

	public void setIdViaviObserver(Long idViaviObserver) {
		this.idViaviObserver = idViaviObserver;
	}

	public Date getDateInsert() {
		return this.dateInsert;
	}

	public void setDateInsert(Date dateInsert) {
		this.dateInsert = dateInsert;
	}

	public Long getIdAsset() {
		return this.idAsset;
	}

	public void setIdAsset(Long idAsset) {
		this.idAsset = idAsset;
	}

	public String getIdentificationNumber() {
		return this.identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

}