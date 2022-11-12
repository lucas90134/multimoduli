package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the location_responsabile_business database table.
 * 
 */
@Entity
@Table(name="location_responsabile_business")
@NamedQuery(name="LocationResponsabileBusiness.findAll", query="SELECT l FROM LocationResponsabileBusiness l")
public class LocationResponsabileBusiness implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="codice_sede_sed")
	private String codiceSedeSed;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idLocationResponsabileBusiness")
	@SequenceGenerator(name="idLocationResponsabileBusiness", sequenceName = "location_responsabile_busines_id_location_responsabile_busi_seq", allocationSize=1)
	@Column(name="id_location_responsabile_business")
	private Long idLocationResponsabileBusiness;

	@Column(name="id_location_sed")
	private Long idLocationSed;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_location_sed",insertable=false,updatable=false)
	private Location location;

	@Column(name="responsabile_sede")
	private String responsabileSede;

	public LocationResponsabileBusiness() {
	}

	public String getCodiceSedeSed() {
		return this.codiceSedeSed;
	}

	public void setCodiceSedeSed(String codiceSedeSed) {
		this.codiceSedeSed = codiceSedeSed;
	}

	public Long getIdLocationResponsabileBusiness() {
		return this.idLocationResponsabileBusiness;
	}

	public void setIdLocationResponsabileBusiness(Long idLocationResponsabileBusiness) {
		this.idLocationResponsabileBusiness = idLocationResponsabileBusiness;
	}

	public Long getIdLocationSed() {
		return this.idLocationSed;
	}

	public void setIdLocationSed(Long idLocationSed) {
		this.idLocationSed = idLocationSed;
	}

	public String getResponsabileSede() {
		return this.responsabileSede;
	}

	public void setResponsabileSede(String responsabileSede) {
		this.responsabileSede = responsabileSede;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}