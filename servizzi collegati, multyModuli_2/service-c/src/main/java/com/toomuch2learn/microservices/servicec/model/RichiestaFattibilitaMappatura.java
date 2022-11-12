package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the richiesta_fattibilita_mappatura database table.
 * 
 */
@Entity
@Table(name="richiesta_fattibilita_mappatura")
@NamedQuery(name="RichiestaFattibilitaMappatura.findAll", query="SELECT r FROM RichiestaFattibilitaMappatura r")
public class RichiestaFattibilitaMappatura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRichiestaFattibilitaMappatura")
	@SequenceGenerator(name="idRichiestaFattibilitaMappatura", sequenceName = "richiesta_fattibilita_mappatu_id_richiesta_fattibilita_mapp_seq", allocationSize=1)
	@Column(name="id_richiesta_fattibilita_mappatura")
	private Long idRichiestaFattibilitaMappatura;
	
	private String acronimo;

	private String fornitore;

	@Column(name="id_profilo_commerciale")
	private Long idProfiloCommerciale;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_profilo_commerciale",insertable=false,updatable=false)
	private ProfiloCommerciale profiloCommerciale;
	
	@Transient
	private String profiloCommercialeDescrizione;

	@Column(name="profilo_fornitore")
	private String profiloFornitore;

	@Column(name="tag_fornitore")
	private String tagFornitore;

	public RichiestaFattibilitaMappatura() {
	}

	public String getAcronimo() {
		return this.acronimo;
	}

	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}

	public String getFornitore() {
		return this.fornitore;
	}

	public void setFornitore(String fornitore) {
		this.fornitore = fornitore;
	}

	public Long getIdProfiloCommerciale() {
		return this.idProfiloCommerciale;
	}

	public void setIdProfiloCommerciale(Long idProfiloCommerciale) {
		this.idProfiloCommerciale = idProfiloCommerciale;
	}

	public Long getIdRichiestaFattibilitaMappatura() {
		return this.idRichiestaFattibilitaMappatura;
	}

	public void setIdRichiestaFattibilitaMappatura(Long idRichiestaFattibilitaMappatura) {
		this.idRichiestaFattibilitaMappatura = idRichiestaFattibilitaMappatura;
	}

	public String getProfiloFornitore() {
		return this.profiloFornitore;
	}

	public void setProfiloFornitore(String profiloFornitore) {
		this.profiloFornitore = profiloFornitore;
	}

	public String getTagFornitore() {
		return this.tagFornitore;
	}

	public void setTagFornitore(String tagFornitore) {
		this.tagFornitore = tagFornitore;
	}

	public ProfiloCommerciale getProfiloCommerciale() {
		return profiloCommerciale;
	}

	public void setProfiloCommerciale(ProfiloCommerciale profiloCommerciale) {
		this.profiloCommerciale = profiloCommerciale;
	}

	public String getProfiloCommercialeDescrizione() {
		return profiloCommercialeDescrizione;
	}

	public void setProfiloCommercialeDescrizione(String profiloCommercialeDescrizione) {
		this.profiloCommercialeDescrizione = profiloCommercialeDescrizione;
	}

}