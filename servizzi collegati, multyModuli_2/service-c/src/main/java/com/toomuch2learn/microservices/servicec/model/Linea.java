package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the linea database table.
 */
@Entity
@NamedQuery(name = "Linea.findAll", query = "SELECT l FROM Linea l")
/*@NamedStoredProcedureQuery(name = "getRowLinea",
        procedureName = "ROWLINEA", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "idLinea", type = Long.class),
        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultlinea", type = Long.class)})
*/
@Audited
public class Linea implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idLinea")
    @SequenceGenerator(name = "idLinea", sequenceName = "linea_id_linea_seq", allocationSize = 1)
    @Column(name = "id_linea")
    private Long idLinea;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STATO_LINEA", insertable = false, updatable = false)
    @NotAudited
    private StatoLinea statoLinea;


    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_RISORSA", insertable = false, updatable = false)
    @NotAudited
    private TipoRisorsa tipoRisorsa;


    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO", insertable = false, updatable = false)
    @NotAudited
    private TipoLinea tipoLinea;

    @JsonIgnore
    @OneToMany(mappedBy = "linea", fetch = FetchType.LAZY)
    @NotAudited
    private List<MatriceLinea> matriceLinea;

    @JsonIgnore
    @OneToMany(mappedBy = "linea", fetch = FetchType.LAZY)
    @NotAudited
    private List<LineaDate> lineaDate;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FUNZIONE_LINEA", insertable = false, updatable = false)
    @NotAudited
    private FunzioneLinea funzioneLinea;

//	@JsonIgnore
//	@OneToMany(mappedBy = "linea", fetch = FetchType.LAZY)
//	private List<LineaIcone> lineaIcone;
//
//	@JsonIgnore
//	@OneToMany(mappedBy = "linea", fetch = FetchType.LAZY)
//	private List<IconeLinea> iconeLinea;


    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ANAGRAFICA_FORNITORE", insertable = false, updatable = false)
    @NotAudited
    private AnagraficaFornitore anagraficaFornitore;
//	
//	@JsonIgnore
//	@OneToMany(mappedBy = "linea", fetch = FetchType.LAZY)
//	private List<XmlEprocurement> xmlEprocurement;
//
//	@JsonIgnore
//	@OneToMany(mappedBy = "linea", fetch = FetchType.LAZY)
//	private List<XmlTiEprocurement> xmlTiEprocurement;
//
//	@JsonIgnore
//	@OneToMany(mappedBy = "linea", fetch = FetchType.LAZY)
//	private List<XmlFwEprocurement> xmlFwEprocurement;
//
//	@JsonIgnore
//	@OneToMany(mappedBy = "linea", fetch = FetchType.LAZY)
//	private List<TmpCorrispondenzaLineaConnessioni> tmpCorrispondenzaLineaConnessioni;
//
//	@JsonIgnore
//	@OneToMany(mappedBy = "linea", fetch = FetchType.LAZY)
//	private List<AvanzamentoStatoServizioRete> avanzamentoStatoServizioRete;
//
//
//	@JsonIgnore
//	@OneToMany(mappedBy = "linea", fetch = FetchType.LAZY)
//	private List<RichiestaUpgradeLinea> richiestaUpgradeLinea;
//

    @JsonIgnore
    @OneToMany(mappedBy = "linea", fetch = FetchType.LAZY)
    @NotAudited
    private List<DettaglioMasterLineaTiesseInventoryNew> dettaglioMasterLinea;
//
//	@JsonIgnore
//	@OneToMany(mappedBy = "linea", fetch = FetchType.LAZY)
//	private List<AvanzamentoVincoloLinea> avanzamentoVincoloLinea;
//
//	@JsonIgnore
//	@OneToMany(mappedBy = "linea", fetch = FetchType.LAZY)
//	private List<VoceFatturazione> voceFatturazione;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONTRATTI_SED_FORNITORI", insertable = false, updatable = false, nullable = false)
    @NotAudited
    private ContrattiSedFornitori contrattiSedFornitori;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONTRATTI_LTM_SED", insertable = false, updatable = false)
    @NotAudited
    private ContrattiLtmSed contrattiLtmSed;
    //
