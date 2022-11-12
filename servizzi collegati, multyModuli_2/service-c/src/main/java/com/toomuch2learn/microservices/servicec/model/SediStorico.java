package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the sedi_storico database table.
 * 
 */
@Entity
@Table(name="sedi_storico")
@NamedQuery(name="SediStorico.findAll", query="SELECT s FROM SediStorico s")
public class SediStorico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSedeStorico")
	@SequenceGenerator(name="idSedeStorico", sequenceName = "sedi_storico_id_sede_storico_seq", allocationSize=1)
	@Column(name="id_sede_storico")
	private Long idSedeStorico;

	@Column(name="altro_recapito")
	private String altroRecapito;

	@Column(name="cell_resp_sede")
	private String cellRespSede;

	@Column(name="cod_cliente_finale")
	private String codClienteFinale;

	@Column(name="cod_progressivo_ltm")
	private Long codProgressivoLtm;

	@Column(name="codice_aams_univoco")
	private String codiceAamsUnivoco;

	@Column(name="codice_db_vlt")
	private Long codiceDbVlt;

	@Column(name="codice_sap")
	private String codiceSap;

	@Column(name="codice_sap_servizi")
	private String codiceSapServizi;

	@Column(name="codice_sede_servizi")
	private String codiceSedeServizi;

	@Column(name="codice_vl")
	private String codiceVl;

	@Column(name="codice_zucchetti")
	private String codiceZucchetti;

	@Column(name="data_cluster")
	private Date dataCluster;

	@Column(name="data_intercompany_servizio_accesso")
	private Date dataIntercompanyServizioAccesso;

	@Column(name="data_stato_sede")
	private Date dataStatoSede;

	@Column(name="data_storicizzazione")
	private Date dataStoricizzazione;

	@Column(name="data_target")
	private Date dataTarget;

	private String esercizio;

	private String gestore;

	@Column(name="id_amministrativo")
	private String idAmministrativo;

	@Column(name="id_business_sede")
	private Long idBusinessSede;

	@Column(name="id_business_sede_dettagli")
	private Long idBusinessSedeDettagli;

	@Column(name="id_cluster")
	private Long idCluster;

	@Column(name="id_codice_sed")
	private Long idCodiceSed;

	@Column(name="id_comune")
	private Long idComune;

	@Column(name="id_contratto_fatturazione")
	private Long idContrattoFatturazione;

	@Column(name="id_funzione_sede")
	private Long idFunzioneSede;

	@Column(name="id_intercompany_servizio_accesso")
	private Long idIntercompanyServizioAccesso;

	@Column(name="id_location_sed")
	private Long idLocationSed;

	@Column(name="id_sede")
	private Long idSede;

	@Column(name="id_sede_multiservizio")
	private Long idSedeMultiservizio;

	@Column(name="id_stato_sede")
	private Long idStatoSede;

	@Column(name="id_target")
	private Long idTarget;

	@Column(name="id_tipo_sede")
	private Long idTipoSede;

	private String indirizzo;

	private String mail;

	private String note;

	@Column(name="num_collegamenti")
	private String numCollegamenti;

	@Column(name="num_lan_mag")
	private Long numLanMag;

	@Column(name="num_lan_playtec")
	private Long numLanPlaytec;

	@Column(name="num_vlt_a_regime")
	private String numVltARegime;

	@Column(name="num_vlt_inspired")
	private String numVltInspired;

	@Column(name="num_vlt_no_spielo")
	private String numVltNoSpielo;

	@Column(name="operativita_sede")
	private String operativitaSede;

	private Long posizione;

	@Column(name="ragione_sociale")
	private String ragioneSociale;

	@Column(name="responsabile_sede")
	private String responsabileSede;

	@Column(name="tel_resp_sede")
	private String telRespSede;

	@Column(name="user_mod")
	private String userMod;

	@Column(name="vlt_totali")
	private String vltTotali;

	public SediStorico() {
	}

	public Long getIdSedeStorico() {
		return this.idSedeStorico;
	}

	public void setIdSedeStorico(Long idSedeStorico) {
		this.idSedeStorico = idSedeStorico;
	}

	public String getAltroRecapito() {
		return this.altroRecapito;
	}

	public void setAltroRecapito(String altroRecapito) {
		this.altroRecapito = altroRecapito;
	}

	public String getCellRespSede() {
		return this.cellRespSede;
	}

	public void setCellRespSede(String cellRespSede) {
		this.cellRespSede = cellRespSede;
	}

	public String getCodClienteFinale() {
		return this.codClienteFinale;
	}

	public void setCodClienteFinale(String codClienteFinale) {
		this.codClienteFinale = codClienteFinale;
	}

	public Long getCodProgressivoLtm() {
		return this.codProgressivoLtm;
	}

	public void setCodProgressivoLtm(Long codProgressivoLtm) {
		this.codProgressivoLtm = codProgressivoLtm;
	}

	public String getCodiceAamsUnivoco() {
		return this.codiceAamsUnivoco;
	}

	public void setCodiceAamsUnivoco(String codiceAamsUnivoco) {
		this.codiceAamsUnivoco = codiceAamsUnivoco;
	}

	public Long getCodiceDbVlt() {
		return this.codiceDbVlt;
	}

	public void setCodiceDbVlt(Long codiceDbVlt) {
		this.codiceDbVlt = codiceDbVlt;
	}

	public String getCodiceSap() {
		return this.codiceSap;
	}

	public void setCodiceSap(String codiceSap) {
		this.codiceSap = codiceSap;
	}

	public String getCodiceSapServizi() {
		return this.codiceSapServizi;
	}

	public void setCodiceSapServizi(String codiceSapServizi) {
		this.codiceSapServizi = codiceSapServizi;
	}

	public String getCodiceSedeServizi() {
		return this.codiceSedeServizi;
	}

	public void setCodiceSedeServizi(String codiceSedeServizi) {
		this.codiceSedeServizi = codiceSedeServizi;
	}

	public String getCodiceVl() {
		return this.codiceVl;
	}

	public void setCodiceVl(String codiceVl) {
		this.codiceVl = codiceVl;
	}

	public String getCodiceZucchetti() {
		return this.codiceZucchetti;
	}

	public void setCodiceZucchetti(String codiceZucchetti) {
		this.codiceZucchetti = codiceZucchetti;
	}

	public Date getDataCluster() {
		return this.dataCluster;
	}

	public void setDataCluster(Date dataCluster) {
		this.dataCluster = dataCluster;
	}

	public Date getDataIntercompanyServizioAccesso() {
		return this.dataIntercompanyServizioAccesso;
	}

	public void setDataIntercompanyServizioAccesso(Date dataIntercompanyServizioAccesso) {
		this.dataIntercompanyServizioAccesso = dataIntercompanyServizioAccesso;
	}

	public Date getDataStatoSede() {
		return this.dataStatoSede;
	}

	public void setDataStatoSede(Date dataStatoSede) {
		this.dataStatoSede = dataStatoSede;
	}

	public Date getDataStoricizzazione() {
		return this.dataStoricizzazione;
	}

	public void setDataStoricizzazione(Date dataStoricizzazione) {
		this.dataStoricizzazione = dataStoricizzazione;
	}

	public Date getDataTarget() {
		return this.dataTarget;
	}

	public void setDataTarget(Date dataTarget) {
		this.dataTarget = dataTarget;
	}

	public String getEsercizio() {
		return this.esercizio;
	}

	public void setEsercizio(String esercizio) {
		this.esercizio = esercizio;
	}

	public String getGestore() {
		return this.gestore;
	}

	public void setGestore(String gestore) {
		this.gestore = gestore;
	}

	public String getIdAmministrativo() {
		return this.idAmministrativo;
	}

	public void setIdAmministrativo(String idAmministrativo) {
		this.idAmministrativo = idAmministrativo;
	}

	public Long getIdBusinessSede() {
		return this.idBusinessSede;
	}

	public void setIdBusinessSede(Long idBusinessSede) {
		this.idBusinessSede = idBusinessSede;
	}

	public Long getIdBusinessSedeDettagli() {
		return this.idBusinessSedeDettagli;
	}

	public void setIdBusinessSedeDettagli(Long idBusinessSedeDettagli) {
		this.idBusinessSedeDettagli = idBusinessSedeDettagli;
	}

	public Long getIdCluster() {
		return this.idCluster;
	}

	public void setIdCluster(Long idCluster) {
		this.idCluster = idCluster;
	}

	public Long getIdCodiceSed() {
		return this.idCodiceSed;
	}

	public void setIdCodiceSed(Long idCodiceSed) {
		this.idCodiceSed = idCodiceSed;
	}

	public Long getIdComune() {
		return this.idComune;
	}

	public void setIdComune(Long idComune) {
		this.idComune = idComune;
	}

	public Long getIdContrattoFatturazione() {
		return this.idContrattoFatturazione;
	}

	public void setIdContrattoFatturazione(Long idContrattoFatturazione) {
		this.idContrattoFatturazione = idContrattoFatturazione;
	}

	public Long getIdFunzioneSede() {
		return this.idFunzioneSede;
	}

	public void setIdFunzioneSede(Long idFunzioneSede) {
		this.idFunzioneSede = idFunzioneSede;
	}

	public Long getIdIntercompanyServizioAccesso() {
		return this.idIntercompanyServizioAccesso;
	}

	public void setIdIntercompanyServizioAccesso(Long idIntercompanyServizioAccesso) {
		this.idIntercompanyServizioAccesso = idIntercompanyServizioAccesso;
	}

	public Long getIdLocationSed() {
		return this.idLocationSed;
	}

	public void setIdLocationSed(Long idLocationSed) {
		this.idLocationSed = idLocationSed;
	}

	public Long getIdSede() {
		return this.idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public Long getIdSedeMultiservizio() {
		return this.idSedeMultiservizio;
	}

	public void setIdSedeMultiservizio(Long idSedeMultiservizio) {
		this.idSedeMultiservizio = idSedeMultiservizio;
	}

	public Long getIdStatoSede() {
		return this.idStatoSede;
	}

	public void setIdStatoSede(Long idStatoSede) {
		this.idStatoSede = idStatoSede;
	}

	public Long getIdTarget() {
		return this.idTarget;
	}

	public void setIdTarget(Long idTarget) {
		this.idTarget = idTarget;
	}

	public Long getIdTipoSede() {
		return this.idTipoSede;
	}

	public void setIdTipoSede(Long idTipoSede) {
		this.idTipoSede = idTipoSede;
	}

	public String getIndirizzo() {
		return this.indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNumCollegamenti() {
		return this.numCollegamenti;
	}

	public void setNumCollegamenti(String numCollegamenti) {
		this.numCollegamenti = numCollegamenti;
	}

	public Long getNumLanMag() {
		return this.numLanMag;
	}

	public void setNumLanMag(Long numLanMag) {
		this.numLanMag = numLanMag;
	}

	public Long getNumLanPlaytec() {
		return this.numLanPlaytec;
	}

	public void setNumLanPlaytec(Long numLanPlaytec) {
		this.numLanPlaytec = numLanPlaytec;
	}

	public String getNumVltARegime() {
		return this.numVltARegime;
	}

	public void setNumVltARegime(String numVltARegime) {
		this.numVltARegime = numVltARegime;
	}

	public String getNumVltInspired() {
		return this.numVltInspired;
	}

	public void setNumVltInspired(String numVltInspired) {
		this.numVltInspired = numVltInspired;
	}

	public String getNumVltNoSpielo() {
		return this.numVltNoSpielo;
	}

	public void setNumVltNoSpielo(String numVltNoSpielo) {
		this.numVltNoSpielo = numVltNoSpielo;
	}

	public String getOperativitaSede() {
		return this.operativitaSede;
	}

	public void setOperativitaSede(String operativitaSede) {
		this.operativitaSede = operativitaSede;
	}

	public Long getPosizione() {
		return this.posizione;
	}

	public void setPosizione(Long posizione) {
		this.posizione = posizione;
	}

	public String getRagioneSociale() {
		return this.ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getResponsabileSede() {
		return this.responsabileSede;
	}

	public void setResponsabileSede(String responsabileSede) {
		this.responsabileSede = responsabileSede;
	}

	public String getTelRespSede() {
		return this.telRespSede;
	}

	public void setTelRespSede(String telRespSede) {
		this.telRespSede = telRespSede;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public String getVltTotali() {
		return this.vltTotali;
	}

	public void setVltTotali(String vltTotali) {
		this.vltTotali = vltTotali;
	}

}