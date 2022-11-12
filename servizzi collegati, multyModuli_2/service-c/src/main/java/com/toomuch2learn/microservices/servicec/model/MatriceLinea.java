package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the MATRICE_LINEA database table.
 * 
 */
@Entity
@Table(name="MATRICE_LINEA")
@NamedQuery(name="MatriceLinea.findAll", query="SELECT m FROM MatriceLinea m")
public class MatriceLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "ID_LINEA",insertable=false,updatable=false)
	private Linea linea;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_apparato",insertable=false,updatable=false)    
	private ApparatiLinea apparatiLinea;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_sede",insertable=false,updatable=false)    
	private Sedi sede;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_sede", referencedColumnName = "id_sede", insertable=false,updatable=false)
	private IpAddressSedi ipAddressSedi;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_configurazione",insertable=false,updatable=false)    
	private IpAddress ipAddress;

	@Id
	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="id_master_linea")
	private Long idMasterLinea;

	@Column(name="id_sede")
	private Long idSede;

	@Column(name="id_apparato")
	private Long idApparato;
	
	//id_ip_address
	@Column(name="id_configurazione")
	private Long idConfigurazione;

	
	public Long getIdApparato() {
		return idApparato;
	}

	public void setIdApparato(Long idApparato) {
		this.idApparato = idApparato;
	}

	public Linea getLinea() {
		return linea;
	}

	public void setLinea(Linea linea) {
		this.linea = linea;
	}

	public ApparatiLinea getApparatiLinea() {
		return apparatiLinea;
	}

	public void setApparatiLinea(ApparatiLinea apparatiLinea) {
		this.apparatiLinea = apparatiLinea;
	}

	public Sedi getSede() {
		return sede;
	}

	public void setSede(Sedi sede) {
		this.sede = sede;
	}

	public IpAddress getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(IpAddress ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Long getIdLinea() {
		return idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Long getIdMasterLinea() {
		return idMasterLinea;
	}

	public void setIdMasterLinea(Long idMasterLinea) {
		this.idMasterLinea = idMasterLinea;
	}

	public Long getIdSede() {
		return idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public Long getIdConfigurazione() {
		return idConfigurazione;
	}

	public void setIdConfigurazione(Long idConfigurazione) {
		this.idConfigurazione = idConfigurazione;
	}
	
}
