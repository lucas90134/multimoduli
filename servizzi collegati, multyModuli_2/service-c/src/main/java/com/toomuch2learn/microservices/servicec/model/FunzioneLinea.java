package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the funzione_linea database table.
 * 
 */
@Entity
@Table(name="funzione_linea")
@NamedQuery(name="FunzioneLinea.findAll", query="SELECT f FROM FunzioneLinea f")
public class FunzioneLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idFunzioneLinea")
	@SequenceGenerator(name="idFunzioneLinea", sequenceName = "funzione_linea_id_funzione_linea_seq", allocationSize=1)
	@Column(name="id_funzione_linea")
	private Long idFunzioneLinea;

	private Boolean abilitato;

	private String descrizione;

	@Column(name="id_contratto_ltm_sed")
	private Integer idContrattoLtmSed;

	public FunzioneLinea() {
	}

	public Long getIdFunzioneLinea() {
		return this.idFunzioneLinea;
	}

	public void setIdFunzioneLinea(Long idFunzioneLinea) {
		this.idFunzioneLinea = idFunzioneLinea;
	}

	public Boolean getAbilitato() {
		return this.abilitato;
	}

	public void setAbilitato(Boolean abilitato) {
		this.abilitato = abilitato;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Integer getIdContrattoLtmSed() {
		return this.idContrattoLtmSed;
	}

	public void setIdContrattoLtmSed(Integer idContrattoLtmSed) {
		this.idContrattoLtmSed = idContrattoLtmSed;
	}

}