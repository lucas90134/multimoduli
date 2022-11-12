package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the causa_non_realizzabile_linea database table.
 * 
 */
@Entity
@Table(name="causa_non_realizzabile_linea")
@NamedQuery(name="CausaNonRealizzabileLinea.findAll", query="SELECT c FROM CausaNonRealizzabileLinea c")
public class CausaNonRealizzabileLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idCausaNonRealizzabileLinea")
	@SequenceGenerator(name="idCausaNonRealizzabileLinea", sequenceName = "causa_non_realizzabile_linea_id_causa_non_realizzabile_linea_seq", allocationSize=1)
	@Column(name="id_causa_non_realizzabile_linea")
	private Long idCausaNonRealizzabileLinea;

	private String descrizione;

	public CausaNonRealizzabileLinea() {
	}

	public Long getIdCausaNonRealizzabileLinea() {
		return this.idCausaNonRealizzabileLinea;
	}

	public void setIdCausaNonRealizzabileLinea(Long idCausaNonRealizzabileLinea) {
		this.idCausaNonRealizzabileLinea = idCausaNonRealizzabileLinea;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}