package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
/**
 * The persistent class for the progetto_ltm_sottoprogetto database table.
 * 
 */
@Entity
@Table(name="focus")
@NamedQuery(name="Focus.findAll", query="SELECT p FROM Focus p")
public class Focus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idFocus")
	@SequenceGenerator(name="idFocus", sequenceName = "focus_id_focus_seq", allocationSize=1)
	@Column(name="id_focus")
	private Long idFocus;
	
	@Column(name="flag_attivo")
	private String flagAttivo;

	@Column(name="flag_default")
	private String flagDefault;

	@Column(name="id_progetto_ltm")
	private Long idProgettoLtm;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_progetto_ltm",insertable=false,updatable=false)
	private ProgettoLtm progettoLtm;

	@JsonIgnore
	@OneToMany(mappedBy = "focus", fetch = FetchType.LAZY)
	private List<XmlMappaturaProgetto> xmlMappaturaProgetto;
	
	private String focus;

	public Focus() {}

	public Long getIdFocus() {
		return idFocus;
	}

	public void setIdFocus(Long idFocus) {
		this.idFocus = idFocus;
	}

	public String getFlagAttivo() {
		return flagAttivo;
	}

	public void setFlagAttivo(String flagAttivo) {
		this.flagAttivo = flagAttivo;
	}

	public String getFlagDefault() {
		return flagDefault;
	}

	public void setFlagDefault(String flagDefault) {
		this.flagDefault = flagDefault;
	}

	public Long getIdProgettoLtm() {
		return idProgettoLtm;
	}

	public void setIdProgettoLtm(Long idProgettoLtm) {
		this.idProgettoLtm = idProgettoLtm;
	}

	public String getFocus() {
		return focus;
	}

	public void setFocus(String focus) {
		this.focus = focus;
	}

	public ProgettoLtm getProgettoLtm() {
		return progettoLtm;
	}

	public void setProgettoLtm(ProgettoLtm progettoLtm) {
		this.progettoLtm = progettoLtm;
	}

	public List<XmlMappaturaProgetto> getXmlMappaturaProgetto() {
		return xmlMappaturaProgetto;
	}

	public void setXmlMappaturaProgetto(List<XmlMappaturaProgetto> xmlMappaturaProgetto) {
		this.xmlMappaturaProgetto = xmlMappaturaProgetto;
	}
}