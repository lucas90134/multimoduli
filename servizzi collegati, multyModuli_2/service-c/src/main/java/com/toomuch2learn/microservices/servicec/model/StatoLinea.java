package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the STATO_LINEA database table.
 * 
 */
@Entity
@Table(name="STATO_LINEA")
@NamedQuery(name="StatoLinea.findAll", query="SELECT s FROM StatoLinea s")
public class StatoLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idStatoLinea")
	@SequenceGenerator(name="idStatoLinea", sequenceName = "stato_linea_id_stato_linea_seq", allocationSize=1)
	@Column(name="ID_STATO_LINEA")
	private Long idStatoLinea;

	@Column(name="CODIFICA")
	private String codifica;

	@Column(name="DESCRIZIONE")
	private String descrizione;

	@Column(name="FLAG_EOF")
	private Boolean flagEof;

	@Column(name="FLAG_IN_LAVORAZIONE")
	private Boolean flagInLavorazione;

	@Column(name="FLAG_OPERATIVO")
	private Boolean flagOperativo;

	@Column(name="FLAG_INFRASTRUTTURA")
	private Boolean flagInfrastruttura;
	
	@Column(name="FLAG_CLIENTE")
	private Boolean flagCliente;
	
	@JsonIgnore
	@OneToMany(mappedBy = "statoLinea", fetch = FetchType.LAZY)
	private List<LineInfrastructure> line;

	public StatoLinea() {
	}

	public Long getIdStatoLinea() {
		return idStatoLinea;
	}

	public void setIdStatoLinea(Long idStatoLinea) {
		this.idStatoLinea = idStatoLinea;
	}

	public String getCodifica() {
		return codifica;
	}

	public void setCodifica(String codifica) {
		this.codifica = codifica;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Boolean getFlagEof() {
		return flagEof;
	}

	public void setFlagEof(Boolean flagEof) {
		this.flagEof = flagEof;
	}

	public Boolean getFlagInLavorazione() {
		return flagInLavorazione;
	}

	public void setFlagInLavorazione(Boolean flagInLavorazione) {
		this.flagInLavorazione = flagInLavorazione;
	}

	public Boolean getFlagOperativo() {
		return flagOperativo;
	}

	public void setFlagOperativo(Boolean flagOperativo) {
		this.flagOperativo = flagOperativo;
	}

	public List<LineInfrastructure> getLine() {
		return line;
	}

	public void setLine(List<LineInfrastructure> line) {
		this.line = line;
	}

	public Boolean getFlagInfrastruttura() {
		return flagInfrastruttura;
	}

	public void setFlagInfrastruttura(Boolean flagInfrastruttura) {
		this.flagInfrastruttura = flagInfrastruttura;
	}

	public Boolean getFlagCliente() {
		return flagCliente;
	}

	public void setFlagCliente(Boolean flagCliente) {
		this.flagCliente = flagCliente;
	}

}