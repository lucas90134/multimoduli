package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="fatturazione_contratti")
public class FatturazioneContratti implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idFatturazioneContratti")
	@SequenceGenerator(name="idFatturazioneContratti", sequenceName = "fatturazione_contratti_id_fatturazione_contratti_seq", allocationSize=1)
	@Column(name="id_fatturazione_contratti")
	private Long idFatturazioneContratti;
	
	@Column(name = "id_business")
	private Long idBusiness;

	@Column(name = "descrizione")
	private String descrizione;

	@Column(name = "inizio_validita")
	private String inizioValidita;

	@Column(name = "fine_validita")
	private String fineValidita;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_business", insertable=false, updatable=false)
	private Business business;

	public Long getIdFatturazioneContratti() {
		return idFatturazioneContratti;
	}

	public void setIdFatturazioneContratti(Long idFatturazioneContratti) {
		this.idFatturazioneContratti = idFatturazioneContratti;
	}

	public Long getIdBusiness() {
		return idBusiness;
	}

	public void setIdBusiness(Long idBusiness) {
		this.idBusiness = idBusiness;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getInizioValidita() {
		return inizioValidita;
	}

	public void setInizioValidita(String inizioValidita) {
		this.inizioValidita = inizioValidita;
	}

	public String getFineValidita() {
		return fineValidita;
	}

	public void setFineValidita(String fineValidita) {
		this.fineValidita = fineValidita;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}
}
