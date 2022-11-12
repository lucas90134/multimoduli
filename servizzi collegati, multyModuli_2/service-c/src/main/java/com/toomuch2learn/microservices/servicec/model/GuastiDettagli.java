package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the guasti_dettagli database table.
 * 
 */
@Entity
@Table(name="guasti_dettagli")
@NamedQuery(name="GuastiDettagli.findAll", query="SELECT g FROM GuastiDettagli g")
public class GuastiDettagli implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idGuastoDettagli")
	@SequenceGenerator(name="idGuastoDettagli", sequenceName = "guasti_dettagli_id_guasto_dettagli_seq", allocationSize=1)
	@Column(name="id_guasto_dettagli")
	private Long idGuastoDettagli;

	@Column(name="causa_effettiva_chiusura")
	private String causaEffettivaChiusura;

	@Column(name="codice_chiusura")
	private String codiceChiusura;

	@Column(name="codice_errore")
	private String codiceErrore;

	private String commenti;

	@Column(name="data_invio")
	private Date dataInvio;

	@Column(name="data_ricezione")
	private Date dataRicezione;

	@Column(name="data_xml")
	private Date dataXml;

	@Column(name="descrizione_esito")
	private String descrizioneEsito;

	private String destinatario;

	private String esito;

	@Column(name="id_guasto")
	private Long idGuasto;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_guasto",insertable=false,updatable=false)
	private Guasti guasti;

	@Column(name="id_operatore")
	private String idOperatore;

	@Column(name="id_stato_guasto")
	private Long idStatoGuasto;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_stato_guasto",insertable=false,updatable=false)
	private GuastoStato statoGuasto;
	
	@Column(name="id_ticket")
	private String idTicket;

	//private Boolean inviato;

	@Column(name="message_id")
	private String messageId;

	private String owner;

	private Integer retry;

	@Column(name="tipo_evento")
	private String tipoEvento;

	@Column(name="xml_richiesta")
	private String xmlRichiesta;

	@Column(name="xml_risposta")
	private String xmlRisposta;

	public GuastiDettagli() {
	}

	public Long getIdGuastoDettagli() {
		return this.idGuastoDettagli;
	}

	public void setIdGuastoDettagli(Long idGuastoDettagli) {
		this.idGuastoDettagli = idGuastoDettagli;
	}

	public String getCausaEffettivaChiusura() {
		return this.causaEffettivaChiusura;
	}

	public void setCausaEffettivaChiusura(String causaEffettivaChiusura) {
		this.causaEffettivaChiusura = causaEffettivaChiusura;
	}

	public String getCodiceChiusura() {
		return this.codiceChiusura;
	}

	public void setCodiceChiusura(String codiceChiusura) {
		this.codiceChiusura = codiceChiusura;
	}

	public String getCodiceErrore() {
		return this.codiceErrore;
	}

	public void setCodiceErrore(String codiceErrore) {
		this.codiceErrore = codiceErrore;
	}

	public String getCommenti() {
		return this.commenti;
	}

	public void setCommenti(String commenti) {
		this.commenti = commenti;
	}

	public Date getDataInvio() {
		return this.dataInvio;
	}

	public void setDataInvio(Date dataInvio) {
		this.dataInvio = dataInvio;
	}

	public Date getDataRicezione() {
		return this.dataRicezione;
	}

	public void setDataRicezione(Date dataRicezione) {
		this.dataRicezione = dataRicezione;
	}

	public Date getDataXml() {
		return this.dataXml;
	}

	public void setDataXml(Date dataXml) {
		this.dataXml = dataXml;
	}

	public String getDescrizioneEsito() {
		return this.descrizioneEsito;
	}

	public void setDescrizioneEsito(String descrizioneEsito) {
		this.descrizioneEsito = descrizioneEsito;
	}

	public String getDestinatario() {
		return this.destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getEsito() {
		return this.esito;
	}

	public void setEsito(String esito) {
		this.esito = esito;
	}

	public Long getIdGuasto() {
		return this.idGuasto;
	}

	public void setIdGuasto(Long idGuasto) {
		this.idGuasto = idGuasto;
	}

	public String getIdOperatore() {
		return this.idOperatore;
	}

	public void setIdOperatore(String idOperatore) {
		this.idOperatore = idOperatore;
	}

	public Long getIdStatoGuasto() {
		return this.idStatoGuasto;
	}

	public void setIdStatoGuasto(Long idStatoGuasto) {
		this.idStatoGuasto = idStatoGuasto;
	}

	public String getIdTicket() {
		return this.idTicket;
	}

	public void setIdTicket(String idTicket) {
		this.idTicket = idTicket;
	}

	/*public Boolean getInviato() {
		return this.inviato;
	}

	public void setInviato(Boolean inviato) {
		this.inviato = inviato;
	}*/

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Integer getRetry() {
		return this.retry;
	}

	public void setRetry(Integer retry) {
		this.retry = retry;
	}

	public String getTipoEvento() {
		return this.tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getXmlRichiesta() {
		return this.xmlRichiesta;
	}

	public void setXmlRichiesta(String xmlRichiesta) {
		this.xmlRichiesta = xmlRichiesta;
	}

	public String getXmlRisposta() {
		return this.xmlRisposta;
	}

	public void setXmlRisposta(String xmlRisposta) {
		this.xmlRisposta = xmlRisposta;
	}

	public GuastoStato getStatoGuasto() {
		return statoGuasto;
	}

	public void setStatoGuasto(GuastoStato statoGuasto) {
		this.statoGuasto = statoGuasto;
	}

}