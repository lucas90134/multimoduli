package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the causa_annullamento_linea database table.
 * 
 */
@Entity
@Table(name="causa_annullamento_linea")
@NamedQuery(name="CausaAnnullamentoLinea.findAll", query="SELECT c FROM CausaAnnullamentoLinea c")
public class CausaAnnullamentoLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idCausaAnnullamentoLinea")
	@SequenceGenerator(name="idCausaAnnullamentoLinea", sequenceName = "causa_annullamento_linea_id_causa_annullamento_linea_seq", allocationSize=1)
	@Column(name="id_causa_annullamento_linea")
	private Long idCausaAnnullamentoLinea;

	private String descrizione;

	public CausaAnnullamentoLinea() {
	}

	public Long getIdCausaAnnullamentoLinea() {
		return this.idCausaAnnullamentoLinea;
	}

	public void setIdCausaAnnullamentoLinea(Long idCausaAnnullamentoLinea) {
		this.idCausaAnnullamentoLinea = idCausaAnnullamentoLinea;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}