package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the router_ticket_dettagli database table.
 * 
 */
@Entity
@Table(name="router_ticket_dettagli")
@NamedQuery(name="RouterTicketDettagli.findAll", query="SELECT r FROM RouterTicketDettagli r")
public class RouterTicketDettagli implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRouterTicketDettagli")
	@SequenceGenerator(name="idRouterTicketDettagli", sequenceName = "router_ticket_dettagli_id_router_ticket_dettagli_seq", allocationSize=1)
	@Column(name="id_router_ticket_dettagli")
	private Long idRouterTicketDettagli;

	@Column(name="codice_scarto")
	private String codiceScarto;

	private Date data;

	@Column(name="descrizione_scarto")
	private String descrizioneScarto;

	private String esito;

	@Column(name="id_router_stato_ticket")
	private Long idRouterStatoTicket;

	@Column(name="id_router_ticket")
	private Long idRouterTicket;

	@Column(name="n_retry")
	private Integer nRetry;

	private String note;

	private Boolean reinvia;

	@Column(name="user_mod")
	private String userMod;

	public RouterTicketDettagli() {
	}

	public Long getIdRouterTicketDettagli() {
		return this.idRouterTicketDettagli;
	}

	public void setIdRouterTicketDettagli(Long idRouterTicketDettagli) {
		this.idRouterTicketDettagli = idRouterTicketDettagli;
	}

	public String getCodiceScarto() {
		return this.codiceScarto;
	}

	public void setCodiceScarto(String codiceScarto) {
		this.codiceScarto = codiceScarto;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescrizioneScarto() {
		return this.descrizioneScarto;
	}

	public void setDescrizioneScarto(String descrizioneScarto) {
		this.descrizioneScarto = descrizioneScarto;
	}

	public String getEsito() {
		return this.esito;
	}

	public void setEsito(String esito) {
		this.esito = esito;
	}

	public Long getIdRouterStatoTicket() {
		return this.idRouterStatoTicket;
	}

	public void setIdRouterStatoTicket(Long idRouterStatoTicket) {
		this.idRouterStatoTicket = idRouterStatoTicket;
	}

	public Long getIdRouterTicket() {
		return this.idRouterTicket;
	}

	public void setIdRouterTicket(Long idRouterTicket) {
		this.idRouterTicket = idRouterTicket;
	}

	public Integer getNRetry() {
		return this.nRetry;
	}

	public void setNRetry(Integer nRetry) {
		this.nRetry = nRetry;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getReinvia() {
		return this.reinvia;
	}

	public void setReinvia(Boolean reinvia) {
		this.reinvia = reinvia;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

}