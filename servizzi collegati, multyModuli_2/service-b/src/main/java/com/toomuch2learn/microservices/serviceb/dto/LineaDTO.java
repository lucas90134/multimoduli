package com.toomuch2learn.microservices.serviceb.dto;


import com.toomuch2learn.microservices.servicec.model.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the linea database table.
 */

public class LineaDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private Long idLinea;


    private StatoLinea statoLinea;



    private TipoRisorsa tipoRisorsa;



    private TipoLinea tipoLinea;


    private List<MatriceLinea> matriceLinea;


    private List<LineaDate> lineaDate;


    private FunzioneLinea funzioneLinea;




    private AnagraficaFornitore anagraficaFornitore;


    private List<DettaglioMasterLineaTiesseInventoryNew> dettaglioMasterLinea;

    private ContrattiSedFornitori contrattiSedFornitori;




    private Focus focus;


    private CausaVincoloLinea causaVincoloLinea;

    private RichiestaLinea richiestaLinea;

    private ProfiloBanda profiloBanda;


    private ProfiloCommerciale profiloCommerciale;

    private TipoRichiestaSed tipoRichiestaSed;


    private List<ComsBlocchi> comsBlocchiList;

    private Long cni;


    private String codNis;



    private String codiceCollaudo;



    private Date dataEsclusioneTalo;


    private Date dataIntercompanyServizioAccesso;


    private Date dataIntercompanyServizioAccessoFree;


    private Integer esclusoMonitoraggioTalo;


    private String esito48h;


    private String esitoVeloce;


    private Boolean flagConsuntivazioneAttiva;


    private Boolean flagTbms;


    private Integer ggSlaEffettivi;


    private Integer giorniInVincolo;


    private Integer giorniInVincoloFornitore;


    private Long idCategoriaServizio;


    private CategoriaServizio categoriaServizio;


    private Long idCausaAnnullamentoLinea;


    private Long idCausaCessazioneLinea;


    private Long idCausaNonFattibileLinea;


    private Long idCausaNonRealizzabileLinea;


    private Long idCausaVincoloLinea;


    private Long idContrattiLtmSed;


    private Long idAnagraficaFornitore;


    private Long idContrattiSedFornitori;


    private Long idFunzioneLinea;


    private Long idIntercompanyServizioAccesso;


    private Long idIntercompanyServizioAccessoFree;


    private Long idLineaMigrato;


    private Long idMasterLinea;


    private Long idProfiloCommerciale;


    private Long idProfiloBanda;


    private Long idFocus;


    private Long idRichiestaLinea;


    private String idSiebelFw;


    private Long idSlaSoglieLinea;


    private Long idSlaSoglieLineaIntercompany;


    private Long idStatoLinea;


    private Long idTestPingone;


    private Long idTipo;


    private Long idTipoRichiestaSed;


    private Long idTipoRisorsa;


    private Long idTipoTemplate;


    private Boolean lineaInConsuntivazioneScommesse;


    private Boolean lineaInConsuntivazioneVlt;


    private String noteConsuntivazioneAttiva;


    private String noteSed;

    private Integer riutilizzo;

    private Integer sla;


    private String tdLinea;


    private String tdLineaVodafone;


    private String tdLineaWind;


    private String userMod;


    private String userMonitoraggioTalo;


    private String velocitaAggancio;


    private String velocitaAggancioRilevata;

    private Boolean whs;



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

    @Override
    public String toString() {
        return "LineaDTO{" +
                "idLinea=" + idLinea +
                ", statoLinea=" + statoLinea +
                ", tipoRisorsa=" + tipoRisorsa +
                ", tipoLinea=" + tipoLinea +
                ", matriceLinea=" + matriceLinea +
                ", lineaDate=" + lineaDate +
                ", funzioneLinea=" + funzioneLinea +
                ", anagraficaFornitore=" + anagraficaFornitore +
                ", dettaglioMasterLinea=" + dettaglioMasterLinea +
                ", contrattiSedFornitori=" + contrattiSedFornitori +
                ", focus=" + focus +
                ", causaVincoloLinea=" + causaVincoloLinea +
                ", richiestaLinea=" + richiestaLinea +
                ", profiloBanda=" + profiloBanda +
                ", profiloCommerciale=" + profiloCommerciale +
                ", tipoRichiestaSed=" + tipoRichiestaSed +
                ", comsBlocchiList=" + comsBlocchiList +
                ", cni=" + cni +
                ", codNis='" + codNis + '\'' +
                ", codiceCollaudo='" + codiceCollaudo + '\'' +
                ", dataEsclusioneTalo=" + dataEsclusioneTalo +
                ", dataIntercompanyServizioAccesso=" + dataIntercompanyServizioAccesso +
                ", dataIntercompanyServizioAccessoFree=" + dataIntercompanyServizioAccessoFree +
                ", esclusoMonitoraggioTalo=" + esclusoMonitoraggioTalo +
                ", esito48h='" + esito48h + '\'' +
                ", esitoVeloce='" + esitoVeloce + '\'' +
                ", flagConsuntivazioneAttiva=" + flagConsuntivazioneAttiva +
                ", flagTbms=" + flagTbms +
                ", ggSlaEffettivi=" + ggSlaEffettivi +
                ", giorniInVincolo=" + giorniInVincolo +
                ", giorniInVincoloFornitore=" + giorniInVincoloFornitore +
                ", idCategoriaServizio=" + idCategoriaServizio +
                ", categoriaServizio=" + categoriaServizio +
                ", idCausaAnnullamentoLinea=" + idCausaAnnullamentoLinea +
                ", idCausaCessazioneLinea=" + idCausaCessazioneLinea +
                ", idCausaNonFattibileLinea=" + idCausaNonFattibileLinea +
                ", idCausaNonRealizzabileLinea=" + idCausaNonRealizzabileLinea +
                ", idCausaVincoloLinea=" + idCausaVincoloLinea +
                ", idContrattiLtmSed=" + idContrattiLtmSed +
                ", idAnagraficaFornitore=" + idAnagraficaFornitore +
                ", idContrattiSedFornitori=" + idContrattiSedFornitori +
                ", idFunzioneLinea=" + idFunzioneLinea +
                ", idIntercompanyServizioAccesso=" + idIntercompanyServizioAccesso +
                ", idIntercompanyServizioAccessoFree=" + idIntercompanyServizioAccessoFree +
                ", idLineaMigrato=" + idLineaMigrato +
                ", idMasterLinea=" + idMasterLinea +
                ", idProfiloCommerciale=" + idProfiloCommerciale +
                ", idProfiloBanda=" + idProfiloBanda +
                ", idFocus=" + idFocus +
                ", idRichiestaLinea=" + idRichiestaLinea +
                ", idSiebelFw='" + idSiebelFw + '\'' +
                ", idSlaSoglieLinea=" + idSlaSoglieLinea +
                ", idSlaSoglieLineaIntercompany=" + idSlaSoglieLineaIntercompany +
                ", idStatoLinea=" + idStatoLinea +
                ", idTestPingone=" + idTestPingone +
                ", idTipo=" + idTipo +
                ", idTipoRichiestaSed=" + idTipoRichiestaSed +
                ", idTipoRisorsa=" + idTipoRisorsa +
                ", idTipoTemplate=" + idTipoTemplate +
                ", lineaInConsuntivazioneScommesse=" + lineaInConsuntivazioneScommesse +
                ", lineaInConsuntivazioneVlt=" + lineaInConsuntivazioneVlt +
                ", noteConsuntivazioneAttiva='" + noteConsuntivazioneAttiva + '\'' +
                ", noteSed='" + noteSed + '\'' +
                ", riutilizzo=" + riutilizzo +
                ", sla=" + sla +
                ", tdLinea='" + tdLinea + '\'' +
                ", tdLineaVodafone='" + tdLineaVodafone + '\'' +
                ", tdLineaWind='" + tdLineaWind + '\'' +
                ", userMod='" + userMod + '\'' +
                ", userMonitoraggioTalo='" + userMonitoraggioTalo + '\'' +
                ", velocitaAggancio='" + velocitaAggancio + '\'' +
                ", velocitaAggancioRilevata='" + velocitaAggancioRilevata + '\'' +
                ", whs=" + whs +
                '}';
    }
}