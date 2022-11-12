package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the tipo_linea database table.
 * 
 */
@Entity
@Table(name="tipo_linea")
@NamedQuery(name="TipoLinea.findAll", query="SELECT t FROM TipoLinea t")
public class TipoLinea implements Serializable {
	private static final Long serialVersionUID = 1L;

	private String descrizione;

	private Integer grado;
	
	@Column(name="flag_attivo")
	private Boolean flagAttivo;

	@Id
	@Column(name="id_tipo")
	private Long idTipo;
	
	@JsonIgnore 
	@OneToMany(mappedBy = "tipoLinea", fetch = FetchType.LAZY) 
	private List<AdmContrattoLinea> admContrattoLinea; 
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TipoLinea [descrizione=");
		builder.append(descrizione);
		builder.append(", grado=");
		builder.append(grado);
		builder.append(", flagAttivo=");
		builder.append(flagAttivo);
		builder.append(", idTipo=");
		builder.append(idTipo);
		builder.append(", admContrattoLinea=");
		builder.append(admContrattoLinea);
		builder.append("]");
		return builder.toString();
	}

	public TipoLinea() {
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Integer getGrado() {
		return this.grado;
	}

	public void setGrado(Integer grado) {
		this.grado = grado;
	}

	public Long getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}

	public Boolean getFlagAttivo() {
		return flagAttivo;
	}

	public void setFlagAttivo(Boolean flagAttivo) {
		this.flagAttivo = flagAttivo;
	}

	public List<AdmContrattoLinea> getAdmContrattoLinea() {
		return admContrattoLinea;
	}

	public void setAdmContrattoLinea(List<AdmContrattoLinea> admContrattoLinea) {
		this.admContrattoLinea = admContrattoLinea;
	}

}