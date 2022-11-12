package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the inventory_storico database table.
 * 
 */
@Entity
@Table(name="inventory_storico")
@NamedQuery(name="InventoryStorico.findAll", query="SELECT t FROM InventoryStorico t")
public class InventoryStorico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idInventoryStorico")
	@SequenceGenerator(name="idInventoryStorico", sequenceName = "inventory_storico_id_inventory_storico_seq", allocationSize=1)
	@Column(name="id_inventory_storico")
	private Long idInventoryStorico;

	@Column(name="adsl_passwd")
	private String adslPasswd;

	@Column(name="adsl_username")
	private String adslUsername;

	@Column(name="blob_show_config")
	private String blobShowConfig;

	private Integer cluster;

	private String cug;

	@Column(name="data_installazione_invent")
	private Date dataInstallazioneInvent;

	@Column(name="data_installazione_rprobe")
	private Date dataInstallazioneRprobe;

	@Column(name="data_migrazione_10elotto")
	private Date dataMigrazione10elotto;

	@Column(name="data_presa_in_carico")
	private Date dataPresaInCarico;

	@Column(name="data_rilevamento")
	private Date dataRilevamento;

	@Column(name="data_storicizzazione")
	private Date dataStoricizzazione;

	@Column(name="data_variazione")
	private Date dataVariazione;

	@Column(name="default_interface")
	private String defaultInterface;

	private String dlci;

	@Column(name="dlci_2")
	private String dlci2;

	@Column(name="esito_installazione_rprobe")
	private Integer esitoInstallazioneRprobe;

	@Column(name="esito_migrazione_10elotto")
	private Integer esitoMigrazione10elotto;

	@Column(name="flag_avvio")
	private Integer flagAvvio;

	@Column(name="flag_batch")
	private Integer flagBatch;

	@Column(name="flag_esito")
	private Integer flagEsito;

	@Column(name="flag_update")
	private Integer flagUpdate;

	@Column(name="flag_variazione_conf_router")
	private Integer flagVariazioneConfRouter;

	@Column(name="funzione_vrrp")
	private String funzioneVrrp;

	@Column(name="gprs_apn")
	private String gprsApn;

	@Column(name="gprs_apn_vodafone")
	private String gprsApnVodafone;

	@Column(name="gprs_apn_wind")
	private String gprsApnWind;

	@Column(name="gprs_passwd")
	private String gprsPasswd;

	@Column(name="gprs_username")
	private String gprsUsername;

	private String hostname;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="id_master_apparato")
	private Long idMasterApparato;

	@Column(name="id_inventory")
	private Long idInventory;

	@Column(name="imola_conf_code")
	private String imolaConfCode;

	@Column(name="interf_gprs")
	private Integer interfGprs;

	@Column(name="interf_isdn")
	private Integer interfIsdn;

	@Column(name="interf_lan")
	private Integer interfLan;

	@Column(name="interf_wan")
	private Integer interfWan;

	@Column(name="interfaccia_di_accesso")
	private String interfacciaDiAccesso;

	@Column(name="invent_vers")
	private String inventVers;

	private String ios;

	@Column(name="ip_accesso")
	private String ipAccesso;

	@Column(name="ip_gprs_mi")
	private String ipGprsMi;

	@Column(name="ip_gprs_mi_inventory")
	private String ipGprsMiInventory;

	@Column(name="ip_gprs_rm")
	private String ipGprsRm;

	@Column(name="ip_gprs_rm_inventory")
	private String ipGprsRmInventory;

	@Column(name="ip_gprs_vodafone")
	private String ipGprsVodafone;

	@Column(name="ip_gprs_vodafone_inventory")
	private String ipGprsVodafoneInventory;

	@Column(name="ip_gprs_wind")
	private String ipGprsWind;

	@Column(name="ip_gprs_wind_inventory")
	private String ipGprsWindInventory;

	@Column(name="ip_isdn")
	private String ipIsdn;

	@Column(name="ip_lan")
	private String ipLan;

	@Column(name="ip_lan_inspired_inventory")
	private String ipLanInspiredInventory;

	@Column(name="ip_lan_inventory")
	private String ipLanInventory;

	@Column(name="ip_lan_novomatic_inventory")
	private String ipLanNovomaticInventory;

	@Column(name="ip_lan_remota")
	private String ipLanRemota;

	@Column(name="ip_lan_remota_2_inventory")
	private String ipLanRemota2Inventory;

	@Column(name="ip_lan_remota_inventory")
	private String ipLanRemotaInventory;

	@Column(name="ip_lan_remota_router")
	private String ipLanRemotaRouter;

	@Column(name="ip_lan_remota_router_2")
	private String ipLanRemotaRouter2;

	@Column(name="ip_lan_remota_router_2_inventory")
	private String ipLanRemotaRouter2Inventory;

	@Column(name="ip_lan_remota_router_inventory")
	private String ipLanRemotaRouterInventory;

	@Column(name="ip_lan_router")
	private String ipLanRouter;

	@Column(name="ip_lan_router_inspired_inventory")
	private String ipLanRouterInspiredInventory;

	@Column(name="ip_lan_router_inventory")
	private String ipLanRouterInventory;

	@Column(name="ip_lan_router_novomatic_inventory")
	private String ipLanRouterNovomaticInventory;

	@Column(name="ip_lan_router_self_inventory")
	private String ipLanRouterSelfInventory;

	@Column(name="ip_lan_router_vbetter_inventory")
	private String ipLanRouterVbetterInventory;

	@Column(name="ip_lan_self_inventory")
	private String ipLanSelfInventory;

	@Column(name="ip_lan_vbetter_inventory")
	private String ipLanVbetterInventory;

	@Column(name="ip_loopback")
	private String ipLoopback;

	@Column(name="ip_loopback_inventory")
	private String ipLoopbackInventory;

	@Column(name="ip_loopback_l_2tp")
	private String ipLoopbackL2tp;

	@Column(name="ip_vrrp_inventory")
	private String ipVrrpInventory;

	@Column(name="ip_wan_router")
	private String ipWanRouter;

	@Column(name="ip_wan_router_2")
	private String ipWanRouter2;

	@Column(name="ip_wan_router_2_inventory")
	private String ipWanRouter2Inventory;

	@Column(name="ip_wan_router_inventory")
	private String ipWanRouterInventory;

	@Column(name="isdn_passwd")
	private String isdnPasswd;

	@Column(name="isdn_username")
	private String isdnUsername;

	@Column(name="lmi_type")
	private String lmiType;

	@Column(name="mac_address")
	private String macAddress;

	private String marca;

	@Column(name="marker_batch")
	private String markerBatch;

	private String matricola;

	private String modello;

	@Column(name="modem_gprs")
	private String modemGprs;

	@Column(name="netmask_lan_gev")
	private String netmaskLanGev;

	@Column(name="netmask_servizi")
	private String netmaskServizi;

	@Column(name="network_lan_gev")
	private String networkLanGev;

	@Column(name="network_servizi")
	private String networkServizi;

	private String numero;

	@Column(name="numero_inventory")
	private Long numeroInventory;

	private String nverde;

	private String password;

	@Column(name="router_lan_gev")
	private String routerLanGev;

	@Column(name="serial_number")
	private String serialNumber;

	@Column(name="stato_gprs")
	private Integer statoGprs;

	@Column(name="stato_isdn")
	private Integer statoIsdn;

	@Column(name="stato_lan")
	private Integer statoLan;

	@Column(name="stato_wan")
	private Integer statoWan;

	@Column(name="subnet_mask_lan_inspired_inventory")
	private String subnetMaskLanInspiredInventory;

	@Column(name="subnet_mask_lan_inventory")
	private String subnetMaskLanInventory;

	@Column(name="subnet_mask_lan_novomatic_inventory")
	private String subnetMaskLanNovomaticInventory;

	@Column(name="subnet_mask_lan_remota_2_inventory")
	private String subnetMaskLanRemota2Inventory;

	@Column(name="subnet_mask_lan_remota_inventory")
	private String subnetMaskLanRemotaInventory;

	@Column(name="subnet_mask_lan_self_inventory")
	private String subnetMaskLanSelfInventory;

	@Column(name="subnet_mask_lan_vbetter_inventory")
	private String subnetMaskLanVbetterInventory;

	@Column(name="switch")
	private Integer switch_;

	@Column(name="tipo_configurazione")
	private String tipoConfigurazione;

	@Column(name="tipo_interf_gprs")
	private String tipoInterfGprs;

	@Column(name="tipo_interf_wan")
	private String tipoInterfWan;

	@Column(name="user_name")
	private String userName;

	@Column(name="variaz_stato_gprs")
	private Integer variazStatoGprs;

	@Column(name="variaz_stato_isdn")
	private Integer variazStatoIsdn;

	@Column(name="variaz_stato_lan")
	private Integer variazStatoLan;

	@Column(name="variaz_stato_wan")
	private Integer variazStatoWan;

	@Column(name="variazione_cfg")
	private Integer variazioneCfg;

	@Column(name="variazione_gprs")
	private Integer variazioneGprs;

	@Column(name="variazione_hw")
	private Integer variazioneHw;

	@Column(name="variazione_ios")
	private Integer variazioneIos;

	@Column(name="variazione_isdn")
	private Integer variazioneIsdn;

	@Column(name="variazione_lan")
	private Integer variazioneLan;

	@Column(name="variazione_lan_remota")
	private Integer variazioneLanRemota;

	@Column(name="variazione_wan")
	private Integer variazioneWan;

	@Column(name="vpi_vci")
	private String vpiVci;

	@Column(name="vpi_vci_2")
	private String vpiVci2;

	public InventoryStorico() {
	}

	public Long getIdInventoryStorico() {
		return this.idInventoryStorico;
	}

	public void setIdInventoryStorico(Long idInventoryStorico) {
		this.idInventoryStorico = idInventoryStorico;
	}

	public String getAdslPasswd() {
		return this.adslPasswd;
	}

	public void setAdslPasswd(String adslPasswd) {
		this.adslPasswd = adslPasswd;
	}

	public String getAdslUsername() {
		return this.adslUsername;
	}

	public void setAdslUsername(String adslUsername) {
		this.adslUsername = adslUsername;
	}

	public String getBlobShowConfig() {
		return this.blobShowConfig;
	}

	public void setBlobShowConfig(String blobShowConfig) {
		this.blobShowConfig = blobShowConfig;
	}

	public Integer getCluster() {
		return this.cluster;
	}

	public void setCluster(Integer cluster) {
		this.cluster = cluster;
	}

	public String getCug() {
		return this.cug;
	}

	public void setCug(String cug) {
		this.cug = cug;
	}

	public Date getDataInstallazioneInvent() {
		return this.dataInstallazioneInvent;
	}

	public void setDataInstallazioneInvent(Date dataInstallazioneInvent) {
		this.dataInstallazioneInvent = dataInstallazioneInvent;
	}

	public Date getDataInstallazioneRprobe() {
		return this.dataInstallazioneRprobe;
	}

	public void setDataInstallazioneRprobe(Date dataInstallazioneRprobe) {
		this.dataInstallazioneRprobe = dataInstallazioneRprobe;
	}

	public Date getDataMigrazione10elotto() {
		return this.dataMigrazione10elotto;
	}

	public void setDataMigrazione10elotto(Date dataMigrazione10elotto) {
		this.dataMigrazione10elotto = dataMigrazione10elotto;
	}

	public Date getDataPresaInCarico() {
		return this.dataPresaInCarico;
	}

	public void setDataPresaInCarico(Date dataPresaInCarico) {
		this.dataPresaInCarico = dataPresaInCarico;
	}

	public Date getDataRilevamento() {
		return this.dataRilevamento;
	}

	public void setDataRilevamento(Date dataRilevamento) {
		this.dataRilevamento = dataRilevamento;
	}

	public Date getDataStoricizzazione() {
		return this.dataStoricizzazione;
	}

	public void setDataStoricizzazione(Date dataStoricizzazione) {
		this.dataStoricizzazione = dataStoricizzazione;
	}

	public Date getDataVariazione() {
		return this.dataVariazione;
	}

	public void setDataVariazione(Date dataVariazione) {
		this.dataVariazione = dataVariazione;
	}

	public String getDefaultInterface() {
		return this.defaultInterface;
	}

	public void setDefaultInterface(String defaultInterface) {
		this.defaultInterface = defaultInterface;
	}

	public String getDlci() {
		return this.dlci;
	}

	public void setDlci(String dlci) {
		this.dlci = dlci;
	}

	public String getDlci2() {
		return this.dlci2;
	}

	public void setDlci2(String dlci2) {
		this.dlci2 = dlci2;
	}

	public Integer getEsitoInstallazioneRprobe() {
		return this.esitoInstallazioneRprobe;
	}

	public void setEsitoInstallazioneRprobe(Integer esitoInstallazioneRprobe) {
		this.esitoInstallazioneRprobe = esitoInstallazioneRprobe;
	}

	public Integer getEsitoMigrazione10elotto() {
		return this.esitoMigrazione10elotto;
	}

	public void setEsitoMigrazione10elotto(Integer esitoMigrazione10elotto) {
		this.esitoMigrazione10elotto = esitoMigrazione10elotto;
	}

	public Integer getFlagAvvio() {
		return this.flagAvvio;
	}

	public void setFlagAvvio(Integer flagAvvio) {
		this.flagAvvio = flagAvvio;
	}

	public Integer getFlagBatch() {
		return this.flagBatch;
	}

	public void setFlagBatch(Integer flagBatch) {
		this.flagBatch = flagBatch;
	}

	public Integer getFlagEsito() {
		return this.flagEsito;
	}

	public void setFlagEsito(Integer flagEsito) {
		this.flagEsito = flagEsito;
	}

	public Integer getFlagUpdate() {
		return this.flagUpdate;
	}

	public void setFlagUpdate(Integer flagUpdate) {
		this.flagUpdate = flagUpdate;
	}

	public Integer getFlagVariazioneConfRouter() {
		return this.flagVariazioneConfRouter;
	}

	public void setFlagVariazioneConfRouter(Integer flagVariazioneConfRouter) {
		this.flagVariazioneConfRouter = flagVariazioneConfRouter;
	}

	public String getFunzioneVrrp() {
		return this.funzioneVrrp;
	}

	public void setFunzioneVrrp(String funzioneVrrp) {
		this.funzioneVrrp = funzioneVrrp;
	}

	public String getGprsApn() {
		return this.gprsApn;
	}

	public void setGprsApn(String gprsApn) {
		this.gprsApn = gprsApn;
	}

	public String getGprsApnVodafone() {
		return this.gprsApnVodafone;
	}

	public void setGprsApnVodafone(String gprsApnVodafone) {
		this.gprsApnVodafone = gprsApnVodafone;
	}

	public String getGprsApnWind() {
		return this.gprsApnWind;
	}

	public void setGprsApnWind(String gprsApnWind) {
		this.gprsApnWind = gprsApnWind;
	}

	public String getGprsPasswd() {
		return this.gprsPasswd;
	}

	public void setGprsPasswd(String gprsPasswd) {
		this.gprsPasswd = gprsPasswd;
	}

	public String getGprsUsername() {
		return this.gprsUsername;
	}

	public void setGprsUsername(String gprsUsername) {
		this.gprsUsername = gprsUsername;
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Long getIdMasterApparato() {
		return this.idMasterApparato;
	}

	public void setIdMasterApparato(Long idMasterApparato) {
		this.idMasterApparato = idMasterApparato;
	}

	public Long getIdInventory() {
		return this.idInventory;
	}

	public void setIdInventory(Long idInventory) {
		this.idInventory = idInventory;
	}

	public String getImolaConfCode() {
		return this.imolaConfCode;
	}

	public void setImolaConfCode(String imolaConfCode) {
		this.imolaConfCode = imolaConfCode;
	}

	public Integer getInterfGprs() {
		return this.interfGprs;
	}

	public void setInterfGprs(Integer interfGprs) {
		this.interfGprs = interfGprs;
	}

	public Integer getInterfIsdn() {
		return this.interfIsdn;
	}

	public void setInterfIsdn(Integer interfIsdn) {
		this.interfIsdn = interfIsdn;
	}

	public Integer getInterfLan() {
		return this.interfLan;
	}

	public void setInterfLan(Integer interfLan) {
		this.interfLan = interfLan;
	}

	public Integer getInterfWan() {
		return this.interfWan;
	}

	public void setInterfWan(Integer interfWan) {
		this.interfWan = interfWan;
	}

	public String getInterfacciaDiAccesso() {
		return this.interfacciaDiAccesso;
	}

	public void setInterfacciaDiAccesso(String interfacciaDiAccesso) {
		this.interfacciaDiAccesso = interfacciaDiAccesso;
	}

	public String getInventVers() {
		return this.inventVers;
	}

	public void setInventVers(String inventVers) {
		this.inventVers = inventVers;
	}

	public String getIos() {
		return this.ios;
	}

	public void setIos(String ios) {
		this.ios = ios;
	}

	public String getIpAccesso() {
		return this.ipAccesso;
	}

	public void setIpAccesso(String ipAccesso) {
		this.ipAccesso = ipAccesso;
	}

	public String getIpGprsMi() {
		return this.ipGprsMi;
	}

	public void setIpGprsMi(String ipGprsMi) {
		this.ipGprsMi = ipGprsMi;
	}

	public String getIpGprsMiInventory() {
		return this.ipGprsMiInventory;
	}

	public void setIpGprsMiInventory(String ipGprsMiInventory) {
		this.ipGprsMiInventory = ipGprsMiInventory;
	}

	public String getIpGprsRm() {
		return this.ipGprsRm;
	}

	public void setIpGprsRm(String ipGprsRm) {
		this.ipGprsRm = ipGprsRm;
	}

	public String getIpGprsRmInventory() {
		return this.ipGprsRmInventory;
	}

	public void setIpGprsRmInventory(String ipGprsRmInventory) {
		this.ipGprsRmInventory = ipGprsRmInventory;
	}

	public String getIpGprsVodafone() {
		return this.ipGprsVodafone;
	}

	public void setIpGprsVodafone(String ipGprsVodafone) {
		this.ipGprsVodafone = ipGprsVodafone;
	}

	public String getIpGprsVodafoneInventory() {
		return this.ipGprsVodafoneInventory;
	}

	public void setIpGprsVodafoneInventory(String ipGprsVodafoneInventory) {
		this.ipGprsVodafoneInventory = ipGprsVodafoneInventory;
	}

	public String getIpGprsWind() {
		return this.ipGprsWind;
	}

	public void setIpGprsWind(String ipGprsWind) {
		this.ipGprsWind = ipGprsWind;
	}

	public String getIpGprsWindInventory() {
		return this.ipGprsWindInventory;
	}

	public void setIpGprsWindInventory(String ipGprsWindInventory) {
		this.ipGprsWindInventory = ipGprsWindInventory;
	}

	public String getIpIsdn() {
		return this.ipIsdn;
	}

	public void setIpIsdn(String ipIsdn) {
		this.ipIsdn = ipIsdn;
	}

	public String getIpLan() {
		return this.ipLan;
	}

	public void setIpLan(String ipLan) {
		this.ipLan = ipLan;
	}

	public String getIpLanInspiredInventory() {
		return this.ipLanInspiredInventory;
	}

	public void setIpLanInspiredInventory(String ipLanInspiredInventory) {
		this.ipLanInspiredInventory = ipLanInspiredInventory;
	}

	public String getIpLanInventory() {
		return this.ipLanInventory;
	}

	public void setIpLanInventory(String ipLanInventory) {
		this.ipLanInventory = ipLanInventory;
	}

	public String getIpLanNovomaticInventory() {
		return this.ipLanNovomaticInventory;
	}

	public void setIpLanNovomaticInventory(String ipLanNovomaticInventory) {
		this.ipLanNovomaticInventory = ipLanNovomaticInventory;
	}

	public String getIpLanRemota() {
		return this.ipLanRemota;
	}

	public void setIpLanRemota(String ipLanRemota) {
		this.ipLanRemota = ipLanRemota;
	}

	public String getIpLanRemota2Inventory() {
		return this.ipLanRemota2Inventory;
	}

	public void setIpLanRemota2Inventory(String ipLanRemota2Inventory) {
		this.ipLanRemota2Inventory = ipLanRemota2Inventory;
	}

	public String getIpLanRemotaInventory() {
		return this.ipLanRemotaInventory;
	}

	public void setIpLanRemotaInventory(String ipLanRemotaInventory) {
		this.ipLanRemotaInventory = ipLanRemotaInventory;
	}

	public String getIpLanRemotaRouter() {
		return this.ipLanRemotaRouter;
	}

	public void setIpLanRemotaRouter(String ipLanRemotaRouter) {
		this.ipLanRemotaRouter = ipLanRemotaRouter;
	}

	public String getIpLanRemotaRouter2() {
		return this.ipLanRemotaRouter2;
	}

	public void setIpLanRemotaRouter2(String ipLanRemotaRouter2) {
		this.ipLanRemotaRouter2 = ipLanRemotaRouter2;
	}

	public String getIpLanRemotaRouter2Inventory() {
		return this.ipLanRemotaRouter2Inventory;
	}

	public void setIpLanRemotaRouter2Inventory(String ipLanRemotaRouter2Inventory) {
		this.ipLanRemotaRouter2Inventory = ipLanRemotaRouter2Inventory;
	}

	public String getIpLanRemotaRouterInventory() {
		return this.ipLanRemotaRouterInventory;
	}

	public void setIpLanRemotaRouterInventory(String ipLanRemotaRouterInventory) {
		this.ipLanRemotaRouterInventory = ipLanRemotaRouterInventory;
	}

	public String getIpLanRouter() {
		return this.ipLanRouter;
	}

	public void setIpLanRouter(String ipLanRouter) {
		this.ipLanRouter = ipLanRouter;
	}

	public String getIpLanRouterInspiredInventory() {
		return this.ipLanRouterInspiredInventory;
	}

	public void setIpLanRouterInspiredInventory(String ipLanRouterInspiredInventory) {
		this.ipLanRouterInspiredInventory = ipLanRouterInspiredInventory;
	}

	public String getIpLanRouterInventory() {
		return this.ipLanRouterInventory;
	}

	public void setIpLanRouterInventory(String ipLanRouterInventory) {
		this.ipLanRouterInventory = ipLanRouterInventory;
	}

	public String getIpLanRouterNovomaticInventory() {
		return this.ipLanRouterNovomaticInventory;
	}

	public void setIpLanRouterNovomaticInventory(String ipLanRouterNovomaticInventory) {
		this.ipLanRouterNovomaticInventory = ipLanRouterNovomaticInventory;
	}

	public String getIpLanRouterSelfInventory() {
		return this.ipLanRouterSelfInventory;
	}

	public void setIpLanRouterSelfInventory(String ipLanRouterSelfInventory) {
		this.ipLanRouterSelfInventory = ipLanRouterSelfInventory;
	}

	public String getIpLanRouterVbetterInventory() {
		return this.ipLanRouterVbetterInventory;
	}

	public void setIpLanRouterVbetterInventory(String ipLanRouterVbetterInventory) {
		this.ipLanRouterVbetterInventory = ipLanRouterVbetterInventory;
	}

	public String getIpLanSelfInventory() {
		return this.ipLanSelfInventory;
	}

	public void setIpLanSelfInventory(String ipLanSelfInventory) {
		this.ipLanSelfInventory = ipLanSelfInventory;
	}

	public String getIpLanVbetterInventory() {
		return this.ipLanVbetterInventory;
	}

	public void setIpLanVbetterInventory(String ipLanVbetterInventory) {
		this.ipLanVbetterInventory = ipLanVbetterInventory;
	}

	public String getIpLoopback() {
		return this.ipLoopback;
	}

	public void setIpLoopback(String ipLoopback) {
		this.ipLoopback = ipLoopback;
	}

	public String getIpLoopbackInventory() {
		return this.ipLoopbackInventory;
	}

	public void setIpLoopbackInventory(String ipLoopbackInventory) {
		this.ipLoopbackInventory = ipLoopbackInventory;
	}

	public String getIpLoopbackL2tp() {
		return this.ipLoopbackL2tp;
	}

	public void setIpLoopbackL2tp(String ipLoopbackL2tp) {
		this.ipLoopbackL2tp = ipLoopbackL2tp;
	}

	public String getIpVrrpInventory() {
		return this.ipVrrpInventory;
	}

	public void setIpVrrpInventory(String ipVrrpInventory) {
		this.ipVrrpInventory = ipVrrpInventory;
	}

	public String getIpWanRouter() {
		return this.ipWanRouter;
	}

	public void setIpWanRouter(String ipWanRouter) {
		this.ipWanRouter = ipWanRouter;
	}

	public String getIpWanRouter2() {
		return this.ipWanRouter2;
	}

	public void setIpWanRouter2(String ipWanRouter2) {
		this.ipWanRouter2 = ipWanRouter2;
	}

	public String getIpWanRouter2Inventory() {
		return this.ipWanRouter2Inventory;
	}

	public void setIpWanRouter2Inventory(String ipWanRouter2Inventory) {
		this.ipWanRouter2Inventory = ipWanRouter2Inventory;
	}

	public String getIpWanRouterInventory() {
		return this.ipWanRouterInventory;
	}

	public void setIpWanRouterInventory(String ipWanRouterInventory) {
		this.ipWanRouterInventory = ipWanRouterInventory;
	}

	public String getIsdnPasswd() {
		return this.isdnPasswd;
	}

	public void setIsdnPasswd(String isdnPasswd) {
		this.isdnPasswd = isdnPasswd;
	}

	public String getIsdnUsername() {
		return this.isdnUsername;
	}

	public void setIsdnUsername(String isdnUsername) {
		this.isdnUsername = isdnUsername;
	}

	public String getLmiType() {
		return this.lmiType;
	}

	public void setLmiType(String lmiType) {
		this.lmiType = lmiType;
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarkerBatch() {
		return this.markerBatch;
	}

	public void setMarkerBatch(String markerBatch) {
		this.markerBatch = markerBatch;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getModello() {
		return this.modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getModemGprs() {
		return this.modemGprs;
	}

	public void setModemGprs(String modemGprs) {
		this.modemGprs = modemGprs;
	}

	public String getNetmaskLanGev() {
		return this.netmaskLanGev;
	}

	public void setNetmaskLanGev(String netmaskLanGev) {
		this.netmaskLanGev = netmaskLanGev;
	}

	public String getNetmaskServizi() {
		return this.netmaskServizi;
	}

	public void setNetmaskServizi(String netmaskServizi) {
		this.netmaskServizi = netmaskServizi;
	}

	public String getNetworkLanGev() {
		return this.networkLanGev;
	}

	public void setNetworkLanGev(String networkLanGev) {
		this.networkLanGev = networkLanGev;
	}

	public String getNetworkServizi() {
		return this.networkServizi;
	}

	public void setNetworkServizi(String networkServizi) {
		this.networkServizi = networkServizi;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Long getNumeroInventory() {
		return this.numeroInventory;
	}

	public void setNumeroInventory(Long numeroInventory) {
		this.numeroInventory = numeroInventory;
	}

	public String getNverde() {
		return this.nverde;
	}

	public void setNverde(String nverde) {
		this.nverde = nverde;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRouterLanGev() {
		return this.routerLanGev;
	}

	public void setRouterLanGev(String routerLanGev) {
		this.routerLanGev = routerLanGev;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Integer getStatoGprs() {
		return this.statoGprs;
	}

	public void setStatoGprs(Integer statoGprs) {
		this.statoGprs = statoGprs;
	}

	public Integer getStatoIsdn() {
		return this.statoIsdn;
	}

	public void setStatoIsdn(Integer statoIsdn) {
		this.statoIsdn = statoIsdn;
	}

	public Integer getStatoLan() {
		return this.statoLan;
	}

	public void setStatoLan(Integer statoLan) {
		this.statoLan = statoLan;
	}

	public Integer getStatoWan() {
		return this.statoWan;
	}

	public void setStatoWan(Integer statoWan) {
		this.statoWan = statoWan;
	}

	public String getSubnetMaskLanInspiredInventory() {
		return this.subnetMaskLanInspiredInventory;
	}

	public void setSubnetMaskLanInspiredInventory(String subnetMaskLanInspiredInventory) {
		this.subnetMaskLanInspiredInventory = subnetMaskLanInspiredInventory;
	}

	public String getSubnetMaskLanInventory() {
		return this.subnetMaskLanInventory;
	}

	public void setSubnetMaskLanInventory(String subnetMaskLanInventory) {
		this.subnetMaskLanInventory = subnetMaskLanInventory;
	}

	public String getSubnetMaskLanNovomaticInventory() {
		return this.subnetMaskLanNovomaticInventory;
	}

	public void setSubnetMaskLanNovomaticInventory(String subnetMaskLanNovomaticInventory) {
		this.subnetMaskLanNovomaticInventory = subnetMaskLanNovomaticInventory;
	}

	public String getSubnetMaskLanRemota2Inventory() {
		return this.subnetMaskLanRemota2Inventory;
	}

	public void setSubnetMaskLanRemota2Inventory(String subnetMaskLanRemota2Inventory) {
		this.subnetMaskLanRemota2Inventory = subnetMaskLanRemota2Inventory;
	}

	public String getSubnetMaskLanRemotaInventory() {
		return this.subnetMaskLanRemotaInventory;
	}

	public void setSubnetMaskLanRemotaInventory(String subnetMaskLanRemotaInventory) {
		this.subnetMaskLanRemotaInventory = subnetMaskLanRemotaInventory;
	}

	public String getSubnetMaskLanSelfInventory() {
		return this.subnetMaskLanSelfInventory;
	}

	public void setSubnetMaskLanSelfInventory(String subnetMaskLanSelfInventory) {
		this.subnetMaskLanSelfInventory = subnetMaskLanSelfInventory;
	}

	public String getSubnetMaskLanVbetterInventory() {
		return this.subnetMaskLanVbetterInventory;
	}

	public void setSubnetMaskLanVbetterInventory(String subnetMaskLanVbetterInventory) {
		this.subnetMaskLanVbetterInventory = subnetMaskLanVbetterInventory;
	}

	public Integer getSwitch_() {
		return this.switch_;
	}

	public void setSwitch_(Integer switch_) {
		this.switch_ = switch_;
	}

	public String getTipoConfigurazione() {
		return this.tipoConfigurazione;
	}

	public void setTipoConfigurazione(String tipoConfigurazione) {
		this.tipoConfigurazione = tipoConfigurazione;
	}

	public String getTipoInterfGprs() {
		return this.tipoInterfGprs;
	}

	public void setTipoInterfGprs(String tipoInterfGprs) {
		this.tipoInterfGprs = tipoInterfGprs;
	}

	public String getTipoInterfWan() {
		return this.tipoInterfWan;
	}

	public void setTipoInterfWan(String tipoInterfWan) {
		this.tipoInterfWan = tipoInterfWan;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getVariazStatoGprs() {
		return this.variazStatoGprs;
	}

	public void setVariazStatoGprs(Integer variazStatoGprs) {
		this.variazStatoGprs = variazStatoGprs;
	}

	public Integer getVariazStatoIsdn() {
		return this.variazStatoIsdn;
	}

	public void setVariazStatoIsdn(Integer variazStatoIsdn) {
		this.variazStatoIsdn = variazStatoIsdn;
	}

	public Integer getVariazStatoLan() {
		return this.variazStatoLan;
	}

	public void setVariazStatoLan(Integer variazStatoLan) {
		this.variazStatoLan = variazStatoLan;
	}

	public Integer getVariazStatoWan() {
		return this.variazStatoWan;
	}

	public void setVariazStatoWan(Integer variazStatoWan) {
		this.variazStatoWan = variazStatoWan;
	}

	public Integer getVariazioneCfg() {
		return this.variazioneCfg;
	}

	public void setVariazioneCfg(Integer variazioneCfg) {
		this.variazioneCfg = variazioneCfg;
	}

	public Integer getVariazioneGprs() {
		return this.variazioneGprs;
	}

	public void setVariazioneGprs(Integer variazioneGprs) {
		this.variazioneGprs = variazioneGprs;
	}

	public Integer getVariazioneHw() {
		return this.variazioneHw;
	}

	public void setVariazioneHw(Integer variazioneHw) {
		this.variazioneHw = variazioneHw;
	}

	public Integer getVariazioneIos() {
		return this.variazioneIos;
	}

	public void setVariazioneIos(Integer variazioneIos) {
		this.variazioneIos = variazioneIos;
	}

	public Integer getVariazioneIsdn() {
		return this.variazioneIsdn;
	}

	public void setVariazioneIsdn(Integer variazioneIsdn) {
		this.variazioneIsdn = variazioneIsdn;
	}

	public Integer getVariazioneLan() {
		return this.variazioneLan;
	}

	public void setVariazioneLan(Integer variazioneLan) {
		this.variazioneLan = variazioneLan;
	}

	public Integer getVariazioneLanRemota() {
		return this.variazioneLanRemota;
	}

	public void setVariazioneLanRemota(Integer variazioneLanRemota) {
		this.variazioneLanRemota = variazioneLanRemota;
	}

	public Integer getVariazioneWan() {
		return this.variazioneWan;
	}

	public void setVariazioneWan(Integer variazioneWan) {
		this.variazioneWan = variazioneWan;
	}

	public String getVpiVci() {
		return this.vpiVci;
	}

	public void setVpiVci(String vpiVci) {
		this.vpiVci = vpiVci;
	}

	public String getVpiVci2() {
		return this.vpiVci2;
	}

	public void setVpiVci2(String vpiVci2) {
		this.vpiVci2 = vpiVci2;
	}

}