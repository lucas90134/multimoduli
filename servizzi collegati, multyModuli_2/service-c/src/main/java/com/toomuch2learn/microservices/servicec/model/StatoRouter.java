package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;

import javax.persistence.*;
/**
 * The persistent class for the STATO_ROUTER database table.
 * 
 */
@Entity
@Table(name="stato_router")
@NamedQuery(name="StatoRouter.findAll", query="SELECT s FROM StatoRouter s")
public class StatoRouter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_stato_router")
	private Long idStatoRouter;

	@Column(name="descrizione_stato_router")
	private String descrizioneStatoRouter;

	public StatoRouter() {
	}
	
	@Override
	public String toString() {
		return "StatoRouter [\n\t{\n\t\t\"idStatoRouter\":\"" + idStatoRouter
				+ "\",\n\t\t \"descrizioneStatoRouter\":\"" + descrizioneStatoRouter + "\"\n\t}\n]";
	}



	public Long getIdStatoRouter() {
		return this.idStatoRouter;
	}

	public void setIdStatoRouter(Long idStatoRouter) {
		this.idStatoRouter = idStatoRouter;
	}

	public String getDescrizioneStatoRouter() {
		return this.descrizioneStatoRouter;
	}

	public void setDescrizioneStatoRouter(String descrizioneStatoRouter) {
		this.descrizioneStatoRouter = descrizioneStatoRouter;
	}

}