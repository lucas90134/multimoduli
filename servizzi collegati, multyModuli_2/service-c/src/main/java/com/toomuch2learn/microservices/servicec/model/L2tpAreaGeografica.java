package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the l2tp_area_geografica database table.
 * 
 */
@Entity
@Table(name="l2tp_area_geografica")
@NamedQuery(name="L2tpAreaGeografica.findAll", query="SELECT l FROM L2tpAreaGeografica l")
public class L2tpAreaGeografica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idAreaGeografica")
	@SequenceGenerator(name="idAreaGeografica", sequenceName = "l2tp_area_geografica_id_area_geografica_seq", allocationSize=1)
	@Column(name="id_area_geografica")
	private Integer idAreaGeografica;

	private String descrizione;

	@Column(name="dns_1")
	private String dns1;

	@Column(name="dns_2")
	private String dns2;

	@Column(name="ip_l2tp")
	private String ipL2tp;

	public L2tpAreaGeografica() {
	}

	public Integer getIdAreaGeografica() {
		return this.idAreaGeografica;
	}

	public void setIdAreaGeografica(Integer idAreaGeografica) {
		this.idAreaGeografica = idAreaGeografica;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDns1() {
		return this.dns1;
	}

	public void setDns1(String dns1) {
		this.dns1 = dns1;
	}

	public String getDns2() {
		return this.dns2;
	}

	public void setDns2(String dns2) {
		this.dns2 = dns2;
	}

	public String getIpL2tp() {
		return this.ipL2tp;
	}

	public void setIpL2tp(String ipL2tp) {
		this.ipL2tp = ipL2tp;
	}

}