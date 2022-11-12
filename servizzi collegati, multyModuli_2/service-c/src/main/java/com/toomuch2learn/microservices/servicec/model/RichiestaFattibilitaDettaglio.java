package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the richiesta_fattibilita_dettaglio database table.
 * 
 */
@Entity
@Table(name="richiesta_fattibilita_dettaglio")
@NamedQuery(name="RichiestaFattibilitaDettaglio.findAll", query="SELECT r FROM RichiestaFattibilitaDettaglio r")
public class RichiestaFattibilitaDettaglio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRichiestaFattibilitaDettaglio")
	@SequenceGenerator(name="idRichiestaFattibilitaDettaglio", sequenceName = "richiesta_fattibilita_dettagl_id_richiesta_fattibilita_dett_seq", allocationSize=1)
	@Column(name="id_richiesta_fattibilita_dettaglio")
	private Long idRichiestaFattibilitaDettaglio;

	private String copertura;

	@Column(name="data_risposta")
	private Date dataRisposta;

	private String fornitore;

	@Column(name="id_richiesta_fattibilita")
	private Long idRichiestaFattibilita;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_richiesta_fattibilita",insertable=false,updatable=false)
	private RichiestaFattibilita richiestaFattibilita;
	
	private String note;

	@Column(name="tipo_profilo")
	private String tipoProfilo;

	public RichiestaFattibilitaDettaglio() {
	}

	public Long getIdRichiestaFattibilitaDettaglio() {
		return this.idRichiestaFattibilitaDettaglio;
	}

	public void setIdRichiestaFattibilitaDettaglio(Long idRichiestaFattibilitaDettaglio) {
		this.idRichiestaFattibilitaDettaglio = idRichiestaFattibilitaDettaglio;
	}

	public String getCopertura() {
		return this.copertura;
	}

	public void setCopertura(String copertura) {
		this.copertura = copertura;
	}

	public String getFornitore() {
		return this.fornitore;
	}

	public void setFornitore(String fornitore) {
		this.fornitore = fornitore;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getTipoProfilo() {
		return this.tipoProfilo;
	}

	public void setTipoProfilo(String tipoProfilo) {
		this.tipoProfilo = tipoProfilo;
	}

	public Date getDataRisposta() {
		return dataRisposta;
	}

	public void setDataRisposta(Date dataRisposta) {
		this.dataRisposta = dataRisposta;
	}

	public Long getIdRichiestaFattibilita() {
		return idRichiestaFattibilita;
	}

	public void setIdRichiestaFattibilita(Long idRichiestaFattibilita) {
		this.idRichiestaFattibilita = idRichiestaFattibilita;
	}

	public RichiestaFattibilita getRichiestaFattibilita() {
		return richiestaFattibilita;
	}

	public void setRichiestaFattibilita(RichiestaFattibilita richiestaFattibilita) {
		this.richiestaFattibilita = richiestaFattibilita;
	}

}