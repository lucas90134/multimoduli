package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;
/**
 * The persistent class for the inventory_storico_linee database table.
 * 
 */
@Entity
@Table(name="inventory_storico_linee")
@NamedQuery(name="InventoryStoricoLinee.findAll", query="SELECT t FROM InventoryStoricoLinee t")
public class InventoryStoricoLinee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idInventoryStoricoLinee")
	@SequenceGenerator(name="idInventoryStoricoLinee", sequenceName = "inventory_storico_linee_id_inventory_storico_linee_seq", allocationSize=1)
	@Column(name="id_inventory_storico_linee")
	private Long idInventoryStoricoLinee;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="id_linea_storicizzata")
	private Long idLineaStoricizzata;

	@Column(name="stato_linea")
	private String statoLinea;

	@Column(name="tipo_linea")
	private String tipoLinea;

	public InventoryStoricoLinee() {
	}

	public Long getIdInventoryStoricoLinee() {
		return this.idInventoryStoricoLinee;
	}

	public void setIdInventoryStoricoLinee(Long idInventoryStoricoLinee) {
		this.idInventoryStoricoLinee = idInventoryStoricoLinee;
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Long getIdLineaStoricizzata() {
		return this.idLineaStoricizzata;
	}

	public void setIdLineaStoricizzata(Long idLineaStoricizzata) {
		this.idLineaStoricizzata = idLineaStoricizzata;
	}

	public String getStatoLinea() {
		return this.statoLinea;
	}

	public void setStatoLinea(String statoLinea) {
		this.statoLinea = statoLinea;
	}

	public String getTipoLinea() {
		return this.tipoLinea;
	}

	public void setTipoLinea(String tipoLinea) {
		this.tipoLinea = tipoLinea;
	}

}