package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the stato_sede database table.
 * 
 */
@Entity
@Table(name="stato_sede")
@NamedQuery(name="StatoSede.findAll", query="SELECT s FROM StatoSede s")
public class StatoSede implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="flag_num_collegamenti")
	private Integer flagNumCollegamenti;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idStatoSede")
	@SequenceGenerator(name="idStatoSede", sequenceName = "stato_sede_id_stato_sede_seq", allocationSize=1)
	@Column(name="id_stato_sede")
	private Long idStatoSede;

	@Column(name="peso_linea")
	private Integer pesoLinea;

	@Column(name="stato_sede")
	private String statoSede;

	public StatoSede() {
	}

	public Integer getFlagNumCollegamenti() {
		return this.flagNumCollegamenti;
	}

	public void setFlagNumCollegamenti(Integer flagNumCollegamenti) {
		this.flagNumCollegamenti = flagNumCollegamenti;
	}

	public Long getIdStatoSede() {
		return this.idStatoSede;
	}

	public void setIdStatoSede(Long idStatoSede) {
		this.idStatoSede = idStatoSede;
	}

	public Integer getPesoLinea() {
		return this.pesoLinea;
	}

	public void setPesoLinea(Integer pesoLinea) {
		this.pesoLinea = pesoLinea;
	}

	public String getStatoSede() {
		return this.statoSede;
	}

	public void setStatoSede(String statoSede) {
		this.statoSede = statoSede;
	}

}