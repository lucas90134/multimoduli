package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the STATO_ROUTER database table.
 * 
 */
@Entity
@Table(name="tipo_apparato")
@NamedQuery(name="TipoApparato.findAll", query="SELECT s FROM TipoApparato s")
public class TipoApparato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo_apparato")
	private Long idTipoApparato;

	@Column(name="descrizione")
	private String descrizione;

	@JsonIgnore
    @ManyToMany(mappedBy = "tipoApparatos")
    private List<ApparatoOrdineAcquisto> apparatoOrdineAcquistos = new ArrayList<>();
	
	public TipoApparato() {
	}

	@Override
	public String toString() {
		return "{\n\t\"idTipoApparato\":\"" + idTipoApparato + "\",\n\t\"descrizione\":\"" + descrizione
				+ "\",\n\t\"apparatoOrdineAcquistos\":\"" + apparatoOrdineAcquistos + "\"\n}";
	}

	public Long getIdTipoApparato() {
		return idTipoApparato;
	}

	public void setIdTipoApparato(Long idTipoApparato) {
		this.idTipoApparato = idTipoApparato;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<ApparatoOrdineAcquisto> getApparatoOrdineAcquistos() {
		return apparatoOrdineAcquistos;
	}

	public void setApparatoOrdineAcquistos(List<ApparatoOrdineAcquisto> apparatoOrdineAcquistos) {
		this.apparatoOrdineAcquistos = apparatoOrdineAcquistos;
	}
	
}