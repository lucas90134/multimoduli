package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the business_sede database table.
 * 
 */
@Entity
@Table(name="codici_vl")
@NamedQuery(name="CodiciVl.findAll", query="SELECT b FROM CodiciVl b")
public class CodiciVl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idCodiciVl")
	@SequenceGenerator(name="idCodiciVl", sequenceName = "codici_vl_id_codici_vl_seq", allocationSize=1)
	@Column(name="id_codici_vl")
	private Long idCodiciVl;

	public CodiciVl() {
	}

	public Long getIdCodiciVl() {
		return idCodiciVl;
	}

	public void setIdCodiciVl(Long idCodiciVl) {
		this.idCodiciVl = idCodiciVl;
	}

}