//	@JsonIgnore
//	@OneToMany(mappedBy = "linea1", fetch = FetchType.LAZY)
//	private List<BackupLinea> backupLinea1;
//
//	@JsonIgnore
//	@OneToMany(mappedBy = "linea2", fetch = FetchType.LAZY)
//	private List<BackupLinea> backupLinea2;
//
//
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_focus", insertable = false, updatable = false)
    @NotAudited
    private Focus focus;


//	@JsonIgnore
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name = "ID_CAUSA_ANNULLAMENTO_LINEA",insertable=false,updatable=false)    
//	private CausaAnnullamentoLinea causaAnnullamentoLinea;
    //
//	@JsonIgnore
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name = "ID_CAUSA_ATTESTAZIONE_LINEA",insertable=false,updatable=false)    
//	private CausaAttestazioneLinea causaAttestazioneLinea;

//	@JsonIgnore
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name = "ID_CAUSA_CESSAZIONE_LINEA",insertable=false,updatable=false)    
//	private CausaCessazioneLinea causaCessazioneLinea;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CAUSA_VINCOLO_LINEA", insertable = false, updatable = false)
    @NotAudited
    private CausaVincoloLinea causaVincoloLinea;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_RICHIESTA_LINEA", insertable = false, updatable = false)
    @NotAudited
    private RichiestaLinea richiestaLinea;

//	@JsonIgnore
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "ID_SLA_SOGLIE_LINEA",insertable=false,updatable=false)
//	private SlaSoglieLinea slaSoglieLinea;

//	@JsonIgnore
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "ID_PROGETTO_LTM_SOTTOPROGETTO",insertable=false,updatable=false)
//	private ProgettoLtmSottoprogetto ltmSottoprogetto;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PROFILO_BANDA", insertable = false, updatable = false)
    @NotAudited
    private ProfiloBanda profiloBanda;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PROFILO_COMMERCIALE", insertable = false, updatable = false)
    @NotAudited
    private ProfiloCommerciale profiloCommerciale;

    //	@jsonignore
    //	@manytoone(fetch = fetchtype.lazy,optional = true )
    //	@notfound(action = notfoundaction.ignore)
    //	@joincolumn(name = "id_categoria_servizio", referencedcolumnname="id_categoria_servizio",insertable=false,updatable=false)
    //	@lazytoone(lazytooneoption.no_proxy)
    //	private profiloLineaPriorita catProfiloLineaPriorita;

