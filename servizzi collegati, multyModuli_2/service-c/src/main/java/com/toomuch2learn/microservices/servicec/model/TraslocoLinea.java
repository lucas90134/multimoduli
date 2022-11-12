package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the trasloco_linea database table.
 * 
 */
@Entity
@Table(name="trasloco_linea")
@NamedQuery(name="TraslocoLinea.findAll", query="SELECT t FROM TraslocoLinea t")
public class TraslocoLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idTrasloco")
	@SequenceGenerator(name="idTrasloco", sequenceName = "trasloco_linea_id_trasloco_seq", allocationSize=1)
	@Column(name="id_trasloco")
	private Long idTrasloco;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "ID_LINEA",insertable=false,updatable=false)
	private Linea linea;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "ID_LINEA_TRASLOCATA",insertable=false,updatable=false)
	private Linea lineaTraslocata;
	
	@Column(name="contatore_trasloco_interno")
	private Long contatoreTraslocoInterno;

	@Column(name="data_richiesta_trasloco")
	private Date dataRichiestaTrasloco;

	@Column(name="data_trasloco_fine")
	private Date dataTraslocoFine;

	@Column(name="data_trasloco_inizio")
	private Date dataTraslocoInizio;

	@Column(name="esito_trasloco")
	private String esitoTrasloco;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="id_linea_traslocata")
	private Long idLineaTraslocata;

	@Column(name="id_tipo_trasloco")
	private Long idTipoTrasloco;

	private String note;

	@Column(name="note_fornitore")
	private String noteFornitore;

	@Column(name="user_mod")
	private String userMod;

	public TraslocoLinea() {
	}

	public Long getIdTrasloco() {
		return this.idTrasloco;
	}

	public void setIdTrasloco(Long idTrasloco) {
		this.idTrasloco = idTrasloco;
	}

	public Long getContatoreTraslocoInterno() {
		return this.contatoreTraslocoInterno;
	}

	public void setContatoreTraslocoInterno(Long contatoreTraslocoInterno) {
		this.contatoreTraslocoInterno = contatoreTraslocoInterno;
	}

	public Date getDataRichiestaTrasloco() {
		return this.dataRichiestaTrasloco;
	}

	public void setDataRichiestaTrasloco(Date dataRichiestaTrasloco) {
		this.dataRichiestaTrasloco = dataRichiestaTrasloco;
	}

	public Date getDataTraslocoFine() {
		return this.dataTraslocoFine;
	}

	public void setDataTraslocoFine(Date dataTraslocoFine) {
		this.dataTraslocoFine = dataTraslocoFine;
	}

	public Date getDataTraslocoInizio() {
		return this.dataTraslocoInizio;
	}

	public void setDataTraslocoInizio(Date dataTraslocoInizio) {
		this.dataTraslocoInizio = dataTraslocoInizio;
	}

	public String getEsitoTrasloco() {
		return this.esitoTrasloco;
	}

	public void setEsitoTrasloco(String esitoTrasloco) {
		this.esitoTrasloco = esitoTrasloco;
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Long getIdLineaTraslocata() {
		return this.idLineaTraslocata;
	}

	public void setIdLineaTraslocata(Long idLineaTraslocata) {
		this.idLineaTraslocata = idLineaTraslocata;
	}

	public Long getIdTipoTrasloco() {
		return this.idTipoTrasloco;
	}

	public void setIdTipoTrasloco(Long idTipoTrasloco) {
		this.idTipoTrasloco = idTipoTrasloco;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNoteFornitore() {
		return this.noteFornitore;
	}

	public void setNoteFornitore(String noteFornitore) {
		this.noteFornitore = noteFornitore;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public Linea getLinea() {
		return linea;
	}

	public void setLinea(Linea linea) {
		this.linea = linea;
	}

	public Linea getLineaTraslocata() {
		return lineaTraslocata;
	}

	public void setLineaTraslocata(Linea lineaTraslocata) {
		this.lineaTraslocata = lineaTraslocata;
	}

}