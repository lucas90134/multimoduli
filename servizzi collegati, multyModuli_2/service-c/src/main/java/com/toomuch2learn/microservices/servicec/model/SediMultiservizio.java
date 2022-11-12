package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the SEDI database table.
 * 
 */
@Entity
@Table(name="SEDI_MULTISERVIZIO")
@NamedQuery(name="SediMultiservizio.findAll", query="SELECT s FROM SediMultiservizio s")
public class SediMultiservizio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSedeMultiservizio")
	@SequenceGenerator(name="idSedeMultiservizio", sequenceName = "sedi_multiservizio_id_sede_multiservizio_seq", allocationSize=1)
	@Column(name="id_sede_multiservizio")
	private Long idSedeMultiservizio;

	@JsonIgnore
	@OneToMany(mappedBy = "sediMultiservizio",fetch=FetchType.LAZY)
	private List<Sedi> sedi;
	
	@Column(name="codice")
	private String codice;

	@Column(name="id_sede_multiservizio_target")
	private Long idSedeMultiservizioTarget;

	@Column(name="note")
	private String note;

	@Column(name="user_mod")
	private String userMod;

	@Column(name="stato")
	private String stato;

	@Column(name="sede_multiservizio_target")
	private String sedeMultiservizioTarget;

	@Column(name="id_sede_1")
	private Long idSede1;

	@Column(name="id_sede_2")
	private Long idSede2;

	@Column(name="id_sede_3")
	private Long idSede3;

	@Column(name="id_sede_4")
	private Long idSede4;

	@Column(name="id_linea_better")
	private Long idLineaBetter;

	@Column(name="id_sedi_multiservizio_stato")
	private Long idSediMultiservizioStato;
	
//	@JsonIgnore
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name = "id_sedi_multiservizio_stato",insertable=false,updatable=false)    
//	private SediMultiservizioStato sediMultiservizioStato;

	@Column(name="data_stato_sede")
	private Date dataStatoSede;

	public Long getIdSedeMultiservizio() {
		return idSedeMultiservizio;
	}

	public void setIdSedeMultiservizio(Long idSedeMultiservizio) {
		this.idSedeMultiservizio = idSedeMultiservizio;
	}

	public List<Sedi> getSedi() {
		return sedi;
	}

	public void setSedi(List<Sedi> sedi) {
		this.sedi = sedi;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public Long getIdSedeMultiservizioTarget() {
		return idSedeMultiservizioTarget;
	}

	public void setIdSedeMultiservizioTarget(Long idSedeMultiservizioTarget) {
		this.idSedeMultiservizioTarget = idSedeMultiservizioTarget;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getUserMod() {
		return userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getSedeMultiservizioTarget() {
		return sedeMultiservizioTarget;
	}

	public void setSedeMultiservizioTarget(String sedeMultiservizioTarget) {
		this.sedeMultiservizioTarget = sedeMultiservizioTarget;
	}

	public Long getIdSede1() {
		return idSede1;
	}

	public void setIdSede1(Long idSede1) {
		this.idSede1 = idSede1;
	}

	public Long getIdSede2() {
		return idSede2;
	}

	public void setIdSede2(Long idSede2) {
		this.idSede2 = idSede2;
	}

	public Long getIdSede3() {
		return idSede3;
	}

	public void setIdSede3(Long idSede3) {
		this.idSede3 = idSede3;
	}

	public Long getIdSede4() {
		return idSede4;
	}

	public void setIdSede4(Long idSede4) {
		this.idSede4 = idSede4;
	}

	public Long getIdLineaBetter() {
		return idLineaBetter;
	}

	public void setIdLineaBetter(Long idLineaBetter) {
		this.idLineaBetter = idLineaBetter;
	}

	public Long getIdSediMultiservizioStato() {
		return idSediMultiservizioStato;
	}

	public void setIdSediMultiservizioStato(Long idSediMultiservizioStato) {
		this.idSediMultiservizioStato = idSediMultiservizioStato;
	}

	public Date getDataStatoSede() {
		return dataStatoSede;
	}

	public void setDataStatoSede(Date dataStatoSede) {
		this.dataStatoSede = dataStatoSede;
	}
//
//	public SediMultiservizioStato getSediMultiservizioStato() {
//		return sediMultiservizioStato;
//	}
//
//	public void setSediMultiservizioStato(SediMultiservizioStato sediMultiservizioStato) {
//		this.sediMultiservizioStato = sediMultiservizioStato;
//	}
//	
	
}
