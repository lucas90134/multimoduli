package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the inventory_dettaglio_tecnico database table.
 * 
 */
@Entity
@Table(name="inventory_dettaglio_tecnico")
@NamedQuery(name="InventoryDettaglioTecnico.findAll", query="SELECT t FROM InventoryDettaglioTecnico t")
public class InventoryDettaglioTecnico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idInventoryDettaglioTecnico")
	@SequenceGenerator(name="idInventoryDettaglioTecnico", sequenceName = "inventory_dettaglio_tecnico_id_inventory_dettaglio_tecnico_seq", allocationSize=1)
	@Column(name="id_inventory_dettaglio_tecnico")
	private Long idInventoryDettaglioTecnico;

	private Boolean congelato;

	@Column(name="data_inserimento")
	private Date dataInserimento;

	@Column(name="downstream_attenuation")
	private String downstreamAttenuation;

	@Column(name="downstream_fast")
	private String downstreamFast;

	@Column(name="downstream_interleave")
	private String downstreamInterleave;

	@Column(name="downstream_margin")
	private String downstreamMargin;

	@Column(name="id_master_apparato")
	private Long idMasterApparato;

	@Column(name="upstream_attenuation")
	private String upstreamAttenuation;

	@Column(name="upstream_fast")
	private String upstreamFast;

	@Column(name="upstream_interleave")
	private String upstreamInterleave;

	@Column(name="upstream_margin")
	private String upstreamMargin;

	public InventoryDettaglioTecnico() {
	}

	public Long getIdInventoryDettaglioTecnico() {
		return this.idInventoryDettaglioTecnico;
	}

	public void setIdInventoryDettaglioTecnico(Long idInventoryDettaglioTecnico) {
		this.idInventoryDettaglioTecnico = idInventoryDettaglioTecnico;
	}

	public Boolean getCongelato() {
		return this.congelato;
	}

	public void setCongelato(Boolean congelato) {
		this.congelato = congelato;
	}

	public Date getDataInserimento() {
		return this.dataInserimento;
	}

	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public String getDownstreamAttenuation() {
		return this.downstreamAttenuation;
	}

	public void setDownstreamAttenuation(String downstreamAttenuation) {
		this.downstreamAttenuation = downstreamAttenuation;
	}

	public String getDownstreamFast() {
		return this.downstreamFast;
	}

	public void setDownstreamFast(String downstreamFast) {
		this.downstreamFast = downstreamFast;
	}

	public String getDownstreamInterleave() {
		return this.downstreamInterleave;
	}

	public void setDownstreamInterleave(String downstreamInterleave) {
		this.downstreamInterleave = downstreamInterleave;
	}

	public String getDownstreamMargin() {
		return this.downstreamMargin;
	}

	public void setDownstreamMargin(String downstreamMargin) {
		this.downstreamMargin = downstreamMargin;
	}

	public Long getIdMasterApparato() {
		return this.idMasterApparato;
	}

	public void setIdMasterApparato(Long idMasterApparato) {
		this.idMasterApparato = idMasterApparato;
	}

	public String getUpstreamAttenuation() {
		return this.upstreamAttenuation;
	}

	public void setUpstreamAttenuation(String upstreamAttenuation) {
		this.upstreamAttenuation = upstreamAttenuation;
	}

	public String getUpstreamFast() {
		return this.upstreamFast;
	}

	public void setUpstreamFast(String upstreamFast) {
		this.upstreamFast = upstreamFast;
	}

	public String getUpstreamInterleave() {
		return this.upstreamInterleave;
	}

	public void setUpstreamInterleave(String upstreamInterleave) {
		this.upstreamInterleave = upstreamInterleave;
	}

	public String getUpstreamMargin() {
		return this.upstreamMargin;
	}

	public void setUpstreamMargin(String upstreamMargin) {
		this.upstreamMargin = upstreamMargin;
	}

}