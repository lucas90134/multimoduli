package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DETTAGLIO_STATO_ROUTER database table.
 * 
 */
@Entity
@Table(name="utilizzo_router")
@NamedQuery(name="UtilizzoRouter.findAll", query="SELECT d FROM UtilizzoRouter d")
public class UtilizzoRouter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="descrizione")
	private String descrizione;

	@Id
	@Column(name="id_utilizzo_router")
	private Long idUtilizzoRouter;

	@Column(name="utilizzo_per_ip")
	private Integer utilizzoPerIp;

	public UtilizzoRouter() {
	}

	@Override
	public String toString() {
		return "{\n\t\"descrizione\":\"" + descrizione + "\",\n\t\"idUtilizzoRouter\":\"" + idUtilizzoRouter
				+ "\",\n\t\"utilizzoPerIp\":\"" + utilizzoPerIp + "\"\n}";
	}



	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getIdUtilizzoRouter() {
		return this.idUtilizzoRouter;
	}

	public void setIdUtilizzoRouter(Long idDettaglioStatoRouter) {
		this.idUtilizzoRouter = idDettaglioStatoRouter;
	}

	public Integer getUtilizzoPerIp() {
		return this.utilizzoPerIp;
	}

	public void setIdStatoRouter(Integer idStatoRouter) {
		this.utilizzoPerIp = idStatoRouter;
	}




}