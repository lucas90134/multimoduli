package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.persistence.*;
/**
 * The persistent class for the inventory database table.
 * 
 */
@Entity
@NamedQuery(name="Inventory.findAll", query="SELECT i FROM Inventory i")
public class Inventory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idInventory")
	@SequenceGenerator(name="idInventory", sequenceName = "Inventory_id_Inventory_seq", allocationSize=1)
	@Column(name="id_inventory")
	private Long idInventory;

	@JsonIgnore
	@OneToMany(mappedBy = "inventory", fetch = FetchType.LAZY)
	private List<DettaglioMasterLineaTiesseInventoryNew> dettaglioMasterLineaTiesseInventoryNew;

	@Column(name="adsl_passwd")
	private String adslPasswd;

	@Column(name="adsl_username")
	private String adslUsername;

	@Column(name="apn_tim")
	private String apnTim;

	@Column(name="codice_variazione")
	private Integer codiceVariazione;

	private String cug;

	@Column(name="data_inserimento")
	private Date dataInserimento;

	@Column(name="data_ricezione")
	private Date dataRicezione;

	@Column(name="data_rilevamento")
	private Date dataRilevamento;

	@Column(name="default_interface")
	private String defaultInterface;

	private String dlci;

	@Column(name="dlci_2")
	private String dlci2;

	@Column(name="esecuzione_inventory_singolo")
	private Date esecuzioneInventorySingolo;

	@Column(name="fine_inventory_singolo")
	private Date fineInventorySingolo;

	@Column(name="gprs_apn")
	private String gprsApn;

	@Column(name="gprs_apn_tim")
	private String gprsApnTim;

	@Column(name="gprs_apn_vodafone")
	private String gprsApnVodafone;

	@Column(name="gprs_apn_wind")
	private String gprsApnWind;

	@Column(name="gprs_passwd")
	private String gprsPasswd;

	@Column(name="gprs_primary")
	private String gprsPrimary;

	@Column(name="gprs_secondary")
	private String gprsSecondary;

	@Column(name="gprs_username")
	private String gprsUsername;

	private String hostname;

	@Column(name="id_master_apparato")
	private Long idMasterApparato;

	@Column(name="imola_conf_code")
	private String imolaConfCode;

	@Column(name="imola_model")
	private String imolaModel;

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

	private String ios;

	@Column(name="ip_accesso")
	private String ipAccesso;

	@Column(name="ip_erice_mgmt")
	private String ipEriceMgmt;

	@Column(name="ip_gprs_associato")
	private String ipGprsAssociato;

	@Column(name="ip_gprs_mi")
	private String ipGprsMi;

	@Column(name="ip_gprs_mi_inventory")
	private String ipGprsMiInventory;

	@Column(name="ip_gprs_rm")
	private String ipGprsRm;

	@Column(name="ip_gprs_rm_inventory")
	private String ipGprsRmInventory;

	@Column(name="ip_gprs_tim_mi")
	private String ipGprsTimMi;

	@Column(name="ip_gprs_tim_rm")
	private String ipGprsTimRm;

	@Column(name="ip_gprs_vodafone")
	private String ipGprsVodafone;

	@Column(name="ip_gprs_wind")
	private String ipGprsWind;

	@Column(name="ip_gre_centro")
	private String ipGreCentro;

	@Column(name="ip_l2tp")
	private String ipL2tp;

	@Column(name="ip_l2tp_centro")
	private String ipL2tpCentro;

	@Column(name="ip_lan")
	private String ipLan;

	@Column(name="ip_lan_remota")
	private String ipLanRemota;

	@Column(name="ip_lan_remota_router")
	private String ipLanRemotaRouter;

	@Column(name="ip_lan_remota_router_2")
	private String ipLanRemotaRouter2;

	@Column(name="ip_lan_remota_router_inventory")
	private String ipLanRemotaRouterInventory;

	@Column(name="ip_lan_router")
	private String ipLanRouter;

	@Column(name="ip_lan_router_virtual")
	private String ipLanRouterVirtual;

	@Column(name="ip_loopback")
	private String ipLoopback;

	@Column(name="ip_loopback_l_2tp")
	private String ipLoopbackL2tp;

	@Column(name="ip_router_better")
	private String ipRouterBetter;

	@Column(name="ip_router_inspired")
	private String ipRouterInspired;

	@Column(name="ip_router_lotto_loc")
	private String ipRouterLottoLoc;

	@Column(name="ip_router_lotto_loc_2")
	private String ipRouterLottoLoc2;

	@Column(name="ip_router_novomatic")
	private String ipRouterNovomatic;

	@Column(name="ip_router_self")
	private String ipRouterSelf;

	@Column(name="ip_router_spielo_loc")
	private String ipRouterSpieloLoc;

	@Column(name="ip_router_vbetter")
	private String ipRouterVbetter;

	@Column(name="ip_wan_router")
	private String ipWanRouter;

	@Column(name="ip_wan_router_2")
	private String ipWanRouter2;

	@Column(name="isdn_passwd")
	private String isdnPasswd;

	@Column(name="isdn_username")
	private String isdnUsername;

	@Column(name="l2tp_login")
	private String l2tpLogin;

	@Column(name="l2tp_secret")
	private String l2tpSecret;

	@Column(name="lmi_type")
	private String lmiType;

	@Column(name="loopback_gev")
	private String loopbackGev;

	@Column(name="loopback_gre")
	private String loopbackGre;

	@Column(name="loopback_servizi")
	private String loopbackServizi;

	@Column(name="mac_address")
	private String macAddress;

	private String marca;

	private String matricola;

	private String modello;

	@Column(name="netmask_better")
	private String netmaskBetter;

	@Column(name="netmask_gev")
	private String netmaskGev;

	@Column(name="netmask_inspired")
	private String netmaskInspired;

	@Column(name="netmask_lan")
	private String netmaskLan;

	@Column(name="netmask_lotto")
	private String netmaskLotto;

	@Column(name="netmask_lotto_loc")
	private String netmaskLottoLoc;

	@Column(name="netmask_lotto_loc_2")
	private String netmaskLottoLoc2;

	@Column(name="netmask_mag")
	private String netmaskMag;

	@Column(name="netmask_mgmt_b")
	private String netmaskMgmtB;

	@Column(name="netmask_mgmt_gn")
	private String netmaskMgmtGn;

	@Column(name="netmask_mgmt_v")
	private String netmaskMgmtV;

	@Column(name="netmask_novomatic")
	private String netmaskNovomatic;

	@Column(name="netmask_playtech")
	private String netmaskPlaytech;

	@Column(name="netmask_self")
	private String netmaskSelf;

	@Column(name="netmask_servizi")
	private String netmaskServizi;

	@Column(name="netmask_spielo")
	private String netmaskSpielo;

	@Column(name="netmask_spielo_loc")
	private String netmaskSpieloLoc;

	@Column(name="netmask_vbetter")
	private String netmaskVbetter;

	@Column(name="network_better")
	private String networkBetter;

	@Column(name="network_gev")
	private String networkGev;

	@Column(name="network_gre")
	private String networkGre;

	@Column(name="network_inspired")
	private String networkInspired;

	@Column(name="network_lan")
	private String networkLan;

	@Column(name="network_lotto")
	private String networkLotto;

	@Column(name="network_lotto_loc")
	private String networkLottoLoc;

	@Column(name="network_lotto_loc_2")
	private String networkLottoLoc2;

	@Column(name="network_mag")
	private String networkMag;

	@Column(name="network_mgmt_b")
	private String networkMgmtB;

	@Column(name="network_mgmt_gn")
	private String networkMgmtGn;

	@Column(name="network_mgmt_v")
	private String networkMgmtV;

	@Column(name="network_novomatic")
	private String networkNovomatic;

	@Column(name="network_playtech")
	private String networkPlaytech;

	@Column(name="network_self")
	private String networkSelf;

	@Column(name="network_servizi")
	private String networkServizi;

	@Column(name="network_spielo")
	private String networkSpielo;

	@Column(name="network_spielo_loc")
	private String networkSpieloLoc;

	@Column(name="network_vbetter")
	private String networkVbetter;

	private String numero;

	@Column(name="numero_inventory")
	private Long numeroInventory;

	private String nverde;

	private String password;

	@Column(name="router_lan")
	private String routerLan;

	@Column(name="serial_number")
	private String serialNumber;

	@Column(name="stato_gprs")
	private Integer statoGprs;

	@Column(name="stato_inventory_singolo")
	private String statoInventorySingolo;

	@Column(name="stato_isdn")
	private Integer statoIsdn;

	@Column(name="stato_lan")
	private Integer statoLan;

	@Column(name="stato_wan")
	private Integer statoWan;

	@Column(name="tipo_interf_wan")
	private String tipoInterfWan;

	@Column(name="user_name")
	private String userName;

	@Column(name="vpi_vci")
	private String vpiVci;

	@Column(name="vpi_vci_2")
	private String vpiVci2;

	public Inventory() {
	}

	public Long getIdInventory() {
		return this.idInventory;
	}

	public void setIdInventory(Long idInventory) {
		this.idInventory = idInventory;
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

	public String getApnTim() {
		return this.apnTim;
	}

	public void setApnTim(String apnTim) {
		this.apnTim = apnTim;
	}

	public Integer getCodiceVariazione() {
		return this.codiceVariazione;
	}

	public void setCodiceVariazione(Integer codiceVariazione) {
		this.codiceVariazione = codiceVariazione;
	}

	public String getCug() {
		return this.cug;
	}

	public void setCug(String cug) {
		this.cug = cug;
	}

	public Date getDataInserimento() {
		return this.dataInserimento;
	}

	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public Date getDataRicezione() {
		return this.dataRicezione;
	}

	public void setDataRicezione(Date dataRicezione) {
		this.dataRicezione = dataRicezione;
	}

	public Date getDataRilevamento() {
		return this.dataRilevamento;
	}

	public void setDataRilevamento(Date dataRilevamento) {
		this.dataRilevamento = dataRilevamento;
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

	public Date getEsecuzioneInventorySingolo() {
		return this.esecuzioneInventorySingolo;
	}

	public void setEsecuzioneInventorySingolo(Date esecuzioneInventorySingolo) {
		this.esecuzioneInventorySingolo = esecuzioneInventorySingolo;
	}

	public Date getFineInventorySingolo() {
		return this.fineInventorySingolo;
	}

	public void setFineInventorySingolo(Date fineInventorySingolo) {
		this.fineInventorySingolo = fineInventorySingolo;
	}

	public String getGprsApn() {
		return this.gprsApn;
	}

	public void setGprsApn(String gprsApn) {
		this.gprsApn = gprsApn;
	}

	public String getGprsApnTim() {
		return this.gprsApnTim;
	}

	public void setGprsApnTim(String gprsApnTim) {
		this.gprsApnTim = gprsApnTim;
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

	public String getGprsPrimary() {
		return this.gprsPrimary;
	}

	public void setGprsPrimary(String gprsPrimary) {
		this.gprsPrimary = gprsPrimary;
	}

	public String getGprsSecondary() {
		return this.gprsSecondary;
	}

	public void setGprsSecondary(String gprsSecondary) {
		this.gprsSecondary = gprsSecondary;
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

	public Long getIdMasterApparato() {
		return this.idMasterApparato;
	}

	public void setIdMasterApparato(Long idMasterApparato) {
		this.idMasterApparato = idMasterApparato;
	}

	public String getImolaConfCode() {
		return this.imolaConfCode;
	}

	public void setImolaConfCode(String imolaConfCode) {
		this.imolaConfCode = imolaConfCode;
	}

	public String getImolaModel() {
		return this.imolaModel;
	}

	public void setImolaModel(String imolaModel) {
		this.imolaModel = imolaModel;
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

	public String getIpEriceMgmt() {
		return this.ipEriceMgmt;
	}

	public void setIpEriceMgmt(String ipEriceMgmt) {
		this.ipEriceMgmt = ipEriceMgmt;
	}

	public String getIpGprsAssociato() {
		return this.ipGprsAssociato;
	}

	public void setIpGprsAssociato(String ipGprsAssociato) {
		this.ipGprsAssociato = ipGprsAssociato;
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

	public String getIpGprsTimMi() {
		return this.ipGprsTimMi;
	}

	public void setIpGprsTimMi(String ipGprsTimMi) {
		this.ipGprsTimMi = ipGprsTimMi;
	}

	public String getIpGprsTimRm() {
		return this.ipGprsTimRm;
	}

	public void setIpGprsTimRm(String ipGprsTimRm) {
		this.ipGprsTimRm = ipGprsTimRm;
	}

	public String getIpGprsVodafone() {
		return this.ipGprsVodafone;
	}

	public void setIpGprsVodafone(String ipGprsVodafone) {
		this.ipGprsVodafone = ipGprsVodafone;
	}

	public String getIpGprsWind() {
		return this.ipGprsWind;
	}

	public void setIpGprsWind(String ipGprsWind) {
		this.ipGprsWind = ipGprsWind;
	}

	public String getIpGreCentro() {
		return this.ipGreCentro;
	}

	public void setIpGreCentro(String ipGreCentro) {
		this.ipGreCentro = ipGreCentro;
	}

	public String getIpL2tp() {
		return this.ipL2tp;
	}

	public void setIpL2tp(String ipL2tp) {
		this.ipL2tp = ipL2tp;
	}

	public String getIpL2tpCentro() {
		return this.ipL2tpCentro;
	}

	public void setIpL2tpCentro(String ipL2tpCentro) {
		this.ipL2tpCentro = ipL2tpCentro;
	}

	public String getIpLan() {
		return this.ipLan;
	}

	public void setIpLan(String ipLan) {
		this.ipLan = ipLan;
	}

	public String getIpLanRemota() {
		return this.ipLanRemota;
	}

	public void setIpLanRemota(String ipLanRemota) {
		this.ipLanRemota = ipLanRemota;
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

	public String getIpLanRouterVirtual() {
		return this.ipLanRouterVirtual;
	}

	public void setIpLanRouterVirtual(String ipLanRouterVirtual) {
		this.ipLanRouterVirtual = ipLanRouterVirtual;
	}

	public String getIpLoopback() {
		return this.ipLoopback;
	}

	public void setIpLoopback(String ipLoopback) {
		this.ipLoopback = ipLoopback;
	}

	public String getIpLoopbackL2tp() {
		return this.ipLoopbackL2tp;
	}

	public void setIpLoopbackL2tp(String ipLoopbackL2tp) {
		this.ipLoopbackL2tp = ipLoopbackL2tp;
	}

	public String getIpRouterBetter() {
		return this.ipRouterBetter;
	}

	public void setIpRouterBetter(String ipRouterBetter) {
		this.ipRouterBetter = ipRouterBetter;
	}

	public String getIpRouterInspired() {
		return this.ipRouterInspired;
	}

	public void setIpRouterInspired(String ipRouterInspired) {
		this.ipRouterInspired = ipRouterInspired;
	}

	public String getIpRouterLottoLoc() {
		return this.ipRouterLottoLoc;
	}

	public void setIpRouterLottoLoc(String ipRouterLottoLoc) {
		this.ipRouterLottoLoc = ipRouterLottoLoc;
	}

	public String getIpRouterLottoLoc2() {
		return this.ipRouterLottoLoc2;
	}

	public void setIpRouterLottoLoc2(String ipRouterLottoLoc2) {
		this.ipRouterLottoLoc2 = ipRouterLottoLoc2;
	}

	public String getIpRouterNovomatic() {
		return this.ipRouterNovomatic;
	}

	public void setIpRouterNovomatic(String ipRouterNovomatic) {
		this.ipRouterNovomatic = ipRouterNovomatic;
	}

	public String getIpRouterSelf() {
		return this.ipRouterSelf;
	}

	public void setIpRouterSelf(String ipRouterSelf) {
		this.ipRouterSelf = ipRouterSelf;
	}

	public String getIpRouterSpieloLoc() {
		return this.ipRouterSpieloLoc;
	}

	public void setIpRouterSpieloLoc(String ipRouterSpieloLoc) {
		this.ipRouterSpieloLoc = ipRouterSpieloLoc;
	}

	public String getIpRouterVbetter() {
		return this.ipRouterVbetter;
	}

	public void setIpRouterVbetter(String ipRouterVbetter) {
		this.ipRouterVbetter = ipRouterVbetter;
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

	public String getL2tpLogin() {
		return this.l2tpLogin;
	}

	public void setL2tpLogin(String l2tpLogin) {
		this.l2tpLogin = l2tpLogin;
	}

	public String getL2tpSecret() {
		return this.l2tpSecret;
	}

	public void setL2tpSecret(String l2tpSecret) {
		this.l2tpSecret = l2tpSecret;
	}

	public String getLmiType() {
		return this.lmiType;
	}

	public void setLmiType(String lmiType) {
		this.lmiType = lmiType;
	}

	public String getLoopbackGev() {
		return this.loopbackGev;
	}

	public void setLoopbackGev(String loopbackGev) {
		this.loopbackGev = loopbackGev;
	}

	public String getLoopbackGre() {
		return this.loopbackGre;
	}

	public void setLoopbackGre(String loopbackGre) {
		this.loopbackGre = loopbackGre;
	}

	public String getLoopbackServizi() {
		return this.loopbackServizi;
	}

	public void setLoopbackServizi(String loopbackServizi) {
		this.loopbackServizi = loopbackServizi;
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		if(macAddress != null)
		this.macAddress = macAddress.toUpperCase();
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public String getNetmaskBetter() {
		return this.netmaskBetter;
	}

	public void setNetmaskBetter(String netmaskBetter) {
		this.netmaskBetter = netmaskBetter;
	}

	public String getNetmaskGev() {
		return this.netmaskGev;
	}

	public void setNetmaskGev(String netmaskGev) {
		this.netmaskGev = netmaskGev;
	}

	public String getNetmaskInspired() {
		return this.netmaskInspired;
	}

	public void setNetmaskInspired(String netmaskInspired) {
		this.netmaskInspired = netmaskInspired;
	}

	public String getNetmaskLan() {
		return this.netmaskLan;
	}

	public void setNetmaskLan(String netmaskLan) {
		this.netmaskLan = netmaskLan;
	}

	public String getNetmaskLotto() {
		return this.netmaskLotto;
	}

	public void setNetmaskLotto(String netmaskLotto) {
		this.netmaskLotto = netmaskLotto;
	}

	public String getNetmaskLottoLoc() {
		return this.netmaskLottoLoc;
	}

	public void setNetmaskLottoLoc(String netmaskLottoLoc) {
		this.netmaskLottoLoc = netmaskLottoLoc;
	}

	public String getNetmaskLottoLoc2() {
		return this.netmaskLottoLoc2;
	}

	public void setNetmaskLottoLoc2(String netmaskLottoLoc2) {
		this.netmaskLottoLoc2 = netmaskLottoLoc2;
	}

	public String getNetmaskMag() {
		return this.netmaskMag;
	}

	public void setNetmaskMag(String netmaskMag) {
		this.netmaskMag = netmaskMag;
	}

	public String getNetmaskMgmtB() {
		return this.netmaskMgmtB;
	}

	public void setNetmaskMgmtB(String netmaskMgmtB) {
		this.netmaskMgmtB = netmaskMgmtB;
	}

	public String getNetmaskMgmtGn() {
		return this.netmaskMgmtGn;
	}

	public void setNetmaskMgmtGn(String netmaskMgmtGn) {
		this.netmaskMgmtGn = netmaskMgmtGn;
	}

	public String getNetmaskMgmtV() {
		return this.netmaskMgmtV;
	}

	public void setNetmaskMgmtV(String netmaskMgmtV) {
		this.netmaskMgmtV = netmaskMgmtV;
	}

	public String getNetmaskNovomatic() {
		return this.netmaskNovomatic;
	}

	public void setNetmaskNovomatic(String netmaskNovomatic) {
		this.netmaskNovomatic = netmaskNovomatic;
	}

	public String getNetmaskPlaytech() {
		return this.netmaskPlaytech;
	}

	public void setNetmaskPlaytech(String netmaskPlaytech) {
		this.netmaskPlaytech = netmaskPlaytech;
	}

	public String getNetmaskSelf() {
		return this.netmaskSelf;
	}

	public void setNetmaskSelf(String netmaskSelf) {
		this.netmaskSelf = netmaskSelf;
	}

	public String getNetmaskServizi() {
		return this.netmaskServizi;
	}

	public void setNetmaskServizi(String netmaskServizi) {
		this.netmaskServizi = netmaskServizi;
	}

	public String getNetmaskSpielo() {
		return this.netmaskSpielo;
	}

	public void setNetmaskSpielo(String netmaskSpielo) {
		this.netmaskSpielo = netmaskSpielo;
	}

	public String getNetmaskSpieloLoc() {
		return this.netmaskSpieloLoc;
	}

	public void setNetmaskSpieloLoc(String netmaskSpieloLoc) {
		this.netmaskSpieloLoc = netmaskSpieloLoc;
	}

	public String getNetmaskVbetter() {
		return this.netmaskVbetter;
	}

	public void setNetmaskVbetter(String netmaskVbetter) {
		this.netmaskVbetter = netmaskVbetter;
	}

	public String getNetworkBetter() {
		return this.networkBetter;
	}

	public void setNetworkBetter(String networkBetter) {
		this.networkBetter = networkBetter;
	}

	public String getNetworkGev() {
		return this.networkGev;
	}

	public void setNetworkGev(String networkGev) {
		this.networkGev = networkGev;
	}

	public String getNetworkGre() {
		return this.networkGre;
	}

	public void setNetworkGre(String networkGre) {
		this.networkGre = networkGre;
	}

	public String getNetworkInspired() {
		return this.networkInspired;
	}

	public void setNetworkInspired(String networkInspired) {
		this.networkInspired = networkInspired;
	}

	public String getNetworkLan() {
		return this.networkLan;
	}

	public void setNetworkLan(String networkLan) {
		this.networkLan = networkLan;
	}

	public String getNetworkLotto() {
		return this.networkLotto;
	}

	public void setNetworkLotto(String networkLotto) {
		this.networkLotto = networkLotto;
	}

	public String getNetworkLottoLoc() {
		return this.networkLottoLoc;
	}

	public void setNetworkLottoLoc(String networkLottoLoc) {
		this.networkLottoLoc = networkLottoLoc;
	}

	public String getNetworkLottoLoc2() {
		return this.networkLottoLoc2;
	}

	public void setNetworkLottoLoc2(String networkLottoLoc2) {
		this.networkLottoLoc2 = networkLottoLoc2;
	}

	public String getNetworkMag() {
		return this.networkMag;
	}

	public void setNetworkMag(String networkMag) {
		this.networkMag = networkMag;
	}

	public String getNetworkMgmtB() {
		return this.networkMgmtB;
	}

	public void setNetworkMgmtB(String networkMgmtB) {
		this.networkMgmtB = networkMgmtB;
	}

	public String getNetworkMgmtGn() {
		return this.networkMgmtGn;
	}

	public void setNetworkMgmtGn(String networkMgmtGn) {
		this.networkMgmtGn = networkMgmtGn;
	}

	public String getNetworkMgmtV() {
		return this.networkMgmtV;
	}

	public void setNetworkMgmtV(String networkMgmtV) {
		this.networkMgmtV = networkMgmtV;
	}

	public String getNetworkNovomatic() {
		return this.networkNovomatic;
	}

	public void setNetworkNovomatic(String networkNovomatic) {
		this.networkNovomatic = networkNovomatic;
	}

	public String getNetworkPlaytech() {
		return this.networkPlaytech;
	}

	public void setNetworkPlaytech(String networkPlaytech) {
		this.networkPlaytech = networkPlaytech;
	}

	public String getNetworkSelf() {
		return this.networkSelf;
	}

	public void setNetworkSelf(String networkSelf) {
		this.networkSelf = networkSelf;
	}

	public String getNetworkServizi() {
		return this.networkServizi;
	}

	public void setNetworkServizi(String networkServizi) {
		this.networkServizi = networkServizi;
	}

	public String getNetworkSpielo() {
		return this.networkSpielo;
	}

	public void setNetworkSpielo(String networkSpielo) {
		this.networkSpielo = networkSpielo;
	}

	public String getNetworkSpieloLoc() {
		return this.networkSpieloLoc;
	}

	public void setNetworkSpieloLoc(String networkSpieloLoc) {
		this.networkSpieloLoc = networkSpieloLoc;
	}

	public String getNetworkVbetter() {
		return this.networkVbetter;
	}

	public void setNetworkVbetter(String networkVbetter) {
		this.networkVbetter = networkVbetter;
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

	public String getRouterLan() {
		return this.routerLan;
	}

	public void setRouterLan(String routerLan) {
		this.routerLan = routerLan;
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

	public String getStatoInventorySingolo() {
		return this.statoInventorySingolo;
	}

	public void setStatoInventorySingolo(String statoInventorySingolo) {
		this.statoInventorySingolo = statoInventorySingolo;
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

	public List<DettaglioMasterLineaTiesseInventoryNew> getDettaglioMasterLineaTiesseInventoryNew() {
		return dettaglioMasterLineaTiesseInventoryNew;
	}

	public void setDettaglioMasterLineaTiesseInventoryNew(
			List<DettaglioMasterLineaTiesseInventoryNew> dettaglioMasterLineaTiesseInventoryNew) {
		this.dettaglioMasterLineaTiesseInventoryNew = dettaglioMasterLineaTiesseInventoryNew;
	}

}