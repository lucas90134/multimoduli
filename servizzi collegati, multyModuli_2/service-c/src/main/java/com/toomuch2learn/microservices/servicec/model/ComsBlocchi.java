package com.toomuch2learn.microservices.servicec.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.envers.NotAudited;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the coms_blocchi database table.
 * 
 */
@Entity
@Table(name="coms_blocchi")
@NamedQuery(name="ComsBlocchi.findAll", query="SELECT c FROM ComsBlocchi c")
public class ComsBlocchi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idComsBlocchi")
	@SequenceGenerator(name="idComsBlocchi", sequenceName = "coms_blocchi_id_coms_blocchi_seq", allocationSize=1)
	@Column(name="id_coms_blocchi")
	private Long idComsBlocchi;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="risposta_coms")
	private String rispostaComs;

	@Column(name="bloccato")
	private Boolean bloccato;

	@Column(name="data_ultimo_intervento")
	private Date dataUltimoIntervento;

	@Column(name="sorgente")
	private String sorgente;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_linea",insertable=false,updatable=false)
	@NotAudited
	private Linea linea;

	public Long getIdComsBlocchi() {
		return idComsBlocchi;
	}

	public void setIdComsBlocchi(Long idComsBlocchi) {
		this.idComsBlocchi = idComsBlocchi;
	}

	public Long getIdLinea() {
		return idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public String getRispostaComs() {
		return rispostaComs;
	}

	public void setRispostaComs(String rispostaComs) {
		this.rispostaComs = rispostaComs;
	}

	public Boolean getBloccato() {
		return bloccato;
	}

	public void setBloccato(Boolean bloccato) {
		this.bloccato = bloccato;
	}

	public Date getDataUltimoIntervento() {
		return dataUltimoIntervento;
	}

	public void setDataUltimoIntervento(Date dataUltimoIntervento) {
		this.dataUltimoIntervento = dataUltimoIntervento;
	}

	public String getSorgente() {
		return sorgente;
	}

	public void setSorgente(String sorgente) {
		this.sorgente = sorgente;
	}

	public Linea getLinea() {
		return linea;
	}

	public void setLinea(Linea linea) {
		this.linea = linea;
	}
}