package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the xml_mappatura_tipo_linea database table.
 * 
 */
@Entity
@Table(name="xml_mappatura_tipo_linea")
@NamedQuery(name="XmlMappaturaTipoLinea.findAll", query="SELECT x FROM XmlMappaturaTipoLinea x")
public class XmlMappaturaTipoLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idXmlMappaturaTipoLinea")
	@SequenceGenerator(name="idXmlMappaturaTipoLinea", sequenceName = "xml_mappatura_tipo_linea_id_xml_mappatura_tipo_linea_seq", allocationSize=1)
	@Column(name="id_xml_mappatura_tipo_linea")
	private Long idXmlMappaturaTipoLinea;

	@Column(name="descrizione_fw")
	private String descrizioneFw;

	@Column(name="descrizione_ti_com")
	private String descrizioneTiCom;

	@Column(name="descrizione_wind")
	private String descrizioneWind;

	@Column(name="id_profilo_commerciale")
	private Long idProfiloCommerciale;

	@Column(name="id_tipo")
	private Long idTipo;

	public XmlMappaturaTipoLinea() {
	}

	public Long getIdXmlMappaturaTipoLinea() {
		return this.idXmlMappaturaTipoLinea;
	}

	public void setIdXmlMappaturaTipoLinea(Long idXmlMappaturaTipoLinea) {
		this.idXmlMappaturaTipoLinea = idXmlMappaturaTipoLinea;
	}

	public String getDescrizioneFw() {
		return this.descrizioneFw;
	}

	public void setDescrizioneFw(String descrizioneFw) {
		this.descrizioneFw = descrizioneFw;
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

	public Long getIdProfiloCommerciale() {
		return this.idProfiloCommerciale;
	}

	public void setIdProfiloCommerciale(Long idProfiloCommerciale) {
		this.idProfiloCommerciale = idProfiloCommerciale;
	}

	public Long getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}

}