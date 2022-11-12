package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the router_ticket_ics_dettagli_prodotti database table.
 * 
 */
@Entity
@Table(name="router_ticket_ics_dettagli_prodotti")
@NamedQuery(name="RouterTicketIcsDettagliProdotti.findAll", query="SELECT r FROM RouterTicketIcsDettagliProdotti r")
public class RouterTicketIcsDettagliProdotti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRouterTicketIcsDettagliProdotti")
	@SequenceGenerator(name="idRouterTicketIcsDettagliProdotti", sequenceName = "router_ticket_ics_dettagli_pr_id_router_ticket_ics_dettagli_seq", allocationSize=1)
	@Column(name="id_router_ticket_ics_dettagli_prodotti")
	private Long idRouterTicketIcsDettagliProdotti;

	@Column(name="id_prodotto")
	private Long idProdotto;

	@Column(name="id_router_ticket")
	private Long idRouterTicket;

	private String matricola;

	private Integer quantita;

	@Column(name="tipo_operazione")
	private Integer tipoOperazione;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PRODOTTO",insertable=false,updatable=false)
	private RouterProdottiIcs routerProdottiIcs;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ROUTER_TICKET",insertable=false,updatable=false)
	private RouterTicketIcs routerTicketIcs;
	
	@Transient
	private String descrizioneProdotto ;
	
	@Transient
	private String descrizioneTipoOperazione ;


	public RouterTicketIcsDettagliProdotti() {
	}

	public Long getIdRouterTicketIcsDettagliProdotti() {
		return this.idRouterTicketIcsDettagliProdotti;
	}

	public void setIdRouterTicketIcsDettagliProdotti(Long idRouterTicketIcsDettagliProdotti) {
		this.idRouterTicketIcsDettagliProdotti = idRouterTicketIcsDettagliProdotti;
	}

	public Long getIdProdotto() {
		return this.idProdotto;
	}

	public void setIdProdotto(Long idProdotto) {
		this.idProdotto = idProdotto;
	}

	public Long getIdRouterTicket() {
		return this.idRouterTicket;
	}

	public void setIdRouterTicket(Long idRouterTicket) {
		this.idRouterTicket = idRouterTicket;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public Integer getQuantita() {
		return this.quantita;
	}

	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}

	public Integer getTipoOperazione() {
		return this.tipoOperazione;
	}

	public void setTipoOperazione(Integer tipoOperazione) {
		this.tipoOperazione = tipoOperazione;
	}

	public RouterProdottiIcs getRouterProdottiIcs() {
		return routerProdottiIcs;
	}

	public void setRouterProdottiIcs(RouterProdottiIcs routerProdottiIcs) {
		this.routerProdottiIcs = routerProdottiIcs;
	}

	public RouterTicketIcs getRouterTicketIcs() {
		return routerTicketIcs;
	}

	public void setRouterTicketIcs(RouterTicketIcs routerTicketIcs) {
		this.routerTicketIcs = routerTicketIcs;
	}

	public String getDescrizioneProdotto() {
		return descrizioneProdotto;
	}

	public void setDescrizioneProdotto(String descrizioneProdotto) {
		this.descrizioneProdotto = descrizioneProdotto;
	}

	public String getDescrizioneTipoOperazione() {
		return descrizioneTipoOperazione;
	}

	public void setDescrizioneTipoOperazione(String descrizioneTipoOperazione) {
		this.descrizioneTipoOperazione = descrizioneTipoOperazione;
	}

}