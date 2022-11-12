package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
/**
 * The persistent class for the babel_switch_inventory_indirizzi_output database table.
 * 
 */
@Entity
@Table(name="babel_switch_inventory_indirizzi_output")
@NamedQuery(name="BabelSwitchInventoryIndirizziOutput.findAll", query="SELECT b FROM BabelSwitchInventoryIndirizziOutput b")
public class BabelSwitchInventoryIndirizziOutput implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idBabelSwitchInventoryIndirizziOutput")
	@SequenceGenerator(name="idBabelSwitchInventoryIndirizziOutput", sequenceName = "babel_switch_inventory_indiri_id_babel_switch_inventory_ind_seq", allocationSize=1)
	@Column(name="id_babel_switch_inventory_indirizzi_output")
	private Long idBabelSwitchInventoryIndirizziOutput;

	@Column(name="codice_cliente")
	private String codiceCliente;

	private String configurazione;

	@Column(name="data_scansione")
	private Date dataScansione;

	@Column(name="flag_in_configurazione")
	private Boolean flagInConfigurazione;

	@Column(name="host_name")
	private String hostName;

	@Column(name="id_inventory")
	private Long idInventory;

	@Column(name="id_sede")
	private Long idSede;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_sede",insertable=false,updatable=false)    
	private Sedi sede;

	@Column(name="ip_contatto")
	private String ipContatto;

	@Column(name="ip_lan")
	private String ipLan;

	@Column(name="mac_address")
	private String macAddress;

	private Boolean manuale;

	@Column(name="serial_number")
	private String serialNumber;

	@Column(name="subnet_mask_lan")
	private String subnetMaskLan;

	@Column(name="sys_desc")
	private String sysDesc;

	@Column(name="user_mod")
	private String userMod;

	@Column(name="versione_hw")
	private String versioneHw;

	@Column(name="versione_sw")
	private String versioneSw;

	public BabelSwitchInventoryIndirizziOutput() {
	}

	public Long getIdBabelSwitchInventoryIndirizziOutput() {
		return this.idBabelSwitchInventoryIndirizziOutput;
	}

	public void setIdBabelSwitchInventoryIndirizziOutput(Long idBabelSwitchInventoryIndirizziOutput) {
		this.idBabelSwitchInventoryIndirizziOutput = idBabelSwitchInventoryIndirizziOutput;
	}

	public String getCodiceCliente() {
		return this.codiceCliente;
	}

	public void setCodiceCliente(String codiceCliente) {
		this.codiceCliente = codiceCliente;
	}

	public String getConfigurazione() {
		return this.configurazione;
	}

	public void setConfigurazione(String configurazione) {
		this.configurazione = configurazione;
	}

	public Date getDataScansione() {
		return this.dataScansione;
	}

	public void setDataScansione(Date dataScansione) {
		this.dataScansione = dataScansione;
	}

	public Boolean getFlagInConfigurazione() {
		return this.flagInConfigurazione;
	}

	public void setFlagInConfigurazione(Boolean flagInConfigurazione) {
		this.flagInConfigurazione = flagInConfigurazione;
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public Long getIdInventory() {
		return this.idInventory;
	}

	public void setIdInventory(Long idInventory) {
		this.idInventory = idInventory;
	}

	public Long getIdSede() {
		return this.idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public String getIpContatto() {
		return this.ipContatto;
	}

	public void setIpContatto(String ipContatto) {
		this.ipContatto = ipContatto;
	}

	public String getIpLan() {
		return this.ipLan;
	}

	public void setIpLan(String ipLan) {
		this.ipLan = ipLan;
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public Boolean getManuale() {
		return this.manuale;
	}

	public void setManuale(Boolean manuale) {
		this.manuale = manuale;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSubnetMaskLan() {
		return this.subnetMaskLan;
	}

	public void setSubnetMaskLan(String subnetMaskLan) {
		this.subnetMaskLan = subnetMaskLan;
	}

	public String getSysDesc() {
		return this.sysDesc;
	}

	public void setSysDesc(String sysDesc) {
		this.sysDesc = sysDesc;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public String getVersioneHw() {
		return this.versioneHw;
	}

	public void setVersioneHw(String versioneHw) {
		this.versioneHw = versioneHw;
	}

	public String getVersioneSw() {
		return this.versioneSw;
	}

	public void setVersioneSw(String versioneSw) {
		this.versioneSw = versioneSw;
	}

	public Sedi getSede() {
		return sede;
	}

	public void setSede(Sedi sede) {
		this.sede = sede;
	}

}