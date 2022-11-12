package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the location database table.
 * 
 */
@Entity
@NamedQuery(name="Location.findAll", query="SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	private String civico;

	@Column(name="codice_location_sed")
	private String codiceLocationSed;

	@Column(name="id_comune")
	private Long idComune;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idLocationSed")
	@SequenceGenerator(name="idLocationSed", sequenceName = "location_id_location_sed_seq", allocationSize=1)
	@Column(name="id_location_sed")
	private Long idLocationSed;

	private String indirizzo;

	private String toponimo;

	public Location() {
	}

	public String getCivico() {
		return this.civico;
	}

	public void setCivico(String civico) {
		this.civico = civico;
	}

	public String getCodiceLocationSed() {
		return this.codiceLocationSed;
	}

	public void setCodiceLocationSed(String codiceLocationSed) {
		this.codiceLocationSed = codiceLocationSed;
	}

	public Long getIdComune() {
		return this.idComune;
	}

	public void setIdComune(Long idComune) {
		this.idComune = idComune;
	}

	public Long getIdLocationSed() {
		return this.idLocationSed;
	}

	public void setIdLocationSed(Long idLocationSed) {
		this.idLocationSed = idLocationSed;
	}

	public String getIndirizzo() {
		return this.indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getToponimo() {
		return this.toponimo;
	}

	public void setToponimo(String toponimo) {
		this.toponimo = toponimo;
	}

}