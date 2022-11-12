package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the MAXIMO_ANAGRAFICA database table.
 * 
 */
@Entity
@Table(name="apparato_ordine_acquisto_allegati")
@NamedQuery(name="ApparatoOrdineAcquistoAllegati.findAll", query="SELECT a FROM ApparatoOrdineAcquistoAllegati a")
public class ApparatoOrdineAcquistoAllegati implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idApparatoOrdineAcquistoAllegati")
	@SequenceGenerator(name="idApparatoOrdineAcquistoAllegati", sequenceName = "apparato_ordine_acquisto_alle_id_apparato_ordine_acquisto_a_seq", allocationSize=1)
	@Column(name="id_apparato_ordine_acquisto_allegati")
	private Long idApparatoOrdineAcquistoAllegati;
	
	@Column(name="id_apparato_ordine_acquisto")
	private Long idApparatoOrdineAcquisto;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_apparato_ordine_acquisto",insertable=false,updatable=false,nullable=true)
	private ApparatoOrdineAcquisto apparatoOrdineAcquisto;
	
	@Column(name="nome_file")
	private String nomeFile;

	@Column(name="tipo_file")
	private String tipoFile;
	
	@Column(name="user_mod")
	private String userMod;
	
	public ApparatoOrdineAcquistoAllegati() {
		super();
	}


	public Long getIdApparatoOrdineAcquisto() {
		return idApparatoOrdineAcquisto;
	}


	@Override
	public String toString() {
		return "ApparatoOrdineAcquistoAllegati [idApparatoOrdineAcquistoAllegati=" + idApparatoOrdineAcquistoAllegati
				+ ", idApparatoOrdineAcquisto=" + idApparatoOrdineAcquisto + ", apparatoOrdineAcquisto="
				+ apparatoOrdineAcquisto + ", nomeFile=" + nomeFile + ", tipoFile=" + tipoFile + ", userMod=" + userMod
				+ "]";
	}


	public Long getIdApparatoOrdineAcquistoAllegati() {
		return idApparatoOrdineAcquistoAllegati;
	}


	public void setIdApparatoOrdineAcquistoAllegati(Long idApparatoOrdineAcquistoAllegati) {
		this.idApparatoOrdineAcquistoAllegati = idApparatoOrdineAcquistoAllegati;
	}


	public ApparatoOrdineAcquisto getApparatoOrdineAcquisto() {
		return apparatoOrdineAcquisto;
	}


	public void setApparatoOrdineAcquisto(ApparatoOrdineAcquisto apparatoOrdineAcquisto) {
		this.apparatoOrdineAcquisto = apparatoOrdineAcquisto;
	}


	public String getNomeFile() {
		return nomeFile;
	}


	public void setNomeFile(String nomeFile) {
		this.nomeFile = nomeFile;
	}


	public String getUserMod() {
		return userMod;
	}


	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}


	public void setIdApparatoOrdineAcquisto(Long idApparatoOrdineAcquisto) {
		this.idApparatoOrdineAcquisto = idApparatoOrdineAcquisto;
	}


	public String getTipoFile() {
		return tipoFile;
	}


	public void setTipoFile(String tipoFile) {
		this.tipoFile = tipoFile;
	}

	
}