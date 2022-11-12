package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the part_number database table.
 * 
 */
@Entity
@Table(name="part_number")
@NamedQuery(name="PartNumber.findAll", query="SELECT p FROM PartNumber p")
public class PartNumber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idPartNumber")
	@SequenceGenerator(name="idPartNumber", sequenceName = "part_number_id_part_number_seq", allocationSize=1)
	@Column(name="id_part_number")
	private Long idPartNumber;

	@Column(name="date_insert")
	private Date dateInsert;

	private String description;

	@Column(name="eos_eol")
	private Date eosEol;

	@Column(name="id_vendor")
	private Long idVendor;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_vendor",insertable=false,updatable=false)
	private Vendor vendor;

	private String note;

	@Column(name="part_number")
	private String partNumber;

	private String technology;

	private String type;

	@Column(name="user_mod")
	private String userMod;

	public PartNumber() {
	}

	public Long getIdPartNumber() {
		return idPartNumber;
	}

	public void setIdPartNumber(Long idPartNumber) {
		this.idPartNumber = idPartNumber;
	}

	public Date getDateInsert() {
		return dateInsert;
	}

	public void setDateInsert(Date dateInsert) {
		this.dateInsert = dateInsert;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEosEol() {
		return eosEol;
	}

	public void setEosEol(Date eosEol) {
		this.eosEol = eosEol;
	}

	public Long getIdVendor() {
		return idVendor;
	}

	public void setIdVendor(Long idVendor) {
		this.idVendor = idVendor;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserMod() {
		return userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

}