//	@JsonIgnore
//	@OneToMany(fetch = FetchType.LAZY)
//	@JoinColumns({
//		@JoinColumn(name = "ID_PROFILO_COMMERCIALE", referencedColumnName="ID_PROFILO_COMMERCIALE",insertable=false,updatable=false),
//		@JoinColumn(name = "ID_CATEGORIA_SERVIZIO", referencedColumnName="ID_CATEGORIA_SERVIZIO",insertable=false,updatable=false)
//	})
//	@LazyToOne(LazyToOneOption.NO_PROXY)
//	private List<ProfiloLineaPriorita> profiloLineaPriorita;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_RICHIESTA_SED", insertable = false, updatable = false)
    @NotAudited
    private TipoRichiestaSed tipoRichiestaSed;

    @JsonIgnore
    @OneToMany(mappedBy = "linea", fetch = FetchType.LAZY)
    @NotAudited
    private List<ComsBlocchi> comsBlocchiList;

    private Long cni;

    @Column(name = "cod_nis")
    private String codNis;

    @Column(name = "codice_collaudo")
    private String codiceCollaudo;

    @Column(name = "data_esclusione_talo")
    private Date dataEsclusioneTalo;

    @Column(name = "data_intercompany_servizio_accesso")
    private Date dataIntercompanyServizioAccesso;

    @Column(name = "data_intercompany_servizio_accesso_free")
    private Date dataIntercompanyServizioAccessoFree;

    @Column(name = "escluso_monitoraggio_talo")
    private Integer esclusoMonitoraggioTalo;

    @Column(name = "esito_48h")
    private String esito48h;

    @Column(name = "esito_veloce")
    private String esitoVeloce;

    @Column(name = "flag_consuntivazione_attiva")
    private Boolean flagConsuntivazioneAttiva;

    @Column(name = "flag_tbms")
    private Boolean flagTbms;

    @Column(name = "gg_sla_effettivi")
    private Integer ggSlaEffettivi;

    @Column(name = "giorni_in_vincolo")
    private Integer giorniInVincolo;

    @Column(name = "giorni_in_vincolo_fornitore")
    private Integer giorniInVincoloFornitore;

    @Column(name = "id_categoria_servizio")
    private Long idCategoriaServizio;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria_servizio", insertable = false, updatable = false)
    @NotAudited
    private CategoriaServizio categoriaServizio;

    @Column(name = "id_causa_annullamento_linea")
    private Long idCausaAnnullamentoLinea;

    @Column(name = "id_causa_cessazione_linea")
    private Long idCausaCessazioneLinea;

    @Column(name = "id_causa_non_fattibile_linea")
    private Long idCausaNonFattibileLinea;

    @Column(name = "id_causa_non_realizzabile_linea")
    private Long idCausaNonRealizzabileLinea;

    @Column(name = "id_causa_vincolo_linea")
    private Long idCausaVincoloLinea;

    @Column(name = "id_contratti_ltm_sed")
    private Long idContrattiLtmSed;

    @Column(name = "id_anagrafica_fornitore")
    private Long idAnagraficaFornitore;

    @Column(name = "id_contratti_sed_fornitori")
    private Long idContrattiSedFornitori;

    @Column(name = "id_funzione_linea")
    private Long idFunzioneLinea;

    @Column(name = "id_intercompany_servizio_accesso")
    private Long idIntercompanyServizioAccesso;

    @Column(name = "id_intercompany_servizio_accesso_free")
    private Long idIntercompanyServizioAccessoFree;

    @Column(name = "id_linea_migrato")
    private Long idLineaMigrato;

    @Column(name = "id_master_linea")
    private Long idMasterLinea;

    @Column(name = "id_profilo_commerciale")
    private Long idProfiloCommerciale;

    @Column(name = "id_profilo_banda")
    private Long idProfiloBanda;

    @Column(name = "id_focus")
    private Long idFocus;

    @Column(name = "id_richiesta_linea")
    private Long idRichiestaLinea;

    @Column(name = "id_siebel_fw")
    private String idSiebelFw;

    @Column(name = "id_sla_soglie_linea")
    private Long idSlaSoglieLinea;

    @Column(name = "id_sla_soglie_linea_intercompany")
    private Long idSlaSoglieLineaIntercompany;

    @Column(name = "id_stato_linea")
    private Long idStatoLinea;

    @Column(name = "id_test_pingone")
    private Long idTestPingone;

    @Column(name = "id_tipo")
    private Long idTipo;

    @Column(name = "id_tipo_richiesta_sed")
    private Long idTipoRichiestaSed;

    @Column(name = "id_tipo_risorsa")
    private Long idTipoRisorsa;

    @Column(name = "id_tipo_template")
    private Long idTipoTemplate;

    @Column(name = "linea_in_consuntivazione_scommesse")
    private Boolean lineaInConsuntivazioneScommesse;

    @Column(name = "linea_in_consuntivazione_vlt")
    private Boolean lineaInConsuntivazioneVlt;

    @Column(name = "note_consuntivazione_attiva")
    private String noteConsuntivazioneAttiva;

    @Column(name = "note_sed")
    private String noteSed;

    private Integer riutilizzo;

    private Integer sla;

    @Column(name = "td_linea")
    private String tdLinea;

    @Column(name = "td_linea_vodafone")
    private String tdLineaVodafone;

    @Column(name = "td_linea_wind")
    private String tdLineaWind;

    @Column(name = "user_mod")
    private String userMod;

    @Column(name = "user_monitoraggio_talo")
    private String userMonitoraggioTalo;

    @Column(name = "velocita_aggancio")
    private String velocitaAggancio;

    @Column(name = "velocita_aggancio_rilevata")
    private String velocitaAggancioRilevata;

    private Boolean whs;

    public Linea() {
    }

    public Long getIdLinea() {
        return this.idLinea;
    }

    public void setIdLinea(Long idLinea) {
        this.idLinea = idLinea;
    }

    public Long getCni() {
        return this.cni;
    }

    public void setCni(Long cni) {
        this.cni = cni;
    }

    public String getCodNis() {
        return this.codNis;
    }

    public void setCodNis(String codNis) {
        this.codNis = codNis;
    }

    public String getCodiceCollaudo() {
        return this.codiceCollaudo;
    }

    public void setCodiceCollaudo(String codiceCollaudo) {
        this.codiceCollaudo = codiceCollaudo;
    }

    public Date getDataEsclusioneTalo() {
        return this.dataEsclusioneTalo;
    }

    public void setDataEsclusioneTalo(Date dataEsclusioneTalo) {
        this.dataEsclusioneTalo = dataEsclusioneTalo;
    }

    public Date getDataIntercompanyServizioAccesso() {
        return this.dataIntercompanyServizioAccesso;
    }

    public void setDataIntercompanyServizioAccesso(Date dataIntercompanyServizioAccesso) {
        this.dataIntercompanyServizioAccesso = dataIntercompanyServizioAccesso;
    }

    public Date getDataIntercompanyServizioAccessoFree() {
        return this.dataIntercompanyServizioAccessoFree;
    }

    public void setDataIntercompanyServizioAccessoFree(Date dataIntercompanyServizioAccessoFree) {
        this.dataIntercompanyServizioAccessoFree = dataIntercompanyServizioAccessoFree;
    }

    public Integer getEsclusoMonitoraggioTalo() {
        return this.esclusoMonitoraggioTalo;
    }

    public void setEsclusoMonitoraggioTalo(Integer esclusoMonitoraggioTalo) {
        this.esclusoMonitoraggioTalo = esclusoMonitoraggioTalo;
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

    public Boolean getFlagConsuntivazioneAttiva() {
        return this.flagConsuntivazioneAttiva;
    }

    public void setFlagConsuntivazioneAttiva(Boolean flagConsuntivazioneAttiva) {
        this.flagConsuntivazioneAttiva = flagConsuntivazioneAttiva;
    }

    public Boolean getFlagTbms() {
        return this.flagTbms;
    }

    public void setFlagTbms(Boolean flagTbms) {
        this.flagTbms = flagTbms;
    }

    public Integer getGgSlaEffettivi() {
        return this.ggSlaEffettivi;
    }

    public void setGgSlaEffettivi(Integer ggSlaEffettivi) {
        this.ggSlaEffettivi = ggSlaEffettivi;
    }

    public Integer getGiorniInVincolo() {
        return this.giorniInVincolo;
    }

    public void setGiorniInVincolo(Integer giorniInVincolo) {
        this.giorniInVincolo = giorniInVincolo;
    }

    public Integer getGiorniInVincoloFornitore() {
        return this.giorniInVincoloFornitore;
    }

    public void setGiorniInVincoloFornitore(Integer giorniInVincoloFornitore) {
        this.giorniInVincoloFornitore = giorniInVincoloFornitore;
    }

    public Long getIdCategoriaServizio() {
        return this.idCategoriaServizio;
    }

    public void setIdCategoriaServizio(Long idCategoriaServizio) {
        this.idCategoriaServizio = idCategoriaServizio;
    }

    public Long getIdCausaAnnullamentoLinea() {
        return this.idCausaAnnullamentoLinea;
    }

    public void setIdCausaAnnullamentoLinea(Long idCausaAnnullamentoLinea) {
        this.idCausaAnnullamentoLinea = idCausaAnnullamentoLinea;
    }

    public Long getIdCausaCessazioneLinea() {
        return this.idCausaCessazioneLinea;
    }

    public void setIdCausaCessazioneLinea(Long idCausaCessazioneLinea) {
        this.idCausaCessazioneLinea = idCausaCessazioneLinea;
    }

    public Long getIdCausaNonFattibileLinea() {
        return this.idCausaNonFattibileLinea;
    }

    public void setIdCausaNonFattibileLinea(Long idCausaNonFattibileLinea) {
        this.idCausaNonFattibileLinea = idCausaNonFattibileLinea;
    }

    public Long getIdCausaNonRealizzabileLinea() {
        return this.idCausaNonRealizzabileLinea;
    }

    public void setIdCausaNonRealizzabileLinea(Long idCausaNonRealizzabileLinea) {
        this.idCausaNonRealizzabileLinea = idCausaNonRealizzabileLinea;
    }

    public Long getIdCausaVincoloLinea() {
        return this.idCausaVincoloLinea;
    }

    public void setIdCausaVincoloLinea(Long idCausaVincoloLinea) {
        this.idCausaVincoloLinea = idCausaVincoloLinea;
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

    public Long getIdFunzioneLinea() {
        return this.idFunzioneLinea;
    }

    public void setIdFunzioneLinea(Long idFunzioneLinea) {
        this.idFunzioneLinea = idFunzioneLinea;
    }

    public Long getIdIntercompanyServizioAccesso() {
        return this.idIntercompanyServizioAccesso;
    }

    public void setIdIntercompanyServizioAccesso(Long idIntercompanyServizioAccesso) {
        this.idIntercompanyServizioAccesso = idIntercompanyServizioAccesso;
    }

    public Long getIdIntercompanyServizioAccessoFree() {
        return this.idIntercompanyServizioAccessoFree;
    }

    public void setIdIntercompanyServizioAccessoFree(Long idIntercompanyServizioAccessoFree) {
        this.idIntercompanyServizioAccessoFree = idIntercompanyServizioAccessoFree;
    }

    public Long getIdLineaMigrato() {
        return this.idLineaMigrato;
    }

    public void setIdLineaMigrato(Long idLineaMigrato) {
        this.idLineaMigrato = idLineaMigrato;
    }

    public Long getIdMasterLinea() {
        return this.idMasterLinea;
    }

    public void setIdMasterLinea(Long idMasterLinea) {
        this.idMasterLinea = idMasterLinea;
    }

    public Long getIdProfiloCommerciale() {
        return this.idProfiloCommerciale;
    }

    public void setIdProfiloCommerciale(Long idProfiloCommerciale) {
        this.idProfiloCommerciale = idProfiloCommerciale;
    }

    public Long getIdProfiloBanda() {
        return this.idProfiloBanda;
    }

    public void setIdProfiloBanda(Long idProfiloBanda) {
        this.idProfiloBanda = idProfiloBanda;
    }

    public Long getIdFocus() {
        return idFocus;
    }

    public void setIdFocus(Long idFocus) {
        this.idFocus = idFocus;
    }

    public Long getIdRichiestaLinea() {
        return this.idRichiestaLinea;
    }

    public void setIdRichiestaLinea(Long idRichiestaLinea) {
        this.idRichiestaLinea = idRichiestaLinea;
    }

    public String getIdSiebelFw() {
        return this.idSiebelFw;
    }

    public void setIdSiebelFw(String idSiebelFw) {
        this.idSiebelFw = idSiebelFw;
    }

    public Long getIdSlaSoglieLinea() {
        return this.idSlaSoglieLinea;
    }

    public void setIdSlaSoglieLinea(Long idSlaSoglieLinea) {
        this.idSlaSoglieLinea = idSlaSoglieLinea;
    }

    public Long getIdSlaSoglieLineaIntercompany() {
        return this.idSlaSoglieLineaIntercompany;
    }

    public void setIdSlaSoglieLineaIntercompany(Long idSlaSoglieLineaIntercompany) {
        this.idSlaSoglieLineaIntercompany = idSlaSoglieLineaIntercompany;
    }

    public Long getIdStatoLinea() {
        return this.idStatoLinea;
    }

    public void setIdStatoLinea(Long idStatoLinea) {
        this.idStatoLinea = idStatoLinea;
    }

    public Long getIdTestPingone() {
        return this.idTestPingone;
    }

    public void setIdTestPingone(Long idTestPingone) {
        this.idTestPingone = idTestPingone;
    }

    public Long getIdTipo() {
        return this.idTipo;
    }

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }

    public Long getIdTipoRichiestaSed() {
        return this.idTipoRichiestaSed;
    }

    public void setIdTipoRichiestaSed(Long idTipoRichiestaSed) {
        this.idTipoRichiestaSed = idTipoRichiestaSed;
    }

    public Long getIdTipoRisorsa() {
        return this.idTipoRisorsa;
    }

    public void setIdTipoRisorsa(Long idTipoRisorsa) {
        this.idTipoRisorsa = idTipoRisorsa;
    }

    public Long getIdTipoTemplate() {
        return this.idTipoTemplate;
    }

    public void setIdTipoTemplate(Long idTipoTemplate) {
        this.idTipoTemplate = idTipoTemplate;
    }

    public Boolean getLineaInConsuntivazioneScommesse() {
        return this.lineaInConsuntivazioneScommesse;
    }

    public void setLineaInConsuntivazioneScommesse(Boolean lineaInConsuntivazioneScommesse) {
        this.lineaInConsuntivazioneScommesse = lineaInConsuntivazioneScommesse;
    }

    public Boolean getLineaInConsuntivazioneVlt() {
        return this.lineaInConsuntivazioneVlt;
    }

    public void setLineaInConsuntivazioneVlt(Boolean lineaInConsuntivazioneVlt) {
        this.lineaInConsuntivazioneVlt = lineaInConsuntivazioneVlt;
    }

    public String getNoteConsuntivazioneAttiva() {
        return this.noteConsuntivazioneAttiva;
    }

    public void setNoteConsuntivazioneAttiva(String noteConsuntivazioneAttiva) {
        this.noteConsuntivazioneAttiva = noteConsuntivazioneAttiva;
    }

    public Integer getRiutilizzo() {
        return this.riutilizzo;
    }

    public void setRiutilizzo(Integer riutilizzo) {
        this.riutilizzo = riutilizzo;
    }

    public Integer getSla() {
        return this.sla;
    }

    public void setSla(Integer sla) {
        this.sla = sla;
    }

    public String getTdLinea() {
        return this.tdLinea;
    }

    public void setTdLinea(String tdLinea) {
        this.tdLinea = tdLinea;
    }

    public String getTdLineaVodafone() {
        return this.tdLineaVodafone;
    }

    public void setTdLineaVodafone(String tdLineaVodafone) {
        this.tdLineaVodafone = tdLineaVodafone;
    }

    public String getTdLineaWind() {
        return this.tdLineaWind;
    }

    public void setTdLineaWind(String tdLineaWind) {
        this.tdLineaWind = tdLineaWind;
    }

    public String getUserMod() {
        return this.userMod;
    }

    public void setUserMod(String userMod) {
        this.userMod = userMod;
    }

    public String getUserMonitoraggioTalo() {
        return this.userMonitoraggioTalo;
    }

    public void setUserMonitoraggioTalo(String userMonitoraggioTalo) {
        this.userMonitoraggioTalo = userMonitoraggioTalo;
    }

    public String getVelocitaAggancio() {
        return this.velocitaAggancio;
    }

    public void setVelocitaAggancio(String velocitaAggancio) {
        this.velocitaAggancio = velocitaAggancio;
    }

    public String getVelocitaAggancioRilevata() {
        return this.velocitaAggancioRilevata;
    }

    public void setVelocitaAggancioRilevata(String velocitaAggancioRilevata) {
        this.velocitaAggancioRilevata = velocitaAggancioRilevata;
    }

    public Boolean getWhs() {
        return this.whs;
    }

    public void setWhs(Boolean whs) {
        this.whs = whs;
    }

    public StatoLinea getStatoLinea() {
        return statoLinea;
    }

    public void setStatoLinea(StatoLinea statoLinea) {
        this.statoLinea = statoLinea;
    }

    public TipoLinea getTipoLinea() {
        return tipoLinea;
    }

    public void setTipoLinea(TipoLinea tipoLinea) {
        this.tipoLinea = tipoLinea;
    }

    public List<MatriceLinea> getMatriceLinea() {
        return matriceLinea;
    }

    public void setMatriceLinea(List<MatriceLinea> matriceLinea) {
        this.matriceLinea = matriceLinea;
    }

    public ContrattiSedFornitori getContrattiSedFornitori() {
        return contrattiSedFornitori;
    }

    public void setContrattiSedFornitori(ContrattiSedFornitori contrattiSedFornitori) {
        this.contrattiSedFornitori = contrattiSedFornitori;
    }

    public ContrattiLtmSed getContrattiLtmSed() {
        return contrattiLtmSed;
    }

    public void setContrattiLtmSed(ContrattiLtmSed contrattiLtmSed) {
        this.contrattiLtmSed = contrattiLtmSed;
    }

    public ProfiloBanda getProfiloBanda() {
        return profiloBanda;
    }

    public void setProfiloBanda(ProfiloBanda profiloBanda) {
        this.profiloBanda = profiloBanda;
    }

    public ProfiloCommerciale getProfiloCommerciale() {
        return profiloCommerciale;
    }

    public void setProfiloCommerciale(ProfiloCommerciale profiloCommerciale) {
        this.profiloCommerciale = profiloCommerciale;
    }

    public AnagraficaFornitore getAnagraficaFornitore() {
        return anagraficaFornitore;
    }

    public void setAnagraficaFornitore(AnagraficaFornitore anagraficaFornitore) {
        this.anagraficaFornitore = anagraficaFornitore;
    }

    public Long getIdAnagraficaFornitore() {
        return idAnagraficaFornitore;
    }

    public void setIdAnagraficaFornitore(Long idAnagraficaFornitore) {
        this.idAnagraficaFornitore = idAnagraficaFornitore;
    }

    public Focus getFocus() {
        return focus;
    }

    public void setFocus(Focus focus) {
        this.focus = focus;
    }

    public String getNoteSed() {
        return noteSed;
    }

    public void setNoteSed(String noteSed) {
        this.noteSed = noteSed;
    }

    public CausaVincoloLinea getCausaVincoloLinea() {
        return causaVincoloLinea;
    }

    public void setCausaVincoloLinea(CausaVincoloLinea causaVincoloLinea) {
        this.causaVincoloLinea = causaVincoloLinea;
    }

    public RichiestaLinea getRichiestaLinea() {
        return richiestaLinea;
    }

    public void setRichiestaLinea(RichiestaLinea richiestaLinea) {
        this.richiestaLinea = richiestaLinea;
    }

//	public List<ProfiloLineaPriorita> getProfiloLineaPriorita() {
//		return profiloLineaPriorita;
//	}
//
//	public void setProfiloLineaPriorita(List<ProfiloLineaPriorita> profiloLineaPriorita) {
//		this.profiloLineaPriorita = profiloLineaPriorita;
//	}

    public List<LineaDate> getLineaDate() {
        return lineaDate;
    }

    public void setLineaDate(List<LineaDate> lineaDate) {
        this.lineaDate = lineaDate;
    }

    public List<DettaglioMasterLineaTiesseInventoryNew> getDettaglioMasterLinea() {
        return dettaglioMasterLinea;
    }

    public void setDettaglioMasterLinea(List<DettaglioMasterLineaTiesseInventoryNew> dettaglioMasterLinea) {
        this.dettaglioMasterLinea = dettaglioMasterLinea;
    }

    public CategoriaServizio getCategoriaServizio() {
        return categoriaServizio;
    }

    public void setCategoriaServizio(CategoriaServizio categoriaServizio) {
        this.categoriaServizio = categoriaServizio;
    }

    public TipoRichiestaSed getTipoRichiestaSed() {
        return tipoRichiestaSed;
    }

    public void setTipoRichiestaSed(TipoRichiestaSed tipoRichiestaSed) {
        this.tipoRichiestaSed = tipoRichiestaSed;
    }

    public FunzioneLinea getFunzioneLinea() {
        return funzioneLinea;
    }

    public void setFunzioneLinea(FunzioneLinea funzioneLinea) {
        this.funzioneLinea = funzioneLinea;
    }

    public TipoRisorsa getTipoRisorsa() {
        return tipoRisorsa;
    }

    public void setTipoRisorsa(TipoRisorsa tipoRisorsa) {
        this.tipoRisorsa = tipoRisorsa;
    }

    public List<ComsBlocchi> getComsBlocchiList() {
        return comsBlocchiList;
    }

    public void setComsBlocchiList(List<ComsBlocchi> comsBlocchiList) {
        this.comsBlocchiList = comsBlocchiList;
    }
}