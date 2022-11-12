package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the richiesta_fattibilita database table.
 * 
 */
@Entity
@Table(name="richiesta_fattibilita")
@NamedQuery(name="RichiestaFattibilita.findAll", query="SELECT r FROM RichiestaFattibilita r")
public class RichiestaFattibilita implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRichiestaFattibilita")
	@SequenceGenerator(name="idRichiestaFattibilita", sequenceName = "richiesta_fattibilita_id_richiesta_fattibilita_seq", allocationSize=1)
	@Column(name="id_richiesta_fattibilita")
	private Long idRichiestaFattibilita;

	@JsonIgnore 
	@OneToMany(mappedBy = "richiestaFattibilita", fetch = FetchType.LAZY) 
	private List<RichiestaFattibilitaDettaglio> richiestaFattibilitaDettaglio; 
	
	@Column(name="altro_recapito")
	private String altroRecapito;

	@Column(name="cell_resp_sede")
	private String cellRespSede;

	@Column(name="cod_cliente_finale")
	private String codClienteFinale;

	@Column(name="data_invio_richiesta")
	private Date dataInvioRichiesta;

	@Column(name="esito_ko_ti")
	private String esitoKoTi;

	private String fastweb;

	@Column(name="id_comune")
	private Long idComune;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_comune",insertable=false,updatable=false)
	private Comuni comune;
	
	@Column(name="id_richiesta_fattabilita_stato")
	private Long idRichiestaFattabilitaStato;

	@Column(name="id_sede")
	private Long idSede;
	
	private String indirizzo;

	private String mail;

	private String nascosto;

	private String note;

	@Column(name="numero_pilota")
	private String numeroPilota;

	@Column(name="responsabile_sede")
	private String responsabileSede;

	@Column(name="richiesta_gbe")
	private String richiestaGbe;

	@Column(name="risposta_fastweb")
	private String rispostaFastweb;

	@Column(name="risposta_telecom")
	private Integer rispostaTelecom;

	@Column(name="risposta_wind")
	private String rispostaWind;

	@Column(name="stato_sede")
	private String statoSede;

	@Column(name="target_sede")
	private String targetSede;

	@Column(name="tel_resp_sede")
	private String telRespSede;

	private String telecom;

	@Column(name="tipo_sede")
	private String tipoSede;

	@Column(name="user_mode")
	private String userMode;

	private String wind;

	public RichiestaFattibilita() {
	}

	public Long getIdRichiestaFattibilita() {
		return this.idRichiestaFattibilita;
	}

	public void setIdRichiestaFattibilita(Long idRichiestaFattibilita) {
		this.idRichiestaFattibilita = idRichiestaFattibilita;
	}

	public String getAltroRecapito() {
		return this.altroRecapito;
	}

	public void setAltroRecapito(String altroRecapito) {
		this.altroRecapito = altroRecapito;
	}

	public String getCellRespSede() {
		return this.cellRespSede;
	}

	public void setCellRespSede(String cellRespSede) {
		this.cellRespSede = cellRespSede;
	}

	public String getCodClienteFinale() {
		return this.codClienteFinale;
	}

	public void setCodClienteFinale(String codClienteFinale) {
		this.codClienteFinale = codClienteFinale;
	}

	public Date getDataInvioRichiesta() {
		return this.dataInvioRichiesta;
	}

	public void setDataInvioRichiesta(Date dataInvioRichiesta) {
		this.dataInvioRichiesta = dataInvioRichiesta;
	}

	public String getEsitoKoTi() {
		return this.esitoKoTi;
	}

	public void setEsitoKoTi(String esitoKoTi) {
		this.esitoKoTi = esitoKoTi;
	}

	public String getFastweb() {
		return this.fastweb;
	}

	public void setFastweb(String fastweb) {
		this.fastweb = fastweb;
	}

	public Long getIdComune() {
		return this.idComune;
	}

	public void setIdComune(Long idComune) {
		this.idComune = idComune;
	}

	public Long getIdRichiestaFattabilitaStato() {
		return this.idRichiestaFattabilitaStato;
	}

	public void setIdRichiestaFattabilitaStato(Long idRichiestaFattabilitaStato) {
		this.idRichiestaFattabilitaStato = idRichiestaFattabilitaStato;
	}

	public Long getIdSede() {
		return this.idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public String getIndirizzo() {
		return this.indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNascosto() {
		return this.nascosto;
	}

	public void setNascosto(String nascosto) {
		this.nascosto = nascosto;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNumeroPilota() {
		return this.numeroPilota;
	}

	public void setNumeroPilota(String numeroPilota) {
		this.numeroPilota = numeroPilota;
	}

	public String getResponsabileSede() {
		return this.responsabileSede;
	}

	public void setResponsabileSede(String responsabileSede) {
		this.responsabileSede = responsabileSede;
	}

	public String getRichiestaGbe() {
		return this.richiestaGbe;
	}

	public void setRichiestaGbe(String richiestaGbe) {
		this.richiestaGbe = richiestaGbe;
	}

	public String getRispostaFastweb() {
		return this.rispostaFastweb;
	}

	public void setRispostaFastweb(String rispostaFastweb) {
		this.rispostaFastweb = rispostaFastweb;
	}

	public Integer getRispostaTelecom() {
		return this.rispostaTelecom;
	}

	public void setRispostaTelecom(Integer rispostaTelecom) {
		this.rispostaTelecom = rispostaTelecom;
	}

	public String getRispostaWind() {
		return this.rispostaWind;
	}

	public void setRispostaWind(String rispostaWind) {
		this.rispostaWind = rispostaWind;
	}

	public String getStatoSede() {
		return this.statoSede;
	}

	public void setStatoSede(String statoSede) {
		this.statoSede = statoSede;
	}

	public String getTargetSede() {
		return this.targetSede;
	}

	public void setTargetSede(String targetSede) {
		this.targetSede = targetSede;
	}

	public String getTelRespSede() {
		return this.telRespSede;
	}

	public void setTelRespSede(String telRespSede) {
		this.telRespSede = telRespSede;
	}

	public String getTelecom() {
		return this.telecom;
	}

	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}

	public String getTipoSede() {
		return this.tipoSede;
	}

	public void setTipoSede(String tipoSede) {
		this.tipoSede = tipoSede;
	}

	public String getUserMode() {
		return this.userMode;
	}

	public void setUserMode(String userMode) {
		this.userMode = userMode;
	}

	public String getWind() {
		return this.wind;
	}

	public void setWind(String wind) {
		this.wind = wind;
	}

	public List<RichiestaFattibilitaDettaglio> getRichiestaFattibilitaDettaglio() {
		return richiestaFattibilitaDettaglio;
	}

	public void setRichiestaFattibilitaDettaglio(List<RichiestaFattibilitaDettaglio> richiestaFattibilitaDettaglio) {
		this.richiestaFattibilitaDettaglio = richiestaFattibilitaDettaglio;
	}

	public Comuni getComune() {
		return comune;
	}

	public void setComune(Comuni comune) {
		this.comune = comune;
	}

}