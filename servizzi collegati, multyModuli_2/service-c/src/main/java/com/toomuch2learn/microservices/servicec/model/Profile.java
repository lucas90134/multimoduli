package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the profiles database table.
 * 
 */
@Entity
@Table(name="profiles")
@NamedQuery(name="Profile.findAll", query="SELECT p FROM Profile p")
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idProfile")
	@SequenceGenerator(name="idProfile", sequenceName = "profiles_id_profile_seq", allocationSize=1)
	@Column(name="id_profile")
	private Long idProfile;

	@JsonIgnore
	@OneToMany(mappedBy = "profile", fetch = FetchType.LAZY)
	private List<LineInfrastructure> lineInfrastructure;
	
	@Column(name="date_insert")
	private Date dateInsert;

	private String note;

	private String profile;

	@Column(name="user_mod")
	private String userMod;

	public Profile() {
	}

	public Long getIdProfile() {
		return this.idProfile;
	}

	public void setIdProfile(Long idProfile) {
		this.idProfile = idProfile;
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

	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
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