package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
 * The persistent class for the tariffe_fornitore database table.
 * 
 */
@Entity
@Table(name="tariffe_fornitore")
@NamedQuery(name="TariffeFornitore.findAll", query="SELECT t FROM TariffeFornitore t")
public class TariffeFornitore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tariffa_fornitore")
	private Long idTariffaFornitore;

	private BigDecimal attivazione;

	private BigDecimal canone;

	private BigDecimal disinstallazione;

	@Column(name="id_anagrafica_fornitore")
	private Long idAnagraficaFornitore;

	@Column(name="id_contratti_sed_fornitori")
	private Long idContrattiSedFornitori;

	@Column(name="id_contratto_ltm_sed")
	private Long idContrattoLtmSed;

	@Column(name="id_profilo_commerciale")
	private Long idProfiloCommerciale;

	@Column(name="id_progetto_ltm")
	private Long idProgettoLtm;

	@Column(name="id_tipo_linea")
	private Long idTipoLinea;

	@Column(name="tipo_risorsa")
	private Integer tipoRisorsa;

	@Column(name="trasloco_esterno")
	private BigDecimal traslocoEsterno;

	@Column(name="trasloco_interno")
	private BigDecimal traslocoInterno;

	public TariffeFornitore() {
	}

	public Long getIdTariffaFornitore() {
		return this.idTariffaFornitore;
	}

	public void setIdTariffaFornitore(Long idTariffaFornitore) {
		this.idTariffaFornitore = idTariffaFornitore;
	}

	public BigDecimal getAttivazione() {
		return this.attivazione;
	}

	public void setAttivazione(BigDecimal attivazione) {
		this.attivazione = attivazione;
	}

	public BigDecimal getCanone() {
		return this.canone;
	}

	public void setCanone(BigDecimal canone) {
		this.canone = canone;
	}

	public BigDecimal getDisinstallazione() {
		return this.disinstallazione;
	}

	public void setDisinstallazione(BigDecimal disinstallazione) {
		this.disinstallazione = disinstallazione;
	}

	public Long getIdAnagraficaFornitore() {
		return this.idAnagraficaFornitore;
	}

	public void setIdAnagraficaFornitore(Long idAnagraficaFornitore) {
		this.idAnagraficaFornitore = idAnagraficaFornitore;
	}

	public Long getIdContrattiSedFornitori() {
		return this.idContrattiSedFornitori;
	}

	public void setIdContrattiSedFornitori(Long idContrattiSedFornitori) {
		this.idContrattiSedFornitori = idContrattiSedFornitori;
	}

	public Long getIdContrattoLtmSed() {
		return this.idContrattoLtmSed;
	}

	public void setIdContrattoLtmSed(Long idContrattoLtmSed) {
		this.idContrattoLtmSed = idContrattoLtmSed;
	}

	public Long getIdProfiloCommerciale() {
		return this.idProfiloCommerciale;
	}

	public void setIdProfiloCommerciale(Long idProfiloCommerciale) {
		this.idProfiloCommerciale = idProfiloCommerciale;
	}

	public Long getIdProgettoLtm() {
		return this.idProgettoLtm;
	}

	public void setIdProgettoLtm(Long idProgettoLtm) {
		this.idProgettoLtm = idProgettoLtm;
	}

	public Long getIdTipoLinea() {
		return this.idTipoLinea;
	}

	public void setIdTipoLinea(Long idTipoLinea) {
		this.idTipoLinea = idTipoLinea;
	}

	public Integer getTipoRisorsa() {
		return this.tipoRisorsa;
	}

	public void setTipoRisorsa(Integer tipoRisorsa) {
		this.tipoRisorsa = tipoRisorsa;
	}

	public BigDecimal getTraslocoEsterno() {
		return this.traslocoEsterno;
	}

	public void setTraslocoEsterno(BigDecimal traslocoEsterno) {
		this.traslocoEsterno = traslocoEsterno;
	}

	public BigDecimal getTraslocoInterno() {
		return this.traslocoInterno;
	}

	public void setTraslocoInterno(BigDecimal traslocoInterno) {
		this.traslocoInterno = traslocoInterno;
	}

}