package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

import javax.persistence.*;
/**
 * The persistent class for the adm_contratto_linea database table.
 * 
 */
@Entity
@Table(name="adm_contratto_linea")
@NamedQuery(name="AdmContrattoLinea.findAll", query="SELECT a FROM AdmContrattoLinea a")
public class AdmContrattoLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idAdmContrattoLinea")
	@SequenceGenerator(name="idAdmContrattoLinea", sequenceName = "adm_contratto_linea_id_adm_contratto_linea_seq", allocationSize=1)
	@Column(name="id_adm_contratto_linea")
	private Long idAdmContrattoLinea;

	@Column(name="id_contratti_sed_fornitori")
	private Long idContrattiSedFornitori;

	@Column(name="id_tipo")
	private Long idTipo;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO",insertable=false,updatable=false)
	private TipoLinea tipoLinea;
	
	public AdmContrattoLinea() {
	}

	public Long getIdAdmContrattoLinea() {
		return this.idAdmContrattoLinea;
	}

	public void setIdAdmContrattoLinea(Long idAdmContrattoLinea) {
		this.idAdmContrattoLinea = idAdmContrattoLinea;
	}

	public Long getIdContrattiSedFornitori() {
		return this.idContrattiSedFornitori;
	}

	public void setIdContrattiSedFornitori(Long idContrattiSedFornitori) {
		this.idContrattiSedFornitori = idContrattiSedFornitori;
	}

	public Long getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}

	public TipoLinea getTipoLinea() {
		return tipoLinea;
	}

	public void setTipoLinea(TipoLinea tipoLinea) {
		this.tipoLinea = tipoLinea;
	}

}