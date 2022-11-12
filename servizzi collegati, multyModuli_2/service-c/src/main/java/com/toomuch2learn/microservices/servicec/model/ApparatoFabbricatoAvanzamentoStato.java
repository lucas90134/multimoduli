package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the MAXIMO_ANAGRAFICA database table.
 * 
 */
@Entity
@Table(name="apparato_fabbricato_avanzamento_stato")
@NamedQuery(name="ApparatoFabbricatoAvanzamentoStato.findAll", query="SELECT a FROM ApparatoFabbricatoAvanzamentoStato a")
public class ApparatoFabbricatoAvanzamentoStato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idApparatoFabbricatoAvanzamentoStato")
	@SequenceGenerator(name="idApparatoFabbricatoAvanzamentoStato", sequenceName = "apparato_fabbricato_avanzamen_id_apparato_fabbricato_avanza_seq", allocationSize=1)
	@Column(name="id_apparato_fabbricato_avanzamento_stato")
	private Long idApparatoFabbricatoAvanzamentoStato;

	@Column(name="mac_address")
	private String macAddress;

	@Column(name="id_apparato_fabbricato")
	private Long idApparatoFabbricato;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_apparato_fabbricato",insertable=false,updatable=false,nullable=true)
	private ApparatoFabbricato apparatoFabbricato;
	
	@Column(name="id_stato_router")
	private Long idStatoRouter;
	
	@JsonIgnore
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_stato_router",insertable=false,updatable=false,nullable=true)
	private StatoRouter statoRouter;

	@Column(name="id_dettaglio_stato_router")
	private Long idDettaglioStatoRouter;
	
	@JsonIgnore
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_dettaglio_stato_router",insertable=false,updatable=false,nullable=true)
	private DettaglioStatoRouter dettaglioStatoRouter;
	
	@Column(name="user_mod")
	private String userMod;

	@Column(name="location")
	private String location;
	
	@Column(name="id_disperso_identificativo_apparato")
	private Long idDispersoIdentificativoApparato;
	

	@JsonIgnore
	@ManyToOne	(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_disperso_identificativo_apparato",insertable=false,updatable=false,nullable=true)
	private DispersoIdentificativoApparato dispersoIdentificativoApparato;
	
	@Column(name="data_disperso")
	private Date dataDisperso;

	@Column(name="data_stato")
	private Date dataStato;
	
	@Column(name="data_primo_aggiornamento_certo")
	private Date dataPrimoAggiornamentoCerto;

	@Column(name="data_ultimo_aggiornamento_certo")
	private Date dataUltimoAggiornamentoCerto;

	@Column(name="data_ultimo_controllo")
	private Date dataUltimoControllo;
	
	@Column(name="id_ubicazione")
	private Long idUbicazione;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_ubicazione",insertable=false,updatable=false)
	private RouterUbicazione ubicazione;
	
	@Transient
	private String ubicazioneDescrizione;
	
	@Transient
	private String descrizioneDisperso;

	@Transient
	private String descrizioneStatoRouter;

	@Transient
	private String descrizioneDettaglioStatoRouter;
	
	public ApparatoFabbricatoAvanzamentoStato() {
		super();
	}

	public Long getIdApparatoFabbricatoAvanzamentoStato() {
		return idApparatoFabbricatoAvanzamentoStato;
	}

	public void setIdApparatoFabbricatoAvanzamentoStato(Long idApparatoFabbricatoAvanzamentoStato) {
		this.idApparatoFabbricatoAvanzamentoStato = idApparatoFabbricatoAvanzamentoStato;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public Long getIdApparatoFabbricato() {
		return idApparatoFabbricato;
	}

	public void setIdApparatoFabbricato(Long idApparatoFabbricato) {
		this.idApparatoFabbricato = idApparatoFabbricato;
	}

	public ApparatoFabbricato getApparatoFabbricato() {
		return apparatoFabbricato;
	}

	public void setApparatoFabbricato(ApparatoFabbricato apparatoFabbricato) {
		this.apparatoFabbricato = apparatoFabbricato;
	}

	public Long getIdStatoRouter() {
		return idStatoRouter;
	}

	public void setIdStatoRouter(Long idStatoRouter) {
		this.idStatoRouter = idStatoRouter;
	}

	public StatoRouter getStatoRouter() {
		return statoRouter;
	}

	public void setStatoRouter(StatoRouter statoRouter) {
		this.statoRouter = statoRouter;
	}

	public String getDescrizioneStatoRouter() {
		return descrizioneStatoRouter;
	}

	public void setDescrizioneStatoRouter(String descrizioneStatoRouter) {
		this.descrizioneStatoRouter = descrizioneStatoRouter;
	}

	public Long getIdDettaglioStatoRouter() {
		return idDettaglioStatoRouter;
	}

	public void setIdDettaglioStatoRouter(Long idDettaglioStatoRouter) {
		this.idDettaglioStatoRouter = idDettaglioStatoRouter;
	}

	public String getDescrizioneDettaglioStatoRouter() {
		return descrizioneDettaglioStatoRouter;
	}

	public void setDescrizioneDettaglioStatoRouter(String descrizioneDettaglioStatoRouter) {
		this.descrizioneDettaglioStatoRouter = descrizioneDettaglioStatoRouter;
	}

	public DettaglioStatoRouter getDettaglioStatoRouter() {
		return dettaglioStatoRouter;
	}

	public void setDettaglioStatoRouter(DettaglioStatoRouter dettaglioStatoRouter) {
		this.dettaglioStatoRouter = dettaglioStatoRouter;
	}

	public String getUserMod() {
		return userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getIdDispersoIdentificativoApparato() {
		return idDispersoIdentificativoApparato;
	}

	public void setIdDispersoIdentificativoApparato(Long idDispersoIdentificativoApparato) {
		this.idDispersoIdentificativoApparato = idDispersoIdentificativoApparato;
	}

	public DispersoIdentificativoApparato getDispersoIdentificativoApparato() {
		return dispersoIdentificativoApparato;
	}

	public void setDispersoIdentificativoApparato(DispersoIdentificativoApparato dispersoIdentificativoApparato) {
		this.dispersoIdentificativoApparato = dispersoIdentificativoApparato;
	}

	public String getDescrizioneDisperso() {
		return descrizioneDisperso;
	}

	public void setDescrizioneDisperso(String descrizioneDisperso) {
		this.descrizioneDisperso = descrizioneDisperso;
	}

	public Date getDataDisperso() {
		return dataDisperso;
	}

	public void setDataDisperso(Date dataDisperso) {
		this.dataDisperso = dataDisperso;
	}

	public Date getDataStato() {
		return dataStato;
	}

	public void setDataStato(Date dataStato) {
		this.dataStato = dataStato;
	}

	public Date getDataPrimoAggiornamentoCerto() {
		return dataPrimoAggiornamentoCerto;
	}

	public void setDataPrimoAggiornamentoCerto(Date dataPrimoAggiornamentoCerto) {
		this.dataPrimoAggiornamentoCerto = dataPrimoAggiornamentoCerto;
	}

	public Date getDataUltimoAggiornamentoCerto() {
		return dataUltimoAggiornamentoCerto;
	}

	public void setDataUltimoAggiornamentoCerto(Date dataUltimoAggiornamentoCerto) {
		this.dataUltimoAggiornamentoCerto = dataUltimoAggiornamentoCerto;
	}

	public Date getDataUltimoControllo() {
		return dataUltimoControllo;
	}

	public void setDataUltimoControllo(Date dataUltimoControllo) {
		this.dataUltimoControllo = dataUltimoControllo;
	}

	public Long getIdUbicazione() {
		return idUbicazione;
	}

	public void setIdUbicazione(Long idUbicazione) {
		this.idUbicazione = idUbicazione;
	}

	public RouterUbicazione getUbicazione() {
		return ubicazione;
	}

	public void setUbicazione(RouterUbicazione ubicazione) {
		this.ubicazione = ubicazione;
	}

	public String getUbicazioneDescrizione() {
		return ubicazioneDescrizione;
	}

	public void setUbicazioneDescrizione(String ubicazioneDescrizione) {
		this.ubicazioneDescrizione = ubicazioneDescrizione;
	}

}