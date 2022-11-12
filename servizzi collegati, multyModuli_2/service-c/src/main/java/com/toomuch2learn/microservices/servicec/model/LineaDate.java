package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the linea_date database table.
 * 
 */
@Entity
@Table(name="linea_date")
@NamedQuery(name="LineaDate.findAll", query="SELECT l FROM LineaDate l")
public class LineaDate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_linea")
	private Long idLinea;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "ID_LINEA",insertable=false,updatable=false)
	private Linea linea;

	@Column(name="data_annullamento")
	private Date dataAnnullamento;

	@Column(name="data_appuntamento")
	private Date dataAppuntamento;

	@Column(name="data_attesa_fattibilita")
	private Date dataAttesaFattibilita;

	@Column(name="data_attivazione")
	private Date dataAttivazione;

	@Column(name="data_cessabile")
	private Date dataCessabile;

	@Column(name="data_cessazione")
	private Date dataCessazione;

	@Column(name="data_emissione_ol")
	private Date dataEmissioneOl;

	@Column(name="data_fattibilita")
	private Date dataFattibilita;

	@Column(name="data_guasta")
	private Date dataGuasta;

	@Column(name="data_non_conforme")
	private Date dataNonConforme;

	@Column(name="data_non_esercibile_p")
	private Date dataNonEsercibileP;

	@Column(name="data_non_fattibile")
	private Date dataNonFattibile;

	@Column(name="data_non_realizzabile")
	private Date dataNonRealizzabile;

	@Column(name="data_pianificabile")
	private Date dataPianificabile;

	@Column(name="data_pianificazione")
	private Date dataPianificazione;

	@Column(name="data_richiesta")
	private Date dataRichiesta;

	@Column(name="data_rilascio_test")
	private Date dataRilascioTest;

	@Column(name="data_startup")
	private Date dataStartup;

	@Column(name="data_stato")
	private Date dataStato;

	@Column(name="data_vincolo")
	private Date dataVincolo;

	public LineaDate() {
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Date getDataAnnullamento() {
		return this.dataAnnullamento;
	}

	public void setDataAnnullamento(Date dataAnnullamento) {
		this.dataAnnullamento = dataAnnullamento;
	}

	public Date getDataAppuntamento() {
		return this.dataAppuntamento;
	}

	public void setDataAppuntamento(Date dataAppuntamento) {
		this.dataAppuntamento = dataAppuntamento;
	}

	public Date getDataAttesaFattibilita() {
		return this.dataAttesaFattibilita;
	}

	public void setDataAttesaFattibilita(Date dataAttesaFattibilita) {
		this.dataAttesaFattibilita = dataAttesaFattibilita;
	}

	public Date getDataAttivazione() {
		return this.dataAttivazione;
	}

	public void setDataAttivazione(Date dataAttivazione) {
		this.dataAttivazione = dataAttivazione;
	}

	public Date getDataCessabile() {
		return this.dataCessabile;
	}

	public void setDataCessabile(Date dataCessabile) {
		this.dataCessabile = dataCessabile;
	}

	public Date getDataCessazione() {
		return this.dataCessazione;
	}

	public void setDataCessazione(Date dataCessazione) {
		this.dataCessazione = dataCessazione;
	}

	public Date getDataEmissioneOl() {
		return this.dataEmissioneOl;
	}

	public void setDataEmissioneOl(Date dataEmissioneOl) {
		this.dataEmissioneOl = dataEmissioneOl;
	}

	public Date getDataFattibilita() {
		return this.dataFattibilita;
	}

	public void setDataFattibilita(Date dataFattibilita) {
		this.dataFattibilita = dataFattibilita;
	}

	public Date getDataGuasta() {
		return this.dataGuasta;
	}

	public void setDataGuasta(Date dataGuasta) {
		this.dataGuasta = dataGuasta;
	}

	public Date getDataNonConforme() {
		return this.dataNonConforme;
	}

	public void setDataNonConforme(Date dataNonConforme) {
		this.dataNonConforme = dataNonConforme;
	}

	public Date getDataNonEsercibileP() {
		return this.dataNonEsercibileP;
	}

	public void setDataNonEsercibileP(Date dataNonEsercibileP) {
		this.dataNonEsercibileP = dataNonEsercibileP;
	}

	public Date getDataNonFattibile() {
		return this.dataNonFattibile;
	}

	public void setDataNonFattibile(Date dataNonFattibile) {
		this.dataNonFattibile = dataNonFattibile;
	}

	public Date getDataNonRealizzabile() {
		return this.dataNonRealizzabile;
	}

	public void setDataNonRealizzabile(Date dataNonRealizzabile) {
		this.dataNonRealizzabile = dataNonRealizzabile;
	}

	public Date getDataPianificabile() {
		return this.dataPianificabile;
	}

	public void setDataPianificabile(Date dataPianificabile) {
		this.dataPianificabile = dataPianificabile;
	}

	public Date getDataPianificazione() {
		return this.dataPianificazione;
	}

	public void setDataPianificazione(Date dataPianificazione) {
		this.dataPianificazione = dataPianificazione;
	}

	public Date getDataRichiesta() {
		return this.dataRichiesta;
	}

	public void setDataRichiesta(Date dataRichiesta) {
		this.dataRichiesta = dataRichiesta;
	}

	public Date getDataRilascioTest() {
		return this.dataRilascioTest;
	}

	public void setDataRilascioTest(Date dataRilascioTest) {
		this.dataRilascioTest = dataRilascioTest;
	}

	public Date getDataStartup() {
		return this.dataStartup;
	}

	public void setDataStartup(Date dataStartup) {
		this.dataStartup = dataStartup;
	}

	public Date getDataStato() {
		return this.dataStato;
	}

	public void setDataStato(Date dataStato) {
		this.dataStato = dataStato;
	}

	public Date getDataVincolo() {
		return this.dataVincolo;
	}

	public void setDataVincolo(Date dataVincolo) {
		this.dataVincolo = dataVincolo;
	}

	public Linea getLinea() {
		return linea;
	}

	public void setLinea(Linea linea) {
		this.linea = linea;
	}

}