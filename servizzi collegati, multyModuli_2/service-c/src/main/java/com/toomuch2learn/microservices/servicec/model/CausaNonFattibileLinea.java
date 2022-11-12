package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the causa_non_fattibile_linea database table.
 * 
 */
@Entity
@Table(name="causa_non_fattibile_linea")
@NamedQuery(name="CausaNonFattibileLinea.findAll", query="SELECT c FROM CausaNonFattibileLinea c")
public class CausaNonFattibileLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idCausaNonFattibileLinea")
	@SequenceGenerator(name="idCausaNonFattibileLinea", sequenceName = "causa_non_fattibile_linea_id_causa_non_fattibile_linea_seq", allocationSize=1)
	@Column(name="id_causa_non_fattibile_linea")
	private Long idCausaNonFattibileLinea;

	private String descrizione;

	@Column(name="id_anagrafica_fornitore")
	private Long idAnagraficaFornitore;

	public CausaNonFattibileLinea() {
	}

	public Long getIdCausaNonFattibileLinea() {
		return this.idCausaNonFattibileLinea;
	}

	public void setIdCausaNonFattibileLinea(Long idCausaNonFattibileLinea) {
		this.idCausaNonFattibileLinea = idCausaNonFattibileLinea;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getIdAnagraficaFornitore() {
		return this.idAnagraficaFornitore;
	}

	public void setIdAnagraficaFornitore(Long idAnagraficaFornitore) {
		this.idAnagraficaFornitore = idAnagraficaFornitore;
	}

}