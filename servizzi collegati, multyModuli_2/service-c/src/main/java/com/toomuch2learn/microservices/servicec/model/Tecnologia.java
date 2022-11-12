package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the tecnologia database table.
 * 
 */
@Entity
@NamedQuery(name="Tecnologia.findAll", query="SELECT t FROM Tecnologia t")
public class Tecnologia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idTecnologia")
	@SequenceGenerator(name="idTecnologia", sequenceName = "tecnologia_id_tecnologia_seq", allocationSize=1)
	@Column(name="id_tecnologia")
	private Long idTecnologia;

	private String descrizione;

	@Column(name="id_tipo")
	private Long idTipo;

	public Tecnologia() {
	}

	public Long getIdTecnologia() {
		return this.idTecnologia;
	}

	public void setIdTecnologia(Long idTecnologia) {
		this.idTecnologia = idTecnologia;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}

}