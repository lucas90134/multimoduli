package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the router_stato_ticket database table.
 * 
 */
@Entity
@Table(name="router_stato_ticket")
@NamedQuery(name="RouterStatoTicket.findAll", query="SELECT r FROM RouterStatoTicket r")
public class RouterStatoTicket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRouterStatoTicket")
	@SequenceGenerator(name="idRouterStatoTicket", sequenceName = "router_stato_ticket_id_router_stato_ticket_seq", allocationSize=1)
	@Column(name="id_router_stato_ticket")
	private Long idRouterStatoTicket;

	private String descrizione;

	public RouterStatoTicket() {
	}

	public Long getIdRouterStatoTicket() {
		return this.idRouterStatoTicket;
	}

	public void setIdRouterStatoTicket(Long idRouterStatoTicket) {
		this.idRouterStatoTicket = idRouterStatoTicket;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}