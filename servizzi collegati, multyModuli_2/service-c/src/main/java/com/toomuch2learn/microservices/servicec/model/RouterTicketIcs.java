package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the router_ticket_ics database table.
 * 
 */
@Entity
@Table(name="router_ticket_ics")
@NamedQuery(name="RouterTicketIcs.findAll", query="SELECT r FROM RouterTicketIcs r")
public class RouterTicketIcs implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRouterTicketIcs")
	@SequenceGenerator(name="idRouterTicketIcs", sequenceName = "router_ticket_ics_id_router_ticket_ics_seq", allocationSize=1)
	@Column(name="id_router_ticket_ics")
	private Long idRouterTicketIcs;

	@Column(name="cod_cliente_finale")
	private String codClienteFinale;

	private Date data;

	@Column(name="data_cambio_stato")
	private Date dataCambioStato;

	private String fornitore;

	@Column(name="id_sede")
	private Long idSede;

	@Column(name="id_stato_attuale")
	private Long idStatoAttuale;

	@Column(name="id_ticket_fornitore")
	private String idTicketFornitore;

	@Column(name="id_ticket_lottomatica")
	private String idTicketLottomatica;

	private String note;

	@Column(name="stato_ics")
	private String statoIcs;

	@Column(name="tipo_operazione")
	private Integer tipoOperazione;

	@Column(name="user_mod")
	private String userMod;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_STATO_ATTUALE",insertable=false,updatable=false)
	private RouterStatoTicketIcs routerStatoTicketIcs;

	@JsonIgnore
	@OneToMany(mappedBy = "routerTicketIcs", fetch = FetchType.LAZY)
	private List<RouterTicketIcsDettagli> routerTicketIcsDettagli;

	@JsonIgnore
	@OneToMany(mappedBy = "routerTicketIcsDettagli", fetch = FetchType.LAZY)
	private List<RouterTicketIcsDettagliInterventi> routerTicketIcsDettagliInterventi;

	@JsonIgnore
	@OneToMany(mappedBy = "routerTicketIcs", fetch = FetchType.LAZY)
	private List<RouterTicketIcsDettagliProdotti> routerTicketIcsDettagliProdotti;

	@Transient
	private String descrizioneStatoTicketIcs ;
	
	@Transient
	private String descrizioneTipoOperazione ;

	@Transient
	private String apparatoRichiesto;

	@Transient
	private String apparatoDaRitirare;

	@Transient
	private String macAddressDaRitirare;


	public RouterTicketIcs() {
	}

	public Long getIdRouterTicketIcs() {
		return this.idRouterTicketIcs;
	}

	public void setIdRouterTicketIcs(Long idRouterTicketIcs) {
		this.idRouterTicketIcs = idRouterTicketIcs;
	}

	public String getCodClienteFinale() {
		return this.codClienteFinale;
	}

	public void setCodClienteFinale(String codClienteFinale) {
		this.codClienteFinale = codClienteFinale;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getDataCambioStato() {
		return this.dataCambioStato;
	}

	public void setDataCambioStato(Date dataCambioStato) {
		this.dataCambioStato = dataCambioStato;
	}

	public String getFornitore() {
		return this.fornitore;
	}

	public void setFornitore(String fornitore) {
		this.fornitore = fornitore;
	}

	public Long getIdSede() {
		return this.idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public Long getIdStatoAttuale() {
		return this.idStatoAttuale;
	}

	public void setIdStatoAttuale(Long idStatoAttuale) {
		this.idStatoAttuale = idStatoAttuale;
	}

	public String getIdTicketFornitore() {
		return this.idTicketFornitore;
	}

	public void setIdTicketFornitore(String idTicketFornitore) {
		this.idTicketFornitore = idTicketFornitore;
	}

	public String getIdTicketLottomatica() {
		return this.idTicketLottomatica;
	}

	public void setIdTicketLottomatica(String idTicketLottomatica) {
		this.idTicketLottomatica = idTicketLottomatica;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getStatoIcs() {
		return this.statoIcs;
	}

	public void setStatoIcs(String statoIcs) {
		this.statoIcs = statoIcs;
	}

	public Integer getTipoOperazione() {
		return this.tipoOperazione;
	}

	public void setTipoOperazione(Integer tipoOperazione) {
		this.tipoOperazione = tipoOperazione;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public RouterStatoTicketIcs getRouterStatoTicketIcs() {
		return routerStatoTicketIcs;
	}

	public void setRouterStatoTicketIcs(RouterStatoTicketIcs routerStatoTicketIcs) {
		this.routerStatoTicketIcs = routerStatoTicketIcs;
	}

	public List<RouterTicketIcsDettagli> getRouterTicketIcsDettagli() {
		return routerTicketIcsDettagli;
	}

	public void setRouterTicketIcsDettagli(List<RouterTicketIcsDettagli> routerTicketIcsDettagli) {
		this.routerTicketIcsDettagli = routerTicketIcsDettagli;
	}

	public List<RouterTicketIcsDettagliInterventi> getRouterTicketIcsDettagliInterventi() {
		return routerTicketIcsDettagliInterventi;
	}

	public void setRouterTicketIcsDettagliInterventi(
			List<RouterTicketIcsDettagliInterventi> routerTicketIcsDettagliInterventi) {
		this.routerTicketIcsDettagliInterventi = routerTicketIcsDettagliInterventi;
	}

	public List<RouterTicketIcsDettagliProdotti> getRouterTicketIcsDettagliProdotti() {
		return routerTicketIcsDettagliProdotti;
	}

	public void setRouterTicketIcsDettagliProdotti(List<RouterTicketIcsDettagliProdotti> routerTicketIcsDettagliProdotti) {
		this.routerTicketIcsDettagliProdotti = routerTicketIcsDettagliProdotti;
	}

	public String getDescrizioneStatoTicketIcs() {
		return descrizioneStatoTicketIcs;
	}

	public void setDescrizioneStatoTicketIcs(String descrizioneStatoTicketIcs) {
		this.descrizioneStatoTicketIcs = descrizioneStatoTicketIcs;
	}

	public String getDescrizioneTipoOperazione() {
		return descrizioneTipoOperazione;
	}

	public void setDescrizioneTipoOperazione(String descrizioneTipoOperazione) {
		this.descrizioneTipoOperazione = descrizioneTipoOperazione;
	}

	public String getApparatoRichiesto() {
		return apparatoRichiesto;
	}

	public void setApparatoRichiesto(String apparatoRichiesto) {
		this.apparatoRichiesto = apparatoRichiesto;
	}

	public String getApparatoDaRitirare() {
		return apparatoDaRitirare;
	}

	public void setApparatoDaRitirare(String apparatoDaRitirare) {
		this.apparatoDaRitirare = apparatoDaRitirare;
	}

	public String getMacAddressDaRitirare() {
		return macAddressDaRitirare;
	}

	public void setMacAddressDaRitirare(String macAddressDaRitirare) {
		this.macAddressDaRitirare = macAddressDaRitirare;
	}

}