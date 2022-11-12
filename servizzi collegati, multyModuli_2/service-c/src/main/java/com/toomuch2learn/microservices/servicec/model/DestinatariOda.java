package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
/**
 * The persistent class for the destinatari_oda database table.
 * 
 */
@Entity
@Table(name="destinatari_oda")
@NamedQuery(name="DestinatariOda.findAll", query="SELECT d FROM DestinatariOda d")
public class DestinatariOda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idDestinatarioOda")
	@SequenceGenerator(name="idDestinatarioOda", sequenceName = "destinatari_oda_id_destinatario_oda_seq", allocationSize=1)
	@Column(name="id_destinatario_oda")
	private Long idDestinatarioOda;

	@Column(name="descrizione")
	private String descrizione;

	@Column(name="user_mod")
	private String userMod;


	@JsonIgnore
    @ManyToMany(mappedBy = "destinatariOdas")
    private List<ApparatoOrdineAcquisto> apparatoOrdineAcquistos = new ArrayList<>();
	
	public List<ApparatoOrdineAcquisto> getApparatoOrdineAcquistos() {
		return apparatoOrdineAcquistos;
	}

	public void setApparatoOrdineAcquistos(List<ApparatoOrdineAcquisto> apparatoOrdineAcquistos) {
		this.apparatoOrdineAcquistos = apparatoOrdineAcquistos;
	}

	public DestinatariOda() {
	}

	public Long getIdDestinatarioOda() {
		return this.idDestinatarioOda;
	}

	public void setIdDestinatarioOda(Long idDestinatarioOda) {
		this.idDestinatarioOda = idDestinatarioOda;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}



	@Override
	public String toString() {
		return "{\n\t\"idDestinatarioOda\":\"" + idDestinatarioOda + "\",\n\t\"descrizione\":\"" + descrizione
				+ "\",\n\t\"userMod\":\"" + userMod + "\",\n\t\"apparatoOrdineAcquistos\":\"" + apparatoOrdineAcquistos + "\"\n}";
	}

}