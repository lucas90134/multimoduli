package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
/**
 * The persistent class for the MAXIMO_OGGETTI_SEDE database table.
 * 
 */
@Entity
@Table(name="maximo_oggetti_sede")
@NamedQuery(name="MaximoOggettiSede.findAll", query="SELECT m FROM MaximoOggettiSede m")
public class MaximoOggettiSede implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="assetnum")
	private String assetnum;

	@Column(name="data_caricamento")
	private Date dataCaricamento;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idMaximoOggettiSede")
	@SequenceGenerator(name="idMaximoOggettiSede", sequenceName = "maximo_oggetti_sede_id_maximo_oggetti_sede_seq", allocationSize=1)
	@Column(name="id_maximo_oggetti_sede")
	private Integer idMaximoOggettiSede;

	@Column(name="itemnum")
	private String itemnum;

	@Column(name="location")
	private String location;

	@Column(name="serialnum")
	private String serialnum;

	@Column(name="status")
	private String status;

	@Column(name="g_codice")
	private String gCodice;
	
	@Column(name="statusdate")
	private Date statusdate;

	public MaximoOggettiSede() {
	}

	public String getAssetnum() {
		return this.assetnum;
	}

	public void setAssetnum(String assetnum) {
		this.assetnum = assetnum;
	}

	public Date getDataCaricamento() {
		return this.dataCaricamento;
	}

	public void setDataCaricamento(Date dataCaricamento) {
		this.dataCaricamento = dataCaricamento;
	}

	public Integer getIdMaximoOggettiSede() {
		return this.idMaximoOggettiSede;
	}

	public void setIdMaximoOggettiSede(Integer idMaximoOggettiSede) {
		this.idMaximoOggettiSede = idMaximoOggettiSede;
	}

	public String getItemnum() {
		return this.itemnum;
	}

	public void setItemnum(String itemnum) {
		this.itemnum = itemnum;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSerialnum() {
		return this.serialnum;
	}

	public void setSerialnum(String serialnum) {
		this.serialnum = serialnum;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStatusdate() {
		return this.statusdate;
	}

	public void setStatusdate(Date statusdate) {
		this.statusdate = statusdate;
	}

	public String getgCodice() {
		return gCodice;
	}

	public void setgCodice(String gCodice) {
		this.gCodice = gCodice;
	}

}