package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the router_ticket_ics_dettagli_interventi database table.
 * 
 */
@Entity
@Table(name="router_ticket_ics_dettagli_interventi")
@NamedQuery(name="RouterTicketIcsDettagliInterventi.findAll", query="SELECT r FROM RouterTicketIcsDettagliInterventi r")
public class RouterTicketIcsDettagliInterventi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRouterTicketIcsDettagliInterventi")
	@SequenceGenerator(name="idRouterTicketIcsDettagliInterventi", sequenceName = "router_ticket_ics_dettagli_in_id_router_ticket_ics_dettagli_seq", allocationSize=1)
	@Column(name="id_router_ticket_ics_dettagli_interventi")
	private Long idRouterTicketIcsDettagliInterventi;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ROUTER_TICKET_ICS_DETTAGLI",insertable=false,updatable=false)
	private RouterTicketIcsDettagli routerTicketIcsDettagli;

	@Column(name="id_router_ticket")
	private Long idRouterTicket;

	@Column(name="id_router_ticket_ics_dettagli")
	private Long idRouterTicketIcsDettagli;

	@Column(name="matricola_in")
	private String matricolaIn;

	@Column(name="matricola_out")
	private String matricolaOut;

	private String note;

	@Column(name="prodotto_in")
	private String prodottoIn;

	@Column(name="prodotto_out")
	private String prodottoOut;

	private String tipologia;

	@Transient
	private Date dataDettaglio;

	
	public RouterTicketIcsDettagliInterventi() {
	}

	public Long getIdRouterTicketIcsDettagliInterventi() {
		return this.idRouterTicketIcsDettagliInterventi;
	}

	public void setIdRouterTicketIcsDettagliInterventi(Long idRouterTicketIcsDettagliInterventi) {
		this.idRouterTicketIcsDettagliInterventi = idRouterTicketIcsDettagliInterventi;
	}

	public Long getIdRouterTicket() {
		return this.idRouterTicket;
	}

	public void setIdRouterTicket(Long idRouterTicket) {
		this.idRouterTicket = idRouterTicket;
	}

	public Long getIdRouterTicketIcsDettagli() {
		return this.idRouterTicketIcsDettagli;
	}

	public void setIdRouterTicketIcsDettagli(Long idRouterTicketIcsDettagli) {
		this.idRouterTicketIcsDettagli = idRouterTicketIcsDettagli;
	}

	public String getMatricolaIn() {
		return this.matricolaIn;
	}

	public void setMatricolaIn(String matricolaIn) {
		this.matricolaIn = matricolaIn;
	}

	public String getMatricolaOut() {
		return this.matricolaOut;
	}

	public void setMatricolaOut(String matricolaOut) {
		this.matricolaOut = matricolaOut;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getProdottoIn() {
		return this.prodottoIn;
	}

	public void setProdottoIn(String prodottoIn) {
		this.prodottoIn = prodottoIn;
	}

	public String getProdottoOut() {
		return this.prodottoOut;
	}

	public void setProdottoOut(String prodottoOut) {
		this.prodottoOut = prodottoOut;
	}

	public String getTipologia() {
		return this.tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public RouterTicketIcsDettagli getRouterTicketIcsDettagli() {
		return routerTicketIcsDettagli;
	}

	public void setRouterTicketIcsDettagli(RouterTicketIcsDettagli routerTicketIcsDettagli) {
		this.routerTicketIcsDettagli = routerTicketIcsDettagli;
	}

	public Date getDataDettaglio() {
		return dataDettaglio;
	}

	public void setDataDettaglio(Date dataDettaglio) {
		this.dataDettaglio = dataDettaglio;
	}

}