package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the inventory_configurazione database table.
 * 
 */
@Entity
@Table(name="inventory_configurazione")
@NamedQuery(name="InventoryConfigurazione.findAll", query="SELECT i FROM InventoryConfigurazione i")
public class InventoryConfigurazione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idInventoryConfigurazione")
	@SequenceGenerator(name="idInventoryConfigurazione", sequenceName = "inventory_configurazione_id_inventory_configurazione_seq", allocationSize=1)
	@Column(name="id_inventory_configurazione")
	private Long idInventoryConfigurazione;

	@Column(name="blob_show_config")
	private String blobShowConfig;

	@Column(name="id_master_apparato")
	private Long idMasterApparato;

	public InventoryConfigurazione() {
	}

	public Long getIdInventoryConfigurazione() {
		return this.idInventoryConfigurazione;
	}

	public void setIdInventoryConfigurazione(Long idInventoryConfigurazione) {
		this.idInventoryConfigurazione = idInventoryConfigurazione;
	}

	public String getBlobShowConfig() {
		return this.blobShowConfig;
	}

	public void setBlobShowConfig(String blobShowConfig) {
		this.blobShowConfig = blobShowConfig;
	}

	public Long getIdMasterApparato() {
		return this.idMasterApparato;
	}

	public void setIdMasterApparato(Long idMasterApparato) {
		this.idMasterApparato = idMasterApparato;
	}

}