package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the CONTRATTI_SED_FORNITORI database table.
 * 
 */
@Entity
@Table(name="CONTRATTI_SED_FORNITORI")
@NamedQuery(name="ContrattiSedFornitori.findAll", query="SELECT c FROM ContrattiSedFornitori c")
public class ContrattiSedFornitori implements Serializable {
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idContrattiSedFornitori")
	@SequenceGenerator(name="idContrattiSedFornitori", sequenceName = "contratti_sed_fornitori_id_contratti_sed_fornitori_seq", allocationSize=1)
	@Column(name="ID_CONTRATTI_SED_FORNITORI")
	private Long idContrattiSedFornitori;
	
	@JsonIgnore
	@OneToMany(mappedBy = "contrattiSedFornitori", fetch = FetchType.LAZY)
	private List<AdmContrattiSedFornitori> admContrattiSedFornitori;
	
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ANAGRAFICA_FORNITORE",insertable=false,updatable=false)
	private AnagraficaFornitore anagraficaFornitore;

	@JsonIgnore
	@OneToMany(mappedBy = "contrattiSedFornitori", fetch = FetchType.LAZY)
	private List<Linea> linea;

	@Column(name="Contratto_PDF")
	private String contrattoPDF;

	@Column(name="DESCRIZIONE")
	private String descrizione;

	@Column(name="DESCRIZIONE_TI")
	private String descrizioneTi;

	@Column(name="EMISSIONE")
	private String emissione;

	@Column(name="FLAG_ARCHITETTURA")
	private String flagArchitettura;

	@Column(name="FLAG_ATTIVO")
	private Boolean flagAttivo;

	@Column(name="FLAG_INVIO_XML_FORNITORE")
	private Boolean flagInvioXmlFornitore;

	@Column(name="ID_ANAGRAFICA_FORNITORE")
	private Long idAnagraficaFornitore;

	@Column(name="ID_SERVIZIO_LINEA_DEFAULT")
	private Integer idServizioLineaDefault;

	@Column(name="LEGENDA_FATTURAZIONE")
	private String legendaFatturazione;

	public Long getIdContrattiSedFornitori() {
		return idContrattiSedFornitori;
	}

	public void setIdContrattiSedFornitori(Long idContrattiSedFornitori) {
		this.idContrattiSedFornitori = idContrattiSedFornitori;
	}

	public List<Linea> getLinea() {
		return linea;
	}

	public void setLinea(List<Linea> linea) {
		this.linea = linea;
	}

	public String getContrattoPDF() {
		return contrattoPDF;
	}

	public void setContrattoPDF(String contrattoPDF) {
		this.contrattoPDF = contrattoPDF;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDescrizioneTi() {
		return descrizioneTi;
	}

	public void setDescrizioneTi(String descrizioneTi) {
		this.descrizioneTi = descrizioneTi;
	}

	public String getEmissione() {
		return emissione;
	}

	public void setEmissione(String emissione) {
		this.emissione = emissione;
	}

	public String getFlagArchitettura() {
		return flagArchitettura;
	}

	public void setFlagArchitettura(String flagArchitettura) {
		this.flagArchitettura = flagArchitettura;
	}

	public Boolean getFlagAttivo() {
		return flagAttivo;
	}

	public void setFlagAttivo(Boolean flagAttivo) {
		this.flagAttivo = flagAttivo;
	}

	public Boolean getFlagInvioXmlFornitore() {
		return flagInvioXmlFornitore;
	}

	public void setFlagInvioXmlFornitore(Boolean flagInvioXmlFornitore) {
		this.flagInvioXmlFornitore = flagInvioXmlFornitore;
	}

	public Long getIdAnagraficaFornitore() {
		return idAnagraficaFornitore;
	}

	public void setIdAnagraficaFornitore(Long idAnagraficaFornitore) {
		this.idAnagraficaFornitore = idAnagraficaFornitore;
	}

	public Integer getIdServizioLineaDefault() {
		return idServizioLineaDefault;
	}

	public void setIdServizioLineaDefault(Integer idServizioLineaDefault) {
		this.idServizioLineaDefault = idServizioLineaDefault;
	}

	public String getLegendaFatturazione() {
		return legendaFatturazione;
	}

	public void setLegendaFatturazione(String legendaFatturazione) {
		this.legendaFatturazione = legendaFatturazione;
	}

	public AnagraficaFornitore getAnagraficaFornitore() {
		return anagraficaFornitore;
	}

	public void setAnagraficaFornitore(AnagraficaFornitore anagraficaFornitore) {
		this.anagraficaFornitore = anagraficaFornitore;
	}

	public List<AdmContrattiSedFornitori> getAdmContrattiSedFornitori() {
		return admContrattiSedFornitori;
	}

	public void setAdmContrattiSedFornitori(List<AdmContrattiSedFornitori> admContrattiSedFornitori) {
		this.admContrattiSedFornitori = admContrattiSedFornitori;
	}
	
}
