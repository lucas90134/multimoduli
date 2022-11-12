package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the router_ticket_ics_dettagli database table.
 * 
 */
@Entity
@Table(name="router_ticket_ics_dettagli")
@NamedQuery(name="RouterTicketIcsDettagli.findAll", query="SELECT r FROM RouterTicketIcsDettagli r")
public class RouterTicketIcsDettagli implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRouterTicketIcsDettagli")
	@SequenceGenerator(name="idRouterTicketIcsDettagli", sequenceName = "router_ticket_ics_dettagli_id_router_ticket_ics_dettagli_seq", allocationSize=1)
	@Column(name="id_router_ticket_ics_dettagli")
	private Long idRouterTicketIcsDettagli;

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

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ROUTER_STATO_TICKET",insertable=false,updatable=false)
	private RouterStatoTicketIcs routerStatoTicketIcs;

	@JsonIgnore
	@OneToMany(mappedBy = "routerTicketIcsDettagli", fetch = FetchType.LAZY)
	private List<RouterTicketIcsDettagliInterventi> routerTicketIcsDettagliInterventi;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ROUTER_TICKET", insertable=false,updatable=false)
	private RouterTicketIcs routerTicketIcs;
	
	@Transient
	private String descrizioneStatoTicketIcs ;

	public RouterTicketIcsDettagli() {
	}

	public Long getIdRouterTicketIcsDettagli() {
		return this.idRouterTicketIcsDettagli;
	}

	public void setIdRouterTicketIcsDettagli(Long idRouterTicketIcsDettagli) {
		this.idRouterTicketIcsDettagli = idRouterTicketIcsDettagli;
	}

	public String getCodiceScarto() {
		return this.codiceScarto;
	}

	public void setCodiceScarto(Long codiceScarto) {
		if(codiceScarto != null) {
			this.codiceScarto = codiceScarto.toString();
		}
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

	public Integer getnRetry() {
		return nRetry;
	}

	public void setnRetry(Integer nRetry) {
		this.nRetry = nRetry;
	}

	public RouterStatoTicketIcs getRouterStatoTicketIcs() {
		return routerStatoTicketIcs;
	}

	public void setRouterStatoTicketIcs(RouterStatoTicketIcs routerStatoTicketIcs) {
		this.routerStatoTicketIcs = routerStatoTicketIcs;
	}

	public List<RouterTicketIcsDettagliInterventi> getRouterTicketIcsDettagliInterventi() {
		return routerTicketIcsDettagliInterventi;
	}

	public void setRouterTicketIcsDettagliInterventi(
			List<RouterTicketIcsDettagliInterventi> routerTicketIcsDettagliInterventi) {
		this.routerTicketIcsDettagliInterventi = routerTicketIcsDettagliInterventi;
	}

	public RouterTicketIcs getRouterTicketIcs() {
		return routerTicketIcs;
	}

	public void setRouterTicketIcs(RouterTicketIcs routerTicketIcs) {
		this.routerTicketIcs = routerTicketIcs;
	}

	public String getDescrizioneStatoTicketIcs() {
		return descrizioneStatoTicketIcs;
	}

	public void setDescrizioneStatoTicketIcs(String descrizioneStatoTicketIcs) {
		this.descrizioneStatoTicketIcs = descrizioneStatoTicketIcs;
	}

}