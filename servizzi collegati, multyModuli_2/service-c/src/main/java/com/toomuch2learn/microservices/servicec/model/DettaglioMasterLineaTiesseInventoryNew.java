package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the dettaglio_master_linea_tiesse_inventory_new database table.
 * 
 */
@Entity
@Table(name="dettaglio_master_linea_tiesse_inventory_new")
@NamedQuery(name="DettaglioMasterLineaTiesseInventoryNew.findAll", query="SELECT d FROM DettaglioMasterLineaTiesseInventoryNew d")
public class DettaglioMasterLineaTiesseInventoryNew implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idDettaglioMasterLineaTiesseInventory")
	@SequenceGenerator(name="idDettaglioMasterLineaTiesseInventory", sequenceName = "dettaglio_master_linea_tiesse_id_dettaglio_master_linea_tie_seq", allocationSize=1)
	@Column(name="id_dettaglio_master_linea_tiesse_inventory")
	private Long idDettaglioMasterLineaTiesseInventory;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY,optional = true)
	@JoinColumn(name = "ID_MASTER_APPARATO", referencedColumnName="ID_MASTER_APPARATO",insertable=false,updatable=false) 
	@LazyToOne(LazyToOneOption.NO_PROXY)
	private Inventory inventory;
	
	@Column(name="id_linea")
	private Long idLinea;
	
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY,optional = true)
	@JoinColumn(name = "id_linea",insertable=false,updatable=false)
	@LazyToOne(LazyToOneOption.NO_PROXY)
	private Linea linea;


	@Column(name="id_master_apparato")
	private Long idMasterApparato;

	@Column(name="id_master_linea")
	private Long idMasterLinea;

	public DettaglioMasterLineaTiesseInventoryNew() {
	}

	public Long getIdDettaglioMasterLineaTiesseInventory() {
		return this.idDettaglioMasterLineaTiesseInventory;
	}

	public void setIdDettaglioMasterLineaTiesseInventory(Long idDettaglioMasterLineaTiesseInventory) {
		this.idDettaglioMasterLineaTiesseInventory = idDettaglioMasterLineaTiesseInventory;
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Long getIdMasterApparato() {
		return this.idMasterApparato;
	}

	public void setIdMasterApparato(Long idMasterApparato) {
		this.idMasterApparato = idMasterApparato;
	}

	public Long getIdMasterLinea() {
		return this.idMasterLinea;
	}

	public void setIdMasterLinea(Long idMasterLinea) {
		this.idMasterLinea = idMasterLinea;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Linea getLinea() {
		return linea;
	}

	public void setLinea(Linea linea) {
		this.linea = linea;
	}

}