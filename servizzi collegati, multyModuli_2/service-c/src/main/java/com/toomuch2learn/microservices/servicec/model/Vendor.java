package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the vendor database table.
 * 
 */
@Entity
@NamedQuery(name="Vendor.findAll", query="SELECT v FROM Vendor v")
public class Vendor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idVendor")
	@SequenceGenerator(name="idVendor", sequenceName = "vendor_id_vendor_seq", allocationSize=1)
	@Column(name="id_vendor")
	private Long idVendor;

	@Column(name="date_insert")
	private Date dateInsert;

	private String note;

	@Column(name="user_mod")
	private String userMod;

	private String vendor;

	public Vendor() {
	}

	public Long getIdVendor() {
		return this.idVendor;
	}

	public void setIdVendor(Long idVendor) {
		this.idVendor = idVendor;
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

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}