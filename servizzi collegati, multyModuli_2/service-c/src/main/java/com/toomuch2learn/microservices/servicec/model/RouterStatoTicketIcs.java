package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the router_stato_ticket database table.
 * 
 */
@Entity
@Table(name="router_stato_ticket_ics")
@NamedQuery(name="RouterStatoTicketIcs.findAll", query="SELECT r FROM RouterStatoTicketIcs r")
public class RouterStatoTicketIcs implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRouterStatoTicketIcs")
	@SequenceGenerator(name="idRouterStatoTicketIcs", sequenceName = "router_stato_ticket_ics_id_router_stato_ticket_ics_seq", allocationSize=1)
	@Column(name="id_router_stato_ticket_ics")
	private Long idRouterStatoTicketIcs;

	private String descrizione;

	public RouterStatoTicketIcs() {
	}

	public Long getIdRouterStatoTicketIcs() {
		return this.idRouterStatoTicketIcs;
	}

	public void setIdRouterStatoTicketIcs(Long idRouterStatoTicketIcs) {
		this.idRouterStatoTicketIcs = idRouterStatoTicketIcs;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}