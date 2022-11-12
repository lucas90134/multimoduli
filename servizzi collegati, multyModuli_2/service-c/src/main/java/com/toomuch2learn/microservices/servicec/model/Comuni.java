package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the comuni database table.
 * 
 */
@Entity
@NamedQuery(name="Comuni.findAll", query="SELECT c FROM Comuni c")
public class Comuni implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cap;

	@Column(name="cod_istat")
	private String codIstat;

	private String comune;

	@Column(name="id_area_geografica")
	private Integer idAreaGeografica;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_area_geografica",insertable=false,updatable=false)
	private L2tpAreaGeografica l2tpAreaGeografica;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idComune")
	@SequenceGenerator(name="idComune", sequenceName = "comuni_id_comune_seq", allocationSize=1)
	@Column(name="id_comune")
	private Long idComune;

	private String prefisso;

	private String provincia;

	private String regione;

	public Comuni() {
	}

	public String getCap() {
		return this.cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getCodIstat() {
		return this.codIstat;
	}

	public void setCodIstat(String codIstat) {
		this.codIstat = codIstat;
	}

	public String getComune() {
		return this.comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public Integer getIdAreaGeografica() {
		return this.idAreaGeografica;
	}

	public void setIdAreaGeografica(Integer idAreaGeografica) {
		this.idAreaGeografica = idAreaGeografica;
	}

	public Long getIdComune() {
		return this.idComune;
	}

	public void setIdComune(Long idComune) {
		this.idComune = idComune;
	}

	public String getPrefisso() {
		return this.prefisso;
	}

	public void setPrefisso(String prefisso) {
		this.prefisso = prefisso;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getRegione() {
		return this.regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public L2tpAreaGeografica getL2tpAreaGeografica() {
		return l2tpAreaGeografica;
	}

	public void setL2tpAreaGeografica(L2tpAreaGeografica l2tpAreaGeografica) {
		this.l2tpAreaGeografica = l2tpAreaGeografica;
	}

}