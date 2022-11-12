package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the tipo_richiesta database table.
 * 
 */
@Entity
@Table(name="tipo_richiesta")
@NamedQuery(name="TipoRichiesta.findAll", query="SELECT t FROM TipoRichiesta t")
public class TipoRichiesta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idTipoRichiesta")
	@SequenceGenerator(name="idTipoRichiesta", sequenceName = "tipo_richiesta_id_tipo_richiesta_seq", allocationSize=1)
	@Column(name="id_tipo_richiesta")
	private Long idTipoRichiesta;

	private String descrizione;

	public TipoRichiesta() {
	}

	public Long getIdTipoRichiesta() {
		return this.idTipoRichiesta;
	}

	public void setIdTipoRichiesta(Long idTipoRichiesta) {
		this.idTipoRichiesta = idTipoRichiesta;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}