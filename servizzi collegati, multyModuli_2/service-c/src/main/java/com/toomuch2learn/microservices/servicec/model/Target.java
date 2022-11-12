package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;

import javax.persistence.*;
/**
 * The persistent class for the target database table.
 * 
 */
@Entity
@NamedQuery(name="Target.findAll", query="SELECT t FROM Target t")
public class Target implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descrizione;

	@Column(name="flag_attivo")
	private Integer flagAttivo;

	@Column(name="id_business_sede")
	private Long idBusinessSede;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idTarget")
	@SequenceGenerator(name="idTarget", sequenceName = "target_id_target_seq", allocationSize=1)
	@Column(name="id_target")
	private Long idTarget;

//	@Column(name="limite_max")
//	private Integer limiteMax;
//
//	@Column(name="limite_min")
//	private Integer limiteMin;

	private String sigla;

	public Target() {
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Integer getFlagAttivo() {
		return this.flagAttivo;
	}

	public void setFlagAttivo(Integer flagAttivo) {
		this.flagAttivo = flagAttivo;
	}

	public Long getIdBusinessSede() {
		return this.idBusinessSede;
	}

	public void setIdBusinessSede(Long idBusinessSede) {
		this.idBusinessSede = idBusinessSede;
	}

	public Long getIdTarget() {
		return this.idTarget;
	}

	public void setIdTarget(Long idTarget) {
		this.idTarget = idTarget;
	}

//	public Integer getLimiteMax() {
//		return this.limiteMax;
//	}
//
//	public void setLimiteMax(Integer limiteMax) {
//		this.limiteMax = limiteMax;
//	}
//
//	public Integer getLimiteMin() {
//		return this.limiteMin;
//	}
//
//	public void setLimiteMin(Integer limiteMin) {
//		this.limiteMin = limiteMin;
//	}

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}