package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the xml_mappatura_progetto database table.
 * 
 */
@Entity
@Table(name="xml_mappatura_progetto")
@NamedQuery(name="XmlMappaturaProgetto.findAll", query="SELECT x FROM XmlMappaturaProgetto x")
public class XmlMappaturaProgetto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idXmlMappaturaProgetto")
	@SequenceGenerator(name="idXmlMappaturaProgetto", sequenceName = "xml_mappatura_progetto_id_xml_mappatura_progetto_seq", allocationSize=1)
	@Column(name="id_xml_mappatura_progetto")
	private Long idXmlMappaturaProgetto;

	@Column(name="descrizione_bt")
	private String descrizioneBt;

	@Column(name="descrizione_fw")
	private String descrizioneFw;

	@Column(name="descrizione_ti")
	private String descrizioneTi;

	@Column(name="descrizione_ti_com")
	private String descrizioneTiCom;

	@Column(name="descrizione_wind")
	private String descrizioneWind;

	@Column(name="flag_attivo")
	private String flagAttivo;

	@Column(name="id_focus")
	private Long idFocus;

	@Column(name="id_progetto_ltm")
	private Long idProgettoLtm;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_focus", insertable=false,updatable=false)
	private Focus focus;

	public XmlMappaturaProgetto() {
	}

	public Long getIdXmlMappaturaProgetto() {
		return this.idXmlMappaturaProgetto;
	}

	public void setIdXmlMappaturaProgetto(Long idXmlMappaturaProgetto) {
		this.idXmlMappaturaProgetto = idXmlMappaturaProgetto;
	}

	public String getDescrizioneBt() {
		return this.descrizioneBt;
	}

	public void setDescrizioneBt(String descrizioneBt) {
		this.descrizioneBt = descrizioneBt;
	}

	public String getDescrizioneFw() {
		return this.descrizioneFw;
	}

	public void setDescrizioneFw(String descrizioneFw) {
		this.descrizioneFw = descrizioneFw;
	}

	public String getDescrizioneTi() {
		return this.descrizioneTi;
	}

	public void setDescrizioneTi(String descrizioneTi) {
		this.descrizioneTi = descrizioneTi;
	}

	public String getDescrizioneTiCom() {
		return this.descrizioneTiCom;
	}

	public void setDescrizioneTiCom(String descrizioneTiCom) {
		this.descrizioneTiCom = descrizioneTiCom;
	}

	public String getDescrizioneWind() {
		return this.descrizioneWind;
	}

	public void setDescrizioneWind(String descrizioneWind) {
		this.descrizioneWind = descrizioneWind;
	}

	public String getFlagAttivo() {
		return this.flagAttivo;
	}

	public void setFlagAttivo(String flagAttivo) {
		this.flagAttivo = flagAttivo;
	}

	public Long getIdFocus() {
		return this.idFocus;
	}

	public void setIdFocus(Long idFocus) {
		this.idFocus = idFocus;
	}

	public Long getIdProgettoLtm() {
		return this.idProgettoLtm;
	}

	public void setIdProgettoLtm(Long idProgettoLtm) {
		this.idProgettoLtm = idProgettoLtm;
	}

	public Focus getFocus() {
		return focus;
	}

	public void setFocus(Focus focus) {
		this.focus = focus;
	}
}