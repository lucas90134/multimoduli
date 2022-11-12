package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the vpn database table.
 * 
 */
@Entity
@NamedQuery(name="Vpn.findAll", query="SELECT v FROM Vpn v")
public class Vpn implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idVpn")
	@SequenceGenerator(name="idVpn", sequenceName = "vpn_id_vpn_seq", allocationSize=1)
	@Column(name="id_vpn")
	private Long idVpn;

	@Column(name="authentication_algorytm")
	private String authenticationAlgorytm;

	@Column(name="bu_service")
	private String buService;

	private String country;

	@Column(name="dh_group")
	private String dhGroup;

	@Column(name="encryption_profile")
	private String encryptionProfile;

	@Column(name="ike_phase_1")
	private String ikePhase1;

	@Column(name="isakamp_key")
	private String isakampKey;

	@Column(name="lifetime_phase_1_sec")
	private String lifetimePhase1Sec;

	@Column(name="lifetime_phase_2_sec")
	private String lifetimePhase2Sec;

	@Column(name="local_network")
	private String localNetwork;

	@Column(name="local_peer")
	private String localPeer;

	private String note;

	@Column(name="partner_contact")
	private String partnerContact;

	@Column(name="partner_name")
	private String partnerName;

	private String pfs;

	@Column(name="remote_hw")
	private String remoteHw;

	@Column(name="remote_network")
	private String remoteNetwork;

	@Column(name="remote_peer")
	private String remotePeer;

	private String state;

	private String type;

	@Column(name="user_mod")
	private String userMod;

	@Column(name="vpn_name")
	private String vpnName;
	
	@Column(name="date_insert")
	private Date dateInsert;

	public Vpn() {
	}

	public String getAuthenticationAlgorytm() {
		return this.authenticationAlgorytm;
	}

	public void setAuthenticationAlgorytm(String authenticationAlgorytm) {
		this.authenticationAlgorytm = authenticationAlgorytm;
	}

	public String getBuService() {
		return this.buService;
	}

	public void setBuService(String buService) {
		this.buService = buService;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDhGroup() {
		return this.dhGroup;
	}

	public void setDhGroup(String dhGroup) {
		this.dhGroup = dhGroup;
	}

	public String getEncryptionProfile() {
		return this.encryptionProfile;
	}

	public void setEncryptionProfile(String encryptionProfile) {
		this.encryptionProfile = encryptionProfile;
	}

	public Long getIdVpn() {
		return this.idVpn;
	}

	public void setIdVpn(Long idVpn) {
		this.idVpn = idVpn;
	}

	public String getIkePhase1() {
		return this.ikePhase1;
	}

	public void setIkePhase1(String ikePhase1) {
		this.ikePhase1 = ikePhase1;
	}

	public String getIsakampKey() {
		return this.isakampKey;
	}

	public void setIsakampKey(String isakampKey) {
		this.isakampKey = isakampKey;
	}

	public String getLocalNetwork() {
		return this.localNetwork;
	}

	public void setLocalNetwork(String localNetwork) {
		this.localNetwork = localNetwork;
	}

	public String getLocalPeer() {
		return this.localPeer;
	}

	public void setLocalPeer(String localPeer) {
		this.localPeer = localPeer;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPartnerName() {
		return this.partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getPfs() {
		return this.pfs;
	}

	public void setPfs(String pfs) {
		this.pfs = pfs;
	}

	public String getRemoteHw() {
		return this.remoteHw;
	}

	public void setRemoteHw(String remoteHw) {
		this.remoteHw = remoteHw;
	}

	public String getRemoteNetwork() {
		return this.remoteNetwork;
	}

	public void setRemoteNetwork(String remoteNetwork) {
		this.remoteNetwork = remoteNetwork;
	}

	public String getRemotePeer() {
		return this.remotePeer;
	}

	public void setRemotePeer(String remotePeer) {
		this.remotePeer = remotePeer;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public String getVpnName() {
		return this.vpnName;
	}

	public void setVpnName(String vpnName) {
		this.vpnName = vpnName;
	}

	public String getLifetimePhase1Sec() {
		return lifetimePhase1Sec;
	}

	public void setLifetimePhase1Sec(String lifetimePhase1Sec) {
		this.lifetimePhase1Sec = lifetimePhase1Sec;
	}

	public String getLifetimePhase2Sec() {
		return lifetimePhase2Sec;
	}

	public void setLifetimePhase2Sec(String lifetimePhase2Sec) {
		this.lifetimePhase2Sec = lifetimePhase2Sec;
	}

	public String getPartnerContact() {
		return partnerContact;
	}

	public void setPartnerContact(String partnerContact) {
		this.partnerContact = partnerContact;
	}

	public Date getDateInsert() {
		return dateInsert;
	}

	public void setDateInsert(Date dateInsert) {
		this.dateInsert = dateInsert;
	}
	
	
}