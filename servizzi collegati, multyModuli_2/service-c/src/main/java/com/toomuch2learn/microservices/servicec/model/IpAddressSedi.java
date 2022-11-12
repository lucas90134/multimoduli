package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.*;
/**
 * The persistent class for the ip_address_sedi database table.
 * 
 */
@Entity
@Table(name="ip_address_sedi")
@NamedQuery(name="IpAddressSedi.findAll", query="SELECT i FROM IpAddressSedi i")
@Audited
public class IpAddressSedi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idIpAddressSedi")
	@SequenceGenerator(name="idIpAddressSedi", sequenceName = "ip_address_sedi_id_ip_address_sedi_seq", allocationSize=1)
	@Column(name="id_ip_address_sedi")
	private Long idIpAddressSedi;
	
	@JsonIgnore 
	@OneToMany(mappedBy = "ipAddressSedi", fetch = FetchType.LAZY) 
	@NotAudited
	private List<MatriceLinea> matriceLinea; 
	
	@Column(name="dhcp_end_gev")
	private String dhcpEndGev;

	@Column(name="dhcp_end_lotto")
	private String dhcpEndLotto;

	@Column(name="dhcp_end_mgmt")
	private String dhcpEndMgmt;

	@Column(name="dhcp_end_servizi")
	private String dhcpEndServizi;

	@Column(name="dhcp_start_gev")
	private String dhcpStartGev;

	@Column(name="dhcp_start_lotto")
	private String dhcpStartLotto;

	@Column(name="dhcp_start_mgmt")
	private String dhcpStartMgmt;

	@Column(name="dhcp_start_servizi")
	private String dhcpStartServizi;

	@Column(name="id_sede")
	private Long idSede;

	@Column(name="ip_bgp_novomatic")
	private String ipBgpNovomatic;

	@Column(name="ip_erice_mgmt")
	private String ipEriceMgmt;

	@Column(name="ip_inspired")
	private String ipInspired;

	@Column(name="ip_lan_mag")
	private String ipLanMag;

	@Column(name="ip_lan_playtec")
	private String ipLanPlaytec;

	@Column(name="ip_terminatore_gev")
	private String ipTerminatoreGev;

	@Column(name="ip_terminatore_servizi")
	private String ipTerminatoreServizi;

	@Column(name="ip_vrrp_better")
	private String ipVrrpBetter;

	@Column(name="ip_vrrp_inspired")
	private String ipVrrpInspired;

	@Column(name="ip_vrrp_lotto_loc")
	private String ipVrrpLottoLoc;

	@Column(name="ip_vrrp_self")
	private String ipVrrpSelf;

	@Column(name="ip_vrrp_spielo_loc")
	private String ipVrrpSpieloLoc;

	@Column(name="ip_vrrp_virtual")
	private String ipVrrpVirtual;

	@Column(name="lan_mgmt")
	private String lanMgmt;

	@Column(name="net_mask_better")
	private String netMaskBetter;

	@Column(name="net_mask_erice")
	private String netMaskErice;

	@Column(name="net_mask_gev")
	private String netMaskGev;

	@Column(name="net_mask_lotto_loc")
	private String netMaskLottoLoc;

	@Column(name="net_mask_mgmt")
	private String netMaskMgmt;

	@Column(name="net_mask_self")
	private String netMaskSelf;

	@Column(name="net_mask_servizi")
	private String netMaskServizi;

	@Column(name="net_mask_spielo")
	private String netMaskSpielo;

	@Column(name="net_mask_spielo_loc")
	private String netMaskSpieloLoc;

	@Column(name="net_mask_virtual")
	private String netMaskVirtual;

	@Column(name="netmask_erice_mgmt")
	private String netmaskEriceMgmt;

	@Column(name="network_better")
	private String networkBetter;

	@Column(name="network_erice")
	private String networkErice;

	@Column(name="network_gev")
	private String networkGev;

	@Column(name="network_lotto_loc")
	private String networkLottoLoc;

	@Column(name="network_self")
	private String networkSelf;

	@Column(name="network_servizi")
	private String networkServizi;

	@Column(name="network_spielo")
	private String networkSpielo;

	@Column(name="network_spielo_loc")
	private String networkSpieloLoc;

	@Column(name="network_tablet")
	private String networkTablet;

	@Column(name="network_virtual")
	private String networkVirtual;

	@Column(name="network_wifi")
	private String networkWifi;

	@Column(name="subnet_mask_bgp_novomatic")
	private String subnetMaskBgpNovomatic;

	@Column(name="subnet_mask_inspired")
	private String subnetMaskInspired;

	@Column(name="subnet_mask_mag")
	private String subnetMaskMag;

	@Column(name="subnet_mask_playtec")
	private String subnetMaskPlaytec;

	public IpAddressSedi() {
	}

	public String getDhcpEndGev() {
		return this.dhcpEndGev;
	}

	public void setDhcpEndGev(String dhcpEndGev) {
		this.dhcpEndGev = dhcpEndGev;
	}

	public String getDhcpEndLotto() {
		return this.dhcpEndLotto;
	}

	public void setDhcpEndLotto(String dhcpEndLotto) {
		this.dhcpEndLotto = dhcpEndLotto;
	}

	public String getDhcpEndMgmt() {
		return this.dhcpEndMgmt;
	}

	public void setDhcpEndMgmt(String dhcpEndMgmt) {
		this.dhcpEndMgmt = dhcpEndMgmt;
	}

	public String getDhcpEndServizi() {
		return this.dhcpEndServizi;
	}

	public void setDhcpEndServizi(String dhcpEndServizi) {
		this.dhcpEndServizi = dhcpEndServizi;
	}

	public String getDhcpStartGev() {
		return this.dhcpStartGev;
	}

	public void setDhcpStartGev(String dhcpStartGev) {
		this.dhcpStartGev = dhcpStartGev;
	}

	public String getDhcpStartLotto() {
		return this.dhcpStartLotto;
	}

	public void setDhcpStartLotto(String dhcpStartLotto) {
		this.dhcpStartLotto = dhcpStartLotto;
	}

	public String getDhcpStartMgmt() {
		return this.dhcpStartMgmt;
	}

	public void setDhcpStartMgmt(String dhcpStartMgmt) {
		this.dhcpStartMgmt = dhcpStartMgmt;
	}

	public String getDhcpStartServizi() {
		return this.dhcpStartServizi;
	}

	public void setDhcpStartServizi(String dhcpStartServizi) {
		this.dhcpStartServizi = dhcpStartServizi;
	}

	public Long getIdIpAddressSedi() {
		return this.idIpAddressSedi;
	}

	public void setIdIpAddressSedi(Long idIpAddressSedi) {
		this.idIpAddressSedi = idIpAddressSedi;
	}

	public Long getIdSede() {
		return this.idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public String getIpBgpNovomatic() {
		return this.ipBgpNovomatic;
	}

	public void setIpBgpNovomatic(String ipBgpNovomatic) {
		this.ipBgpNovomatic = ipBgpNovomatic;
	}

	public String getIpEriceMgmt() {
		return this.ipEriceMgmt;
	}

	public void setIpEriceMgmt(String ipEriceMgmt) {
		this.ipEriceMgmt = ipEriceMgmt;
	}

	public String getIpInspired() {
		return this.ipInspired;
	}

	public void setIpInspired(String ipInspired) {
		this.ipInspired = ipInspired;
	}

	public String getIpLanMag() {
		return this.ipLanMag;
	}

	public void setIpLanMag(String ipLanMag) {
		this.ipLanMag = ipLanMag;
	}

	public String getIpLanPlaytec() {
		return this.ipLanPlaytec;
	}

	public void setIpLanPlaytec(String ipLanPlaytec) {
		this.ipLanPlaytec = ipLanPlaytec;
	}

	public String getIpTerminatoreGev() {
		return this.ipTerminatoreGev;
	}

	public void setIpTerminatoreGev(String ipTerminatoreGev) {
		this.ipTerminatoreGev = ipTerminatoreGev;
	}

	public String getIpTerminatoreServizi() {
		return this.ipTerminatoreServizi;
	}

	public void setIpTerminatoreServizi(String ipTerminatoreServizi) {
		this.ipTerminatoreServizi = ipTerminatoreServizi;
	}

	public String getIpVrrpBetter() {
		return this.ipVrrpBetter;
	}

	public void setIpVrrpBetter(String ipVrrpBetter) {
		this.ipVrrpBetter = ipVrrpBetter;
	}

	public String getIpVrrpInspired() {
		return this.ipVrrpInspired;
	}

	public void setIpVrrpInspired(String ipVrrpInspired) {
		this.ipVrrpInspired = ipVrrpInspired;
	}

	public String getIpVrrpLottoLoc() {
		return this.ipVrrpLottoLoc;
	}

	public void setIpVrrpLottoLoc(String ipVrrpLottoLoc) {
		this.ipVrrpLottoLoc = ipVrrpLottoLoc;
	}

	public String getIpVrrpSelf() {
		return this.ipVrrpSelf;
	}

	public void setIpVrrpSelf(String ipVrrpSelf) {
		this.ipVrrpSelf = ipVrrpSelf;
	}

	public String getIpVrrpSpieloLoc() {
		return this.ipVrrpSpieloLoc;
	}

	public void setIpVrrpSpieloLoc(String ipVrrpSpieloLoc) {
		this.ipVrrpSpieloLoc = ipVrrpSpieloLoc;
	}

	public String getIpVrrpVirtual() {
		return this.ipVrrpVirtual;
	}

	public void setIpVrrpVirtual(String ipVrrpVirtual) {
		this.ipVrrpVirtual = ipVrrpVirtual;
	}

	public String getLanMgmt() {
		return this.lanMgmt;
	}

	public void setLanMgmt(String lanMgmt) {
		this.lanMgmt = lanMgmt;
	}

	public String getNetMaskBetter() {
		return this.netMaskBetter;
	}

	public void setNetMaskBetter(String netMaskBetter) {
		this.netMaskBetter = netMaskBetter;
	}

	public String getNetMaskErice() {
		return this.netMaskErice;
	}

	public void setNetMaskErice(String netMaskErice) {
		this.netMaskErice = netMaskErice;
	}

	public String getNetMaskGev() {
		return this.netMaskGev;
	}

	public void setNetMaskGev(String netMaskGev) {
		this.netMaskGev = netMaskGev;
	}

	public String getNetMaskLottoLoc() {
		return this.netMaskLottoLoc;
	}

	public void setNetMaskLottoLoc(String netMaskLottoLoc) {
		this.netMaskLottoLoc = netMaskLottoLoc;
	}

	public String getNetMaskMgmt() {
		return this.netMaskMgmt;
	}

	public void setNetMaskMgmt(String netMaskMgmt) {
		this.netMaskMgmt = netMaskMgmt;
	}

	public String getNetMaskSelf() {
		return this.netMaskSelf;
	}

	public void setNetMaskSelf(String netMaskSelf) {
		this.netMaskSelf = netMaskSelf;
	}

	public String getNetMaskServizi() {
		return this.netMaskServizi;
	}

	public void setNetMaskServizi(String netMaskServizi) {
		this.netMaskServizi = netMaskServizi;
	}

	public String getNetMaskSpielo() {
		return this.netMaskSpielo;
	}

	public void setNetMaskSpielo(String netMaskSpielo) {
		this.netMaskSpielo = netMaskSpielo;
	}

	public String getNetMaskSpieloLoc() {
		return this.netMaskSpieloLoc;
	}

	public void setNetMaskSpieloLoc(String netMaskSpieloLoc) {
		this.netMaskSpieloLoc = netMaskSpieloLoc;
	}

	public String getNetMaskVirtual() {
		return this.netMaskVirtual;
	}

	public void setNetMaskVirtual(String netMaskVirtual) {
		this.netMaskVirtual = netMaskVirtual;
	}

	public String getNetmaskEriceMgmt() {
		return this.netmaskEriceMgmt;
	}

	public void setNetmaskEriceMgmt(String netmaskEriceMgmt) {
		this.netmaskEriceMgmt = netmaskEriceMgmt;
	}

	public String getNetworkBetter() {
		return this.networkBetter;
	}

	public void setNetworkBetter(String networkBetter) {
		this.networkBetter = networkBetter;
	}

	public String getNetworkErice() {
		return this.networkErice;
	}

	public void setNetworkErice(String networkErice) {
		this.networkErice = networkErice;
	}

	public String getNetworkGev() {
		return this.networkGev;
	}

	public void setNetworkGev(String networkGev) {
		this.networkGev = networkGev;
	}

	public String getNetworkLottoLoc() {
		return this.networkLottoLoc;
	}

	public void setNetworkLottoLoc(String networkLottoLoc) {
		this.networkLottoLoc = networkLottoLoc;
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

	public String getNetworkTablet() {
		return this.networkTablet;
	}

	public void setNetworkTablet(String networkTablet) {
		this.networkTablet = networkTablet;
	}

	public String getNetworkVirtual() {
		return this.networkVirtual;
	}

	public void setNetworkVirtual(String networkVirtual) {
		this.networkVirtual = networkVirtual;
	}

	public String getNetworkWifi() {
		return this.networkWifi;
	}

	public void setNetworkWifi(String networkWifi) {
		this.networkWifi = networkWifi;
	}

	public String getSubnetMaskBgpNovomatic() {
		return this.subnetMaskBgpNovomatic;
	}

	public void setSubnetMaskBgpNovomatic(String subnetMaskBgpNovomatic) {
		this.subnetMaskBgpNovomatic = subnetMaskBgpNovomatic;
	}

	public String getSubnetMaskInspired() {
		return this.subnetMaskInspired;
	}

	public void setSubnetMaskInspired(String subnetMaskInspired) {
		this.subnetMaskInspired = subnetMaskInspired;
	}

	public String getSubnetMaskMag() {
		return this.subnetMaskMag;
	}

	public void setSubnetMaskMag(String subnetMaskMag) {
		this.subnetMaskMag = subnetMaskMag;
	}

	public String getSubnetMaskPlaytec() {
		return this.subnetMaskPlaytec;
	}

	public void setSubnetMaskPlaytec(String subnetMaskPlaytec) {
		this.subnetMaskPlaytec = subnetMaskPlaytec;
	}

	public List<MatriceLinea> getMatriceLinea() {
		return matriceLinea;
	}

	public void setMatriceLinea(List<MatriceLinea> matriceLinea) {
		this.matriceLinea = matriceLinea;
	}

}