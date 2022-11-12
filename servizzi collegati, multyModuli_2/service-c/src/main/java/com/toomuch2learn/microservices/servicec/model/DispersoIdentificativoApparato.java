package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the MAXIMO_ANAGRAFICA database table.
 * 
 */
@Entity
@Table(name="disperso_identificativo_apparato")
@NamedQuery(name="DispersoIdentificativoApparato.findAll", query="SELECT d FROM DispersoIdentificativoApparato d")
public class DispersoIdentificativoApparato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idDispersoIdentificativoApparato")
	@SequenceGenerator(name="idDispersoIdentificativoApparato", sequenceName = "disperso_identificativo_appar_id_disperso_identificativo_ap_seq", allocationSize=1)
	@Column(name="id_disperso_identificativo_apparato")
	private Long idDispersoIdentificativoApparato;

	@Column(name="descrizione_disperso")
	private String descrizioneDisperso;


	public Long getIdDispersoIdentificativoApparato() {
		return idDispersoIdentificativoApparato;
	}

	public void setIdDispersoIdentificativoApparato(Long idDispersoIdentificativoApparato) {
		this.idDispersoIdentificativoApparato = idDispersoIdentificativoApparato;
	}

	public String getDescrizioneDisperso() {
		return descrizioneDisperso;
	}

	public void setDescrizioneDisperso(String descrizioneDisperso) {
		this.descrizioneDisperso = descrizioneDisperso;
	}



}