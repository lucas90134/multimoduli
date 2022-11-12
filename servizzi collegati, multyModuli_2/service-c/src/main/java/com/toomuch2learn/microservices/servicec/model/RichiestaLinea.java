package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the richiesta_linea database table.
 * 
 */
@Entity
@Table(name="richiesta_linea")
@NamedQuery(name="RichiestaLinea.findAll", query="SELECT r FROM RichiestaLinea r")
public class RichiestaLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRichiestaLinea")
	@SequenceGenerator(name="idRichiestaLinea", sequenceName = "richiesta_linea_id_richiesta_linea_seq", allocationSize=1)
	@Column(name="id_richiesta_linea")
	private Long idRichiestaLinea;
	
	@JsonIgnore
	@OneToMany(mappedBy = "richiestaLinea", fetch = FetchType.LAZY)
	private List<Linea> linea;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_dettaglio_richiesta",insertable=false,updatable=false)
	private DettaglioRichiesta dettaglioRichiesta;
	
	private String cap;

	@Column(name="cell_intestatario")
	private String cellIntestatario;

	@Column(name="cell_referente")
	private String cellReferente;

	@Column(name="cod_cliente_finale")
	private String codClienteFinale;

	@Column(name="cod_cliente_finale_new")
	private String codClienteFinaleNew;

	@Column(name="cod_istat")
	private String codIstat;

	@Column(name="cod_progressivo_ltm")
	private Long codProgressivoLtm;

	@Column(name="codice_db_vlt")
	private Long codiceDbVlt;

	@Column(name="cognome_intestatario")
	private String cognomeIntestatario;

	private String comune;

	@Column(name="comunicazione_bu")
	private String comunicazioneBu;

	@Column(name="data_comunicazione_bu")
	private Date dataComunicazioneBu;

	@Column(name="data_richiesta")
	private Date dataRichiesta;

	@Column(name="data_stato")
	private Date dataStato;

	@Column(name="data_target")
	private Date dataTarget;

	@Column(name="data_target_previsto")
	private Date dataTargetPrevisto;

	@Column(name="default_gateway")
	private String defaultGateway;

	@Column(name="desc_sede")
	private String descSede;

	@Column(name="email_intestatario")
	private String emailIntestatario;

	@Column(name="email_referente")
	private String emailReferente;

	private String esercizio;

	@Column(name="flag_vlt")
	private Boolean flagVlt;

	private Long focus;

	private String gestore;

	@Column(name="id_amministrativo")
	private String idAmministrativo;

	@Column(name="id_comune")
	private Long idComune;

	@Column(name="id_contratto_ltm_sed")
	private Long idContrattoLtmSed;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_contratto_ltm_sed",insertable=false,updatable=false)
	private ContrattiLtmSed contrattiLtmSed;

	@Column(name="id_dettaglio_richiesta")
	private Long idDettaglioRichiesta;

	@Column(name="id_durata")
	private Integer idDurata;

	@Column(name="id_gruppo")
	private Integer idGruppo;

	@Column(name="id_progetto_cliente")
	private Integer idProgettoCliente;

	@Column(name="id_richiesta_linea_padre")
	private Long idRichiestaLineaPadre;

	@Column(name="id_sede")
	private Long idSede;
	
	@Column(name="id_stato_richiesta")
	private Long idStatoRichiesta;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_stato_richiesta",insertable=false,updatable=false)
	private StatoRichiesta statoRichiesta;

	@Column(name="id_target")
	private Long idTarget;

	@Column(name="id_target_previsto")
	private Integer idTargetPrevisto;

	@Column(name="id_tipo_linea_richiesta")
	private Long idTipoLineaRichiesta;

	private String indirizzo;

	private String localita;

	@Column(name="mq_sede")
	private String mqSede;

	@Column(name="mq_sede_previsto")
	private String mqSedePrevisto;

	@Column(name="nome_intestatario")
	private String nomeIntestatario;

	@Column(name="nominativo_referente")
	private String nominativoReferente;

	private String note;

	@Column(name="note_cliente")
	private String noteCliente;

	@Column(name="note_sede")
	private String noteSede;

	@Column(name="num_lan_mag")
	private Long numLanMag;

	@Column(name="num_lan_mag_previsto")
	private Long numLanMagPrevisto;

	@Column(name="num_lan_playtec")
	private Long numLanPlaytec;

	@Column(name="num_lan_playtec_previsto")
	private Long numLanPlaytecPrevisto;

	@Column(name="num_vlt_a_regime")
	private String numVltARegime;

	@Column(name="num_vlt_a_regime_previsto")
	private String numVltARegimePrevisto;

	@Column(name="num_vlt_inspired")
	private String numVltInspired;

	@Column(name="num_vlt_inspired_previsto")
	private String numVltInspiredPrevisto;

	@Column(name="num_vlt_no_spielo")
	private String numVltNoSpielo;

	@Column(name="num_vlt_no_spielo_previsto")
	private String numVltNoSpieloPrevisto;

	private String provincia;

	@Column(name="ragione_sociale")
	private String ragioneSociale;

	@Column(name="recapito_alternativo")
	private String recapitoAlternativo;

	private String responsabile;

	private Integer riutilizzo;

	@Column(name="tel_referente")
	private String telReferente;

	@Column(name="telefono_intestatario")
	private String telefonoIntestatario;

	@Column(name="user_mod")
	private String userMod;

	private Integer vip;

	@Column(name="vlt_bally")
	private String vltBally;

	@Column(name="vlt_bally_previsto")
	private String vltBallyPrevisto;

	@Column(name="vlt_totali_s_n_i")
	private Integer vltTotaliSNI;

	@Column(name="vlt_totali_s_n_i_previsto")
	private Integer vltTotaliSNIPrevisto;

	@Transient
	private String descrizioneDettaglioRichiesta;
	
	public RichiestaLinea() {
	}

	public Long getIdRichiestaLinea() {
		return this.idRichiestaLinea;
	}

	public void setIdRichiestaLinea(Long idRichiestaLinea) {
		this.idRichiestaLinea = idRichiestaLinea;
	}

	public String getCap() {
		return this.cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getCellIntestatario() {
		return this.cellIntestatario;
	}

	public void setCellIntestatario(String cellIntestatario) {
		this.cellIntestatario = cellIntestatario;
	}

	public String getCellReferente() {
		return this.cellReferente;
	}

	public void setCellReferente(String cellReferente) {
		this.cellReferente = cellReferente;
	}

	public String getCodClienteFinale() {
		return this.codClienteFinale;
	}

	public void setCodClienteFinale(String codClienteFinale) {
		this.codClienteFinale = codClienteFinale;
	}

	public String getCodClienteFinaleNew() {
		return this.codClienteFinaleNew;
	}

	public void setCodClienteFinaleNew(String codClienteFinaleNew) {
		this.codClienteFinaleNew = codClienteFinaleNew;
	}

	public String getCodIstat() {
		return this.codIstat;
	}

	public void setCodIstat(String codIstat) {
		this.codIstat = codIstat;
	}

	public Long getCodProgressivoLtm() {
		return this.codProgressivoLtm;
	}

	public void setCodProgressivoLtm(Long codProgressivoLtm) {
		this.codProgressivoLtm = codProgressivoLtm;
	}

	public Long getCodiceDbVlt() {
		return this.codiceDbVlt;
	}

	public void setCodiceDbVlt(Long codiceDbVlt) {
		this.codiceDbVlt = codiceDbVlt;
	}

	public String getCognomeIntestatario() {
		return this.cognomeIntestatario;
	}

	public void setCognomeIntestatario(String cognomeIntestatario) {
		this.cognomeIntestatario = cognomeIntestatario;
	}

	public String getComune() {
		return this.comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getComunicazioneBu() {
		return this.comunicazioneBu;
	}

	public void setComunicazioneBu(String comunicazioneBu) {
		this.comunicazioneBu = comunicazioneBu;
	}

	public Date getDataComunicazioneBu() {
		return this.dataComunicazioneBu;
	}

	public void setDataComunicazioneBu(Date dataComunicazioneBu) {
		this.dataComunicazioneBu = dataComunicazioneBu;
	}

	public Date getDataRichiesta() {
		return this.dataRichiesta;
	}

	public void setDataRichiesta(Date dataRichiesta) {
		this.dataRichiesta = dataRichiesta;
	}

	public Date getDataStato() {
		return this.dataStato;
	}

	public void setDataStato(Date dataStato) {
		this.dataStato = dataStato;
	}

	public Date getDataTarget() {
		return this.dataTarget;
	}

	public void setDataTarget(Date dataTarget) {
		this.dataTarget = dataTarget;
	}

	public Date getDataTargetPrevisto() {
		return this.dataTargetPrevisto;
	}

	public void setDataTargetPrevisto(Date dataTargetPrevisto) {
		this.dataTargetPrevisto = dataTargetPrevisto;
	}

	public String getDefaultGateway() {
		return this.defaultGateway;
	}

	public void setDefaultGateway(String defaultGateway) {
		this.defaultGateway = defaultGateway;
	}

	public String getDescSede() {
		return this.descSede;
	}

	public void setDescSede(String descSede) {
		this.descSede = descSede;
	}

	public String getEmailIntestatario() {
		return this.emailIntestatario;
	}

	public void setEmailIntestatario(String emailIntestatario) {
		this.emailIntestatario = emailIntestatario;
	}

	public String getEmailReferente() {
		return this.emailReferente;
	}

	public void setEmailReferente(String emailReferente) {
		this.emailReferente = emailReferente;
	}

	public String getEsercizio() {
		return this.esercizio;
	}

	public void setEsercizio(String esercizio) {
		this.esercizio = esercizio;
	}

	public Boolean getFlagVlt() {
		return this.flagVlt;
	}

	public void setFlagVlt(Boolean flagVlt) {
		this.flagVlt = flagVlt;
	}

	public Long getFocus() {
		return this.focus;
	}

	public void setFocus(Long focus) {
		this.focus = focus;
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

	public Long getIdComune() {
		return this.idComune;
	}

	public void setIdComune(Long idComune) {
		this.idComune = idComune;
	}

	public Long getIdContrattoLtmSed() {
		return this.idContrattoLtmSed;
	}

	public void setIdContrattoLtmSed(Long idContrattoLtmSed) {
		this.idContrattoLtmSed = idContrattoLtmSed;
	}

	public Long getIdDettaglioRichiesta() {
		return this.idDettaglioRichiesta;
	}

	public void setIdDettaglioRichiesta(Long idDettaglioRichiesta) {
		this.idDettaglioRichiesta = idDettaglioRichiesta;
	}

	public Integer getIdDurata() {
		return this.idDurata;
	}

	public void setIdDurata(Integer idDurata) {
		this.idDurata = idDurata;
	}

	public Integer getIdGruppo() {
		return this.idGruppo;
	}

	public void setIdGruppo(Integer idGruppo) {
		this.idGruppo = idGruppo;
	}

	public Integer getIdProgettoCliente() {
		return this.idProgettoCliente;
	}

	public void setIdProgettoCliente(Integer idProgettoCliente) {
		this.idProgettoCliente = idProgettoCliente;
	}

	public Long getIdRichiestaLineaPadre() {
		return this.idRichiestaLineaPadre;
	}

	public void setIdRichiestaLineaPadre(Long idRichiestaLineaPadre) {
		this.idRichiestaLineaPadre = idRichiestaLineaPadre;
	}

	public Long getIdSede() {
		return this.idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public Long getIdStatoRichiesta() {
		return this.idStatoRichiesta;
	}

	public void setIdStatoRichiesta(Long idStatoRichiesta) {
		this.idStatoRichiesta = idStatoRichiesta;
	}

	public Long getIdTarget() {
		return this.idTarget;
	}

	public void setIdTarget(Long idTarget) {
		this.idTarget = idTarget;
	}

	public Integer getIdTargetPrevisto() {
		return this.idTargetPrevisto;
	}

	public void setIdTargetPrevisto(Integer idTargetPrevisto) {
		this.idTargetPrevisto = idTargetPrevisto;
	}

	public Long getIdTipoLineaRichiesta() {
		return this.idTipoLineaRichiesta;
	}

	public void setIdTipoLineaRichiesta(Long idTipoLineaRichiesta) {
		this.idTipoLineaRichiesta = idTipoLineaRichiesta;
	}

	public String getIndirizzo() {
		return this.indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getLocalita() {
		return this.localita;
	}

	public void setLocalita(String localita) {
		this.localita = localita;
	}

	public String getMqSede() {
		return this.mqSede;
	}

	public void setMqSede(String mqSede) {
		this.mqSede = mqSede;
	}

	public String getMqSedePrevisto() {
		return this.mqSedePrevisto;
	}

	public void setMqSedePrevisto(String mqSedePrevisto) {
		this.mqSedePrevisto = mqSedePrevisto;
	}

	public String getNomeIntestatario() {
		return this.nomeIntestatario;
	}

	public void setNomeIntestatario(String nomeIntestatario) {
		this.nomeIntestatario = nomeIntestatario;
	}

	public String getNominativoReferente() {
		return this.nominativoReferente;
	}

	public void setNominativoReferente(String nominativoReferente) {
		this.nominativoReferente = nominativoReferente;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNoteCliente() {
		return this.noteCliente;
	}

	public void setNoteCliente(String noteCliente) {
		this.noteCliente = noteCliente;
	}

	public String getNoteSede() {
		return this.noteSede;
	}

	public void setNoteSede(String noteSede) {
		this.noteSede = noteSede;
	}

	public Long getNumLanMag() {
		return this.numLanMag;
	}

	public void setNumLanMag(Long numLanMag) {
		this.numLanMag = numLanMag;
	}

	public Long getNumLanMagPrevisto() {
		return this.numLanMagPrevisto;
	}

	public void setNumLanMagPrevisto(Long numLanMagPrevisto) {
		this.numLanMagPrevisto = numLanMagPrevisto;
	}

	public Long getNumLanPlaytec() {
		return this.numLanPlaytec;
	}

	public void setNumLanPlaytec(Long numLanPlaytec) {
		this.numLanPlaytec = numLanPlaytec;
	}

	public Long getNumLanPlaytecPrevisto() {
		return this.numLanPlaytecPrevisto;
	}

	public void setNumLanPlaytecPrevisto(Long numLanPlaytecPrevisto) {
		this.numLanPlaytecPrevisto = numLanPlaytecPrevisto;
	}

	public String getNumVltARegime() {
		return this.numVltARegime;
	}

	public void setNumVltARegime(String numVltARegime) {
		this.numVltARegime = numVltARegime;
	}

	public String getNumVltARegimePrevisto() {
		return this.numVltARegimePrevisto;
	}

	public void setNumVltARegimePrevisto(String numVltARegimePrevisto) {
		this.numVltARegimePrevisto = numVltARegimePrevisto;
	}

	public String getNumVltInspired() {
		return this.numVltInspired;
	}

	public void setNumVltInspired(String numVltInspired) {
		this.numVltInspired = numVltInspired;
	}

	public String getNumVltInspiredPrevisto() {
		return this.numVltInspiredPrevisto;
	}

	public void setNumVltInspiredPrevisto(String numVltInspiredPrevisto) {
		this.numVltInspiredPrevisto = numVltInspiredPrevisto;
	}

	public String getNumVltNoSpielo() {
		return this.numVltNoSpielo;
	}

	public void setNumVltNoSpielo(String numVltNoSpielo) {
		this.numVltNoSpielo = numVltNoSpielo;
	}

	public String getNumVltNoSpieloPrevisto() {
		return this.numVltNoSpieloPrevisto;
	}

	public void setNumVltNoSpieloPrevisto(String numVltNoSpieloPrevisto) {
		this.numVltNoSpieloPrevisto = numVltNoSpieloPrevisto;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getRagioneSociale() {
		return this.ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getRecapitoAlternativo() {
		return this.recapitoAlternativo;
	}

	public void setRecapitoAlternativo(String recapitoAlternativo) {
		this.recapitoAlternativo = recapitoAlternativo;
	}

	public String getResponsabile() {
		return this.responsabile;
	}

	public void setResponsabile(String responsabile) {
		this.responsabile = responsabile;
	}

	public Integer getRiutilizzo() {
		return this.riutilizzo;
	}

	public void setRiutilizzo(Integer riutilizzo) {
		this.riutilizzo = riutilizzo;
	}

	public String getTelReferente() {
		return this.telReferente;
	}

	public void setTelReferente(String telReferente) {
		this.telReferente = telReferente;
	}

	public String getTelefonoIntestatario() {
		return this.telefonoIntestatario;
	}

	public void setTelefonoIntestatario(String telefonoIntestatario) {
		this.telefonoIntestatario = telefonoIntestatario;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public Integer getVip() {
		return this.vip;
	}

	public void setVip(Integer vip) {
		this.vip = vip;
	}

	public String getVltBally() {
		return this.vltBally;
	}

	public void setVltBally(String vltBally) {
		this.vltBally = vltBally;
	}

	public String getVltBallyPrevisto() {
		return this.vltBallyPrevisto;
	}

	public void setVltBallyPrevisto(String vltBallyPrevisto) {
		this.vltBallyPrevisto = vltBallyPrevisto;
	}

	public Integer getVltTotaliSNI() {
		return this.vltTotaliSNI;
	}

	public void setVltTotaliSNI(Integer vltTotaliSNI) {
		this.vltTotaliSNI = vltTotaliSNI;
	}

	public Integer getVltTotaliSNIPrevisto() {
		return this.vltTotaliSNIPrevisto;
	}

	public void setVltTotaliSNIPrevisto(Integer vltTotaliSNIPrevisto) {
		this.vltTotaliSNIPrevisto = vltTotaliSNIPrevisto;
	}

	public List<Linea> getLinea() {
		return linea;
	}

	public void setLinea(List<Linea> linea) {
		this.linea = linea;
	}

	public DettaglioRichiesta getDettaglioRichiesta() {
		return dettaglioRichiesta;
	}

	public void setDettaglioRichiesta(DettaglioRichiesta dettaglioRichiesta) {
		this.dettaglioRichiesta = dettaglioRichiesta;
	}

	public String getDescrizioneDettaglioRichiesta() {
		return descrizioneDettaglioRichiesta;
	}

	public void setDescrizioneDettaglioRichiesta(String descrizioneDettaglioRichiesta) {
		this.descrizioneDettaglioRichiesta = descrizioneDettaglioRichiesta;
	}

	public ContrattiLtmSed getContrattiLtmSed() {
		return contrattiLtmSed;
	}

	public void setContrattiLtmSed(ContrattiLtmSed contrattiLtmSed) {
		this.contrattiLtmSed = contrattiLtmSed;
	}

	public StatoRichiesta getStatoRichiesta() {
		return statoRichiesta;
	}

	public void setStatoRichiesta(StatoRichiesta statoRichiesta) {
		this.statoRichiesta = statoRichiesta;
	}

}