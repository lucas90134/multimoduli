package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the linee_fatturazione_storico database table.
 * 
 */
@Entity
@Table(name="linee_fatturazione_storico")
@NamedQuery(name="LineeFatturazioneStorico.findAll", query="SELECT l FROM LineeFatturazioneStorico l")
public class LineeFatturazioneStorico implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long competenza;

	@Column(name="contratto_pdf")
	private String contrattoPdf;

	@Column(name="data_storicizzazione")
	private Date dataStoricizzazione;

	private String descrizione;

	private String emissione;

	@Column(name="id_contratti_ltm_sed")
	private Long idContrattiLtmSed;

	@Column(name="id_contratti_sed_fornitori")
	private Long idContrattiSedFornitori;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idMarker")
	@SequenceGenerator(name="idMarker", sequenceName = "linee_fatturazione_storico_id_marker_seq", allocationSize=1)
	@Column(name="id_marker")
	private Long idMarker;

	@Column(name="intestazione_canone")
	private String intestazioneCanone;

	@Column(name="intestazione_ut")
	private String intestazioneUt;

	private String legenda;

	@Column(name="user_mod")
	private String userMod;

	public LineeFatturazioneStorico() {
	}

	public Long getCompetenza() {
		return this.competenza;
	}

	public void setCompetenza(Long competenza) {
		this.competenza = competenza;
	}

	public String getContrattoPdf() {
		return this.contrattoPdf;
	}

	public void setContrattoPdf(String contrattoPdf) {
		this.contrattoPdf = contrattoPdf;
	}

	public Date getDataStoricizzazione() {
		return this.dataStoricizzazione;
	}

	public void setDataStoricizzazione(Date dataStoricizzazione) {
		this.dataStoricizzazione = dataStoricizzazione;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getEmissione() {
		return this.emissione;
	}

	public void setEmissione(String emissione) {
		this.emissione = emissione;
	}

	public Long getIdContrattiLtmSed() {
		return this.idContrattiLtmSed;
	}

	public void setIdContrattiLtmSed(Long idContrattiLtmSed) {
		this.idContrattiLtmSed = idContrattiLtmSed;
	}

	public Long getIdContrattiSedFornitori() {
		return this.idContrattiSedFornitori;
	}

	public void setIdContrattiSedFornitori(Long idContrattiSedFornitori) {
		this.idContrattiSedFornitori = idContrattiSedFornitori;
	}

	public Long getIdMarker() {
		return this.idMarker;
	}

	public void setIdMarker(Long idMarker) {
		this.idMarker = idMarker;
	}

	public String getIntestazioneCanone() {
		return this.intestazioneCanone;
	}

	public void setIntestazioneCanone(String intestazioneCanone) {
		this.intestazioneCanone = intestazioneCanone;
	}

	public String getIntestazioneUt() {
		return this.intestazioneUt;
	}

	public void setIntestazioneUt(String intestazioneUt) {
		this.intestazioneUt = intestazioneUt;
	}

	public String getLegenda() {
		return this.legenda;
	}

	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

}