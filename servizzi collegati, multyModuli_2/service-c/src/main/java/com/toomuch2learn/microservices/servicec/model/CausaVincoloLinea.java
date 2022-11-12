package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the causa_vincolo_linea database table.
 * 
 */
@Entity
@Table(name="causa_vincolo_linea")
@NamedQuery(name="CausaVincoloLinea.findAll", query="SELECT c FROM CausaVincoloLinea c")
public class CausaVincoloLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idCausaVincoloLinea")
	@SequenceGenerator(name="idCausaVincoloLinea", sequenceName = "causa_vincolo_linea_id_causa_vincolo_linea_seq", allocationSize=1)
	@Column(name="id_causa_vincolo_linea")
	private Long idCausaVincoloLinea;

	private String descrizione;

	@Column(name="flag_attivo")
	private Boolean flagAttivo;

	@Column(name="id_anagrafica_fornitore")
	private Long idAnagraficaFornitore;

	@Column(name="id_tipo_vincolo")
	private Long idTipoVincolo;

	@Column(name="tempi_stimati")
	private String tempiStimati;

	public CausaVincoloLinea() {
	}

	public Long getIdCausaVincoloLinea() {
		return this.idCausaVincoloLinea;
	}

	public void setIdCausaVincoloLinea(Long idCausaVincoloLinea) {
		this.idCausaVincoloLinea = idCausaVincoloLinea;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Boolean getFlagAttivo() {
		return this.flagAttivo;
	}

	public void setFlagAttivo(Boolean flagAttivo) {
		this.flagAttivo = flagAttivo;
	}

	public Long getIdAnagraficaFornitore() {
		return this.idAnagraficaFornitore;
	}

	public void setIdAnagraficaFornitore(Long idAnagraficaFornitore) {
		this.idAnagraficaFornitore = idAnagraficaFornitore;
	}

	public Long getIdTipoVincolo() {
		return this.idTipoVincolo;
	}

	public void setIdTipoVincolo(Long idTipoVincolo) {
		this.idTipoVincolo = idTipoVincolo;
	}

	public String getTempiStimati() {
		return this.tempiStimati;
	}

	public void setTempiStimati(String tempiStimati) {
		this.tempiStimati = tempiStimati;
	}

}