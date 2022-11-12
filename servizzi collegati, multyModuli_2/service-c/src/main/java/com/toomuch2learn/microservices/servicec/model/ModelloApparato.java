package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the modello_apparato database table.
 * 
 */
@Entity
@Table(name="modello_apparato")
@NamedQuery(name="ModelloApparato.findAll", query="SELECT m FROM ModelloApparato m")
public class ModelloApparato implements Serializable {
	private static final long serialVersionUID = 1L;

	private Boolean gprs;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idModelloApparato")
	@SequenceGenerator(name="idModelloApparato", sequenceName = "modello_apparato_id_modello_apparato_seq", allocationSize=1)
	@Column(name="id_modello_apparato")
	private Long idModelloApparato;
	
	@JsonIgnore
	@OneToMany(mappedBy = "modelloApparato", fetch = FetchType.LAZY)
	private List<ApparatiLinea> apparatiLinea;

	@Column(name="id_modello_fw")
	private Long idModelloFw;

	@Column(name="id_tipo_apparato")
	private Long idTipoApparato;

	private String infrastruttura;

	private String marca;

	private String modello;

	@Column(name="modello_apparato_attivo")
	private Boolean modelloApparatoAttivo;

	@Column(name="modello_nexus")
	private String modelloNexus;

	public ModelloApparato() {
	}

	public Boolean getGprs() {
		return this.gprs;
	}

	public void setGprs(Boolean gprs) {
		this.gprs = gprs;
	}

	public Long getIdModelloApparato() {
		return this.idModelloApparato;
	}

	public void setIdModelloApparato(Long idModelloApparato) {
		this.idModelloApparato = idModelloApparato;
	}

	public Long getIdModelloFw() {
		return this.idModelloFw;
	}

	public void setIdModelloFw(Long idModelloFw) {
		this.idModelloFw = idModelloFw;
	}

	public Long getIdTipoApparato() {
		return this.idTipoApparato;
	}

	public void setIdTipoApparato(Long idTipoApparato) {
		this.idTipoApparato = idTipoApparato;
	}

	public String getInfrastruttura() {
		return this.infrastruttura;
	}

	public void setInfrastruttura(String infrastruttura) {
		this.infrastruttura = infrastruttura;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return this.modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public Boolean getModelloApparatoAttivo() {
		return this.modelloApparatoAttivo;
	}

	public void setModelloApparatoAttivo(Boolean modelloApparatoAttivo) {
		this.modelloApparatoAttivo = modelloApparatoAttivo;
	}

	public String getModelloNexus() {
		return this.modelloNexus;
	}

	public void setModelloNexus(String modelloNexus) {
		this.modelloNexus = modelloNexus;
	}

	public List<ApparatiLinea> getApparatiLinea() {
		return apparatiLinea;
	}

	public void setApparatiLinea(List<ApparatiLinea> apparatiLinea) {
		this.apparatiLinea = apparatiLinea;
	}

}