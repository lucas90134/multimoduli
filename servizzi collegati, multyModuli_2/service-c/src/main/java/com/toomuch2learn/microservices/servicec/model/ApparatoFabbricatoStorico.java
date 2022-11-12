package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the MAXIMO_ANAGRAFICA database table.
 * 
 */
@Entity
@Table(name="apparato_fabbricato_storico")
@NamedQuery(name="ApparatoFabbricatoStorico.findAll", query="SELECT a FROM ApparatoFabbricatoStorico a")
public class ApparatoFabbricatoStorico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idApparatoFabbricatoStorico")
	@SequenceGenerator(name="idApparatoFabbricatoStorico", sequenceName = "apparato_fabbricato_storico_id_apparato_fabbricato_storico_seq", allocationSize=1)
	@Column(name="id_apparato_fabbricato_storico")
	private Long idApparatoFabbricatoStorico;
	
	@Column(name="id_apparato_fabbricato")
	private Long idApparatoFabbricato;
	
	@Column(name="mac_address",length=16,nullable=false)
	private String macAddress;

	@Column(name="ip_tim_rm",length=15)
	private String ipTimRm;

	@Column(name="ip_tim_mi",length=15)
	private String ipTimMi;

	@Column(name="sim",length=50)
	private String sim;

	@Column(name="sim2",length=50)
	private String sim2;
	
	@Column(name="ip_wind",length=15)
	private String ipWind;
	
	@Column(name="ip_vodafone",length=15)
	private String ipVodafone;
	
	@Column(name="matricola",length=50)
	private String matricola;
	
	@Column(name="serial_number",length=50)
	private String serialNumber;
	
	@Column(name="iccd",length=50)
	private String iccd;
	
	@Column(name="iccd2",length=50)
	private String iccd2;
	
	@Column(name="iccd_vodafone",length=50)
	private String iccdVodafone;
	
	@Column(name="imsi_vodafone",length=50)
	private String imsiVodafone;
	
	@Column(name="id_modello_apparato")
	private Integer idModelloApparato;
	
	@JsonIgnore
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_modello_apparato",insertable=false,updatable=false,nullable=true)
	private ModelloApparato modelloApparato;
	
	@Column(name="id_ordine_acquisto")
	private Long idOrdineAcquisto;
	
	@Column(name="id_utilizzo_router")
	private Integer idUtilizzoRouter;
	
	@JsonIgnore
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_utilizzo_router",insertable=false,updatable=false,nullable=true)
	private UtilizzoRouter utilizzoRouter;

	@Column(name="id_stato_router")
	private Integer idStatoRouter;
	
	@JsonIgnore
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_stato_router",insertable=false,updatable=false,nullable=true)
	private StatoRouter statoRouter;

	@Column(name="id_dettaglio_stato_router")
	private Integer idDettaglioStatoRouter;

	@JsonIgnore
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_dettaglio_stato_router",insertable=false,updatable=false,nullable=true)
	private DettaglioStatoRouter dettaglioStatoRouter;
	
	@Column(name="data_stato_router")
	private Date dataStatoRouter;
	
	@Column(name="data_prima_volta_nello_stato")
	private Date dataPrimaVoltaNelloStato;
	
	@Column(name="data_ultimo_rilevamento")
	private Date dataUltimoRilevamento;
	
	@Column(name="data_import")
	private Date dataImport;
	
	@Column(name="id_ubicazione")
	private Integer idUbicazione;
	
	@Column(name="id_sede")
	private Integer idSede;
	
	@Column(name="id_import_apparato_fabbricato")
	private Long idImportApparatoFabbricato;
	
	@Column(name="data_storicizzazione")
	private Date dataStoricizzazione;
	
	public ApparatoFabbricatoStorico() {
		super();
	}

	@Override
	public String toString() {
		return "{\n\t\"idApparatoFabbricatoStorico\":\"" + idApparatoFabbricatoStorico
				+ "\",\n\t\"idApparatoFabbricato\":\"" + idApparatoFabbricato + "\",\n\t\"macAddress\":\"" + macAddress
				+ "\",\n\t\"ipTimRm\":\"" + ipTimRm + "\",\n\t\"ipTimMi\":\"" + ipTimMi + "\",\n\t\"sim\":\"" + sim
				+ "\",\n\t\"sim2\":\"" + sim2 + "\",\n\t\"ipWind\":\"" + ipWind + "\",\n\t\"ipVodafone\":\""
				+ ipVodafone + "\",\n\t\"matricola\":\"" + matricola + "\",\n\t\"serialNumber\":\"" + serialNumber
				+ "\",\n\t\"iccd\":\"" + iccd + "\",\n\t\"iccd2\":\"" + iccd2 + "\",\n\t\"iccdVodafone\":\""
				+ iccdVodafone + "\",\n\t\"imsiVodafone\":\"" + imsiVodafone + "\",\n\t\"idModelloApparato\":\""
				+ idModelloApparato + "\",\n\t\"modelloApparato\":\"" + modelloApparato
				+ "\",\n\t\"idOrdineAcquisto\":\"" + idOrdineAcquisto + "\",\n\t\"idUtilizzoRouter\":\""
				+ idUtilizzoRouter + "\",\n\t\"utilizzoRouter\":\"" + utilizzoRouter + "\",\n\t\"idStatoRouter\":\""
				+ idStatoRouter + "\",\n\t\"statoRouter\":\"" + statoRouter + "\",\n\t\"idDettaglioStatoRouter\":\""
				+ idDettaglioStatoRouter + "\",\n\t\"dettaglioStatoRouter\":\"" + dettaglioStatoRouter
				+ "\",\n\t\"dataStatoRouter\":\"" + dataStatoRouter + "\",\n\t\"dataPrimaVoltaNelloStato\":\""
				+ dataPrimaVoltaNelloStato + "\",\n\t\"dataUltimoRilevamento\":\"" + dataUltimoRilevamento
				+ "\",\n\t\"dataImport\":\"" + dataImport + "\",\n\t\"idUbicazione\":\"" + idUbicazione
				+ "\",\n\t\"idSede\":\"" + idSede + "\",\n\t\"idImportApparatoFabbricato\":\""
				+ idImportApparatoFabbricato + "\",\n\t\"dataStoricizzazione\":\"" + dataStoricizzazione + "\"\n}";
	}

	public Long getIdApparatoFabbricato() {
		return idApparatoFabbricato;
	}

	public void setIdApparatoFabbricato(Long idApparatoFabbricato) {
		this.idApparatoFabbricato = idApparatoFabbricato;
	}

	public Long getIdApparatoFabbricatoStorico() {
		return idApparatoFabbricatoStorico;
	}

	public void setIdApparatoFabbricatoStorico(Long idApparatoFabbricatoStorico) {
		this.idApparatoFabbricatoStorico = idApparatoFabbricatoStorico;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getIpTimRm() {
		return ipTimRm;
	}

	public void setIpTimRm(String ipTimRm) {
		this.ipTimRm = ipTimRm;
	}

	public String getIpTimMi() {
		return ipTimMi;
	}

	public void setIpTimMi(String ipTimMi) {
		this.ipTimMi = ipTimMi;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public String getSim2() {
		return sim2;
	}

	public void setSim2(String sim2) {
		this.sim2 = sim2;
	}

	public String getIpWind() {
		return ipWind;
	}

	public void setIpWind(String ipWind) {
		this.ipWind = ipWind;
	}

	public String getIpVodafone() {
		return ipVodafone;
	}

	public void setIpVodafone(String ipVodafone) {
		this.ipVodafone = ipVodafone;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getIccd() {
		return iccd;
	}

	public void setIccd(String iccd) {
		this.iccd = iccd;
	}

	public String getIccd2() {
		return iccd2;
	}

	public void setIccd2(String iccd2) {
		this.iccd2 = iccd2;
	}

	public String getIccdVodafone() {
		return iccdVodafone;
	}

	public void setIccdVodafone(String iccdVodafone) {
		this.iccdVodafone = iccdVodafone;
	}

	public String getImsiVodafone() {
		return imsiVodafone;
	}

	public void setImsiVodafone(String imsiVodafone) {
		this.imsiVodafone = imsiVodafone;
	}

	public Integer getIdModelloApparato() {
		return idModelloApparato;
	}

	public void setIdModelloApparato(Integer idModelloApparato) {
		this.idModelloApparato = idModelloApparato;
	}

	public ModelloApparato getModelloApparato() {
		return modelloApparato;
	}

	public void setModelloApparato(ModelloApparato modelloApparato) {
		this.modelloApparato = modelloApparato;
	}

	public Long getIdOrdineAcquisto() {
		return idOrdineAcquisto;
	}

	public void setIdOrdineAcquisto(Long idOrdineAcquisto) {
		this.idOrdineAcquisto = idOrdineAcquisto;
	}

	public Integer getIdUtilizzoRouter() {
		return idUtilizzoRouter;
	}

	public void setIdUtilizzoRouter(Integer idUtilizzoRouter) {
		this.idUtilizzoRouter = idUtilizzoRouter;
	}

	public UtilizzoRouter getUtilizzoRouter() {
		return utilizzoRouter;
	}

	public void setUtilizzoRouter(UtilizzoRouter utilizzoRouter) {
		this.utilizzoRouter = utilizzoRouter;
	}

	public Integer getIdStatoRouter() {
		return idStatoRouter;
	}

	public void setIdStatoRouter(Integer idStatoRouter) {
		this.idStatoRouter = idStatoRouter;
	}

	public StatoRouter getStatoRouter() {
		return statoRouter;
	}

	public void setStatoRouter(StatoRouter statoRouter) {
		this.statoRouter = statoRouter;
	}

	public Integer getIdDettaglioStatoRouter() {
		return idDettaglioStatoRouter;
	}

	public void setIdDettaglioStatoRouter(Integer idDettaglioStatoRouter) {
		this.idDettaglioStatoRouter = idDettaglioStatoRouter;
	}

	public DettaglioStatoRouter getDettaglioStatoRouter() {
		return dettaglioStatoRouter;
	}

	public void setDettaglioStatoRouter(DettaglioStatoRouter dettaglioStatoRouter) {
		this.dettaglioStatoRouter = dettaglioStatoRouter;
	}

	public Date getDataStatoRouter() {
		return dataStatoRouter;
	}

	public void setDataStatoRouter(Date dataStatoRouter) {
		this.dataStatoRouter = dataStatoRouter;
	}

	public Date getDataPrimaVoltaNelloStato() {
		return dataPrimaVoltaNelloStato;
	}

	public void setDataPrimaVoltaNelloStato(Date dataPrimaVoltaNelloStato) {
		this.dataPrimaVoltaNelloStato = dataPrimaVoltaNelloStato;
	}

	public Date getDataUltimoRilevamento() {
		return dataUltimoRilevamento;
	}

	public void setDataUltimoRilevamento(Date dataUltimoRilevamento) {
		this.dataUltimoRilevamento = dataUltimoRilevamento;
	}

	public Date getDataImport() {
		return dataImport;
	}

	public void setDataImport(Date dataImport) {
		this.dataImport = dataImport;
	}

	public Integer getIdUbicazione() {
		return idUbicazione;
	}

	public void setIdUbicazione(Integer idUbicazione) {
		this.idUbicazione = idUbicazione;
	}

	public Integer getIdSede() {
		return idSede;
	}

	public void setIdSede(Integer idSede) {
		this.idSede = idSede;
	}

	public Long getIdImportApparatoFabbricato() {
		return idImportApparatoFabbricato;
	}

	public void setIdImportApparatoFabbricato(Long idImportApparatoFabbricato) {
		this.idImportApparatoFabbricato = idImportApparatoFabbricato;
	}

	public Date getDataStoricizzazione() {
		return dataStoricizzazione;
	}

	public void setDataStoricizzazione(Date dataStoricizzazione) {
		this.dataStoricizzazione = dataStoricizzazione;
	}

	
}