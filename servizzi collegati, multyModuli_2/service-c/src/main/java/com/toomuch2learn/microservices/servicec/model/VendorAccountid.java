package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the vendor_accountid database table.
 * 
 */
@Entity
@Table(name="vendor_accountid")
@NamedQuery(name="VendorAccountid.findAll", query="SELECT v FROM VendorAccountid v")
public class VendorAccountid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idVendorAccountid")
	@SequenceGenerator(name="idVendorAccountid", sequenceName = "vendor_accountid_id_vendor_accountid_seq", allocationSize=1)
	@Column(name="id_vendor_accountid")
	private Long idVendorAccountid;

	@Column(name="account_id")
	private String accountId;

	@Column(name="date_insert")
	private Date dateInsert;

	private String note;

	@Column(name="support_id")
	private Integer supportId;

	@Column(name="user_mod")
	private String userMod;

	private String webportal;

	public VendorAccountid() {
	}

	public Long getIdVendorAccountid() {
		return this.idVendorAccountid;
	}

	public void setIdVendorAccountid(Long idVendorAccountid) {
		this.idVendorAccountid = idVendorAccountid;
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
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

	public Integer getSupportId() {
		return this.supportId;
	}

	public void setSupportId(Integer supportId) {
		this.supportId = supportId;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public String getWebportal() {
		return this.webportal;
	}

	public void setWebportal(String webportal) {
		this.webportal = webportal;
	}

}