package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the linea_tipo_template database table.
 * 
 */
@Entity
@Table(name="linea_tipo_template")
@NamedQuery(name="LineaTipoTemplate.findAll", query="SELECT l FROM LineaTipoTemplate l")
public class LineaTipoTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idLineaTemplate")
	@SequenceGenerator(name="idLineaTemplate", sequenceName = "linea_tipo_template_id_linea_template_seq", allocationSize=1)
	@Column(name="id_linea_template")
	private Long idLineaTemplate;

	@Column(name="data_inserimento")
	private Date dataInserimento;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="id_tipo_template")
	private Integer idTipoTemplate;

	private String operazione;

	private String usermod;

	public LineaTipoTemplate() {
	}

	public Long getIdLineaTemplate() {
		return this.idLineaTemplate;
	}

	public void setIdLineaTemplate(Long idLineaTemplate) {
		this.idLineaTemplate = idLineaTemplate;
	}

	public Date getDataInserimento() {
		return this.dataInserimento;
	}

	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Integer getIdTipoTemplate() {
		return this.idTipoTemplate;
	}

	public void setIdTipoTemplate(Integer idTipoTemplate) {
		this.idTipoTemplate = idTipoTemplate;
	}

	public String getOperazione() {
		return this.operazione;
	}

	public void setOperazione(String operazione) {
		this.operazione = operazione;
	}

	public String getUsermod() {
		return this.usermod;
	}

	public void setUsermod(String usermod) {
		this.usermod = usermod;
	}

}