package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the sedi database table.
 * 
 */
@Entity
@NamedQuery(name="Sedi.findAll", query="SELECT s FROM Sedi s")
@Audited
public class Sedi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSede")
	@SequenceGenerator(name="idSede", sequenceName = "sedi_id_sede_seq", allocationSize=1)
	@Column(name="id_sede")
	private Long idSede;
	
	@JsonIgnore
	@OneToMany(mappedBy = "sede", fetch = FetchType.LAZY)
	@NotAudited
	private List<BabelSwitchInventoryIndirizziOutput> babelSwitchInventoryIndirizziOutput;

	@JsonIgnore 
	@OneToMany(mappedBy = "sede", fetch = FetchType.LAZY)
	@NotAudited
	private List<MatriceLinea> matriceLinea; 

	@Column(name="id_stato_sede")
	private Long idStatoSede;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_stato_sede",insertable=false,updatable=false)
	@NotAudited
	private StatoSede statoSede;
	
	@Column(name="id_funzione_sede")
	private Long idFunzioneSede;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_funzione_sede",insertable=false,updatable=false)
	@NotAudited
	private FunzioneSede funzioneSede;

	@Column(name="id_contratto_fatturazione")
	private Long idContrattoFatturazione;

	@Column(name="altro_recapito")
	private String altroRecapito;

	@Column(name="cell_resp_sede")
	private String cellRespSede;

	@Column(name="cod_cliente_finale")
	private String codClienteFinale;

	@Column(name="cod_progressivo_ltm")
	private Long codProgressivoLtm;

	@Column(name="codice_sap")
	private String codiceSap;

	@Column(name="codice_sap_servizi")
	private String codiceSapServizi;

	@Column(name="codice_sede_servizi")
	private String codiceSedeServizi;

	@Column(name="codice_zucchetti")
	private String codiceZucchetti;

	@Column(name="data_cluster")
	private Date dataCluster;

	@Column(name="data_intercompany_servizio_accesso")
	private Date dataIntercompanyServizioAccesso;

	@Column(name="data_target")
	private Date dataTarget;

	private String esercizio;

	private String gestore;

	@Column(name="id_amministrativo")
	private String idAmministrativo;

	@Column(name="id_business_sede")
	private Long idBusinessSede;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_business_sede",insertable=false,updatable=false)
	@NotAudited
	private BusinessSede businessSede;
	
	@Column(name="id_business_sede_dettagli")
	private Long idBusinessSedeDettagli;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_business_sede_dettagli",insertable=false,updatable=false)
	@NotAudited
	private BusinessSedeDettaglio businessSedeDettagli;

	@Column(name="id_cluster")
	private Long idCluster;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cluster",insertable=false,updatable=false)
	@NotAudited
	private Cluster cluster;

