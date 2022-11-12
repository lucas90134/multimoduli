package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the guasti database table.
 * 
 */
@Entity
@Table(name="guasti_associazione_ambito")
@NamedQuery(name="GuastiAssociazioneAmbito.findAll", query="SELECT g FROM GuastiAssociazioneAmbito g")
public class GuastiAssociazioneAmbito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idGuastiAssociazioneAmbito")
	@SequenceGenerator(name="idGuastiAssociazioneAmbito", sequenceName = "guasti_associazione_ambito_id_guasto_associazione_ambito_seq", allocationSize=1)
	@Column(name="id_guasto_associazione_ambito")
	private Long idGuastiAssociazioneAmbito;

	@Column(name="td_linea")
	private String tdLinea;
	
	@Column(name="id_guasti_helpsi")
	private Long idGuastoHelpsi;
	
	@Column(name="id_stato_guasto")
	private Long idStatoGuasto;
	
	@Column(name="data_ricezione")
	private Date dataRicezione;
	
	@Column(name="data_invio")
	private Date dataInvio;
	
	@Column(name="id_associativo")
	private Long idAssociativo;
	
	@Column(name="id_guasto")
	private Long idGuasto;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_guasto" , updatable=false, insertable=false)
    private Guasti guasto;
	
	@Column(name="ambito")
	private String ambito;
	
	@Column(name="tipo_evento_da_inviare")
	private String tipoEventoDaInviare;

	@Column(name="principale")
	private Boolean principale;

	
	@Override
	public String toString() {
		return "GuastiAssociazioneAmbito [idGuastiAssociazioneAmbito=" + idGuastiAssociazioneAmbito + ", tdLinea="
				+ tdLinea + ", idGuastoHelpsi=" + idGuastoHelpsi + ", idStatoGuasto=" + idStatoGuasto
				+ ", dataRicezione=" + dataRicezione + ", dataInvio=" + dataInvio + ", idAssociativo=" + idAssociativo
				+ ", idGuasto=" + idGuasto + ", ambito=" + ambito + ", principale=" + principale + "]";
	}

	public GuastiAssociazioneAmbito() {
		super();
	}

	public GuastiAssociazioneAmbito(Long idGuastiAssociazioneAmbito, String tdLinea, Long idGuastoHelpsi,
			Long idStatoGuasto, Date dataRicezione, Date dataInvio, Long idAssociativo, Long idGuasto, String ambito,
			Boolean principale) {
		super();
		this.idGuastiAssociazioneAmbito = idGuastiAssociazioneAmbito;
		this.tdLinea = tdLinea;
		this.idGuastoHelpsi = idGuastoHelpsi;
		this.idStatoGuasto = idStatoGuasto;
		this.dataRicezione = dataRicezione;
		this.dataInvio = dataInvio;
		this.idAssociativo = idAssociativo;
		this.idGuasto = idGuasto;
		this.ambito = ambito;
		this.principale = principale;
	}

	public Long getIdGuastiAssociazioneAmbito() {
		return idGuastiAssociazioneAmbito;
	}

	public void setIdGuastiAssociazioneAmbito(Long idGuastiAssociazioneAmbito) {
		this.idGuastiAssociazioneAmbito = idGuastiAssociazioneAmbito;
	}

	public String getTdLinea() {
		return tdLinea;
	}

	public void setTdLinea(String tdLinea) {
		this.tdLinea = tdLinea;
	}

	public Long getIdGuastoHelpsi() {
		return idGuastoHelpsi;
	}

	public void setIdGuastoHelpsi(Long idGuastoHelpsi) {
		this.idGuastoHelpsi = idGuastoHelpsi;
	}

	public Long getIdStatoGuasto() {
		return idStatoGuasto;
	}

	public void setIdStatoGuasto(Long idStatoGuasto) {
		this.idStatoGuasto = idStatoGuasto;
	}

	public Date getDataRicezione() {
		return dataRicezione;
	}

	public void setDataRicezione(Date dataRicezione) {
		this.dataRicezione = dataRicezione;
	}

	public Date getDataInvio() {
		return dataInvio;
	}

	public void setDataInvio(Date dataInvio) {
		this.dataInvio = dataInvio;
	}

	public Long getIdAssociativo() {
		return idAssociativo;
	}

	public void setIdAssociativo(Long idAssociativo) {
		this.idAssociativo = idAssociativo;
	}

	public Long getIdGuasto() {
		return idGuasto;
	}

	public void setIdGuasto(Long idGuasto) {
		this.idGuasto = idGuasto;
	}

	public String getAmbito() {
		return ambito;
	}

	public void setAmbito(String ambito) {
		this.ambito = ambito;
	}
	
	public String getTipoEventoDaInviare() {
		return tipoEventoDaInviare;
	}

	public void setTipoEventoDaInviare(String tipoEventoDaInviare) {
		this.tipoEventoDaInviare = tipoEventoDaInviare;
	}
	
	public Boolean getPrincipale() {
		return principale;
	}

	public void setPrincipale(Boolean principale) {
		this.principale = principale;
	}

	public Guasti getGuasto() {
		return guasto;
	}

	public void setGuasto(Guasti guasto) {
		this.guasto = guasto;
	}

}