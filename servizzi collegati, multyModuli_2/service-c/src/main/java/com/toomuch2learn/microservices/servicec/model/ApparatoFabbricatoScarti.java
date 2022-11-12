package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="apparato_fabbricato_scarti")
@NamedQuery(name="ApparatoFabbricatoScarti.findAll", query="SELECT a FROM ApparatoFabbricatoScarti a")
public class ApparatoFabbricatoScarti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idApparatoFabbricatoScarti")
	@SequenceGenerator(name="idApparatoFabbricatoScarti", sequenceName = "apparato_fabbricato_scarti_id_apparato_fabbricato_scarti_seq", allocationSize=1)
	@Column(name="id_apparato_fabbricato_scarti")
	private Long idApparatoFabbricatoScarti;
	
	@Column(name="id_import_apparato_fabbricato")
	private Long idImportApparatoFabbricato;

	@Column(name="macaddress",length=16,nullable=false)
	private String macAddress;

	@Column(name="descrizione_anomalia")
	private String descrizioneAnomalia;
	
	@Column(name="matricola")
	private String matricola;
	
	@Override
	public String toString() {
		return "ApparatoFabbricatoScarti [idApparatoFabbricatoScarti=" + idApparatoFabbricatoScarti
				+ ", idImportApparatoFabbricato=" + idImportApparatoFabbricato + ", macAddress=" + macAddress
				+ ", descrizioneAnomalia=" + descrizioneAnomalia + ", matricola=" + matricola + "]";
	}

	public Long getIdApparatoFabbricatoScarti() {
		return idApparatoFabbricatoScarti;
	}

	public void setIdApparatoFabbricatoScarti(Long idApparatoFabbricatoScarti) {
		this.idApparatoFabbricatoScarti = idApparatoFabbricatoScarti;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getDescrizioneAnomalia() {
		return descrizioneAnomalia;
	}

	public void setDescrizioneAnomalia(String descrizioneAnomalia) {
		this.descrizioneAnomalia = descrizioneAnomalia;
	}

	public Long getIdImportApparatoFabbricato() {
		return idImportApparatoFabbricato;
	}

	public void setIdImportApparatoFabbricato(Long idImportApparatoFabbricato) {
		this.idImportApparatoFabbricato = idImportApparatoFabbricato;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
}