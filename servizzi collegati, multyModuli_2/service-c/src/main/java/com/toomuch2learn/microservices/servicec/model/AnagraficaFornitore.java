package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;

import javax.persistence.*;
/**
 * The persistent class for the business_sede database table.
 * 
 */
@Entity
@Table(name="anagrafica_fornitore")
@NamedQuery(name="AnagraficaFornitore.findAll", query="SELECT b FROM AnagraficaFornitore b")
public class AnagraficaFornitore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idAnagraficaFornitore")
	@SequenceGenerator(name="idAnagraficaFornitore", sequenceName = "anagrafica_fornitore_id_anagrafica_fornitore_seq", allocationSize=1)
	@Column(name="id_anagrafica_fornitore")
	private Long idAnagraficaFornitore;

	private String descrizione;
	
	@Column(name = "flag_attivo")
	private String flagAttivo;
	
	public AnagraficaFornitore() {
	}

	public Long getIdAnagraficaFornitore() {
		return idAnagraficaFornitore;
	}

	public void setIdAnagraficaFornitore(Long idAnagraficaFornitore) {
		this.idAnagraficaFornitore = idAnagraficaFornitore;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getFlagAttivo() {
		return flagAttivo;
	}

	public void setFlagAttivo(String flagAttivo) {
		this.flagAttivo = flagAttivo;
	}


}