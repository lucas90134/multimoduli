package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the promemoria_linea database table.
 * 
 */
@Entity
@Table(name="promemoria_linea")
@NamedQuery(name="PromemoriaLinea.findAll", query="SELECT p FROM PromemoriaLinea p")
public class PromemoriaLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idPromemoriaLinea")
	@SequenceGenerator(name="idPromemoriaLinea", sequenceName = "promemoria_linea_id_promemoria_linea_seq", allocationSize=1)
	@Column(name="id_promemoria_linea")
	private Long idPromemoriaLinea;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "ID_LINEA",insertable=false,updatable=false)
	private Linea linea;

	@Column(name="data_evasione")
	private Date dataEvasione;

	@Column(name="data_inserimento")
	private Date dataInserimento;

	@Column(name="data_scadenza")
	private Date dataScadenza;

	@Column(name="id_linea")
	private Long idLinea;

	private String note;

	@Column(name="user_mod")
	private String userMod;

	public PromemoriaLinea() {
	}

	public Long getIdPromemoriaLinea() {
		return this.idPromemoriaLinea;
	}

	public void setIdPromemoriaLinea(Long idPromemoriaLinea) {
		this.idPromemoriaLinea = idPromemoriaLinea;
	}

	public Date getDataEvasione() {
		return this.dataEvasione;
	}

	public void setDataEvasione(Date dataEvasione) {
		this.dataEvasione = dataEvasione;
	}

	public Date getDataInserimento() {
		return this.dataInserimento;
	}

	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public Date getDataScadenza() {
		return this.dataScadenza;
	}

	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
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

}