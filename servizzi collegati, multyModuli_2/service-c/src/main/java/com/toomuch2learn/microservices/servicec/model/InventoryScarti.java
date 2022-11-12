package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the inventory_scarti database table.
 * 
 */
@Entity
@Table(name="inventory_scarti")
@NamedQuery(name="InventoryScarti.findAll", query="SELECT t FROM InventoryScarti t")
public class InventoryScarti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idInventoryScarti")
	@SequenceGenerator(name="idInventoryScarti", sequenceName = "inventory_scarti_id_inventory_scarti_seq", allocationSize=1)
	@Column(name="id_inventory_scarti")
	private Long idInventoryScarti;

	private String hostname;

	@Column(name="ip_gprs")
	private String ipGprs;

	@Column(name="ip_loopback")
	private String ipLoopback;

	@Column(name="ip_wan_router")
	private String ipWanRouter;

	@Column(name="mac_address")
	private String macAddress;

	@Column(name="motivo_scarto")
	private String motivoScarto;

	public InventoryScarti() {
	}

	public Long getIdInventoryScarti() {
		return this.idInventoryScarti;
	}

	public void setIdInventoryScarti(Long idInventoryScarti) {
		this.idInventoryScarti = idInventoryScarti;
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getIpGprs() {
		return this.ipGprs;
	}

	public void setIpGprs(String ipGprs) {
		this.ipGprs = ipGprs;
	}

	public String getIpLoopback() {
		return this.ipLoopback;
	}

	public void setIpLoopback(String ipLoopback) {
		this.ipLoopback = ipLoopback;
	}

	public String getIpWanRouter() {
		return this.ipWanRouter;
	}

	public void setIpWanRouter(String ipWanRouter) {
		this.ipWanRouter = ipWanRouter;
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getMotivoScarto() {
		return this.motivoScarto;
	}

	public void setMotivoScarto(String motivoScarto) {
		this.motivoScarto = motivoScarto;
	}

}