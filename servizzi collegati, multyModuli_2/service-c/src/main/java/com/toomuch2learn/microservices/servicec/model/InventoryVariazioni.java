package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the inventory_variazioni database table.
 * 
 */
@Entity
@Table(name="inventory_variazioni")
@NamedQuery(name="InventoryVariazioni.findAll", query="SELECT t FROM InventoryVariazioni t")
public class InventoryVariazioni implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idInventoryVariazioni")
	@SequenceGenerator(name="idInventoryVariazioni", sequenceName = "inventory_variazioni_id_inventory_variazioni_seq", allocationSize=1)
	@Column(name="id_inventory_variazioni")
	private Long idInventoryVariazioni;

	@Column(name="blob_show_config")
	private String blobShowConfig;

	@Column(name="data_variazione")
	private Date dataVariazione;

	@Column(name="id_master_apparato")
	private Long idMasterApparato;

	@Column(name="id_tiesse_inventory_tipo_variazione")
	private Long idTiesseInventoryTipoVariazione;

	private String ios;

	@Column(name="ip_gprs_mi_inventory")
	private String ipGprsMiInventory;

	@Column(name="ip_gprs_rm_inventory")
	private String ipGprsRmInventory;

	@Column(name="ip_gprs_vodafone_inventory")
	private String ipGprsVodafoneInventory;

	@Column(name="ip_gprs_wind_inventory")
	private String ipGprsWindInventory;

	@Column(name="ip_lan_inventory")
	private String ipLanInventory;

	@Column(name="ip_lan_remota_inventory")
	private String ipLanRemotaInventory;

	@Column(name="ip_lan_remota_router_inventory")
	private String ipLanRemotaRouterInventory;

	@Column(name="ip_lan_remota_router_inventory_2")
	private String ipLanRemotaRouterInventory2;

	@Column(name="ip_lan_router_inventory")
	private String ipLanRouterInventory;

	@Column(name="ip_lan_router_virtual_inventory")
	private String ipLanRouterVirtualInventory;

	@Column(name="ip_vrrp_inventory")
	private String ipVrrpInventory;

	@Column(name="ip_wan_router_inventory")
	private String ipWanRouterInventory;

	@Column(name="ip_wan_router_inventory_2")
	private String ipWanRouterInventory2;

	@Column(name="mac_address")
	private String macAddress;

	private String marca;

	private String matricola;

	private String modello;

	@Column(name="numero_inventory")
	private String numeroInventory;

	@Column(name="serial_number")
	private String serialNumber;

	@Column(name="vpi_vci_inventory")
	private String vpiVciInventory;

	@Column(name="vpi_vci_inventory_2")
	private String vpiVciInventory2;

	public InventoryVariazioni() {
	}

	public Long getIdInventoryVariazioni() {
		return this.idInventoryVariazioni;
	}

	public void setIdInventoryVariazioni(Long idInventoryVariazioni) {
		this.idInventoryVariazioni = idInventoryVariazioni;
	}

	public String getBlobShowConfig() {
		return this.blobShowConfig;
	}

	public void setBlobShowConfig(String blobShowConfig) {
		this.blobShowConfig = blobShowConfig;
	}

	public Date getDataVariazione() {
		return this.dataVariazione;
	}

	public void setDataVariazione(Date dataVariazione) {
		this.dataVariazione = dataVariazione;
	}

	public Long getIdMasterApparato() {
		return this.idMasterApparato;
	}

	public void setIdMasterApparato(Long idMasterApparato) {
		this.idMasterApparato = idMasterApparato;
	}

	public Long getIdTiesseInventoryTipoVariazione() {
		return this.idTiesseInventoryTipoVariazione;
	}

	public void setIdTiesseInventoryTipoVariazione(Long idTiesseInventoryTipoVariazione) {
		this.idTiesseInventoryTipoVariazione = idTiesseInventoryTipoVariazione;
	}

	public String getIos() {
		return this.ios;
	}

	public void setIos(String ios) {
		this.ios = ios;
	}

	public String getIpGprsMiInventory() {
		return this.ipGprsMiInventory;
	}

	public void setIpGprsMiInventory(String ipGprsMiInventory) {
		this.ipGprsMiInventory = ipGprsMiInventory;
	}

	public String getIpGprsRmInventory() {
		return this.ipGprsRmInventory;
	}

	public void setIpGprsRmInventory(String ipGprsRmInventory) {
		this.ipGprsRmInventory = ipGprsRmInventory;
	}

	public String getIpGprsVodafoneInventory() {
		return this.ipGprsVodafoneInventory;
	}

	public void setIpGprsVodafoneInventory(String ipGprsVodafoneInventory) {
		this.ipGprsVodafoneInventory = ipGprsVodafoneInventory;
	}

	public String getIpGprsWindInventory() {
		return this.ipGprsWindInventory;
	}

	public void setIpGprsWindInventory(String ipGprsWindInventory) {
		this.ipGprsWindInventory = ipGprsWindInventory;
	}

	public String getIpLanInventory() {
		return this.ipLanInventory;
	}

	public void setIpLanInventory(String ipLanInventory) {
		this.ipLanInventory = ipLanInventory;
	}

	public String getIpLanRemotaInventory() {
		return this.ipLanRemotaInventory;
	}

	public void setIpLanRemotaInventory(String ipLanRemotaInventory) {
		this.ipLanRemotaInventory = ipLanRemotaInventory;
	}

	public String getIpLanRemotaRouterInventory() {
		return this.ipLanRemotaRouterInventory;
	}

	public void setIpLanRemotaRouterInventory(String ipLanRemotaRouterInventory) {
		this.ipLanRemotaRouterInventory = ipLanRemotaRouterInventory;
	}

	public String getIpLanRemotaRouterInventory2() {
		return this.ipLanRemotaRouterInventory2;
	}

	public void setIpLanRemotaRouterInventory2(String ipLanRemotaRouterInventory2) {
		this.ipLanRemotaRouterInventory2 = ipLanRemotaRouterInventory2;
	}

	public String getIpLanRouterInventory() {
		return this.ipLanRouterInventory;
	}

	public void setIpLanRouterInventory(String ipLanRouterInventory) {
		this.ipLanRouterInventory = ipLanRouterInventory;
	}

	public String getIpLanRouterVirtualInventory() {
		return this.ipLanRouterVirtualInventory;
	}

	public void setIpLanRouterVirtualInventory(String ipLanRouterVirtualInventory) {
		this.ipLanRouterVirtualInventory = ipLanRouterVirtualInventory;
	}

	public String getIpVrrpInventory() {
		return this.ipVrrpInventory;
	}

	public void setIpVrrpInventory(String ipVrrpInventory) {
		this.ipVrrpInventory = ipVrrpInventory;
	}

	public String getIpWanRouterInventory() {
		return this.ipWanRouterInventory;
	}

	public void setIpWanRouterInventory(String ipWanRouterInventory) {
		this.ipWanRouterInventory = ipWanRouterInventory;
	}

	public String getIpWanRouterInventory2() {
		return this.ipWanRouterInventory2;
	}

	public void setIpWanRouterInventory2(String ipWanRouterInventory2) {
		this.ipWanRouterInventory2 = ipWanRouterInventory2;
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getModello() {
		return this.modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getNumeroInventory() {
		return this.numeroInventory;
	}

	public void setNumeroInventory(String numeroInventory) {
		this.numeroInventory = numeroInventory;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getVpiVciInventory() {
		return this.vpiVciInventory;
	}

	public void setVpiVciInventory(String vpiVciInventory) {
		this.vpiVciInventory = vpiVciInventory;
	}

	public String getVpiVciInventory2() {
		return this.vpiVciInventory2;
	}

	public void setVpiVciInventory2(String vpiVciInventory2) {
		this.vpiVciInventory2 = vpiVciInventory2;
	}

}