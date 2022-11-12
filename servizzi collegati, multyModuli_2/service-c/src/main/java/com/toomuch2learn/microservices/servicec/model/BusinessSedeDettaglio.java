package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the business_sede_dettaglio database table.
 * 
 */
@Entity
@Table(name="business_sede_dettaglio")
@NamedQuery(name="BusinessSedeDettaglio.findAll", query="SELECT b FROM BusinessSedeDettaglio b")
public class BusinessSedeDettaglio implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descrizione;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idBusinessSedeDettaglio")
	@SequenceGenerator(name="idBusinessSedeDettaglio", sequenceName = "business_sede_dettaglio_id_business_sede_dettaglio_seq", allocationSize=1)
	@Column(name="id_business_sede_dettaglio")
	private Long idBusinessSedeDettaglio;

	public BusinessSedeDettaglio() {
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getIdBusinessSedeDettaglio() {
		return this.idBusinessSedeDettaglio;
	}

	public void setIdBusinessSedeDettaglio(Long idBusinessSedeDettaglio) {
		this.idBusinessSedeDettaglio = idBusinessSedeDettaglio;
	}

}