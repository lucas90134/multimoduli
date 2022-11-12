package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the ip_address_apparato_storico database table.
 * 
 */
@Entity
@Table(name="ip_address_apparato_storico")
@NamedQuery(name="IpAddressApparatoStorico.findAll", query="SELECT i FROM IpAddressApparatoStorico i")
public class IpAddressApparatoStorico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idIpAddressApparatoStorico")
	@SequenceGenerator(name="idIpAddressApparatoStorico", sequenceName = "ip_address_apparato_storico_id_ip_address_apparato_storico_seq", allocationSize=1)
	@Column(name="id_ip_address_apparato_storico")
	private Long idIpAddressApparatoStorico;

	@Column(name="data_storicizzazione")
	private Date dataStoricizzazione;

	@Column(name="id_apparati_linea")
	private Long idApparatiLinea;

	@Column(name="id_ip_address_apparato")
	private Long idIpAddressApparato;

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

	public IpAddressApparatoStorico() {
	}

	public Long getIdIpAddressApparatoStorico() {
		return this.idIpAddressApparatoStorico;
	}

	public void setIdIpAddressApparatoStorico(Long idIpAddressApparatoStorico) {
		this.idIpAddressApparatoStorico = idIpAddressApparatoStorico;
	}

	public Date getDataStoricizzazione() {
		return this.dataStoricizzazione;
	}

	public void setDataStoricizzazione(Date dataStoricizzazione) {
		this.dataStoricizzazione = dataStoricizzazione;
	}

	public Long getIdApparatiLinea() {
		return this.idApparatiLinea;
	}

	public void setIdApparatiLinea(Long idApparatiLinea) {
		this.idApparatiLinea = idApparatiLinea;
	}

	public Long getIdIpAddressApparato() {
		return this.idIpAddressApparato;
	}

	public void setIdIpAddressApparato(Long idIpAddressApparato) {
		this.idIpAddressApparato = idIpAddressApparato;
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
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

}