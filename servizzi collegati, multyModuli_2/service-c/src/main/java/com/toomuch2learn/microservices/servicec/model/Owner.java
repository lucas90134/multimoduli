package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the owner database table.
 * 
 */
@Entity
@NamedQuery(name="Owner.findAll", query="SELECT o FROM Owner o")
public class Owner implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idOwner")
	@SequenceGenerator(name="idOwner", sequenceName = "owner_id_owner_seq", allocationSize=1)
	@Column(name="id_owner")
	private Long idOwner;

	@JsonIgnore
	@OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
	private List<LineInfrastructure> lineInfrastructure;
	
	private String cellphone;

	@Column(name="date_insert")
	private Date dateInsert;

	private String email;

	private String name;

	private String note;

	private String surname;

	private String telephone;

	@Column(name="user_mod")
	private String userMod;

	public Owner() {
	}

	public Long getIdOwner() {
		return this.idOwner;
	}

	public void setIdOwner(Long idOwner) {
		this.idOwner = idOwner;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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