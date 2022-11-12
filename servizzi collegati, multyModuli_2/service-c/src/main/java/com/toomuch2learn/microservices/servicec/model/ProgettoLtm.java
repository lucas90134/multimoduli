package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the progetto_ltm database table.
 * 
 */
@Entity
@Table(name="progetto_ltm")
@NamedQuery(name="ProgettoLtm.findAll", query="SELECT p FROM ProgettoLtm p")
public class ProgettoLtm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idProgettoLtm")
	@SequenceGenerator(name="idProgettoLtm", sequenceName = "progetto_ltm_id_progetto_ltm_seq", allocationSize=1)
	@Column(name="id_progetto_ltm")
	private Long idProgettoLtm;

	@Column(name="flag_attivo")
	private Boolean flagAttivo;

	@Column(name="progetto_ltm")
	private String progettoLtm;
	
	@JsonIgnore 
	@OneToMany(mappedBy = "progettoLtm", fetch = FetchType.LAZY) 
	private List<Focus> focus; 

	public ProgettoLtm() {
	}

	public Long getIdProgettoLtm() {
		return this.idProgettoLtm;
	}

	public void setIdProgettoLtm(Long idProgettoLtm) {
		this.idProgettoLtm = idProgettoLtm;
	}

	public Boolean getFlagAttivo() {
		return this.flagAttivo;
	}

	public void setFlagAttivo(Boolean flagAttivo) {
		this.flagAttivo = flagAttivo;
	}

	public String getProgettoLtm() {
		return this.progettoLtm;
	}

	public void setProgettoLtm(String progettoLtm) {
		this.progettoLtm = progettoLtm;
	}

	public List<Focus> getFocus() {
		return focus;
	}

	public void setFocus(List<Focus> focus) {
		this.focus = focus;
	}

}