package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the technology database table.
 * 
 */
@Entity
@NamedQuery(name="Technology.findAll", query="SELECT t FROM Technology t")
public class Technology implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idTechnology")
	@SequenceGenerator(name="idTechnology", sequenceName = "technology_id_technology_seq", allocationSize=1)
	@Column(name="id_technology")
	private Long idTechnology;

	@JsonIgnore
	@OneToMany(mappedBy = "technology", fetch = FetchType.LAZY)
	private List<LineInfrastructure> lineInfrastructure;
	
	@Column(name="date_insert")
	private Date dateInsert;

	private String note;

	private String technology;

	@Column(name="user_mod")
	private String userMod;

	public Technology() {
	}

	public Long getIdTechnology() {
		return this.idTechnology;
	}

	public void setIdTechnology(Long idTechnology) {
		this.idTechnology = idTechnology;
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

	public String getTechnology() {
		return this.technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
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