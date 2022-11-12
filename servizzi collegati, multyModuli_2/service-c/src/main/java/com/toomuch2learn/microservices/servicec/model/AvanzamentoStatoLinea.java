package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the avanzamento_stato_linea database table.
 * 
 */
@Entity
@Table(name="avanzamento_stato_linea")
@NamedQuery(name="AvanzamentoStatoLinea.findAll", query="SELECT a FROM AvanzamentoStatoLinea a")
public class AvanzamentoStatoLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idAvanzamentoStatoLinea")
	@SequenceGenerator(name="idAvanzamentoStatoLinea", sequenceName = "avanzamento_stato_linea_id_avanzamento_stato_linea_seq", allocationSize=1)
	@Column(name="id_avanzamento_stato_linea")
	private Long idAvanzamentoStatoLinea;

	@Column(name="data_cambio_stato")
	private Date dataCambioStato;

	@Column(name="data_stato_linea")
	private Date dataStatoLinea;

	@Column(name="id_causa_annullamento_linea")
	private Long idCausaAnnullamentoLinea;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_causa_annullamento_linea",insertable=false,updatable=false)
	private CausaAnnullamentoLinea causaAnnullamentoLinea;

	@Column(name="id_causa_attestazione_linea")
	private Long idCausaAttestazioneLinea;

	@Column(name="id_causa_cessazione_linea")
	private Long idCausaCessazioneLinea;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_causa_cessazione_linea",insertable=false,updatable=false)
	private CausaCessazioneLinea causaCessazioneLinea;
	
	@Column(name="id_causa_non_fattibile_linea")
	private Long idCausaNonFattibileLinea;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_causa_non_fattibile_linea",insertable=false,updatable=false)
	private CausaNonFattibileLinea causaNonFattibileLinea;
	
	@Column(name="id_causa_non_realizzabile_linea")
	private Long idCausaNonRealizzabileLinea;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_causa_non_realizzabile_linea",insertable=false,updatable=false)
	private CausaNonRealizzabileLinea causaNonRealizzabileLinea;
	
	@Column(name="id_causa_vincolo_linea")
	private Long idCausaVincoloLinea;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_causa_vincolo_linea",insertable=false,updatable=false)
	private CausaVincoloLinea causaVincoloLinea;
	
	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="id_stato_linea")
	private Long idStatoLinea;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_stato_linea",insertable=false,updatable=false)
	private StatoLinea statoLinea;
	
	private String note;

	private Boolean standby;

	@Column(name="user_mod")
	private String userMod;

	public AvanzamentoStatoLinea() {
	}

	public Long getIdAvanzamentoStatoLinea() {
		return idAvanzamentoStatoLinea;
	}

	public void setIdAvanzamentoStatoLinea(Long idAvanzamentoStatoLinea) {
		this.idAvanzamentoStatoLinea = idAvanzamentoStatoLinea;
	}

	public Date getDataCambioStato() {
		return dataCambioStato;
	}

	public void setDataCambioStato(Date dataCambioStato) {
		this.dataCambioStato = dataCambioStato;
	}

	public Date getDataStatoLinea() {
		return dataStatoLinea;
	}

	public void setDataStatoLinea(Date dataStatoLinea) {
		this.dataStatoLinea = dataStatoLinea;
	}

	public Long getIdCausaAnnullamentoLinea() {
		return idCausaAnnullamentoLinea;
	}

	public void setIdCausaAnnullamentoLinea(Long idCausaAnnullamentoLinea) {
		this.idCausaAnnullamentoLinea = idCausaAnnullamentoLinea;
	}

	public CausaAnnullamentoLinea getCausaAnnullamentoLinea() {
		return causaAnnullamentoLinea;
	}

	public void setCausaAnnullamentoLinea(CausaAnnullamentoLinea causaAnnullamentoLinea) {
		this.causaAnnullamentoLinea = causaAnnullamentoLinea;
	}

	public Long getIdCausaCessazioneLinea() {
		return idCausaCessazioneLinea;
	}

	public void setIdCausaCessazioneLinea(Long idCausaCessazioneLinea) {
		this.idCausaCessazioneLinea = idCausaCessazioneLinea;
	}

	public CausaCessazioneLinea getCausaCessazioneLinea() {
		return causaCessazioneLinea;
	}

	public void setCausaCessazioneLinea(CausaCessazioneLinea causaCessazioneLinea) {
		this.causaCessazioneLinea = causaCessazioneLinea;
	}

	public Long getIdCausaNonFattibileLinea() {
		return idCausaNonFattibileLinea;
	}

	public void setIdCausaNonFattibileLinea(Long idCausaNonFattibileLinea) {
		this.idCausaNonFattibileLinea = idCausaNonFattibileLinea;
	}

	public CausaNonFattibileLinea getCausaNonFattibileLinea() {
		return causaNonFattibileLinea;
	}

	public void setCausaNonFattibileLinea(CausaNonFattibileLinea causaNonFattibileLinea) {
		this.causaNonFattibileLinea = causaNonFattibileLinea;
	}

	public Long getIdCausaNonRealizzabileLinea() {
		return idCausaNonRealizzabileLinea;
	}

	public void setIdCausaNonRealizzabileLinea(Long idCausaNonRealizzabileLinea) {
		this.idCausaNonRealizzabileLinea = idCausaNonRealizzabileLinea;
	}

	public CausaNonRealizzabileLinea getCausaNonRealizzabileLinea() {
		return causaNonRealizzabileLinea;
	}

	public void setCausaNonRealizzabileLinea(CausaNonRealizzabileLinea causaNonRealizzabileLinea) {
		this.causaNonRealizzabileLinea = causaNonRealizzabileLinea;
	}

	public Long getIdCausaVincoloLinea() {
		return idCausaVincoloLinea;
	}

	public void setIdCausaVincoloLinea(Long idCausaVincoloLinea) {
		this.idCausaVincoloLinea = idCausaVincoloLinea;
	}

	public CausaVincoloLinea getCausaVincoloLinea() {
		return causaVincoloLinea;
	}

	public void setCausaVincoloLinea(CausaVincoloLinea causaVincoloLinea) {
		this.causaVincoloLinea = causaVincoloLinea;
	}

	public Long getIdLinea() {
		return idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Long getIdStatoLinea() {
		return idStatoLinea;
	}

	public void setIdStatoLinea(Long idStatoLinea) {
		this.idStatoLinea = idStatoLinea;
	}

	public StatoLinea getStatoLinea() {
		return statoLinea;
	}

	public void setStatoLinea(StatoLinea statoLinea) {
		this.statoLinea = statoLinea;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getStandby() {
		return standby;
	}

	public void setStandby(Boolean standby) {
		this.standby = standby;
	}

	public String getUserMod() {
		return userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public Long getIdCausaAttestazioneLinea() {
		return idCausaAttestazioneLinea;
	}

	public void setIdCausaAttestazioneLinea(Long idCausaAttestazioneLinea) {
		this.idCausaAttestazioneLinea = idCausaAttestazioneLinea;
	}
	
}