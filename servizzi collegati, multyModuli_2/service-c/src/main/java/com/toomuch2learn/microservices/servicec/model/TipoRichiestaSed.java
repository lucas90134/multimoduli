package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="tipo_richiesta_sed")
@NamedQuery(name="TipoRichiestaSed.findAll", query="SELECT t FROM TipoRichiestaSed t")
public class TipoRichiestaSed implements Serializable {
	
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idTipoRichiestaSed")
	@SequenceGenerator(name="idTipoRichiestaSed", sequenceName = "tipo_richiesta_sed_id_tipo_richiesta_sed_seq", allocationSize=1)
	@Column(name="id_tipo_richiesta_sed")
	private Long idTipoRichiestaSed;

	private String descrizione;
	
	public TipoRichiestaSed() {
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getIdTipoRichiestaSed() {
		return idTipoRichiestaSed;
	}

	public void setIdTipoRichiestaSed(Long idTipoRichiestaSed) {
		this.idTipoRichiestaSed = idTipoRichiestaSed;
	}
}