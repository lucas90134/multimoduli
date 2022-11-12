package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the guasti database table.
 * 
 */
@Entity
@Table(name="guasti")
@NamedQuery(name="Guasti.findAll", query="SELECT g FROM Guasti g")
public class Guasti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idGuasto")
	@SequenceGenerator(name="idGuasto", sequenceName = "guasti_id_guasto_seq", allocationSize=1)
	@Column(name="id_guasto")
	private Long idGuasto;

	@Column(name="data_cambio_stato")
	private Date dataCambioStato;

	@Column(name="descrizione_problema")
	private String descrizioneProblema;

	@Column(name="email_cliente_rif")
	private String emailClienteRif;

	@Column(name="esito_corrente")
	private String esitoCorrente;

	@Column(name="id_anagrafica_fornitore")
	private Long idAnagraficaFornitore;

	@Column(name="id_azione")
	private String idAzione;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_azione", referencedColumnName="id_guasto_azione",insertable=false,updatable=false)
	private GuastoAzioni guastoAzioni;
	
	//IDGUASTO_TD 
	@Column(name="id_guasto_helpsi")
	private Long idGuastoHelpsi;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="id_ticket")
	private String idTicket;

	@Column(name="lista_codici_disservizio")
	private String listaCodiciDisservizio;

	@Column(name="notifica_cambio_stato")
	private String notificaCambioStato;

	@Column(name="rif_cliente")
	private String rifCliente;

	private String severita;

	@Column(name="stato_attuale")
	private Long statoAttuale;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "stato_attuale",insertable=false,updatable=false)
	private GuastoStato guastoStato;
	
	@Column(name="td_linea")
	private String tdLinea;

	@Column(name="tel_rif_cliente")
	private String telRifCliente;
	
	@OneToMany(mappedBy = "guasti", fetch = FetchType.LAZY)
	List<GuastiDettagli> guastiDettagli;

	public Guasti() {
	}

	public Long getIdGuasto() {
		return this.idGuasto;
	}

	public void setIdGuasto(Long idGuasto) {
		this.idGuasto = idGuasto;
	}

	public Date getDataCambioStato() {
		return this.dataCambioStato;
	}

	public void setDataCambioStato(Date dataCambioStato) {
		this.dataCambioStato = dataCambioStato;
	}

	public String getDescrizioneProblema() {
		return this.descrizioneProblema;
	}

	public void setDescrizioneProblema(String descrizioneProblema) {
		this.descrizioneProblema = descrizioneProblema;
	}

	public String getEmailClienteRif() {
		return this.emailClienteRif;
	}

	public void setEmailClienteRif(String emailClienteRif) {
		this.emailClienteRif = emailClienteRif;
	}

	public String getEsitoCorrente() {
		return this.esitoCorrente;
	}

	public void setEsitoCorrente(String esitoCorrente) {
		this.esitoCorrente = esitoCorrente;
	}

	public Long getIdAnagraficaFornitore() {
		return this.idAnagraficaFornitore;
	}

	public void setIdAnagraficaFornitore(Long idAnagraficaFornitore) {
		this.idAnagraficaFornitore = idAnagraficaFornitore;
	}

	public String getIdAzione() {
		return this.idAzione;
	}

	public void setIdAzione(String idAzione) {
		this.idAzione = idAzione;
	}

	public Long getIdGuastoHelpsi() {
		return this.idGuastoHelpsi;
	}

	public void setIdGuastoHelpsi(Long idGuastoHelpsi) {
		this.idGuastoHelpsi = idGuastoHelpsi;
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public String getIdTicket() {
		return this.idTicket;
	}

	public void setIdTicket(String idTicket) {
		this.idTicket = idTicket;
	}

	public String getListaCodiciDisservizio() {
		return this.listaCodiciDisservizio;
	}

	public void setListaCodiciDisservizio(String listaCodiciDisservizio) {
		this.listaCodiciDisservizio = listaCodiciDisservizio;
	}

	public String getNotificaCambioStato() {
		return this.notificaCambioStato;
	}

	public void setNotificaCambioStato(String notificaCambioStato) {
		this.notificaCambioStato = notificaCambioStato;
	}

	public String getRifCliente() {
		return this.rifCliente;
	}

	public void setRifCliente(String rifCliente) {
		this.rifCliente = rifCliente;
	}

	public String getSeverita() {
		return this.severita;
	}

	public void setSeverita(String severita) {
		this.severita = severita;
	}

	public Long getStatoAttuale() {
		return this.statoAttuale;
	}

	public void setStatoAttuale(Long statoAttuale) {
		this.statoAttuale = statoAttuale;
	}

	public String getTdLinea() {
		return this.tdLinea;
	}

	public void setTdLinea(String tdLinea) {
		this.tdLinea = tdLinea;
	}

	public String getTelRifCliente() {
		return this.telRifCliente;
	}

	public void setTelRifCliente(String telRifCliente) {
		this.telRifCliente = telRifCliente;
	}

	public List<GuastiDettagli> getGuastiDettagli() {
		return guastiDettagli;
	}

	public void setGuastiDettagli(List<GuastiDettagli> guastiDettagli) {
		this.guastiDettagli = guastiDettagli;
	}

	public GuastoStato getGuastoStato() {
		return guastoStato;
	}

	public void setGuastoStato(GuastoStato guastoStato) {
		this.guastoStato = guastoStato;
	}

	public GuastoAzioni getGuastoAzioni() {
		return guastoAzioni;
	}

	public void setGuastoAzioni(GuastoAzioni guastoAzioni) {
		this.guastoAzioni = guastoAzioni;
	}

}