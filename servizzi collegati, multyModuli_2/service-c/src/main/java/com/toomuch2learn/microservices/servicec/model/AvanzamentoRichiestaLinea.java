package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the avanzamento_richiesta_linea database table.
 * 
 */
@Entity
@Table(name="avanzamento_richiesta_linea")
@NamedQuery(name="AvanzamentoRichiestaLinea.findAll", query="SELECT a FROM AvanzamentoRichiestaLinea a")
public class AvanzamentoRichiestaLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idAvanzamentoRichiestaLinea")
	@SequenceGenerator(name="idAvanzamentoRichiestaLinea", sequenceName = "avanzamento_richiesta_linea_id_avanzamento_richiesta_linea_seq", allocationSize=1)
	@Column(name="id_avanzamento_richiesta_linea")
	private Long idAvanzamentoRichiestaLinea;

	@Column(name="data_stato")
	private Date dataStato;

	@Column(name="id_richiesta_linea")
	private Long idRichiestaLinea;

	@Column(name="id_stato_richiesta")
	private Long idStatoRichiesta;

	@Column(name="note_avanzamento")
	private String noteAvanzamento;

	@Column(name="progressivo_richiesta_old")
	private Integer progressivoRichiestaOld;

	@Column(name="user_mod")
	private String userMod;

	public AvanzamentoRichiestaLinea() {
	}

	public Long getIdAvanzamentoRichiestaLinea() {
		return this.idAvanzamentoRichiestaLinea;
	}

	public void setIdAvanzamentoRichiestaLinea(Long idAvanzamentoRichiestaLinea) {
		this.idAvanzamentoRichiestaLinea = idAvanzamentoRichiestaLinea;
	}

	public Date getDataStato() {
		return this.dataStato;
	}

	public void setDataStato(Date dataStato) {
		this.dataStato = dataStato;
	}

	public Long getIdRichiestaLinea() {
		return this.idRichiestaLinea;
	}

	public void setIdRichiestaLinea(Long idRichiestaLinea) {
		this.idRichiestaLinea = idRichiestaLinea;
	}

	public Long getIdStatoRichiesta() {
		return this.idStatoRichiesta;
	}

	public void setIdStatoRichiesta(Long idStatoRichiesta) {
		this.idStatoRichiesta = idStatoRichiesta;
	}

	public String getNoteAvanzamento() {
		return this.noteAvanzamento;
	}

	public void setNoteAvanzamento(String noteAvanzamento) {
		this.noteAvanzamento = noteAvanzamento;
	}

	public Integer getProgressivoRichiestaOld() {
		return this.progressivoRichiestaOld;
	}

	public void setProgressivoRichiestaOld(Integer progressivoRichiestaOld) {
		this.progressivoRichiestaOld = progressivoRichiestaOld;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

}