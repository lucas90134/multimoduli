package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the CONTRATTI_LTM_SED database table.
 * 
 */
@Entity
@Table(name="CONTRATTI_LTM_SED")
@NamedQuery(name="ContrattiLtmSed.findAll", query="SELECT c FROM ContrattiLtmSed c")
public class ContrattiLtmSed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idContrattiLtmSed")
	@SequenceGenerator(name="idContrattiLtmSed", sequenceName = "contratti_ltm_sed_id_contratti_ltm_sed_seq", allocationSize=1)
	@Column(name="ID_CONTRATTI_LTM_SED")
	private Long idContrattiLtmSed;

	@JsonIgnore
	@OneToMany(mappedBy = "contrattiLtmSed", fetch = FetchType.LAZY)
	private List<Linea> linea;

	@Column(name="DESCRIZIONE")
	private String descrizione;

	@Column(name="FLAG_ARCHITETTURA")
	private String flagArchitettura;

	@Column(name="FLAG_ATTIVO")
	private String flagAttivo;

	@Column(name="FLAG_FATTURAZIONE_ATTIVA")
	private Boolean flagFatturazioneAttiva;

	@Column(name="ID_COMUNE")
	private Integer idComune;

	@Column(name="ID_SERVIZIO_LINEA_DEFAULT")
	private Integer idServizioLineaDefault;

	@Column(name="INDIRIZZO")
	private String indirizzo;

	@Column(name="LEGENDA_FATTURAZIONE")
	private String legendaFatturazione;

	@Column(name="NUMERO_CIVICO")
	private String numeroCivico;

	@Column(name="RAGIONE_SOCIALE")
	private String ragioneSociale;

	@Column(name="SEDE_LEGALE")
	private String sedeLegale;

	@Column(name="TIPO_FATTURAZIONE_ATTIVA")
	private String tipoFatturazioneAttiva;

	public Long getIdContrattiLtmSed() {
		return idContrattiLtmSed;
	}

	public void setIdContrattiLtmSed(Long idContrattiLtmSed) {
		this.idContrattiLtmSed = idContrattiLtmSed;
	}

	public List<Linea> getLinea() {
		return linea;
	}

	public void setLinea(List<Linea> linea) {
		this.linea = linea;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getFlagArchitettura() {
		return flagArchitettura;
	}

	public void setFlagArchitettura(String flagArchitettura) {
		this.flagArchitettura = flagArchitettura;
	}

	public String getFlagAttivo() {
		return flagAttivo;
	}

	public void setFlagAttivo(String flagAttivo) {
		this.flagAttivo = flagAttivo;
	}

	public Boolean getFlagFatturazioneAttiva() {
		return flagFatturazioneAttiva;
	}

	public void setFlagFatturazioneAttiva(Boolean flagFatturazioneAttiva) {
		this.flagFatturazioneAttiva = flagFatturazioneAttiva;
	}

	public Integer getIdComune() {
		return idComune;
	}

	public void setIdComune(Integer idComune) {
		this.idComune = idComune;
	}

	public Integer getIdServizioLineaDefault() {
		return idServizioLineaDefault;
	}

	public void setIdServizioLineaDefault(Integer idServizioLineaDefault) {
		this.idServizioLineaDefault = idServizioLineaDefault;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getLegendaFatturazione() {
		return legendaFatturazione;
	}

	public void setLegendaFatturazione(String legendaFatturazione) {
		this.legendaFatturazione = legendaFatturazione;
	}

	public String getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getSedeLegale() {
		return sedeLegale;
	}

	public void setSedeLegale(String sedeLegale) {
		this.sedeLegale = sedeLegale;
	}

	public String getTipoFatturazioneAttiva() {
		return tipoFatturazioneAttiva;
	}

	public void setTipoFatturazioneAttiva(String tipoFatturazioneAttiva) {
		this.tipoFatturazioneAttiva = tipoFatturazioneAttiva;
	}
	
}
