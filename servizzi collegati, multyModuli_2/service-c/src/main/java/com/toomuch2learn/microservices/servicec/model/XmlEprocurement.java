package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
/**
 * The persistent class for the XML_EPROCUREMENT database table.
 * 
 */
@Entity
@Table(name = "xml_eprocurement")
@NamedQuery(name = "XmlEprocurement.findAll", query = "SELECT x FROM XmlEprocurement x")
public class XmlEprocurement implements Serializable {

	private static final long serialVersionUID = 8328192641776217948L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idXmlEprocurement")
	@SequenceGenerator(name="idXmlEprocurement", sequenceName = "xml_eprocurement_id_xml_eprocurement_seq", allocationSize=1)
	@Column(name = "id_xml_eprocurement")
	private Long idXmlEprocurement;

	@Column(name = "id_anagrafica_fornitore")
	private Long idAnagraficaFornitore;
	
	@Column(name = "id_linea")
	private Long idLinea;
	
	@Column(name = "id_sede")
	private Long idSede;
	
	@Column(name = "id_stato")
	private Long idStato;
	
	@Column(name = "tipo_operazione")
	private String tipoOperazione;
	
	@Column(name = "stringa_xml")
	private String stringaXml;
	
	@Column(name = "stringa_url")
	private String stringaUrl;
	
	@Column(name = "data_invio")
	private Date dataInvio;
	
	@Column(name = "esito")
	private String esito;

	@Column(name = "note")
	private String note;
	
	@Column(name = "data_risposta")
	private Date dataRisposta;
	
	@Column(name = "stringa_xml_risposta")
	private String stringaXmlRisposta;
	
	@Column(name = "n_rinvio")
	private Integer nRinvio;
	
	@Column(name = "elimina_errore")
	private Boolean eliminaErrore;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ANAGRAFICA_FORNITORE",insertable=false,updatable=false)
	private AnagraficaFornitore anagraficaFornitore;

	@Transient
	private String descrizioneAnagraficaFornitore;
	
	@Override
	public String toString() {
		return "XmlEprocurement [idXmlEprocurement=" + idXmlEprocurement + ", idAnagraficaFornitore="
				+ idAnagraficaFornitore + ", idLinea=" + idLinea + ", idSede=" + idSede + ", idStato=" + idStato
				+ ", tipoOperazione=" + tipoOperazione + ", stringaXml=" + stringaXml + ", stringaUrl=" + stringaUrl
				+ ", dataInvio=" + dataInvio + ", esito=" + esito + ", note=" + note + ", dataRisposta=" + dataRisposta
				+ ", stringaXmlRisposta=" + stringaXmlRisposta + ", nRinvio=" + nRinvio + ", eliminaErrore="
				+ eliminaErrore + "]";
	}

	public Long getIdXmlEprocurement() {
		return idXmlEprocurement;
	}

	public void setIdXmlEprocurement(Long idXmlEprocurement) {
		this.idXmlEprocurement = idXmlEprocurement;
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

	public Long getIdStato() {
		return idStato;
	}

	public void setIdStato(Long idStato) {
		this.idStato = idStato;
	}

	public String getTipoOperazione() {
		return tipoOperazione;
	}

	public void setTipoOperazione(String tipoOperazione) {
		this.tipoOperazione = tipoOperazione;
	}

	public String getStringaXml() {
		return stringaXml;
	}

	public void setStringaXml(String stringaXml) {
		this.stringaXml = stringaXml;
	}

	public String getStringaUrl() {
		return stringaUrl;
	}

	public void setStringaUrl(String stringaUrl) {
		this.stringaUrl = stringaUrl;
	}

	public Date getDataInvio() {
		return dataInvio;
	}

	public void setDataInvio(Date dataInvio) {
		this.dataInvio = dataInvio;
	}

	public String getEsito() {
		return esito;
	}

	public void setEsito(String esito) {
		this.esito = esito;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getDataRisposta() {
		return dataRisposta;
	}

	public void setDataRisposta(Date dataRisposta) {
		this.dataRisposta = dataRisposta;
	}

	public String getStringaXmlRisposta() {
		return stringaXmlRisposta;
	}

	public void setStringaXmlRisposta(String stringaXmlRisposta) {
		this.stringaXmlRisposta = stringaXmlRisposta;
	}

	public Integer getnRinvio() {
		return nRinvio;
	}

	public void setnRinvio(Integer nRinvio) {
		this.nRinvio = nRinvio;
	}

	public Boolean getEliminaErrore() {
		return eliminaErrore;
	}

	public void setEliminaErrore(Boolean eliminaErrore) {
		this.eliminaErrore = eliminaErrore;
	}

	public AnagraficaFornitore getAnagraficaFornitore() {
		return anagraficaFornitore;
	}

	public void setAnagraficaFornitore(AnagraficaFornitore anagraficaFornitore) {
		this.anagraficaFornitore = anagraficaFornitore;
	}

	public String getDescrizioneAnagraficaFornitore() {
		return descrizioneAnagraficaFornitore;
	}

	public void setDescrizioneAnagraficaFornitore(String descrizioneAnagraficaFornitore) {
		this.descrizioneAnagraficaFornitore = descrizioneAnagraficaFornitore;
	}
	
}