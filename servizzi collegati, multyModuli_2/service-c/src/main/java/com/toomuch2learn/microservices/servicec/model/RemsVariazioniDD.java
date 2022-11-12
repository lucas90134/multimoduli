package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the rems_variazioni_dd database table.
 * 
 */
@Entity
@Table(name="rems_variazioni_dd")
@NamedQuery(name="RemsVariazioniDD.findAll", query="SELECT r FROM RemsVariazioniDD r")
public class RemsVariazioniDD implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRemsVariazioniDD")
	@SequenceGenerator(name="idRemsVariazioniDD", sequenceName = "rems_variazioni_dd_id_rems_variazioni_dd_seq", allocationSize=1)
	@Column(name="id_rems_variazioni_dd")
	private Long idRemsVariazioniDD;

	@Column(name="cod_cliente_finale")
	private String codClienteFinale;

	@Column(name="data_attivazione")
	private Date dataAttivazione;

	@Column(name="profilo_linea")
	private Integer profiloLinea;

	public RemsVariazioniDD() {
	}

	public Long getIdRemsVariazioniDD() {
		return this.idRemsVariazioniDD;
	}

	public void setIdRemsVariazioniDD(Long idRemsVariazioniDD) {
		this.idRemsVariazioniDD = idRemsVariazioniDD;
	}

	public String getCodClienteFinale() {
		return this.codClienteFinale;
	}

	public void setCodClienteFinale(String codClienteFinale) {
		this.codClienteFinale = codClienteFinale;
	}

	public Date getDataAttivazione() {
		return this.dataAttivazione;
	}

	public void setDataAttivazione(Date dataAttivazione) {
		this.dataAttivazione = dataAttivazione;
	}

	public Integer getProfiloLinea() {
		return this.profiloLinea;
	}

	public void setProfiloLinea(Integer profiloLinea) {
		this.profiloLinea = profiloLinea;
	}

}