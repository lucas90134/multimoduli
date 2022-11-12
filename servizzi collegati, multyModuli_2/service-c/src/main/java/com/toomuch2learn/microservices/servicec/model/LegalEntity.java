package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the legal_entity database table.
 * 
 */
@Entity
@Table(name="legal_entity")
@NamedQuery(name="LegalEntity.findAll", query="SELECT l FROM LegalEntity l")
public class LegalEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idLegalEntity")
	@SequenceGenerator(name="idLegalEntity", sequenceName = "legal_entity_id_legal_entity_seq", allocationSize=1)
	@Column(name="id_legal_entity")
	private Long idLegalEntity;

	@Column(name="billing_address")
	private String billingAddress;

	private String contact;

	@Column(name="date_insert")
	private Date dateInsert;

	private String email;

	private Integer id;

	@Column(name="legal_entity")
	private String legalEntity;

	@Column(name="mail_invoices_to")
	private String mailInvoicesTo;

	private String note;

	private String phone;

	private String recipient;

	@Column(name="tax_id")
	private String taxId;

	@Column(name="user_mod")
	private String userMod;

	public LegalEntity() {
	}

	public Long getIdLegalEntity() {
		return this.idLegalEntity;
	}

	public void setIdLegalEntity(Long idLegalEntity) {
		this.idLegalEntity = idLegalEntity;
	}

	public String getBillingAddress() {
		return this.billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getDateInsert() {
		return this.dateInsert;
	}

	public void setDateInsert(Date dateInsert) {
		this.dateInsert = dateInsert;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLegalEntity() {
		return this.legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	public String getMailInvoicesTo() {
		return this.mailInvoicesTo;
	}

	public void setMailInvoicesTo(String mailInvoicesTo) {
		this.mailInvoicesTo = mailInvoicesTo;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRecipient() {
		return this.recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getTaxId() {
		return this.taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

}