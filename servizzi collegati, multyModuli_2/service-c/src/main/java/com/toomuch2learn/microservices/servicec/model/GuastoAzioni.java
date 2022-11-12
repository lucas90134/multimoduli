package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="guasto_azioni")
@NamedQuery(name="GuastoAzioni.findAll", query="SELECT g FROM GuastoAzioni g")
public class GuastoAzioni implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Long id;

	@Column(name="id_guasto_azione")
	private String idGuastoAzione;

	@Column(name="descrizione")
	private String descrizione;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdGuastoAzione() {
		return idGuastoAzione;
	}

	public void setIdGuastoAzione(String idGuastoAzione) {
		this.idGuastoAzione = idGuastoAzione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}