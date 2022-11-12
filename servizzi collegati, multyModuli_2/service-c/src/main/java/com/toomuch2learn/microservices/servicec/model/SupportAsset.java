package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the support_asset database table.
 * 
 */
@Entity
@Table(name="support_asset")
@NamedQuery(name="SupportAsset.findAll", query="SELECT s FROM SupportAsset s")
public class SupportAsset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSupportAsset")
	@SequenceGenerator(name="idSupportAsset", sequenceName = "support_asset_id_support_asset_seq", allocationSize=1)
	@Column(name="id_support_asset")
	private Long idSupportAsset;

	@Column(name="date_insert")
	private Date dateInsert;

	@Column(name="end_date_support")
	private Date endDateSupport;

	@Column(name="id_asset")
	private Long idAsset;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_asset",insertable=false,updatable=false)
	private Asset asset;

	@Column(name="id_support")
	private Long idSupport;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_support",insertable=false,updatable=false)
	private Support support;

	private String note;

	private Integer oda;

	@Column(name="service_cost")
	private String serviceCost;

	@Column(name="service_cost_valuta")
	private String serviceCostValuta;
	
	@Column(name="service_end_date")
	private Date serviceEndDate;

	@Column(name="service_start_date")
	private Date serviceStartDate;

	@Column(name="start_date_support")
	private Date startDateSupport;

	@Column(name="support_cost")
	private String supportCost;

	@Column(name="support_cost_valuta")
	private String supportCostValuta;

	@Column(name="user_mod")
	private String userMod;

	public SupportAsset() {
	}

	public Long getIdSupportAsset() {
		return idSupportAsset;
	}

	public void setIdSupportAsset(Long idSupportAsset) {
		this.idSupportAsset = idSupportAsset;
	}

	public Date getDateInsert() {
		return dateInsert;
	}

	public void setDateInsert(Date dateInsert) {
		this.dateInsert = dateInsert;
	}

	public Date getEndDateSupport() {
		return endDateSupport;
	}

	public void setEndDateSupport(Date endDateSupport) {
		this.endDateSupport = endDateSupport;
	}

	public Long getIdAsset() {
		return idAsset;
	}

	public void setIdAsset(Long idAsset) {
		this.idAsset = idAsset;
	}

	public Long getIdSupport() {
		return idSupport;
	}

	public void setIdSupport(Long idSupport) {
		this.idSupport = idSupport;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getOda() {
		return oda;
	}

	public void setOda(Integer oda) {
		this.oda = oda;
	}

	public String getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(String serviceCost) {
		this.serviceCost = serviceCost;
	}

	public Date getServiceEndDate() {
		return serviceEndDate;
	}

	public void setServiceEndDate(Date serviceEndDate) {
		this.serviceEndDate = serviceEndDate;
	}

	public Date getServiceStartDate() {
		return serviceStartDate;
	}

	public void setServiceStartDate(Date serviceStartDate) {
		this.serviceStartDate = serviceStartDate;
	}

	public Date getStartDateSupport() {
		return startDateSupport;
	}

	public void setStartDateSupport(Date startDateSupport) {
		this.startDateSupport = startDateSupport;
	}

	public String getSupportCost() {
		return supportCost;
	}

	public void setSupportCost(String supportCost) {
		this.supportCost = supportCost;
	}

	public String getUserMod() {
		return userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Support getSupport() {
		return support;
	}

	public void setSupport(Support support) {
		this.support = support;
	}

	public String getServiceCostValuta() {
		return serviceCostValuta;
	}

	public void setServiceCostValuta(String serviceCostValuta) {
		this.serviceCostValuta = serviceCostValuta;
	}

	public String getSupportCostValuta() {
		return supportCostValuta;
	}

	public void setSupportCostValuta(String supportCostValuta) {
		this.supportCostValuta = supportCostValuta;
	}
	
}