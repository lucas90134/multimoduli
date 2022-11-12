package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the asset database table.
 * 
 */
@Entity
@Table(name = "asset" , uniqueConstraints = @UniqueConstraint(columnNames = "serial_number"))
@NamedQuery(name="Asset.findAll", query="SELECT a FROM Asset a")
public class Asset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idAsset")
	@SequenceGenerator(name="idAsset", sequenceName = "asset_id_asset_seq", allocationSize=1)
	@Column(name="id_asset")
	private Long idAsset;

	@JsonIgnore
	@OneToMany(mappedBy = "asset", fetch = FetchType.LAZY)
	private List<SupportAsset> supportAssets;
	
	@JsonIgnore
	@OneToMany(mappedBy = "asset", fetch = FetchType.LAZY)
	private List<ViaviObserver> viaviObserver;
	
	@Column(name="cost_center")
	private String costCenter;

	@Column(name="date_insert")
	private Date dateInsert;

	private String father;
	
	@Transient
	private String pippo;
	
//	@JsonIgnore
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "father" , referencedColumnName = "serial_number" ,insertable=false,updatable=false)
//	private Asset assetFather;

	private Boolean haschild;

	private String hostname;

	@Column(name="id_asset_replaced")
	private String idAssetReplaced;

//	@JsonIgnore
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_asset_replaced",referencedColumnName = "serial_number",insertable=false,updatable=false)
//	private Asset assetReplaced;
	

	@Column(name="id_legal_entity")
	private Long idLegalEntity;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_legal_entity",insertable=false,updatable=false)
	private LegalEntity legalEntity;
	
	@Column(name="id_location")
	private Long idLocation;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_location",insertable=false,updatable=false)
	private LocationInfrastructure location;

	@Column(name="id_maintainer")
	private Long idMaintainer;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_maintainer",insertable=false,updatable=false)
	private Maintainer maintainer;

	@Column(name="id_owner")
	private Long idOwner;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_owner",insertable=false,updatable=false)
	private Owner owner;

	@Column(name="id_part_number")
	private Long idPartNumber;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_part_number",insertable=false,updatable=false)
	private PartNumber partNumber;

	@Column(name="id_service")
	private Long idService;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_service",insertable=false,updatable=false)
	private Services service;

	@Column(name="id_vendor")
	private Long idVendor;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_vendor",insertable=false,updatable=false)
	private Vendor vendor;

	@Column(name="id_vendor_accountid")
	private Long idVendorAccountid;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_vendor_accountid",insertable=false,updatable=false)
	private VendorAccountid vendorAccountid;

	@Column(name="mgt_ip")
	private String mgtIp;

	private String note;

	private String oda;

	@Column(name="os_version")
	private String osVersion;

	private Integer psu;

	@Column(name="purchase_cost")
	private String purchaseCost;
	
	@Column(name="purchase_cost_valuta")
	private Character purchaseCostValuta;

	@Column(name="rack_name")
	private String rackName;

	private String rda;

	@Column(name="room_name")
	private String roomName;

	private Integer ru;

	@Column(name="sap_id")
	private String sapId;

	@Column(name="serial_number")
	private String serialNumber;

	@Column(name="user_mod")
	private String userMod;

	@Column(name="environment")
	private String environment;

	public Asset() {
	}

	public Long getIdAsset() {
		return idAsset;
	}

	public void setIdAsset(Long idAsset) {
		this.idAsset = idAsset;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public Date getDateInsert() {
		return dateInsert;
	}

	public void setDateInsert(Date dateInsert) {
		this.dateInsert = dateInsert;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public Boolean getHaschild() {
		return haschild;
	}

	public void setHaschild(Boolean haschild) {
		this.haschild = haschild;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getIdAssetReplaced() {
		return idAssetReplaced;
	}

	public void setIdAssetReplaced(String idAssetReplaced) {
		this.idAssetReplaced = idAssetReplaced;
	}

	public Long getIdLegalEntity() {
		return idLegalEntity;
	}

	public void setIdLegalEntity(Long idLegalEntity) {
		this.idLegalEntity = idLegalEntity;
	}

	public LegalEntity getLegalEntity() {
		return legalEntity;
	}

	public void setLegalEntity(LegalEntity legalEntity) {
		this.legalEntity = legalEntity;
	}

	public Long getIdLocation() {
		return idLocation;
	}

	public void setIdLocation(Long idLocation) {
		this.idLocation = idLocation;
	}

	public LocationInfrastructure getLocation() {
		return location;
	}

	public void setLocation(LocationInfrastructure location) {
		this.location = location;
	}

	public Long getIdMaintainer() {
		return idMaintainer;
	}

	public void setIdMaintainer(Long idMaintainer) {
		this.idMaintainer = idMaintainer;
	}

	public Maintainer getMaintainer() {
		return maintainer;
	}

	public void setMaintainer(Maintainer maintainer) {
		this.maintainer = maintainer;
	}

	public Long getIdOwner() {
		return idOwner;
	}

	public void setIdOwner(Long idOwner) {
		this.idOwner = idOwner;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Long getIdPartNumber() {
		return idPartNumber;
	}

	public void setIdPartNumber(Long idPartNumber) {
		this.idPartNumber = idPartNumber;
	}

	public PartNumber getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(PartNumber partNumber) {
		this.partNumber = partNumber;
	}

	public Long getIdService() {
		return idService;
	}

	public void setIdService(Long idService) {
		this.idService = idService;
	}

	public Services getService() {
		return service;
	}

	public void setService(Services service) {
		this.service = service;
	}

	public Long getIdVendor() {
		return idVendor;
	}

	public void setIdVendor(Long idVendor) {
		this.idVendor = idVendor;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public Long getIdVendorAccountid() {
		return idVendorAccountid;
	}

	public void setIdVendorAccountid(Long idVendorAccountid) {
		this.idVendorAccountid = idVendorAccountid;
	}

	public VendorAccountid getVendorAccountid() {
		return vendorAccountid;
	}

	public void setVendorAccountid(VendorAccountid vendorAccountid) {
		this.vendorAccountid = vendorAccountid;
	}

	public String getMgtIp() {
		return mgtIp;
	}

	public void setMgtIp(String mgtIp) {
		this.mgtIp = mgtIp;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getOda() {
		return oda;
	}

	public void setOda(String oda) {
		this.oda = oda;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public Integer getPsu() {
		return psu;
	}

	public void setPsu(Integer psu) {
		this.psu = psu;
	}

	public String getPurchaseCost() {
		return purchaseCost;
	}

	public void setPurchaseCost(String purchaseCost) {
		this.purchaseCost = purchaseCost;
	}

	public String getRackName() {
		return rackName;
	}

	public void setRackName(String rackName) {
		this.rackName = rackName;
	}

	public String getRda() {
		return rda;
	}

	public void setRda(String rda) {
		this.rda = rda;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Integer getRu() {
		return ru;
	}

	public void setRu(Integer ru) {
		this.ru = ru;
	}

	public String getSapId() {
		return sapId;
	}

	public void setSapId(String sapId) {
		this.sapId = sapId;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getUserMod() {
		return userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public List<SupportAsset> getSupportAssets() {
		return supportAssets;
	}

	public void setSupportAssets(List<SupportAsset> supportAssets) {
		this.supportAssets = supportAssets;
	}

	public List<ViaviObserver> getViaviObserver() {
		return viaviObserver;
	}

	public void setViaviObserver(List<ViaviObserver> viaviObserver) {
		this.viaviObserver = viaviObserver;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

//	public Asset getAssetFather() {
//		return assetFather;
//	}
//
//	public void setAssetFather(Asset assetFather) {
//		this.assetFather = assetFather;
//	}
//
//	public Asset getAssetReplaced() {
//		return assetReplaced;
//	}
//
//	public void setAssetReplaced(Asset assetReplaced) {
//		this.assetReplaced = assetReplaced;
//	}

	public Character getPurchaseCostValuta() {
		return purchaseCostValuta;
	}

	public void setPurchaseCostValuta(Character purchaseCostValuta) {
		this.purchaseCostValuta = purchaseCostValuta;
	}

}