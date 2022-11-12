package com.toomuch2learn.microservices.servicec.model;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the coms_quarantena database table.
 * 
 */
@Entity
@Table(name="coms_quarantena")
@NamedQuery(name="ComsQuarantena.findAll", query="SELECT c FROM ComsQuarantena c")
public class ComsQuarantena implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idComsQuarantena")
	@SequenceGenerator(name="idComsQuarantena", sequenceName = "coms_quarantena_id_coms_quarantena_seq", allocationSize=1)
	@Column(name="id_coms_quarantena")
	private Long idComsQuarantena;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="cod_cliente_finale")
	private String codClienteFinale;

	@Column(name="note_anomalie")
	private String noteAnomalie;

	@Column(name="note_dettagli")
	private String noteDettagli;

	@Column(name="rilevata_da_coms")
	private String rilevataDaComs;

	@Column(name="vlt_scom")
	private Boolean vltScom;

	@Column(name="data_elaborazione")
	private Date dataElaborazione;


	public Long getIdComsQuarantena() {
		return idComsQuarantena;
	}

	public void setIdComsQuarantena(Long idComsQuarantena) {
		this.idComsQuarantena = idComsQuarantena;
	}

	public Long getIdLinea() {
		return idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public String getCodClienteFinale() {
		return codClienteFinale;
	}

	public void setCodClienteFinale(String codClienteFinale) {
		this.codClienteFinale = codClienteFinale;
	}

	public String getNoteAnomalie() {
		return noteAnomalie;
	}

	public void setNoteAnomalie(String noteAnomalie) {
		this.noteAnomalie = noteAnomalie;
	}

	public String getNoteDettagli() {
		return noteDettagli;
	}

	public void setNoteDettagli(String noteDettagli) {
		this.noteDettagli = noteDettagli;
	}

	public String getRilevataDaComs() {
		return rilevataDaComs;
	}

	public void setRilevataDaComs(String rilevataDaComs) {
		this.rilevataDaComs = rilevataDaComs;
	}

	public Boolean getVltScom() {
		return vltScom;
	}

	public void setVltScom(Boolean vltScom) {
		this.vltScom = vltScom;
	}

	public Date getDataElaborazione() {
		return dataElaborazione;
	}

	public void setDataElaborazione(Date dataElaborazione) {
		this.dataElaborazione = dataElaborazione;
	}
}