package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the apparato_fabbricato database table.
 * 
 */
@Entity
@Table(name="apparato_fabbricato")
@NamedQuery(name="ApparatoFabbricato.findAll", query="SELECT a FROM ApparatoFabbricato a")
@Audited
public class ApparatoFabbricato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idApparatoFabbricato")
	@SequenceGenerator(name="idApparatoFabbricato", sequenceName = "apparato_fabbricato_id_apparato_fabbricato_seq", allocationSize=1)
	@Column(name="id_apparato_fabbricato")
	private Long idApparatoFabbricato;

	@JsonIgnore
	@OneToMany(mappedBy = "apparatoFabbricato", fetch = FetchType.LAZY)
	@NotAudited
	private List<ApparatiLinea> apparatiLinea;

	@Column(name="data_disperso")
	private Date dataDisperso;

	@Column(name="data_import")
	private Date dataImport;

	@Column(name="data_in_circolo")
	private Date dataInCircolo;

	@Column(name="data_primo_aggiornamento_certo")
	private Date dataPrimoAggiornamentoCerto;

	@Column(name="data_stato")
	private Date dataStato;

	@Column(name="data_ultimo_aggiornamento_certo")
	private Date dataUltimoAggiornamentoCerto;

	@Column(name="data_ultimo_controllo")
	private Date dataUltimoControllo;

	@Column(name="flag_disperso")
	private Boolean flagDisperso;

	@Column(name="flag_in_circolo")
	private Boolean flagInCircolo;

	private String iccd;

	@Column(name="iccd_vodafone")
	private String iccdVodafone;

	private String iccd2;

	@Column(name="id_dettaglio_stato_router")
	private Long idDettaglioStatoRouter;

	@Column(name="id_disperso_identificativo_apparato")
	private Long idDispersoIdentificativoApparato;

	@Column(name="id_import_apparato_fabbricato")
	private Long idImportApparatoFabbricato;

	@Column(name="id_modello_apparato")
	private Long idModelloApparato;

	@Column(name="id_ordine_acquisto")
	private Long idOrdineAcquisto;

	@Column(name="id_sede")
	private Long idSede;

	@Column(name="id_stato_router")
	private Long idStatoRouter;

	@Column(name="id_tipo_apparato")
	private Long idTipoApparato;

	@Column(name="id_ubicazione")
	private Long idUbicazione;

	@Column(name="id_utilizzo_apparato")
	private Long idUtilizzoApparato;

	@Column(name="id_utilizzo_router")
	private Long idUtilizzoRouter;

	@Column(name="imsi_vodafone")
	private String imsiVodafone;

	@Column(name="ip_tim_mi")
	private String ipTimMi;

	@Column(name="ip_tim_rm")
	private String ipTimRm;

	@Column(name="ip_vodafone")
	private String ipVodafone;

	@Column(name="ip_wind")
	private String ipWind;

	private String location;

	@Column(name="mac_address")
	private String macAddress;

	private String matricola;

	@Column(name="serial_number")
	private String serialNumber;

	private String sim;

	private String sim2;

	@JsonIgnore
	@ManyToOne	(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_ordine_acquisto",insertable=false,updatable=false,nullable=true)
	@NotAudited
	private ApparatoOrdineAcquisto apparatoOrdineAcquisto;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_modello_apparato",insertable=false,updatable=false,nullable=true)
	@NotAudited
	private ModelloApparato modelloApparato;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_dettaglio_stato_router",insertable=false,updatable=false,nullable=true)
	@NotAudited
	private DettaglioStatoRouter dettaglioStatoRouter;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_stato_router",insertable=false,updatable=false,nullable=true)
	@NotAudited
	private StatoRouter statoRouter;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_utilizzo_router",insertable=false,updatable=false,nullable=true)
	@NotAudited
	private UtilizzoRouter utilizzoRouter;

	@JsonIgnore
	@ManyToOne	(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_utilizzo_apparato",insertable=false,updatable=false,nullable=true)
	@NotAudited
	private UtilizzoApparato utilizzoApparato;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_tipo_apparato",insertable=false,updatable=false,nullable=true)
	@NotAudited
	private TipoApparato tipoApparato;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_ubicazione",insertable=false,updatable=false,nullable=true)
	@NotAudited
	private RouterUbicazione routerUbicazione;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_disperso_identificativo_apparato",insertable=false,updatable=false,nullable=true)
	@NotAudited
	private DispersoIdentificativoApparato dispersoIdentificativoApparato;


	public ApparatoFabbricato() {
	}

	public Long getIdApparatoFabbricato() {
		return this.idApparatoFabbricato;
	}

	public void setIdApparatoFabbricato(Long idApparatoFabbricato) {
		this.idApparatoFabbricato = idApparatoFabbricato;
	}

	public Date getDataDisperso() {
		return this.dataDisperso;
	}

	public void setDataDisperso(Date dataDisperso) {
		this.dataDisperso = dataDisperso;
	}

	public Date getDataImport() {
		return this.dataImport;
	}

	public void setDataImport(Date dataImport) {
		this.dataImport = dataImport;
	}

	public Date getDataInCircolo() {
		return this.dataInCircolo;
	}

	public void setDataInCircolo(Date dataInCircolo) {
		this.dataInCircolo = dataInCircolo;
	}

	public Date getDataPrimoAggiornamentoCerto() {
		return this.dataPrimoAggiornamentoCerto;
	}

	public void setDataPrimoAggiornamentoCerto(Date dataPrimoAggiornamentoCerto) {
		this.dataPrimoAggiornamentoCerto = dataPrimoAggiornamentoCerto;
	}

	public Date getDataStato() {
		return this.dataStato;
	}

	public void setDataStato(Date dataStato) {
		this.dataStato = dataStato;
	}

	public Date getDataUltimoAggiornamentoCerto() {
		return this.dataUltimoAggiornamentoCerto;
	}

	public void setDataUltimoAggiornamentoCerto(Date dataUltimoAggiornamentoCerto) {
		this.dataUltimoAggiornamentoCerto = dataUltimoAggiornamentoCerto;
	}

	public Date getDataUltimoControllo() {
		return this.dataUltimoControllo;
	}

	public void setDataUltimoControllo(Date dataUltimoControllo) {
		this.dataUltimoControllo = dataUltimoControllo;
	}

	public Boolean getFlagDisperso() {
		return this.flagDisperso;
	}

	public void setFlagDisperso(Boolean flagDisperso) {
		this.flagDisperso = flagDisperso;
	}

	public Boolean getFlagInCircolo() {
		return this.flagInCircolo;
	}

	public void setFlagInCircolo(Boolean flagInCircolo) {
		this.flagInCircolo = flagInCircolo;
	}

	public String getIccd() {
		return this.iccd;
	}

	public void setIccd(String iccd) {
		this.iccd = iccd;
	}

	public String getIccdVodafone() {
		return this.iccdVodafone;
	}

	public void setIccdVodafone(String iccdVodafone) {
		this.iccdVodafone = iccdVodafone;
	}

	public String getIccd2() {
		return this.iccd2;
	}

	public void setIccd2(String iccd2) {
		this.iccd2 = iccd2;
	}

	public Long getIdDettaglioStatoRouter() {
		return this.idDettaglioStatoRouter;
	}

	public void setIdDettaglioStatoRouter(Long idDettaglioStatoRouter) {
		this.idDettaglioStatoRouter = idDettaglioStatoRouter;
	}

	public Long getIdDispersoIdentificativoApparato() {
		return this.idDispersoIdentificativoApparato;
	}

	public void setIdDispersoIdentificativoApparato(Long idDispersoIdentificativoApparato) {
		this.idDispersoIdentificativoApparato = idDispersoIdentificativoApparato;
	}

	public Long getIdImportApparatoFabbricato() {
		return this.idImportApparatoFabbricato;
	}

	public void setIdImportApparatoFabbricato(Long idImportApparatoFabbricato) {
		this.idImportApparatoFabbricato = idImportApparatoFabbricato;
	}

	public Long getIdModelloApparato() {
		return this.idModelloApparato;
	}

	public void setIdModelloApparato(Long idModelloApparato) {
		this.idModelloApparato = idModelloApparato;
	}

	public Long getIdOrdineAcquisto() {
		return this.idOrdineAcquisto;
	}

	public void setIdOrdineAcquisto(Long idOrdineAcquisto) {
		this.idOrdineAcquisto = idOrdineAcquisto;
	}

	public Long getIdSede() {
		return this.idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public Long getIdStatoRouter() {
		return this.idStatoRouter;
	}

	public void setIdStatoRouter(Long idStatoRouter) {
		this.idStatoRouter = idStatoRouter;
	}

	public Long getIdTipoApparato() {
		return this.idTipoApparato;
	}

	public void setIdTipoApparato(Long idTipoApparato) {
		this.idTipoApparato = idTipoApparato;
	}

	public Long getIdUbicazione() {
		return this.idUbicazione;
	}

	public void setIdUbicazione(Long idUbicazione) {
		this.idUbicazione = idUbicazione;
	}

	public Long getIdUtilizzoApparato() {
		return this.idUtilizzoApparato;
	}

	public void setIdUtilizzoApparato(Long idUtilizzoApparato) {
		this.idUtilizzoApparato = idUtilizzoApparato;
	}

	public Long getIdUtilizzoRouter() {
		return this.idUtilizzoRouter;
	}

	public void setIdUtilizzoRouter(Long idUtilizzoRouter) {
		this.idUtilizzoRouter = idUtilizzoRouter;
	}

	public String getImsiVodafone() {
		return this.imsiVodafone;
	}

	public void setImsiVodafone(String imsiVodafone) {
		this.imsiVodafone = imsiVodafone;
	}

	public String getIpTimMi() {
		return this.ipTimMi;
	}

	public void setIpTimMi(String ipTimMi) {
		this.ipTimMi = ipTimMi;
	}

	public String getIpTimRm() {
		return this.ipTimRm;
	}

	public void setIpTimRm(String ipTimRm) {
		this.ipTimRm = ipTimRm;
	}

	public String getIpVodafone() {
		return this.ipVodafone;
	}

	public void setIpVodafone(String ipVodafone) {
		this.ipVodafone = ipVodafone;
	}

	public String getIpWind() {
		return this.ipWind;
	}

	public void setIpWind(String ipWind) {
		this.ipWind = ipWind;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSim() {
		return this.sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public String getSim2() {
		return this.sim2;
	}

	public void setSim2(String sim2) {
		this.sim2 = sim2;
	}

	public List<ApparatiLinea> getApparatiLinea() {
		return apparatiLinea;
	}

	public void setApparatiLinea(List<ApparatiLinea> apparatiLinea) {
		this.apparatiLinea = apparatiLinea;
	}

	public ApparatoOrdineAcquisto getApparatoOrdineAcquisto() {
		return apparatoOrdineAcquisto;
	}

	public void setApparatoOrdineAcquisto(ApparatoOrdineAcquisto apparatoOrdineAcquisto) {
		this.apparatoOrdineAcquisto = apparatoOrdineAcquisto;
	}

	public ModelloApparato getModelloApparato() {
		return modelloApparato;
	}

	public void setModelloApparato(ModelloApparato modelloApparato) {
		this.modelloApparato = modelloApparato;
	}

	public DettaglioStatoRouter getDettaglioStatoRouter() {
		return dettaglioStatoRouter;
	}

	public void setDettaglioStatoRouter(DettaglioStatoRouter dettaglioStatoRouter) {
		this.dettaglioStatoRouter = dettaglioStatoRouter;
	}

	public StatoRouter getStatoRouter() {
		return statoRouter;
	}

	public void setStatoRouter(StatoRouter statoRouter) {
		this.statoRouter = statoRouter;
	}

	public UtilizzoRouter getUtilizzoRouter() {
		return utilizzoRouter;
	}

	public void setUtilizzoRouter(UtilizzoRouter utilizzoRouter) {
		this.utilizzoRouter = utilizzoRouter;
	}

	public UtilizzoApparato getUtilizzoApparato() {
		return utilizzoApparato;
	}

	public void setUtilizzoApparato(UtilizzoApparato utilizzoApparato) {
		this.utilizzoApparato = utilizzoApparato;
	}

	public TipoApparato getTipoApparato() {
		return tipoApparato;
	}

	public void setTipoApparato(TipoApparato tipoApparato) {
		this.tipoApparato = tipoApparato;
	}

	public RouterUbicazione getRouterUbicazione() {
		return routerUbicazione;
	}

	public void setRouterUbicazione(RouterUbicazione routerUbicazione) {
		this.routerUbicazione = routerUbicazione;
	}

	public DispersoIdentificativoApparato getDispersoIdentificativoApparato() {
		return dispersoIdentificativoApparato;
	}

	public void setDispersoIdentificativoApparato(DispersoIdentificativoApparato dispersoIdentificativoApparato) {
		this.dispersoIdentificativoApparato = dispersoIdentificativoApparato;
	}
}