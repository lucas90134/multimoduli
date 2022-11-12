package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the linea_icone database table.
 * 
 */
@Entity
@Table(name="linea_icone")
@NamedQuery(name="LineaIcone.findAll", query="SELECT l FROM LineaIcone l")
public class LineaIcone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="icona_backup")
	private Boolean iconaBackup;

	@Column(name="icona_chiamata_aperta")
	private Boolean iconaChiamataAperta;

	@Column(name="icona_master")
	private Boolean iconaMaster;

	@Column(name="icona_promemoria")
	private Boolean iconaPromemoria;

	@Column(name="icona_te_new")
	private Boolean iconaTeNew;

	@Column(name="icona_te_old")
	private Boolean iconaTeOld;

	@Column(name="icona_test_48ore")
	private Boolean iconaTest48ore;

	@Column(name="icona_test_rapido")
	private Boolean iconaTestRapido;

	@Column(name="icona_ti_new")
	private Boolean iconaTiNew;

	@Column(name="icona_ti_old")
	private Boolean iconaTiOld;

	@Column(name="icona_visualizza_test")
	private Boolean iconaVisualizzaTest;

	public LineaIcone() {
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Boolean getIconaBackup() {
		return this.iconaBackup;
	}

	public void setIconaBackup(Boolean iconaBackup) {
		this.iconaBackup = iconaBackup;
	}

	public Boolean getIconaChiamataAperta() {
		return this.iconaChiamataAperta;
	}

	public void setIconaChiamataAperta(Boolean iconaChiamataAperta) {
		this.iconaChiamataAperta = iconaChiamataAperta;
	}

	public Boolean getIconaMaster() {
		return this.iconaMaster;
	}

	public void setIconaMaster(Boolean iconaMaster) {
		this.iconaMaster = iconaMaster;
	}

	public Boolean getIconaPromemoria() {
		return this.iconaPromemoria;
	}

	public void setIconaPromemoria(Boolean iconaPromemoria) {
		this.iconaPromemoria = iconaPromemoria;
	}

	public Boolean getIconaTeNew() {
		return this.iconaTeNew;
	}

	public void setIconaTeNew(Boolean iconaTeNew) {
		this.iconaTeNew = iconaTeNew;
	}

	public Boolean getIconaTeOld() {
		return this.iconaTeOld;
	}

	public void setIconaTeOld(Boolean iconaTeOld) {
		this.iconaTeOld = iconaTeOld;
	}

	public Boolean getIconaTest48ore() {
		return this.iconaTest48ore;
	}

	public void setIconaTest48ore(Boolean iconaTest48ore) {
		this.iconaTest48ore = iconaTest48ore;
	}

	public Boolean getIconaTestRapido() {
		return this.iconaTestRapido;
	}

	public void setIconaTestRapido(Boolean iconaTestRapido) {
		this.iconaTestRapido = iconaTestRapido;
	}

	public Boolean getIconaTiNew() {
		return this.iconaTiNew;
	}

	public void setIconaTiNew(Boolean iconaTiNew) {
		this.iconaTiNew = iconaTiNew;
	}

	public Boolean getIconaTiOld() {
		return this.iconaTiOld;
	}

	public void setIconaTiOld(Boolean iconaTiOld) {
		this.iconaTiOld = iconaTiOld;
	}

	public Boolean getIconaVisualizzaTest() {
		return this.iconaVisualizzaTest;
	}

	public void setIconaVisualizzaTest(Boolean iconaVisualizzaTest) {
		this.iconaVisualizzaTest = iconaVisualizzaTest;
	}

}