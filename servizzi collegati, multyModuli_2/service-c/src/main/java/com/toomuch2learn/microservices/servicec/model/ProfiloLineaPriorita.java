package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the profilo_linea_priorita database table.
 * 
 */
@Entity
@Table(name="profilo_linea_priorita")
@NamedQuery(name="ProfiloLineaPriorita.findAll", query="SELECT p FROM ProfiloLineaPriorita p")
public class ProfiloLineaPriorita implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idProfiloLineaPriorita")
	@SequenceGenerator(name="idProfiloLineaPriorita", sequenceName = "profilo_linea_priorita_id_profilo_linea_priorita_seq", allocationSize=1)
	@Column(name="id_profilo_linea_priorita")
	private Long idProfiloLineaPriorita;

	@Column(name="id_categoria_servizio")
	private Long idCategoriaServizio;

	@Column(name="id_profilo_commerciale")
	private Long idProfiloCommerciale;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PROFILO_COMMERCIALE",insertable=false,updatable=false)
	private ProfiloCommerciale profiloCommerciale;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_categoria_servizio",insertable=false,updatable=false)
	private CategoriaServizio categoriaServizio;

	private Integer priorita;

	public ProfiloLineaPriorita() {
	}

	public Long getIdProfiloLineaPriorita() {
		return this.idProfiloLineaPriorita;
	}

	public void setIdProfiloLineaPriorita(Long idProfiloLineaPriorita) {
		this.idProfiloLineaPriorita = idProfiloLineaPriorita;
	}

	public Long getIdCategoriaServizio() {
		return this.idCategoriaServizio;
	}

	public void setIdCategoriaServizio(Long idCategoriaServizio) {
		this.idCategoriaServizio = idCategoriaServizio;
	}

	public Long getIdProfiloCommerciale() {
		return this.idProfiloCommerciale;
	}

	public void setIdProfiloCommerciale(Long idProfiloCommerciale) {
		this.idProfiloCommerciale = idProfiloCommerciale;
	}

	public Integer getPriorita() {
		return this.priorita;
	}

	public void setPriorita(Integer priorita) {
		this.priorita = priorita;
	}

	public ProfiloCommerciale getProfiloCommerciale() {
		return profiloCommerciale;
	}

	public void setProfiloCommerciale(ProfiloCommerciale profiloCommerciale) {
		this.profiloCommerciale = profiloCommerciale;
	}
}