package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the adm_contratti_sed_fornitori database table.
 * 
 */
@Entity
@Table(name="adm_contratti_sed_fornitori")
@NamedQuery(name="AdmContrattiSedFornitori.findAll", query="SELECT a FROM AdmContrattiSedFornitori a")
public class AdmContrattiSedFornitori implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idAdmContrattiSedFornitori")
	@SequenceGenerator(name="idAdmContrattiSedFornitori", sequenceName = "adm_contratti_sed_fornitori_id_adm_contratti_sed_fornitori_seq", allocationSize=1)
	@Column(name="id_adm_contratti_sed_fornitori")
	private Long idAdmContrattiSedFornitori;

	@Column(name="id_contratti_ltm_sed")
	private Long idContrattiLtmSed;

	@Column(name="id_contratti_sed_fornitori")
	private Long idContrattiSedFornitori;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_contratti_ltm_sed",insertable=false,updatable=false)
	private ContrattiLtmSed contrattiLtmSed;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_contratti_sed_fornitori",insertable=false,updatable=false)
	private ContrattiSedFornitori contrattiSedFornitori;
	
	public AdmContrattiSedFornitori() {
	}

	public Long getIdAdmContrattiSedFornitori() {
		return this.idAdmContrattiSedFornitori;
	}

	public void setIdAdmContrattiSedFornitori(Long idAdmContrattiSedFornitori) {
		this.idAdmContrattiSedFornitori = idAdmContrattiSedFornitori;
	}

	public Long getIdContrattiLtmSed() {
		return this.idContrattiLtmSed;
	}

	public void setIdContrattiLtmSed(Long idContrattiLtmSed) {
		this.idContrattiLtmSed = idContrattiLtmSed;
	}

	public Long getIdContrattiSedFornitori() {
		return this.idContrattiSedFornitori;
	}

	public void setIdContrattiSedFornitori(Long idContrattiSedFornitori) {
		this.idContrattiSedFornitori = idContrattiSedFornitori;
	}

	public ContrattiLtmSed getContrattiLtmSed() {
		return contrattiLtmSed;
	}

	public void setContrattiLtmSed(ContrattiLtmSed contrattiLtmSed) {
		this.contrattiLtmSed = contrattiLtmSed;
	}

	public ContrattiSedFornitori getContrattiSedFornitori() {
		return contrattiSedFornitori;
	}

	public void setContrattiSedFornitori(ContrattiSedFornitori contrattiSedFornitori) {
		this.contrattiSedFornitori = contrattiSedFornitori;
	}

}