package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the terminali_gestori database table.
 * 
 */
@Entity
@Table(name="terminali_gestori")
@NamedQuery(name="TerminaliGestori.findAll", query="SELECT t FROM TerminaliGestori t")
public class TerminaliGestori implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idTerminaliGestori")
	@SequenceGenerator(name="idTerminaliGestori", sequenceName = "terminali_gestori_id_terminali_gestori_seq", allocationSize=1)
	@Column(name="id_terminali_gestori")
	private Long idTerminaliGestori;

	@Column(name="cod_cliente_finale")
	private String codClienteFinale;

	private Date data;

	private String gestore;

	@Column(name="ip_1")
	private Integer ip1;

	@Column(name="ip_2")
	private Integer ip2;

	@Column(name="ip_3")
	private Integer ip3;

	@Column(name="ip_4")
	private Integer ip4;

	@Column(name="num_connessioni")
	private Integer numConnessioni;
	
	@Transient
	private String ip;

	private String terminale;

	public TerminaliGestori() {
	}

	public Long getIdTerminaliGestori() {
		return this.idTerminaliGestori;
	}

	public void setIdTerminaliGestori(Long idTerminaliGestori) {
		this.idTerminaliGestori = idTerminaliGestori;
	}

	public String getCodClienteFinale() {
		return this.codClienteFinale;
	}

	public void setCodClienteFinale(String codClienteFinale) {
		this.codClienteFinale = codClienteFinale;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getGestore() {
		return this.gestore;
	}

	public void setGestore(String gestore) {
		this.gestore = gestore;
	}

	public Integer getIp1() {
		return this.ip1;
	}

	public void setIp1(Integer ip1) {
		this.ip1 = ip1;
	}

	public Integer getIp2() {
		return this.ip2;
	}

	public void setIp2(Integer ip2) {
		this.ip2 = ip2;
	}

	public Integer getIp3() {
		return this.ip3;
	}

	public void setIp3(Integer ip3) {
		this.ip3 = ip3;
	}

	public Integer getIp4() {
		return this.ip4;
	}

	public void setIp4(Integer ip4) {
		this.ip4 = ip4;
	}

	public Integer getNumConnessioni() {
		return this.numConnessioni;
	}

	public void setNumConnessioni(Integer numConnessioni) {
		this.numConnessioni = numConnessioni;
	}

	public String getTerminale() {
		return this.terminale;
	}

	public void setTerminale(String terminale) {
		this.terminale = terminale;
	}

	public String getIp() {
		if(ip1 != null && ip2 != null && ip3 != null && ip4 != null) {
			return ip1 + "." + ip2 + "." + ip3 + "." + ip4;
		}
		return null;
	}
}