//	@JsonIgnore
//	@OneToMany(fetch = FetchType.LAZY)
//	@JoinColumn(name = "cod_cliente_finale",referencedColumnName = "cod_cliente_finale",insertable=false,updatable=false)
//	private List<ReportDatiVos> reportDatiVos;
//	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//	@JoinTable(name = "report_dati_vod",
//	    joinColumns = @JoinColumn(name = "cod_cliente_finale", referencedColumnName = "cod_cliente_finale",insertable = false,updatable = false),
//	    inverseJoinColumns = @JoinColumn(name = "cod_cliente_finale", referencedColumnName = "cod_cliente_finale",insertable = false,updatable = false)
//	)
	//private Set<ReportDatiVos> reportDatiVos = new HashSet<ReportDatiVos>();
	
	
	@Column(name="id_codice_sed")
	private Long idCodiceSed;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_codice_sed",referencedColumnName = "id_location_responsabile_business", insertable=false,updatable=false)
	@NotAudited
	private LocationResponsabileBusiness locationResponsabileBusiness;

	@Column(name="id_comune")
	private Long idComune;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_comune",insertable=false,updatable=false)
	@NotAudited
	private Comuni comune;

	@Column(name="id_intercompany_servizio_accesso")
	private Long idIntercompanyServizioAccesso;

	@Column(name="id_location_sed")
	private Long idLocationSed;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_location_sed",insertable=false,updatable=false)
	@NotAudited
	private Location location;

	@Column(name="id_sede_multiservizio")
	private Long idSedeMultiservizio;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_sede_multiservizio",insertable=false,updatable=false)
	@NotAudited
	private SediMultiservizio sediMultiservizio;
	
	@Column(name="id_target")
	private Long idTarget;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_target",insertable=false,updatable=false)
	@NotAudited
	private Target target;

	@Column(name="id_tipo_sede")
	private Long idTipoSede;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_sede",insertable=false,updatable=false)
	@NotAudited
	private TipoSede tipoSede;

	private String indirizzo;

	private String mail;

	private String note;

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
	
	@Column(name="codice_aams_univoco")
	private String codiceAamsUnivoco;

	@Column(name="codice_db_vlt")
	private Long codiceDbVlt;

	@Column(name="codice_vl")
	private String codiceVl;

	@Column(name="data_stato_sede")
	private Date dataStatoSede;

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

	@Column(name="vlt_totali")
	private String vltTotali;

	public Sedi() {
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

	public String getCodiceSap() {
		if(codiceSap != null) {
			return this.codiceSap.toUpperCase();
		}
		return this.codiceSap;
	}

	public void setCodiceSap(String codiceSap) {
		if(codiceSap != null) {
			this.codiceSap = codiceSap.toUpperCase();
		}
		this.codiceSap = codiceSap;
	}

	public String getCodiceSapServizi() {
		if(codiceSapServizi!= null) {
			return this.codiceSapServizi.toUpperCase();
		}
		return this.codiceSapServizi;
	}

	public void setCodiceSapServizi(String codiceSapServizi) {
		if(codiceSapServizi!= null) {
			this.codiceSapServizi = codiceSapServizi.toUpperCase();
		}
		this.codiceSapServizi = codiceSapServizi;
	}

	public String getCodiceSedeServizi() {
		return this.codiceSedeServizi;
	}

	public void setCodiceSedeServizi(String codiceSedeServizi) {
		this.codiceSedeServizi = codiceSedeServizi;
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

	public BusinessSede getBusinessSede() {
		return businessSede;
	}

	public void setBusinessSede(BusinessSede businessSede) {
		this.businessSede = businessSede;
	}

	public Cluster getCluster() {
		return cluster;
	}

	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
	}

	public LocationResponsabileBusiness getLocationResponsabileBusiness() {
		return locationResponsabileBusiness;
	}

	public void setLocationResponsabileBusiness(LocationResponsabileBusiness locationResponsabileBusiness) {
		this.locationResponsabileBusiness = locationResponsabileBusiness;
	}

	public Comuni getComune() {
		return comune;
	}

	public void setComune(Comuni comune) {
		this.comune = comune;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	public TipoSede getTipoSede() {
		return tipoSede;
	}

	public void setTipoSede(TipoSede tipoSede) {
		this.tipoSede = tipoSede;
	}

	public Long getIdStatoSede() {
		return idStatoSede;
	}

	public void setIdStatoSede(Long idStatoSede) {
		this.idStatoSede = idStatoSede;
	}

	public StatoSede getStatoSede() {
		return statoSede;
	}

	public void setStatoSede(StatoSede statoSede) {
		this.statoSede = statoSede;
	}

	public Long getIdFunzioneSede() {
		return idFunzioneSede;
	}

	public void setIdFunzioneSede(Long idFunzioneSede) {
		this.idFunzioneSede = idFunzioneSede;
	}

	public FunzioneSede getFunzioneSede() {
		return funzioneSede;
	}

	public void setFunzioneSede(FunzioneSede funzioneSede) {
		this.funzioneSede = funzioneSede;
	}

	public Long getIdContrattoFatturazione() {
		return idContrattoFatturazione;
	}

	public void setIdContrattoFatturazione(Long idContrattoFatturazione) {
		this.idContrattoFatturazione = idContrattoFatturazione;
	}

	public SediMultiservizio getSediMultiservizio() {
		return sediMultiservizio;
	}

	public void setSediMultiservizio(SediMultiservizio sediMultiservizio) {
		this.sediMultiservizio = sediMultiservizio;
	}

	public Long getIdBusinessSedeDettagli() {
		return idBusinessSedeDettagli;
	}

	public void setIdBusinessSedeDettagli(Long idBusinessSedeDettagli) {
		this.idBusinessSedeDettagli = idBusinessSedeDettagli;
	}

	public BusinessSedeDettaglio getBusinessSedeDettagli() {
		return businessSedeDettagli;
	}

	public void setBusinessSedeDettagli(BusinessSedeDettaglio businessSedeDettagli) {
		this.businessSedeDettagli = businessSedeDettagli;
	}

	public String getCodiceAamsUnivoco() {
		return codiceAamsUnivoco;
	}

	public void setCodiceAamsUnivoco(String codiceAamsUnivoco) {
		this.codiceAamsUnivoco = codiceAamsUnivoco;
	}

	public Long getCodiceDbVlt() {
		return codiceDbVlt;
	}

	public void setCodiceDbVlt(Long codiceDbVlt) {
		this.codiceDbVlt = codiceDbVlt;
	}

	public String getCodiceVl() {
		return codiceVl;
	}

	public void setCodiceVl(String codiceVl) {
		this.codiceVl = codiceVl;
	}

	public Date getDataStatoSede() {
		return dataStatoSede;
	}

	public void setDataStatoSede(Date dataStatoSede) {
		this.dataStatoSede = dataStatoSede;
	}

	public String getNumCollegamenti() {
		return numCollegamenti;
	}

	public void setNumCollegamenti(String numCollegamenti) {
		this.numCollegamenti = numCollegamenti;
	}

	public Long getNumLanMag() {
		return numLanMag;
	}

	public void setNumLanMag(Long numLanMag) {
		this.numLanMag = numLanMag;
	}

	public Long getNumLanPlaytec() {
		return numLanPlaytec;
	}

	public void setNumLanPlaytec(Long numLanPlaytec) {
		this.numLanPlaytec = numLanPlaytec;
	}

	public String getNumVltARegime() {
		return numVltARegime;
	}

	public void setNumVltARegime(String numVltARegime) {
		this.numVltARegime = numVltARegime;
	}

	public String getNumVltInspired() {
		return numVltInspired;
	}

	public void setNumVltInspired(String numVltInspired) {
		this.numVltInspired = numVltInspired;
	}

	public String getNumVltNoSpielo() {
		return numVltNoSpielo;
	}

	public void setNumVltNoSpielo(String numVltNoSpielo) {
		this.numVltNoSpielo = numVltNoSpielo;
	}

	public String getVltTotali() {
		return vltTotali;
	}

	public void setVltTotali(String vltTotali) {
		this.vltTotali = vltTotali;
	}

//	public ReportDatiVos getReportDatiVos() {
//		if(reportDatiVos != null && !reportDatiVos.isEmpty()) {
//			return reportDatiVos.get(0);
//		}
//		return null;
//	}
//
//	public void setReportDatiVos(List<ReportDatiVos> reportDatiVos) {
//		this.reportDatiVos = reportDatiVos;
//	}

	public List<MatriceLinea> getMatriceLinea() {
		return matriceLinea;
	}

	public void setMatriceLinea(List<MatriceLinea> matriceLinea) {
		this.matriceLinea = matriceLinea;
	}

	public List<BabelSwitchInventoryIndirizziOutput> getBabelSwitchInventoryIndirizziOutput() {
		return babelSwitchInventoryIndirizziOutput;
	}

	public void setBabelSwitchInventoryIndirizziOutput(List<BabelSwitchInventoryIndirizziOutput> babelSwitchInventoryIndirizziOutput) {
		this.babelSwitchInventoryIndirizziOutput = babelSwitchInventoryIndirizziOutput;
	}

}
