package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the line_infrastructure database table.
 * 
 */
@Entity
@Table(name="line_infrastructure")
@NamedQuery(name="LineInfrastructure.findAll", query="SELECT l FROM LineInfrastructure l")
public class LineInfrastructure implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idLine")
	@SequenceGenerator(name="idLine", sequenceName = "line_infrastructure_id_line_seq", allocationSize=1)
	@Column(name="id_line")
	private Long idLine;

	@Column(name="annual_cost")
	private BigDecimal annualCost;

	@Column(name="expiration_date")
	private Date expirationDate;

	@Column(name="id_line_status")
	private Long idLineStatus;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_line_status",insertable=false,updatable=false)
	private StatoLinea statoLinea;

	@Column(name="id_location_1")
	private Long idLocation1;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_location_1",insertable=false,updatable=false)
	private LocationInfrastructure location1;

	@Column(name="id_location_2")
	private Long idLocation2;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_location_2",insertable=false,updatable=false)
	private LocationInfrastructure location2;

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

	@Column(name="id_profile")
	private Long idProfile;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_profile",insertable=false,updatable=false)
	private Profile profile;

	@Column(name="id_service")
	private Long idService;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_service",insertable=false,updatable=false)
	private Services service;

	@Column(name="id_technology")
	private Long idTechnology;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_technology",insertable=false,updatable=false)
	private Technology technology;


	@Column(name="line_status_date")
	private Date lineStatusDate;

	@Column(name="network_equipment")
	private String networkEquipment;

	private String note;

	private String oda;

	private String rda;

	@Column(name="secret_cod_on_bill")
	private String secretCodOnBill;

	@Column(name="tax_code")
	private String taxCode;

	private String td;

	@Column(name="una_tantum")
	private BigDecimal unaTantum;

	@Column(name="user_mod")
	private String userMod;

	@Column(name="vanue_on_bill")
	private String vanueOnBill;

	public LineInfrastructure() {
	}

	public Long getIdLine() {
		return idLine;
	}

	public void setIdLine(Long idLine) {
		this.idLine = idLine;
	}

	public BigDecimal getAnnualCost() {
		return annualCost;
	}

	public void setAnnualCost(BigDecimal annualCost) {
		this.annualCost = annualCost;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Long getIdLineStatus() {
		return idLineStatus;
	}

	public void setIdLineStatus(Long idLineStatus) {
		this.idLineStatus = idLineStatus;
	}

	public Long getIdLocation1() {
		return idLocation1;
	}

	public void setIdLocation1(Long idLocation1) {
		this.idLocation1 = idLocation1;
	}

	public LocationInfrastructure getLocation1() {
		return location1;
	}

	public void setLocation1(LocationInfrastructure location1) {
		this.location1 = location1;
	}

	public Long getIdLocation2() {
		return idLocation2;
	}

	public void setIdLocation2(Long idLocation2) {
		this.idLocation2 = idLocation2;
	}

	public LocationInfrastructure getLocation2() {
		return location2;
	}

	public void setLocation2(LocationInfrastructure location2) {
		this.location2 = location2;
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

	public Long getIdProfile() {
		return idProfile;
	}

	public void setIdProfile(Long idProfile) {
		this.idProfile = idProfile;
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

	public Long getIdTechnology() {
		return idTechnology;
	}

	public void setIdTechnology(Long idTechnology) {
		this.idTechnology = idTechnology;
	}

	public Technology getTechnology() {
		return technology;
	}

	public void setTechnology(Technology technology) {
		this.technology = technology;
	}

	public Date getLineStatusDate() {
		return lineStatusDate;
	}

	public void setLineStatusDate(Date lineStatusDate) {
		this.lineStatusDate = lineStatusDate;
	}

	public String getNetworkEquipment() {
		return networkEquipment;
	}

	public void setNetworkEquipment(String networkEquipment) {
		this.networkEquipment = networkEquipment;
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

	public String getRda() {
		return rda;
	}

	public void setRda(String rda) {
		this.rda = rda;
	}

	public String getSecretCodOnBill() {
		return secretCodOnBill;
	}

	public void setSecretCodOnBill(String secretCodOnBill) {
		this.secretCodOnBill = secretCodOnBill;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getTd() {
		return td;
	}

	public void setTd(String td) {
		this.td = td;
	}

	public BigDecimal getUnaTantum() {
		return unaTantum;
	}

	public void setUnaTantum(BigDecimal unaTantum) {
		this.unaTantum = unaTantum;
	}

	public String getUserMod() {
		return userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public String getVanueOnBill() {
		return vanueOnBill;
	}

	public void setVanueOnBill(String vanueOnBill) {
		this.vanueOnBill = vanueOnBill;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public StatoLinea getStatoLinea() {
		return statoLinea;
	}

	public void setStatoLinea(StatoLinea statoLinea) {
		this.statoLinea = statoLinea;
	}
}