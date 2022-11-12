package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;

import javax.persistence.*;
/**
 * The persistent class for the categoria_servizio database table.
 * 
 */
@Entity
@Table(name="categoria_servizio")
@NamedQuery(name="CategoriaServizio.findAll", query="SELECT c FROM CategoriaServizio c")
public class CategoriaServizio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idCategoriaServizio")
	@SequenceGenerator(name="idCategoriaServizio", sequenceName = "categoria_servizio_id_categoria_servizio_seq", allocationSize=1)
	@Column(name="id_categoria_servizio")
	private Long idCategoriaServizio;

	private String descrizione;

	@Column(name="num_vc")
	private Integer numVc;

	public CategoriaServizio() {}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getIdCategoriaServizio() {
		return this.idCategoriaServizio;
	}

	public void setIdCategoriaServizio(Long idCategoriaServizio) {
		this.idCategoriaServizio = idCategoriaServizio;
	}

	public Integer getNumVc() {
		return this.numVc;
	}

	public void setNumVc(Integer numVc) {
		this.numVc = numVc;
	}

}