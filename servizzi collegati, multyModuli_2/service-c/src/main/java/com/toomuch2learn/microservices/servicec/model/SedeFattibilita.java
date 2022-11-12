package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the sede_fattibilita database table.
 * 
 */
@Entity
@Table(name="sede_fattibilita")
@NamedQuery(name="SedeFattibilita.findAll", query="SELECT s FROM SedeFattibilita s")
public class SedeFattibilita implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSedeFattibilita")
	@SequenceGenerator(name="idSedeFattibilita", sequenceName = "sede_fattibilita_id_sede_fattibilita_seq", allocationSize=1)
	@Column(name="id_sede_fattibilita")
	private Long idSedeFattibilita;

	@Column(name="cod_cliente_finale")
	private String codClienteFinale;

	private Boolean copertura;

	@Column(name="data_fattibilita")
	private Date dataFattibilita;

	@Column(name="data_inserimento")
	private Date dataInserimento;

	@Column(name="id_anagrafica_fornitore")
	private Long idAnagraficaFornitore;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ANAGRAFICA_FORNITORE",insertable=false,updatable=false)
	private AnagraficaFornitore anagraficaFornitore;

	@Column(name="id_contratto_ltm_sed")
	private Long idContrattoLtmSed;

	@Column(name="id_sede")
	private Long idSede;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_sede",insertable=false,updatable=false)
	private Sedi sede;

	@Column(name="id_tipo")
	private Long idTipo;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo",insertable=false,updatable=false)
	private TipoLinea tipoLinea;

	@Column(name="id_tipo_risorsa")
	private Long idTipoRisorsa;

	private String note;

	@Column(name="profilo_tecnico")
	private String profiloTecnico;

	@Column(name="user_mod")
	private String userMod;

	public SedeFattibilita() {
	}

	public Long getIdSedeFattibilita() {
		return this.idSedeFattibilita;
	}

	public void setIdSedeFattibilita(Long idSedeFattibilita) {
		this.idSedeFattibilita = idSedeFattibilita;
	}

	public String getCodClienteFinale() {
		return this.codClienteFinale;
	}

	public void setCodClienteFinale(String codClienteFinale) {
		this.codClienteFinale = codClienteFinale;
	}

	public Boolean getCopertura() {
		return this.copertura;
	}

	public void setCopertura(Boolean copertura) {
		this.copertura = copertura;
	}

	public Date getDataFattibilita() {
		return this.dataFattibilita;
	}

	public void setDataFattibilita(Date dataFattibilita) {
		this.dataFattibilita = dataFattibilita;
	}

	public Date getDataInserimento() {
		return this.dataInserimento;
	}

	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public Long getIdAnagraficaFornitore() {
		return this.idAnagraficaFornitore;
	}

	public void setIdAnagraficaFornitore(Long idAnagraficaFornitore) {
		this.idAnagraficaFornitore = idAnagraficaFornitore;
	}

	public Long getIdContrattoLtmSed() {
		return this.idContrattoLtmSed;
	}

	public void setIdContrattoLtmSed(Long idContrattoLtmSed) {
		this.idContrattoLtmSed = idContrattoLtmSed;
	}

	public Long getIdSede() {
		return this.idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public Long getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}

	public Long getIdTipoRisorsa() {
		return this.idTipoRisorsa;
	}

	public void setIdTipoRisorsa(Long idTipoRisorsa) {
		this.idTipoRisorsa = idTipoRisorsa;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getProfiloTecnico() {
		return this.profiloTecnico;
	}

	public void setProfiloTecnico(String profiloTecnico) {
		this.profiloTecnico = profiloTecnico;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public AnagraficaFornitore getAnagraficaFornitore() {
		return anagraficaFornitore;
	}

	public void setAnagraficaFornitore(AnagraficaFornitore anagraficaFornitore) {
		this.anagraficaFornitore = anagraficaFornitore;
	}

	public Sedi getSede() {
		return sede;
	}

	public void setSede(Sedi sede) {
		this.sede = sede;
	}

	public TipoLinea getTipoLinea() {
		return tipoLinea;
	}

	public void setTipoLinea(TipoLinea tipoLinea) {
		this.tipoLinea = tipoLinea;
	}

}