package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the tipo_vincolo database table.
 * 
 */
@Entity
@Table(name="tipo_vincolo")
@NamedQuery(name="TipoVincolo.findAll", query="SELECT t FROM TipoVincolo t")
public class TipoVincolo implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Column(name="descrizione_tipo_vincolo")
	private String descrizioneTipoVincolo;

	@Column(name="competenza_vincolo")
	private String competenzaVincolo;

	@Id
	@Column(name="id_tipo_vincolo")
	private Long idTipoVincolo;

	public String getDescrizioneTipoVincolo() {
		return descrizioneTipoVincolo;
	}

	public void setDescrizioneTipoVincolo(String descrizioneTipoVincolo) {
		this.descrizioneTipoVincolo = descrizioneTipoVincolo;
	}

	public String getCompetenzaVincolo() {
		return competenzaVincolo;
	}

	public void setCompetenzaVincolo(String competenzaVincolo) {
		this.competenzaVincolo = competenzaVincolo;
	}

	public Long getIdTipoVincolo() {
		return idTipoVincolo;
	}

	public void setIdTipoVincolo(Long idTipoVincolo) {
		this.idTipoVincolo = idTipoVincolo;
	}

}