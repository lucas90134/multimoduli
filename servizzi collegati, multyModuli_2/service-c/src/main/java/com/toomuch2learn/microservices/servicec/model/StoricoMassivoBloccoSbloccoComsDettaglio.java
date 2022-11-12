package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the storico_massivo_blocco_sblocco_coms_dettaglio database table.
 * 
 */
@Entity
@Table(name="storico_massivo_blocco_sblocco_coms_dettaglio")
@NamedQuery(name="StoricoMassivoBloccoSbloccoComsDettaglio.findAll", query="SELECT s FROM StoricoMassivoBloccoSbloccoComsDettaglio s")
public class StoricoMassivoBloccoSbloccoComsDettaglio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idStoricoMassivoBloccoSbloccoComsDettaglio")
	@SequenceGenerator(name="idStoricoMassivoBloccoSbloccoComsDettaglio", sequenceName = "storico_massivo_blocco_sblocco_coms_dettaglio_seq", allocationSize=1)
	@Column(name="id_storico_massivo_blocco_sblocco_coms_dettaglio")
	private Long idStoricoMassivoBloccoSbloccoComsDettaglio;

	@Column(name="id_storico_coms_blocco_sblocco")
	private Long idStoricoComsBloccoSblocco;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="messaggio_errore")
	private String messaggioErrore;

	@Column(name="esito_invio_coms")
	private String esitoInvioComs;

	@Column(name="operazione")
	private String operazione;

	@Column(name="user_mod")
	private String userMod;

	@Column(name="tag_massivo")
	private String tagMassivo;

	@Column(name="retry")
	private Long retry;

	@Column(name="esito_config_router")
	private String esitoConfigRouter;

	@Column(name="risposta_config_router")
	private String rispostaConfigRouter;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_storico_coms_blocco_sblocco", insertable=false, updatable=false)
	private StoricoComsBloccoSblocco storicoComsBloccoSblocco;

	public Long getIdStoricoMassivoBloccoSbloccoComsDettaglio() {
		return idStoricoMassivoBloccoSbloccoComsDettaglio;
	}

	public void setIdStoricoMassivoBloccoSbloccoComsDettaglio(Long idStoricoMassivoBloccoSbloccoComsDettaglio) {
		this.idStoricoMassivoBloccoSbloccoComsDettaglio = idStoricoMassivoBloccoSbloccoComsDettaglio;
	}

	public Long getIdStoricoComsBloccoSblocco() {
		return idStoricoComsBloccoSblocco;
	}

	public void setIdStoricoComsBloccoSblocco(Long idStoricoComsBloccoSblocco) {
		this.idStoricoComsBloccoSblocco = idStoricoComsBloccoSblocco;
	}

	public Long getIdLinea() {
		return idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public String getMessaggioErrore() {
		return messaggioErrore;
	}

	public void setMessaggioErrore(String messaggioErrore) {
		this.messaggioErrore = messaggioErrore;
	}

	public String getEsitoInvioComs() {
		return esitoInvioComs;
	}

	public void setEsitoInvioComs(String esitoInvioComs) {
		this.esitoInvioComs = esitoInvioComs;
	}

	public String getOperazione() {
		return operazione;
	}

	public void setOperazione(String operazione) {
		this.operazione = operazione;
	}

	public String getUserMod() {
		return userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public String getTagMassivo() {
		return tagMassivo;
	}

	public void setTagMassivo(String tagMassivo) {
		this.tagMassivo = tagMassivo;
	}

	public Long getRetry() {
		return retry;
	}

	public void setRetry(Long retry) {
		this.retry = retry;
	}

	public String getEsitoConfigRouter() {
		return esitoConfigRouter;
	}

	public void setEsitoConfigRouter(String esitoConfigRouter) {
		this.esitoConfigRouter = esitoConfigRouter;
	}

	public String getRispostaConfigRouter() {
		return rispostaConfigRouter;
	}

	public void setRispostaConfigRouter(String rispostaConfigRouter) {
		this.rispostaConfigRouter = rispostaConfigRouter;
	}

	public StoricoComsBloccoSblocco getStoricoComsBloccoSblocco() {
		return storicoComsBloccoSblocco;
	}

	public void setStoricoComsBloccoSblocco(StoricoComsBloccoSblocco storicoComsBloccoSblocco) {
		this.storicoComsBloccoSblocco = storicoComsBloccoSblocco;
	}
}