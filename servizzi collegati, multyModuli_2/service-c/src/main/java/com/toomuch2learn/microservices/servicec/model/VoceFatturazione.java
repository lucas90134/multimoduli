package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the voce_fatturazione database table.
 * 
 */
@Entity
@Table(name="voce_fatturazione")
@NamedQuery(name="VoceFatturazione.findAll", query="SELECT v FROM VoceFatturazione v")
public class VoceFatturazione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idVoceFatturazione")
	@SequenceGenerator(name="idVoceFatturazione", sequenceName = "voce_fatturazione_id_voce_fatturazione_seq", allocationSize=1)
	@Column(name="id_voce_fatturazione")
	private Long idVoceFatturazione;

	@Column(name="costo_personalizzato")
	private Boolean costoPersonalizzato;

	@Column(name="data_mod")
	private Date dataMod;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="id_tipo_voce")
	private Long idTipoVoce;

	private BigDecimal importo;

	private String note;

	@Column(name="user_mod")
	private String userMod;

	@Column(name="voce_fatturazione")
	private String voceFatturazione;

	public VoceFatturazione() {
	}

	public Long getIdVoceFatturazione() {
		return this.idVoceFatturazione;
	}

	public void setIdVoceFatturazione(Long idVoceFatturazione) {
		this.idVoceFatturazione = idVoceFatturazione;
	}

	public Boolean getCostoPersonalizzato() {
		return this.costoPersonalizzato;
	}

	public void setCostoPersonalizzato(Boolean costoPersonalizzato) {
		this.costoPersonalizzato = costoPersonalizzato;
	}

	public Date getDataMod() {
		return this.dataMod;
	}

	public void setDataMod(Date dataMod) {
		this.dataMod = dataMod;
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Long getIdTipoVoce() {
		return this.idTipoVoce;
	}

	public void setIdTipoVoce(Long idTipoVoce) {
		this.idTipoVoce = idTipoVoce;
	}

	public BigDecimal getImporto() {
		return this.importo;
	}

	public void setImporto(BigDecimal importo) {
		this.importo = importo;
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

	public String getVoceFatturazione() {
		return this.voceFatturazione;
	}

	public void setVoceFatturazione(String voceFatturazione) {
		this.voceFatturazione = voceFatturazione;
	}

}