package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the causa_cessazione_linea database table.
 * 
 */
@Entity
@Table(name="causa_cessazione_linea")
@NamedQuery(name="CausaCessazioneLinea.findAll", query="SELECT c FROM CausaCessazioneLinea c")
public class CausaCessazioneLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idCausaCessazioneLinea")
	@SequenceGenerator(name="idCausaCessazioneLinea", sequenceName = "causa_cessazione_linea_id_causa_cessazione_linea_seq", allocationSize=1)
	@Column(name="id_causa_cessazione_linea")
	private Long idCausaCessazioneLinea;

	private String descrizione;

	public CausaCessazioneLinea() {
	}

	public Long getIdCausaCessazioneLinea() {
		return this.idCausaCessazioneLinea;
	}

	public void setIdCausaCessazioneLinea(Long idCausaCessazioneLinea) {
		this.idCausaCessazioneLinea = idCausaCessazioneLinea;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}