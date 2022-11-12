package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
/**
 * The persistent class for the maintainer database table.
 * 
 */
@Entity
@NamedQuery(name="Maintainer.findAll", query="SELECT m FROM Maintainer m")
public class Maintainer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idMaintainer")
	@SequenceGenerator(name="idMaintainer", sequenceName = "maintainer_id_maintainer_seq", allocationSize=1)
	@Column(name="id_maintainer")
	private Long idMaintainer;

	@JsonIgnore
	@OneToMany(mappedBy = "maintainer", fetch = FetchType.LAZY)
	private List<LineInfrastructure> lineInfrastructure;
	
	@Column(name="date_insert")
	private Date dateInsert;

	@Column(name="esc_email")
	private String escEmail;

	@Column(name="esc_phone")
	private String escPhone;

	private String escalation;

	private String maintainer;

	private String note;

	@Column(name="service_manager")
	private String serviceManager;

	@Column(name="sm_email")
	private String smEmail;

	@Column(name="sm_phone")
	private String smPhone;

	@Column(name="user_mod")
	private String userMod;

	@JsonIgnore
	@OneToMany(mappedBy = "maintainer",fetch=FetchType.LAZY)
	private List<MaintainerAttach> maintainerAttach;
	
	public Maintainer() {
	}

	public Long getIdMaintainer() {
		return this.idMaintainer;
	}

	public void setIdMaintainer(Long idMaintainer) {
		this.idMaintainer = idMaintainer;
	}

	public Date getDateInsert() {
		return this.dateInsert;
	}

	public void setDateInsert(Date dateInsert) {
		this.dateInsert = dateInsert;
	}

	public String getEscEmail() {
		return this.escEmail;
	}

	public void setEscEmail(String escEmail) {
		this.escEmail = escEmail;
	}

	public String getEscPhone() {
		return this.escPhone;
	}

	public void setEscPhone(String escPhone) {
		this.escPhone = escPhone;
	}

	public String getEscalation() {
		return this.escalation;
	}

	public void setEscalation(String escalation) {
		this.escalation = escalation;
	}

	public String getMaintainer() {
		return this.maintainer;
	}

	public void setMaintainer(String maintainer) {
		this.maintainer = maintainer;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getServiceManager() {
		return this.serviceManager;
	}

	public void setServiceManager(String serviceManager) {
		this.serviceManager = serviceManager;
	}

	public String getSmEmail() {
		return this.smEmail;
	}

	public void setSmEmail(String smEmail) {
		this.smEmail = smEmail;
	}

	public String getSmPhone() {
		return this.smPhone;
	}

	public void setSmPhone(String smPhone) {
		this.smPhone = smPhone;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public List<MaintainerAttach> getMaintainerAttach() {
		return maintainerAttach;
	}

	public void setMaintainerAttach(List<MaintainerAttach> maintainerAttach) {
		this.maintainerAttach = maintainerAttach;
	}

	public List<LineInfrastructure> getLineInfrastructure() {
		return lineInfrastructure;
	}

	public void setLineInfrastructure(List<LineInfrastructure> lineInfrastructure) {
		this.lineInfrastructure = lineInfrastructure;
	}

}