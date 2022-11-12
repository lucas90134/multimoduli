package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the DETTAGLIO_STATO_ROUTER database table.
 * 
 */
@Entity
@Table(name="dettaglio_stato_router")
@NamedQuery(name="DettaglioStatoRouter.findAll", query="SELECT d FROM DettaglioStatoRouter d")
public class DettaglioStatoRouter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="descrizione")
	private String descrizione;

	@Id	
	@Column(name="id_dettaglio_stato_router")
	private Long idDettaglioStatoRouter;

	@Column(name="id_stato_router")
	private Long idStatoRouter;

	
	@Override
	public String toString() {
		return "DettaglioStatoRouter [\n\t{\n\t\t\"descrizione\":\"" + descrizione
				+ "\",\n\t\t \"idDettaglioStatoRouter\":\"" + idDettaglioStatoRouter + "\",\n\t\t \"idStatoRouter\":\""
				+ idStatoRouter + "\"\n\t}\n]";
	}

	public DettaglioStatoRouter() {
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getIdDettaglioStatoRouter() {
		return this.idDettaglioStatoRouter;
	}

	public void setIdDettaglioStatoRouter(Long idDettaglioStatoRouter) {
		this.idDettaglioStatoRouter = idDettaglioStatoRouter;
	}

	public Long getIdStatoRouter() {
		return this.idStatoRouter;
	}

	public void setIdStatoRouter(Long idStatoRouter) {
		this.idStatoRouter = idStatoRouter;
	}

}