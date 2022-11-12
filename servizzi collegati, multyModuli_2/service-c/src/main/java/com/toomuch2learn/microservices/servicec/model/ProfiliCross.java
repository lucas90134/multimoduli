package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;
/**
 * The persistent class for the profili_cross database table.
 * 
 */
@Entity
@Table(name="profili_cross")
@NamedQuery(name="ProfiliCross.findAll", query="SELECT p FROM ProfiliCross p")
public class ProfiliCross implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idProfiliCross")
	@SequenceGenerator(name="idProfiliCross", sequenceName = "profili_cross_id_profili_cross_seq", allocationSize=1)
	@Column(name="id_profili_cross")
	private Long idProfiliCross;

	@Column(name="id_profilo_commerciale")
	private Long idProfiloCommerciale;

	@Column(name="id_profilo_banda")
	private Long idProfiloBanda;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_profilo_commerciale",insertable=false,updatable=false)
	private ProfiloCommerciale profiloCommerciale;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_profilo_banda",insertable=false,updatable=false)
	private ProfiloBanda profiloBanda;
	
	public ProfiliCross() {
	}

	public Long getIdProfiliCross() {
		return this.idProfiliCross;
	}

	public void setIdProfiliCross(Long idProfiliCross) {
		this.idProfiliCross = idProfiliCross;
	}

	public Long getIdProfiloCommerciale() {
		return idProfiloCommerciale;
	}

	public void setIdProfiloCommerciale(Long idProfiloCommerciale) {
		this.idProfiloCommerciale = idProfiloCommerciale;
	}

	public Long getIdProfiloBanda() {
		return idProfiloBanda;
	}

	public void setIdProfiloBanda(Long idProfiloBanda) {
		this.idProfiloBanda = idProfiloBanda;
	}

	public ProfiloCommerciale getProfiloCommerciale() {
		return profiloCommerciale;
	}

	public void setProfiloCommerciale(ProfiloCommerciale profiloCommerciale) {
		this.profiloCommerciale = profiloCommerciale;
	}

	public ProfiloBanda getProfiloBanda() {
		return profiloBanda;
	}

	public void setProfiloBanda(ProfiloBanda profiloBanda) {
		this.profiloBanda = profiloBanda;
	}

}