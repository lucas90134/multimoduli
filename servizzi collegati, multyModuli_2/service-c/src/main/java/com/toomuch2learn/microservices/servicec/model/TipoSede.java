package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the tipo_sede database table.
 * 
 */
@Entity
@Table(name="tipo_sede")
@NamedQuery(name="TipoSede.findAll", query="SELECT t FROM TipoSede t")
public class TipoSede implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descrizione;

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idTipoSede")
	@SequenceGenerator(name="idTipoSede", sequenceName = "target_id_target_seq", allocationSize=1)
	@Column(name="id_tipo_sede")
	private Long idTipoSede;

	public TipoSede() {
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getIdTipoSede() {
		return this.idTipoSede;
	}

	public void setIdTipoSede(Long idTipoSede) {
		this.idTipoSede = idTipoSede;
	}

}