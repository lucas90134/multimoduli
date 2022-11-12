package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DETTAGLIO_STATO_ROUTER database table.
 * 
 */
@Entity
@Table(name="utilizzo_apparato")
@NamedQuery(name="UtilizzoApparatp.findAll", query="SELECT d FROM UtilizzoApparato d")
public class UtilizzoApparato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="descrizione")
	private String descrizione;

	@Id
	@Column(name="id_utilizzo_apparato")
	private Long idUtilizzoApparato;


	public UtilizzoApparato() {
	}

	
	@Override
	public String toString() {
		return "{\n\t\"descrizione\":\"" + descrizione + "\",\n\t\"idUtilizzoApparato\":\"" + idUtilizzoApparato
				+ "\"\n}";
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public Long getIdUtilizzoApparato() {
		return idUtilizzoApparato;
	}


	public void setIdUtilizzoApparato(Long idUtilizzoApparato) {
		this.idUtilizzoApparato = idUtilizzoApparato;
	}



	
	
}