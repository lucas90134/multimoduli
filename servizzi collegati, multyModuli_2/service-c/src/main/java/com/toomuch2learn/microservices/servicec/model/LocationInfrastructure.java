package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
/**
 * The persistent class for the location_infrastructure database table.
 * 
 */
@Entity
@Table(name="location_infrastructure")
@NamedQuery(name="LocationInfrastructure.findAll", query="SELECT l FROM LocationInfrastructure l")
public class LocationInfrastructure implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idLocation")
	@SequenceGenerator(name="idLocation", sequenceName = "location_infrastructure_id_location_seq", allocationSize=1)
	@Column(name="id_location")
	private Long idLocation;

	@JsonIgnore
	@OneToMany(mappedBy = "location1", fetch = FetchType.LAZY)
	private List<LineInfrastructure> lineInfrastructure1;

	@JsonIgnore
	@OneToMany(mappedBy = "location2", fetch = FetchType.LAZY)
	private List<LineInfrastructure> lineInfrastructure2;
	
	private String address;

	private String contact;

	private String country;

	private String description;

	private String email;

	private String location;

	private String mobile;

	private String note;

	private String phone;

	@Column(name="post_code")
	private String postCode;

	private String province;

	private String recipient;

	@Column(name="shipping_address")
	private String shippingAddress;

	@Column(name="shipping_notes")
	private String shippingNotes;

	private String town;

	@Column(name="user_mod")
	private String userMod;

	public LocationInfrastructure() {
	}

	public Long getIdLocation() {
		return this.idLocation;
	}

	public void setIdLocation(Long idLocation) {
		this.idLocation = idLocation;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getRecipient() {
		return this.recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getShippingAddress() {
		return this.shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getShippingNotes() {
		return this.shippingNotes;
	}

	public void setShippingNotes(String shippingNotes) {
		this.shippingNotes = shippingNotes;
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public List<LineInfrastructure> getLineInfrastructure1() {
		return lineInfrastructure1;
	}

	public void setLineInfrastructure1(List<LineInfrastructure> lineInfrastructure1) {
		this.lineInfrastructure1 = lineInfrastructure1;
	}

	public List<LineInfrastructure> getLineInfrastructure2() {
		return lineInfrastructure2;
	}

	public void setLineInfrastructure2(List<LineInfrastructure> lineInfrastructure2) {
		this.lineInfrastructure2 = lineInfrastructure2;
	}

}