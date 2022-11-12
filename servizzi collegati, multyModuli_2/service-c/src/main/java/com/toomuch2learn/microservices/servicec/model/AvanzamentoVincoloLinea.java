package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the avanzamento_vincolo_linea database table.
 * 
 */
@Entity
@Table(name="avanzamento_vincolo_linea")
@NamedQuery(name="AvanzamentoVincoloLinea.findAll", query="SELECT a FROM AvanzamentoVincoloLinea a")
public class AvanzamentoVincoloLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idAvanzamentoVincoloLinea")
	@SequenceGenerator(name="idAvanzamentoVincoloLinea", sequenceName = "avanzamento_vincolo_linea_id_avanzamento_vincolo_linea_seq", allocationSize=1)
	@Column(name="id_avanzamento_vincolo_linea")
	private Long idAvanzamentoVincoloLinea;

	@Column(name="data_apertura")
	private Date dataApertura;

	@Column(name="data_apertura_wr")
	private Date dataAperturaWr;

	@Column(name="data_chiusura")
	private Date dataChiusura;

	@Column(name="data_prevista_chiusura")
	private Date dataPrevistaChiusura;

	@Column(name="data_prevista_chiusura_wr")
	private Date dataPrevistaChiusuraWr;

	@Column(name="id_causa_vincolo_linea")
	private Long idCausaVincoloLinea;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="inserito_da")
	private String inseritoDa;

	@Column(name="note_apertura")
	private String noteApertura;

	@Column(name="note_chiusura")
	private String noteChiusura;

	@Column(name="sigla_wr")
	private String siglaWr;

	public AvanzamentoVincoloLinea() {
	}

	public Long getIdAvanzamentoVincoloLinea() {
		return this.idAvanzamentoVincoloLinea;
	}

	public void setIdAvanzamentoVincoloLinea(Long idAvanzamentoVincoloLinea) {
		this.idAvanzamentoVincoloLinea = idAvanzamentoVincoloLinea;
	}

	public Date getDataApertura() {
		return this.dataApertura;
	}

	public void setDataApertura(Date dataApertura) {
		this.dataApertura = dataApertura;
	}

	public Date getDataAperturaWr() {
		return this.dataAperturaWr;
	}

	public void setDataAperturaWr(Date dataAperturaWr) {
		this.dataAperturaWr = dataAperturaWr;
	}

	public Date getDataChiusura() {
		return this.dataChiusura;
	}

	public void setDataChiusura(Date dataChiusura) {
		this.dataChiusura = dataChiusura;
	}

	public Date getDataPrevistaChiusura() {
		return this.dataPrevistaChiusura;
	}

	public void setDataPrevistaChiusura(Date dataPrevistaChiusura) {
		this.dataPrevistaChiusura = dataPrevistaChiusura;
	}

	public Date getDataPrevistaChiusuraWr() {
		return this.dataPrevistaChiusuraWr;
	}

	public void setDataPrevistaChiusuraWr(Date dataPrevistaChiusuraWr) {
		this.dataPrevistaChiusuraWr = dataPrevistaChiusuraWr;
	}

	public Long getIdCausaVincoloLinea() {
		return this.idCausaVincoloLinea;
	}

	public void setIdCausaVincoloLinea(Long idCausaVincoloLinea) {
		this.idCausaVincoloLinea = idCausaVincoloLinea;
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public String getInseritoDa() {
		return this.inseritoDa;
	}

	public void setInseritoDa(String inseritoDa) {
		this.inseritoDa = inseritoDa;
	}

	public String getNoteApertura() {
		return this.noteApertura;
	}

	public void setNoteApertura(String noteApertura) {
		this.noteApertura = noteApertura;
	}

	public String getNoteChiusura() {
		return this.noteChiusura;
	}

	public void setNoteChiusura(String noteChiusura) {
		this.noteChiusura = noteChiusura;
	}

	public String getSiglaWr() {
		return this.siglaWr;
	}

	public void setSiglaWr(String siglaWr) {
		this.siglaWr = siglaWr;
	}

}