package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the linee_fatturazione_storico_dettagli database table.
 * 
 */
@Entity
@Table(name="linee_fatturazione_storico_dettagli")
public class LineeFatturazioneStoricoDettagli implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idLineeFatturazioneStoricoDettagli")
	@SequenceGenerator(name="idLineeFatturazioneStoricoDettagli", sequenceName = "linee_fatturazione_storico_de_id_linee_fatturazione_storico_seq", allocationSize=1)
	@Column(name="id_linee_fatturazione_storico_dettagli")
	private Long idLineeFatturazioneStoricoDettagli;

	@Column(name="anno_competenza")
	private String annoCompetenza;

	private String appartenenza;

	private BigDecimal canone;

	@Column(name="cod_cliente_finale")
	private String codClienteFinale;

	private String competenza;

	@Column(name="contratti_sed_fornitori")
	private String contrattiSedFornitori;

	@Column(name="contratto_ltm")
	private String contrattoLtm;

	@Column(name="data_attivazione")
	private Date dataAttivazione;

	@Column(name="data_cessazione")
	private Date dataCessazione;

	@Column(name="data_stato")
	private Date dataStato;

	@Column(name="dd_fatt")
	private String ddFatt;

	@Column(name="dd_inf")
	private String ddInf;

	@Column(name="dd_sup")
	private String ddSup;

	@Column(name="descrizione_anagrafica_fornitore")
	private String descrizioneAnagraficaFornitore;

	@Column(name="funzione_linea")
	private String funzioneLinea;

	@Column(name="funzione_router")
	private String funzioneRouter;

	@Column(name="id_contratti_ltm_sed")
	private Long idContrattiLtmSed;

	@Column(name="id_contratti_sed_fornitori")
	private Long idContrattiSedFornitori;

	@Column(name="id_fascia")
	private Long idFascia;

	@Column(name="id_infrastruttura")
	private Long idInfrastruttura;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="id_marker")
	private Long idMarker;

	@Column(name="id_profilo_linea")
	private Long idProfiloLinea;

	@Column(name="id_profilo_tecnico")
	private Long idProfiloTecnico;

	@Column(name="id_progetto_ltm")
	private Long idProgettoLtm;

	@Column(name="id_siebel_fw")
	private String idSiebelFw;

	@Column(name="id_tipo_linea")
	private Long idTipoLinea;

	@Column(name="mm_fatt")
	private String mmFatt;

	@Column(name="mm_inf")
	private String mmInf;

	@Column(name="mm_sup")
	private String mmSup;

	@Column(name="stato_linea")
	private String statoLinea;

	@Column(name="td_linea")
	private String tdLinea;

	@Column(name="tipo_linea")
	private String tipoLinea;

	@Column(name="tipo_richiesta_sed")
	private String tipoRichiestaSed;

	@Column(name="tipo_risorsa")
	private String tipoRisorsa;

	private BigDecimal ut;

	@Column(name="ut_canone")
	private String utCanone;

	@Column(name="ut_disinst")
	private BigDecimal utDisinst;

	@Column(name="voce_fatturazione")
	private String voceFatturazione;

	@Column(name="yy_fatt")
	private String yyFatt;

	@Column(name="yy_inf")
	private String yyInf;

	@Column(name="yy_sup")
	private String yySup;

	@Transient
	private String contrattiLtmSed;
	
	public LineeFatturazioneStoricoDettagli() {
	}

	public Long getIdLineeFatturazioneStoricoDettagli() {
		return this.idLineeFatturazioneStoricoDettagli;
	}

	public void setIdLineeFatturazioneStoricoDettagli(Long idLineeFatturazioneStoricoDettagli) {
		this.idLineeFatturazioneStoricoDettagli = idLineeFatturazioneStoricoDettagli;
	}

	public String getAnnoCompetenza() {
		return this.annoCompetenza;
	}

	public void setAnnoCompetenza(String annoCompetenza) {
		this.annoCompetenza = annoCompetenza;
	}

	public String getAppartenenza() {
		return this.appartenenza;
	}

	public void setAppartenenza(String appartenenza) {
		this.appartenenza = appartenenza;
	}

	public BigDecimal getCanone() {
		return this.canone;
	}

	public void setCanone(BigDecimal canone) {
		this.canone = canone;
	}

	public String getCodClienteFinale() {
		return this.codClienteFinale;
	}

	public void setCodClienteFinale(String codClienteFinale) {
		this.codClienteFinale = codClienteFinale;
	}

	public String getCompetenza() {
		return this.competenza;
	}

	public void setCompetenza(String competenza) {
		this.competenza = competenza;
	}

	public String getContrattiSedFornitori() {
		return this.contrattiSedFornitori;
	}

	public void setContrattiSedFornitori(String contrattiSedFornitori) {
		this.contrattiSedFornitori = contrattiSedFornitori;
	}

	public String getContrattoLtm() {
		return this.contrattoLtm;
	}

	public void setContrattoLtm(String contrattoLtm) {
		this.contrattoLtm = contrattoLtm;
	}

	public Date getDataAttivazione() {
		return this.dataAttivazione;
	}

	public void setDataAttivazione(Date dataAttivazione) {
		this.dataAttivazione = dataAttivazione;
	}

	public Date getDataCessazione() {
		return this.dataCessazione;
	}

	public void setDataCessazione(Date dataCessazione) {
		this.dataCessazione = dataCessazione;
	}

	public Date getDataStato() {
		return this.dataStato;
	}

	public void setDataStato(Date dataStato) {
		this.dataStato = dataStato;
	}

	public String getDdFatt() {
		return this.ddFatt;
	}

	public void setDdFatt(String ddFatt) {
		this.ddFatt = ddFatt;
	}

	public String getDdInf() {
		return this.ddInf;
	}

	public void setDdInf(String ddInf) {
		this.ddInf = ddInf;
	}

	public String getDdSup() {
		return this.ddSup;
	}

	public void setDdSup(String ddSup) {
		this.ddSup = ddSup;
	}

	public String getDescrizioneAnagraficaFornitore() {
		return this.descrizioneAnagraficaFornitore;
	}

	public void setDescrizioneAnagraficaFornitore(String descrizioneAnagraficaFornitore) {
		this.descrizioneAnagraficaFornitore = descrizioneAnagraficaFornitore;
	}

	public String getFunzioneLinea() {
		return this.funzioneLinea;
	}

	public void setFunzioneLinea(String funzioneLinea) {
		this.funzioneLinea = funzioneLinea;
	}

	public String getFunzioneRouter() {
		return this.funzioneRouter;
	}

	public void setFunzioneRouter(String funzioneRouter) {
		this.funzioneRouter = funzioneRouter;
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

	public Long getIdFascia() {
		return this.idFascia;
	}

	public void setIdFascia(Long idFascia) {
		this.idFascia = idFascia;
	}

	public Long getIdInfrastruttura() {
		return this.idInfrastruttura;
	}

	public void setIdInfrastruttura(Long idInfrastruttura) {
		this.idInfrastruttura = idInfrastruttura;
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Long getIdMarker() {
		return this.idMarker;
	}

	public void setIdMarker(Long idMarker) {
		this.idMarker = idMarker;
	}

	public Long getIdProfiloLinea() {
		return this.idProfiloLinea;
	}

	public void setIdProfiloLinea(Long idProfiloLinea) {
		this.idProfiloLinea = idProfiloLinea;
	}

	public Long getIdProfiloTecnico() {
		return this.idProfiloTecnico;
	}

	public void setIdProfiloTecnico(Long idProfiloTecnico) {
		this.idProfiloTecnico = idProfiloTecnico;
	}

	public Long getIdProgettoLtm() {
		return this.idProgettoLtm;
	}

	public void setIdProgettoLtm(Long idProgettoLtm) {
		this.idProgettoLtm = idProgettoLtm;
	}

	public String getIdSiebelFw() {
		return this.idSiebelFw;
	}

	public void setIdSiebelFw(String idSiebelFw) {
		this.idSiebelFw = idSiebelFw;
	}

	public Long getIdTipoLinea() {
		return this.idTipoLinea;
	}

	public void setIdTipoLinea(Long idTipoLinea) {
		this.idTipoLinea = idTipoLinea;
	}

	public String getMmFatt() {
		return this.mmFatt;
	}

	public void setMmFatt(String mmFatt) {
		this.mmFatt = mmFatt;
	}

	public String getMmInf() {
		return this.mmInf;
	}

	public void setMmInf(String mmInf) {
		this.mmInf = mmInf;
	}

	public String getMmSup() {
		return this.mmSup;
	}

	public void setMmSup(String mmSup) {
		this.mmSup = mmSup;
	}

	public String getStatoLinea() {
		return this.statoLinea;
	}

	public void setStatoLinea(String statoLinea) {
		this.statoLinea = statoLinea;
	}

	public String getTdLinea() {
		return this.tdLinea;
	}

	public void setTdLinea(String tdLinea) {
		this.tdLinea = tdLinea;
	}

	public String getTipoLinea() {
		return this.tipoLinea;
	}

	public void setTipoLinea(String tipoLinea) {
		this.tipoLinea = tipoLinea;
	}

	public String getTipoRichiestaSed() {
		return this.tipoRichiestaSed;
	}

	public void setTipoRichiestaSed(String tipoRichiestaSed) {
		this.tipoRichiestaSed = tipoRichiestaSed;
	}

	public String getTipoRisorsa() {
		return this.tipoRisorsa;
	}

	public void setTipoRisorsa(String tipoRisorsa) {
		this.tipoRisorsa = tipoRisorsa;
	}

	public BigDecimal getUt() {
		return this.ut;
	}

	public void setUt(BigDecimal ut) {
		this.ut = ut;
	}

	public String getUtCanone() {
		return this.utCanone;
	}

	public void setUtCanone(String utCanone) {
		this.utCanone = utCanone;
	}

	public BigDecimal getUtDisinst() {
		return this.utDisinst;
	}

	public void setUtDisinst(BigDecimal utDisinst) {
		this.utDisinst = utDisinst;
	}

	public String getVoceFatturazione() {
		return this.voceFatturazione;
	}

	public void setVoceFatturazione(String voceFatturazione) {
		this.voceFatturazione = voceFatturazione;
	}

	public String getYyFatt() {
		return this.yyFatt;
	}

	public void setYyFatt(String yyFatt) {
		this.yyFatt = yyFatt;
	}

	public String getYyInf() {
		return this.yyInf;
	}

	public void setYyInf(String yyInf) {
		this.yyInf = yyInf;
	}

	public String getYySup() {
		return this.yySup;
	}

	public void setYySup(String yySup) {
		this.yySup = yySup;
	}

	public String getContrattiLtmSed() {
		return contrattiLtmSed;
	}

	public void setContrattiLtmSed(String contrattiLtmSed) {
		this.contrattiLtmSed = contrattiLtmSed;
	}

}