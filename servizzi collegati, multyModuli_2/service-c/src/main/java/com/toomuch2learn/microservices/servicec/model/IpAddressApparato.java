package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ip_address_apparato database table.
 * 
 */
@Entity
@Table(name="ip_address_apparato")
@NamedQuery(name="IpAddressApparato.findAll", query="SELECT i FROM IpAddressApparato i")
public class IpAddressApparato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idIpAddressApparato")
	@SequenceGenerator(name="idIpAddressApparato", sequenceName = "ip_address_apparato_id_ip_address_apparato_seq", allocationSize=1)
	@Column(name="id_ip_address_apparato")
	private Long idIpAddressApparato;


	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_apparati_linea",insertable=false,updatable=false)       
	private ApparatiLinea apparatiLinea;
	
	@Column(name="id_apparati_linea")
	private Long idApparatiLinea;

	@Column(name="ip_router_better")
	private String ipRouterBetter;

	@Column(name="ip_router_inspired")
	private String ipRouterInspired;

	@Column(name="ip_router_lotto")
	private String ipRouterLotto;

	@Column(name="ip_router_lotto_loc")
	private String ipRouterLottoLoc;

	@Column(name="ip_router_self")
	private String ipRouterSelf;

	@Column(name="ip_router_spielo_loc")
	private String ipRouterSpieloLoc;

	@Column(name="login_l2tp")
	private String loginL2tp;
	
	@Column(name="user_mod")
	private String userMod;

	public IpAddressApparato() {
	}

	public Long getIdIpAddressApparato() {
		return this.idIpAddressApparato;
	}

	public void setIdIpAddressApparato(Long idIpAddressApparato) {
		this.idIpAddressApparato = idIpAddressApparato;
	}

	public Long getIdApparatiLinea() {
		return this.idApparatiLinea;
	}

	public void setIdApparatiLinea(Long idApparatiLinea) {
		this.idApparatiLinea = idApparatiLinea;
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

	public String getIpRouterLotto() {
		return this.ipRouterLotto;
	}

	public void setIpRouterLotto(String ipRouterLotto) {
		this.ipRouterLotto = ipRouterLotto;
	}

	public String getIpRouterLottoLoc() {
		return this.ipRouterLottoLoc;
	}

	public void setIpRouterLottoLoc(String ipRouterLottoLoc) {
		this.ipRouterLottoLoc = ipRouterLottoLoc;
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

	public String getLoginL2tp() {
		return this.loginL2tp;
	}

	public void setLoginL2tp(String loginL2tp) {
		this.loginL2tp = loginL2tp;
	}

	public String getUserMod() {
		return userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public ApparatiLinea getApparatiLinea() {
		return apparatiLinea;
	}

	public void setApparatiLinea(ApparatiLinea apparatiLinea) {
		this.apparatiLinea = apparatiLinea;
	}
	
}