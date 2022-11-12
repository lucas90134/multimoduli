package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the ip_address_storico database table.
 * 
 */
@Entity
@Table(name="ip_address_storico")
@NamedQuery(name="IpAddressStorico.findAll", query="SELECT i FROM IpAddressStorico i")
public class IpAddressStorico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idIpAddressStorico")
	@SequenceGenerator(name="idIpAddressStorico", sequenceName = "ip_address_storico_id_ip_address_storico_seq", allocationSize=1)
	@Column(name="id_ip_address_storico")
	private Long idIpAddressStorico;

	@Column(name="data_storicizzazione")
	private Date dataStoricizzazione;

	private String dlci;

	@Column(name="dlci_2")
	private String dlci2;

	@Column(name="id_ip_address")
	private Long idIpAddress;

	@Column(name="ip_contatto")
	private String ipContatto;

	@Column(name="ip_l2tp_centro")
	private String ipL2tpCentro;

	@Column(name="ip_lan_remota_2")
	private String ipLanRemota2;

	@Column(name="ip_lan_router")
	private String ipLanRouter;

	@Column(name="ip_lan_router_remota")
	private String ipLanRouterRemota;

	@Column(name="ip_lan_router_remota_2")
	private String ipLanRouterRemota2;

	@Column(name="ip_lan_router_tobe")
	private String ipLanRouterTobe;

	@Column(name="ip_lan_router_virtual")
	private String ipLanRouterVirtual;

	@Column(name="ip_lan_router_virtual_tobe")
	private String ipLanRouterVirtualTobe;

	@Column(name="ip_lan_tobe")
	private String ipLanTobe;

	@Column(name="ip_lan_virtual")
	private String ipLanVirtual;

	@Column(name="ip_lan_virtual_tobe")
	private String ipLanVirtualTobe;

	@Column(name="ip_loopback")
	private String ipLoopback;

	@Column(name="ip_loopback_2_l2tp")
	private String ipLoopback2L2tp;

	@Column(name="ip_loopback_gev")
	private String ipLoopbackGev;

	@Column(name="ip_loopback_l2tp")
	private String ipLoopbackL2tp;

	@Column(name="ip_loopback_l2tp_tobe")
	private String ipLoopbackL2tpTobe;

	@Column(name="ip_loopback_servizi")
	private String ipLoopbackServizi;

	@Column(name="ip_router_virtual")
	private String ipRouterVirtual;

	@Column(name="ip_secondary")
	private String ipSecondary;

	@Column(name="ip_subnet_lan_virtual")
	private String ipSubnetLanVirtual;

	@Column(name="ip_subnet_lan_virtual_tobe")
	private String ipSubnetLanVirtualTobe;

	@Column(name="ip_subnet_secondary")
	private String ipSubnetSecondary;

	@Column(name="ip_tunnel_centro")
	private String ipTunnelCentro;

	@Column(name="ip_tunnel_router")
	private String ipTunnelRouter;

	@Column(name="ip_tunnel_source_hsdpa")
	private String ipTunnelSourceHsdpa;

	@Column(name="ip_vrrp_lan")
	private String ipVrrpLan;

	@Column(name="ip_vrrp_lan_2")
	private String ipVrrpLan2;

	@Column(name="ip_vrrp_lan_remota")
	private String ipVrrpLanRemota;

	@Column(name="ip_vrrp_lan_remota_tobe")
	private String ipVrrpLanRemotaTobe;

	@Column(name="ip_wan_centro")
	private String ipWanCentro;

	@Column(name="ip_wan_router")
	private String ipWanRouter;

	@Column(name="ip_wan_router_2")
	private String ipWanRouter2;

	private String l2tp;

	private String lan;

	@Column(name="lan_remota")
	private String lanRemota;

	@Column(name="lan_remota_2")
	private String lanRemota2;

	@Column(name="lmi_type")
	private String lmiType;

	@Column(name="loopback_gre")
	private String loopbackGre;

	@Column(name="net_mask_better_fittizia")
	private String netMaskBetterFittizia;

	@Column(name="net_mask_lotto")
	private String netMaskLotto;

	@Column(name="net_mask_spielo_statica")
	private String netMaskSpieloStatica;

	@Column(name="network_better_fittizia")
	private String networkBetterFittizia;

	@Column(name="network_gre")
	private String networkGre;

	@Column(name="network_lotto")
	private String networkLotto;

	@Column(name="network_spielo_statica")
	private String networkSpieloStatica;

	@Column(name="note_modifica")
	private String noteModifica;

	@Column(name="subnet_mask_ip_pubblico")
	private String subnetMaskIpPubblico;

	@Column(name="subnet_mask_lan")
	private String subnetMaskLan;

	@Column(name="subnet_mask_lan_remota")
	private String subnetMaskLanRemota;

	@Column(name="subnet_mask_lan_remota_2")
	private String subnetMaskLanRemota2;

	@Column(name="subnet_mask_lan_tobe")
	private String subnetMaskLanTobe;

	@Column(name="subnet_mask_loopback")
	private String subnetMaskLoopback;

	@Column(name="subnet_mask_tunnel_centro")
	private String subnetMaskTunnelCentro;

	@Column(name="subnet_mask_tunnel_router")
	private String subnetMaskTunnelRouter;

	@Column(name="subnet_mask_wan")
	private String subnetMaskWan;

	@Column(name="subnet_mask_wan_2")
	private String subnetMaskWan2;

	private String tecnologia;

	@Column(name="user_mod")
	private String userMod;

	@Column(name="utente_modifica")
	private String utenteModifica;

	private String vc;

	@Column(name="vc_2")
	private String vc2;

	private String vlan;

	@Column(name="vlan_2")
	private String vlan2;

	@Column(name="vpi_vci")
	private String vpiVci;

	@Column(name="vpi_vci_2")
	private String vpiVci2;

	private Long wifi;

	public IpAddressStorico() {
	}

	public Long getIdIpAddressStorico() {
		return this.idIpAddressStorico;
	}

	public void setIdIpAddressStorico(Long idIpAddressStorico) {
		this.idIpAddressStorico = idIpAddressStorico;
	}

	public Date getDataStoricizzazione() {
		return this.dataStoricizzazione;
	}

	public void setDataStoricizzazione(Date dataStoricizzazione) {
		this.dataStoricizzazione = dataStoricizzazione;
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

	public Long getIdIpAddress() {
		return this.idIpAddress;
	}

	public void setIdIpAddress(Long idIpAddress) {
		this.idIpAddress = idIpAddress;
	}

	public String getIpContatto() {
		return this.ipContatto;
	}

	public void setIpContatto(String ipContatto) {
		this.ipContatto = ipContatto;
	}

	public String getIpL2tpCentro() {
		return this.ipL2tpCentro;
	}

	public void setIpL2tpCentro(String ipL2tpCentro) {
		this.ipL2tpCentro = ipL2tpCentro;
	}

	public String getIpLanRemota2() {
		return this.ipLanRemota2;
	}

	public void setIpLanRemota2(String ipLanRemota2) {
		this.ipLanRemota2 = ipLanRemota2;
	}

	public String getIpLanRouter() {
		return this.ipLanRouter;
	}

	public void setIpLanRouter(String ipLanRouter) {
		this.ipLanRouter = ipLanRouter;
	}

	public String getIpLanRouterRemota() {
		return this.ipLanRouterRemota;
	}

	public void setIpLanRouterRemota(String ipLanRouterRemota) {
		this.ipLanRouterRemota = ipLanRouterRemota;
	}

	public String getIpLanRouterRemota2() {
		return this.ipLanRouterRemota2;
	}

	public void setIpLanRouterRemota2(String ipLanRouterRemota2) {
		this.ipLanRouterRemota2 = ipLanRouterRemota2;
	}

	public String getIpLanRouterTobe() {
		return this.ipLanRouterTobe;
	}

	public void setIpLanRouterTobe(String ipLanRouterTobe) {
		this.ipLanRouterTobe = ipLanRouterTobe;
	}

	public String getIpLanRouterVirtual() {
		return this.ipLanRouterVirtual;
	}

	public void setIpLanRouterVirtual(String ipLanRouterVirtual) {
		this.ipLanRouterVirtual = ipLanRouterVirtual;
	}

	public String getIpLanRouterVirtualTobe() {
		return this.ipLanRouterVirtualTobe;
	}

	public void setIpLanRouterVirtualTobe(String ipLanRouterVirtualTobe) {
		this.ipLanRouterVirtualTobe = ipLanRouterVirtualTobe;
	}

	public String getIpLanTobe() {
		return this.ipLanTobe;
	}

	public void setIpLanTobe(String ipLanTobe) {
		this.ipLanTobe = ipLanTobe;
	}

	public String getIpLanVirtual() {
		return this.ipLanVirtual;
	}

	public void setIpLanVirtual(String ipLanVirtual) {
		this.ipLanVirtual = ipLanVirtual;
	}

	public String getIpLanVirtualTobe() {
		return this.ipLanVirtualTobe;
	}

	public void setIpLanVirtualTobe(String ipLanVirtualTobe) {
		this.ipLanVirtualTobe = ipLanVirtualTobe;
	}

	public String getIpLoopback() {
		return this.ipLoopback;
	}

	public void setIpLoopback(String ipLoopback) {
		this.ipLoopback = ipLoopback;
	}

	public String getIpLoopback2L2tp() {
		return this.ipLoopback2L2tp;
	}

	public void setIpLoopback2L2tp(String ipLoopback2L2tp) {
		this.ipLoopback2L2tp = ipLoopback2L2tp;
	}

	public String getIpLoopbackGev() {
		return this.ipLoopbackGev;
	}

	public void setIpLoopbackGev(String ipLoopbackGev) {
		this.ipLoopbackGev = ipLoopbackGev;
	}

	public String getIpLoopbackL2tp() {
		return this.ipLoopbackL2tp;
	}

	public void setIpLoopbackL2tp(String ipLoopbackL2tp) {
		this.ipLoopbackL2tp = ipLoopbackL2tp;
	}

	public String getIpLoopbackL2tpTobe() {
		return this.ipLoopbackL2tpTobe;
	}

	public void setIpLoopbackL2tpTobe(String ipLoopbackL2tpTobe) {
		this.ipLoopbackL2tpTobe = ipLoopbackL2tpTobe;
	}

	public String getIpLoopbackServizi() {
		return this.ipLoopbackServizi;
	}

	public void setIpLoopbackServizi(String ipLoopbackServizi) {
		this.ipLoopbackServizi = ipLoopbackServizi;
	}

	public String getIpRouterVirtual() {
		return this.ipRouterVirtual;
	}

	public void setIpRouterVirtual(String ipRouterVirtual) {
		this.ipRouterVirtual = ipRouterVirtual;
	}

	public String getIpSecondary() {
		return this.ipSecondary;
	}

	public void setIpSecondary(String ipSecondary) {
		this.ipSecondary = ipSecondary;
	}

	public String getIpSubnetLanVirtual() {
		return this.ipSubnetLanVirtual;
	}

	public void setIpSubnetLanVirtual(String ipSubnetLanVirtual) {
		this.ipSubnetLanVirtual = ipSubnetLanVirtual;
	}

	public String getIpSubnetLanVirtualTobe() {
		return this.ipSubnetLanVirtualTobe;
	}

	public void setIpSubnetLanVirtualTobe(String ipSubnetLanVirtualTobe) {
		this.ipSubnetLanVirtualTobe = ipSubnetLanVirtualTobe;
	}

	public String getIpSubnetSecondary() {
		return this.ipSubnetSecondary;
	}

	public void setIpSubnetSecondary(String ipSubnetSecondary) {
		this.ipSubnetSecondary = ipSubnetSecondary;
	}

	public String getIpTunnelCentro() {
		return this.ipTunnelCentro;
	}

	public void setIpTunnelCentro(String ipTunnelCentro) {
		this.ipTunnelCentro = ipTunnelCentro;
	}

	public String getIpTunnelRouter() {
		return this.ipTunnelRouter;
	}

	public void setIpTunnelRouter(String ipTunnelRouter) {
		this.ipTunnelRouter = ipTunnelRouter;
	}

	public String getIpTunnelSourceHsdpa() {
		return this.ipTunnelSourceHsdpa;
	}

	public void setIpTunnelSourceHsdpa(String ipTunnelSourceHsdpa) {
		this.ipTunnelSourceHsdpa = ipTunnelSourceHsdpa;
	}

	public String getIpVrrpLan() {
		return this.ipVrrpLan;
	}

	public void setIpVrrpLan(String ipVrrpLan) {
		this.ipVrrpLan = ipVrrpLan;
	}

	public String getIpVrrpLan2() {
		return this.ipVrrpLan2;
	}

	public void setIpVrrpLan2(String ipVrrpLan2) {
		this.ipVrrpLan2 = ipVrrpLan2;
	}

	public String getIpVrrpLanRemota() {
		return this.ipVrrpLanRemota;
	}

	public void setIpVrrpLanRemota(String ipVrrpLanRemota) {
		this.ipVrrpLanRemota = ipVrrpLanRemota;
	}

	public String getIpVrrpLanRemotaTobe() {
		return this.ipVrrpLanRemotaTobe;
	}

	public void setIpVrrpLanRemotaTobe(String ipVrrpLanRemotaTobe) {
		this.ipVrrpLanRemotaTobe = ipVrrpLanRemotaTobe;
	}

	public String getIpWanCentro() {
		return this.ipWanCentro;
	}

	public void setIpWanCentro(String ipWanCentro) {
		this.ipWanCentro = ipWanCentro;
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

	public String getL2tp() {
		return this.l2tp;
	}

	public void setL2tp(String l2tp) {
		this.l2tp = l2tp;
	}

	public String getLan() {
		return this.lan;
	}

	public void setLan(String lan) {
		this.lan = lan;
	}

	public String getLanRemota() {
		return this.lanRemota;
	}

	public void setLanRemota(String lanRemota) {
		this.lanRemota = lanRemota;
	}

	public String getLanRemota2() {
		return this.lanRemota2;
	}

	public void setLanRemota2(String lanRemota2) {
		this.lanRemota2 = lanRemota2;
	}

	public String getLmiType() {
		return this.lmiType;
	}

	public void setLmiType(String lmiType) {
		this.lmiType = lmiType;
	}

	public String getLoopbackGre() {
		return this.loopbackGre;
	}

	public void setLoopbackGre(String loopbackGre) {
		this.loopbackGre = loopbackGre;
	}

	public String getNetMaskBetterFittizia() {
		return this.netMaskBetterFittizia;
	}

	public void setNetMaskBetterFittizia(String netMaskBetterFittizia) {
		this.netMaskBetterFittizia = netMaskBetterFittizia;
	}

	public String getNetMaskLotto() {
		return this.netMaskLotto;
	}

	public void setNetMaskLotto(String netMaskLotto) {
		this.netMaskLotto = netMaskLotto;
	}

	public String getNetMaskSpieloStatica() {
		return this.netMaskSpieloStatica;
	}

	public void setNetMaskSpieloStatica(String netMaskSpieloStatica) {
		this.netMaskSpieloStatica = netMaskSpieloStatica;
	}

	public String getNetworkBetterFittizia() {
		return this.networkBetterFittizia;
	}

	public void setNetworkBetterFittizia(String networkBetterFittizia) {
		this.networkBetterFittizia = networkBetterFittizia;
	}

	public String getNetworkGre() {
		return this.networkGre;
	}

	public void setNetworkGre(String networkGre) {
		this.networkGre = networkGre;
	}

	public String getNetworkLotto() {
		return this.networkLotto;
	}

	public void setNetworkLotto(String networkLotto) {
		this.networkLotto = networkLotto;
	}

	public String getNetworkSpieloStatica() {
		return this.networkSpieloStatica;
	}

	public void setNetworkSpieloStatica(String networkSpieloStatica) {
		this.networkSpieloStatica = networkSpieloStatica;
	}

	public String getNoteModifica() {
		return this.noteModifica;
	}

	public void setNoteModifica(String noteModifica) {
		this.noteModifica = noteModifica;
	}

	public String getSubnetMaskIpPubblico() {
		return this.subnetMaskIpPubblico;
	}

	public void setSubnetMaskIpPubblico(String subnetMaskIpPubblico) {
		this.subnetMaskIpPubblico = subnetMaskIpPubblico;
	}

	public String getSubnetMaskLan() {
		return this.subnetMaskLan;
	}

	public void setSubnetMaskLan(String subnetMaskLan) {
		this.subnetMaskLan = subnetMaskLan;
	}

	public String getSubnetMaskLanRemota() {
		return this.subnetMaskLanRemota;
	}

	public void setSubnetMaskLanRemota(String subnetMaskLanRemota) {
		this.subnetMaskLanRemota = subnetMaskLanRemota;
	}

	public String getSubnetMaskLanRemota2() {
		return this.subnetMaskLanRemota2;
	}

	public void setSubnetMaskLanRemota2(String subnetMaskLanRemota2) {
		this.subnetMaskLanRemota2 = subnetMaskLanRemota2;
	}

	public String getSubnetMaskLanTobe() {
		return this.subnetMaskLanTobe;
	}

	public void setSubnetMaskLanTobe(String subnetMaskLanTobe) {
		this.subnetMaskLanTobe = subnetMaskLanTobe;
	}

	public String getSubnetMaskLoopback() {
		return this.subnetMaskLoopback;
	}

	public void setSubnetMaskLoopback(String subnetMaskLoopback) {
		this.subnetMaskLoopback = subnetMaskLoopback;
	}

	public String getSubnetMaskTunnelCentro() {
		return this.subnetMaskTunnelCentro;
	}

	public void setSubnetMaskTunnelCentro(String subnetMaskTunnelCentro) {
		this.subnetMaskTunnelCentro = subnetMaskTunnelCentro;
	}

	public String getSubnetMaskTunnelRouter() {
		return this.subnetMaskTunnelRouter;
	}

	public void setSubnetMaskTunnelRouter(String subnetMaskTunnelRouter) {
		this.subnetMaskTunnelRouter = subnetMaskTunnelRouter;
	}

	public String getSubnetMaskWan() {
		return this.subnetMaskWan;
	}

	public void setSubnetMaskWan(String subnetMaskWan) {
		this.subnetMaskWan = subnetMaskWan;
	}

	public String getSubnetMaskWan2() {
		return this.subnetMaskWan2;
	}

	public void setSubnetMaskWan2(String subnetMaskWan2) {
		this.subnetMaskWan2 = subnetMaskWan2;
	}

	public String getTecnologia() {
		return this.tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public String getUtenteModifica() {
		return this.utenteModifica;
	}

	public void setUtenteModifica(String utenteModifica) {
		this.utenteModifica = utenteModifica;
	}

	public String getVc() {
		return this.vc;
	}

	public void setVc(String vc) {
		this.vc = vc;
	}

	public String getVc2() {
		return this.vc2;
	}

	public void setVc2(String vc2) {
		this.vc2 = vc2;
	}

	public String getVlan() {
		return this.vlan;
	}

	public void setVlan(String vlan) {
		this.vlan = vlan;
	}

	public String getVlan2() {
		return this.vlan2;
	}

	public void setVlan2(String vlan2) {
		this.vlan2 = vlan2;
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

	public Long getWifi() {
		return this.wifi;
	}

	public void setWifi(Long wifi) {
		this.wifi = wifi;
	}

}