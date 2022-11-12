package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

/**
 * The persistent class for the test_pingone database table.
 * 
 */
@Entity
@Table(name="test_pingone")
@NamedQuery(name="TestPingone.findAll", query="SELECT t FROM TestPingone t")
public class TestPingone implements Serializable {
	private static final long serialVersionUID = 1L;

	private String codice;

	@Column(name="data_48h")
	private Date data48h;

	@Column(name="data_inizio_test")
	private Date dataInizioTest;

	@Column(name="dettaglio_test_rapido")
	private String dettaglioTestRapido;

	@Column(name="esito_48h")
	private String esito48h;

	@Column(name="esito_veloce")
	private String esitoVeloce;

	@Column(name="flg_cambio_stato")
	private Integer flgCambioStato;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="id_provider_linea")
	private Integer idProviderLinea;

	@Id
	@Column(name="id_test_pingone")
	private Long idTestPingone;

	@Column(name="intervalli_max_3600")
	private String intervalliMax3600;

	private String ip;

	@Column(name="max_persi_comtinui")
	private String maxPersiComtinui;

	private String note;

	@Column(name="pac_persi")
	private String pacPersi;

	@Column(name="pac_persi_interrruzione_max_1h")
	private String pacPersiInterrruzioneMax1h;

	@Column(name="pac_tot_inviati")
	private String pacTotInviati;

	@Column(name="ping_timestamp")
	private Integer pingTimestamp;

	public TestPingone() {
	}

	public String getCodice() {
		return this.codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public Date getData48h() {
		return this.data48h;
	}

	public void setData48h(Date data48h) {
		this.data48h = data48h;
	}

	public Date getDataInizioTest() {
		return this.dataInizioTest;
	}

	public void setDataInizioTest(Date dataInizioTest) {
		this.dataInizioTest = dataInizioTest;
	}

	public String getDettaglioTestRapido() {
		return this.dettaglioTestRapido;
	}

	public void setDettaglioTestRapido(String dettaglioTestRapido) {
		this.dettaglioTestRapido = dettaglioTestRapido;
	}

	public String getEsito48h() {
		return this.esito48h;
	}

	public void setEsito48h(String esito48h) {
		this.esito48h = esito48h;
	}

	public String getEsitoVeloce() {
		return this.esitoVeloce;
	}

	public void setEsitoVeloce(String esitoVeloce) {
		this.esitoVeloce = esitoVeloce;
	}

	public Integer getFlgCambioStato() {
		return this.flgCambioStato;
	}

	public void setFlgCambioStato(Integer flgCambioStato) {
		this.flgCambioStato = flgCambioStato;
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Integer getIdProviderLinea() {
		return this.idProviderLinea;
	}

	public void setIdProviderLinea(Integer idProviderLinea) {
		this.idProviderLinea = idProviderLinea;
	}

	public Long getIdTestPingone() {
		return this.idTestPingone;
	}

	public void setIdTestPingone(Long idTestPingone) {
		this.idTestPingone = idTestPingone;
	}

	public String getIntervalliMax3600() {
		return this.intervalliMax3600;
	}

	public void setIntervalliMax3600(String intervalliMax3600) {
		this.intervalliMax3600 = intervalliMax3600;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMaxPersiComtinui() {
		return this.maxPersiComtinui;
	}

	public void setMaxPersiComtinui(String maxPersiComtinui) {
		this.maxPersiComtinui = maxPersiComtinui;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPacPersi() {
		return this.pacPersi;
	}

	public void setPacPersi(String pacPersi) {
		this.pacPersi = pacPersi;
	}

	public String getPacPersiInterrruzioneMax1h() {
		return this.pacPersiInterrruzioneMax1h;
	}

	public void setPacPersiInterrruzioneMax1h(String pacPersiInterrruzioneMax1h) {
		this.pacPersiInterrruzioneMax1h = pacPersiInterrruzioneMax1h;
	}

	public String getPacTotInviati() {
		return this.pacTotInviati;
	}

	public void setPacTotInviati(String pacTotInviati) {
		this.pacTotInviati = pacTotInviati;
	}

	public Integer getPingTimestamp() {
		return this.pingTimestamp;
	}

	public void setPingTimestamp(Integer pingTimestamp) {
		this.pingTimestamp = pingTimestamp;
	}

}