package com.toomuch2learn.microservices.servicec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;



/**
 * The persistent class for the DETTAGLIO_STATO_ROUTER database table.
 * 
 */
@Entity
@Table(name="router_ubicazione")
public class RouterUbicazione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="descrizione")
	private String descrizione;

	@Id
	@Column(name="id_router_ubicazione")
	private Long idRouterUbicazione;


	public RouterUbicazione() {
	}

	@Override
	public String toString() {
		return "{\n\t\"descrizione\":\"" + descrizione + "\",\n\t\"idRouterUbicazione\":\"" + idRouterUbicazione
				+ "\"\n}";
	}

	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public Long getIdRouterUbicazione() {
		return idRouterUbicazione;
	}


	public void setIdRouterUbicazione(Long idRouterUbicazione) {
		this.idRouterUbicazione = idRouterUbicazione;
	}



}