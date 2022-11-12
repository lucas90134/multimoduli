package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the tipo_risorsa database table.
 * 
 */
@Entity
@Table(name="tipo_risorsa")
@NamedQuery(name="TipoRisorsa.findAll", query="SELECT t FROM TipoRisorsa t")
public class TipoRisorsa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idTipoRisorsa")
	@SequenceGenerator(name="idTipoRisorsa", sequenceName = "tipo_risorsa_id_tipo_risorsa_seq", allocationSize=1)
	@Column(name="id_tipo_risorsa")
	private Long idTipoRisorsa;

	private String descrizione;

	public TipoRisorsa() {
	}

	public Long getIdTipoRisorsa() {
		return this.idTipoRisorsa;
	}

	public void setIdTipoRisorsa(Long idTipoRisorsa) {
		this.idTipoRisorsa = idTipoRisorsa;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}