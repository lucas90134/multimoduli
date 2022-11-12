package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
/**
 * The persistent class for the XML_EPROCUREMENT_STORICO database table.
 *
 */
@Entity
@Table(name = "xml_eprocurement_storico")
@NamedQuery(name = "XmlEprocurementStorico.findAll", query = "SELECT x FROM XmlEprocurementStorico x")
public class XmlEprocurementStorico implements Serializable {

	private static final long serialVersionUID = 8328192641776217948L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idXmlEprocurementStorico")
	@SequenceGenerator(name="idXmlEprocurementStorico", sequenceName = "xml_eprocurement_storico_id_xml_eprocurement_storico_seq", allocationSize=1)
	@Column(name = "id_xml_eprocurement_storico")
	private Long idXmlEprocurementStorico;

	@Column(name = "id_anagrafica_fornitore")
	private Long idAnagraficaFornitore;

	@Column(name = "id_linea")
	private Long idLinea;

	@Column(name = "id_sede")
	private Long idSede;

	@Column(name = "stato_fornitore")
	private String statoFornitore;

	@Column(name = "tipo_richiesta_fornitore")
	private String tipoRichiestaFornitore;

	@Column(name = "stringa_xml_fornitore")
	private String stringaXmlFornitore;

	@Column(name = "data_ricezione")
	private Date dataRicezione;

	@Column(name = "flag_elaborata")
	private Long flagElaborata;

	@Column(name = "data_risposta_sed")
	private Date dataRispostaSed;

	@Column(name = "risposta_sed")
	private String rispostaSed;

	@Column(name = "stringa_xml_sed")
	private String stringaXmlSed;

	@Column(name = "note")
	private String note;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ANAGRAFICA_FORNITORE",insertable=false,updatable=false)
	private AnagraficaFornitore anagraficaFornitore;

	@Override
	public String toString() {
		return "XmlEprocurementStorico [idXmlEprocurementStorico=" + idXmlEprocurementStorico + ", idAnagraficaFornitore="
				+ idAnagraficaFornitore + ", idLinea=" + idLinea + ", idSede=" + idSede + ", statoFornitore=" + statoFornitore
				+ ", tipoRichiestaFornitore=" + tipoRichiestaFornitore + ", stringaXmlFornitore=" + stringaXmlFornitore
				+ ", dataRicezione=" + dataRicezione + ", flagElaborata=" + flagElaborata + ", dataRispostaSed=" + dataRispostaSed
				+ ", stringaXmlSed=" + stringaXmlSed + ", rispostaSed=" + rispostaSed +  ", note=" + note +  "]";
	}

	public Long getIdXmlEprocurementStorico() {
		return idXmlEprocurementStorico;
	}

	public void setIdXmlEprocurementStorico(Long idXmlEprocurementStorico) {
		this.idXmlEprocurementStorico = idXmlEprocurementStorico;
	}

	public Long getIdAnagraficaFornitore() {
		return idAnagraficaFornitore;
	}

	public void setIdAnagraficaFornitore(Long idAnagraficaFornitore) {
		this.idAnagraficaFornitore = idAnagraficaFornitore;
	}

	public Long getIdLinea() {
		return idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Long getIdSede() {
		return idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public String getStatoFornitore() {
		return statoFornitore;
	}

	public void setStatoFornitore(String statoFornitore) {
		this.statoFornitore = statoFornitore;
	}

	public String getTipoRichiestaFornitore() {
		return tipoRichiestaFornitore;
	}

	public void setTipoRichiestaFornitore(String tipoRichiestaFornitore) {
		this.tipoRichiestaFornitore = tipoRichiestaFornitore;
	}

	public String getStringaXmlFornitore() {
		return stringaXmlFornitore;
	}

	public void setStringaXmlFornitore(String stringaXmlFornitore) {
		this.stringaXmlFornitore = stringaXmlFornitore;
	}


	public Date getDataRicezione() {
		return dataRicezione;
	}

	public void setDataRicezione(Date dataRicezione) {
		this.dataRicezione = dataRicezione;
	}

	public Date getDataRispostaSed() {
		return dataRispostaSed;
	}

	public void setDataRispostaSed(Date dataRispostaSed) {
		this.dataRispostaSed = dataRispostaSed;
	}

	public String getStringaXmlSed() {
		return stringaXmlSed;
	}

	public void setStringaXmlSed(String stringaXmlSed) {
		this.stringaXmlSed = stringaXmlSed;
	}

	public Long getFlagElaborata() {
		return flagElaborata;
	}

	public void setFlagElaborata(Long flagElaborata) {
		this.flagElaborata = flagElaborata;
	}

	public String getRispostaSed() {
		return rispostaSed;
	}

	public void setRispostaSed(String rispostaSed) {
		this.rispostaSed = rispostaSed;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public AnagraficaFornitore getAnagraficaFornitore() {
		return anagraficaFornitore;
	}

	public void setAnagraficaFornitore(AnagraficaFornitore anagraficaFornitore) {
		this.anagraficaFornitore = anagraficaFornitore;
	}
}