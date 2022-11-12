package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the MAXIMO_ANAGRAFICA database table.
 * 
 */
@Entity
@Table(name="apparato_ordine_acquisto")
@NamedQuery(name="ApparatoOrdineAcquisto.findAll", query="SELECT a FROM ApparatoOrdineAcquisto a")
public class ApparatoOrdineAcquisto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idApparatoOrdineAcquisto")
	@SequenceGenerator(name="idApparatoOrdineAcquisto", sequenceName = "apparato_ordine_acquisto_id_apparato_ordine_acquisto_seq", allocationSize=1)
	@Column(name="id_apparato_ordine_acquisto")
	private Long idApparatoOrdineAcquisto;
	
	@Column(name="numero_oda")
	private Long numeroOda;
	
	@Column(name="data_acquisto")
	private Date dataAcquisto;
	
	@Column(name="quantita_ordinata")
	private Integer quantitaOrdinata;
	
	@Column(name="data_prevista_consegna")
	private Date dataPrevistaConsegna;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(
	  name = "MTM_APPARATO_ORDINE_ACQUISTO_DESTINATARI_ODA", 
	  joinColumns = @JoinColumn(name = "id_apparato_ordine_acquisto"), 
	  inverseJoinColumns = @JoinColumn(name = "id_destinatario_oda"))
	private List<DestinatariOda> destinatariOdas;
	
	@Column(name="quantita_riscontrata")
	private Integer quantitaRiscontrata;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(
	  name = "MTM_APPARATO_ORDINE_ACQUISTO_TIPO_APPARATO", 
	  joinColumns = @JoinColumn(name = "id_apparato_ordine_acquisto"), 
	  inverseJoinColumns = @JoinColumn(name = "id_tipo_apparato"))
	private List<TipoApparato> tipoApparatos;
	
	@Column(name="costo")
	private BigDecimal costo;

	@Column(name="user_mod")
	private String userMod;
	
	@Column(name="id_utilizzo_router")
	private Long idUtilizzoRouter;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_utilizzo_router",insertable=false,updatable=false,nullable=true)
	private UtilizzoRouter utilizzoRouter;
	
	@Column(name="id_business")
	private Long idBusiness;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_business",insertable=false,updatable=false,nullable=true)
	private Business business;
	
	@Column(name="data_ricevimento_bene")
	private Date dataRicevimentoBene;
	
	@Column(name="data_attivazione_bene")
	private Date dataAttivazioneBene;
	
	public ApparatoOrdineAcquisto() {
		super();
	}

	public Long getIdApparatoOrdineAcquisto() {
		return idApparatoOrdineAcquisto;
	}

	@Override
	public String toString() {
		return "ApparatoOrdineAcquisto [idApparatoOrdineAcquisto=" + idApparatoOrdineAcquisto + ", numeroOda="
				+ numeroOda + ", dataAcquisto=" + dataAcquisto + ", quantitaOrdinata=" + quantitaOrdinata
				+ ", dataPrevistaConsegna=" + dataPrevistaConsegna + ", destinatariOdas=" + destinatariOdas
				+ ", quantitaRiscontrata=" + quantitaRiscontrata + ", tipoApparatos=" + tipoApparatos + ", costo="
				+ costo + ", userMod=" + userMod + ", idUtilizzoRouter=" + idUtilizzoRouter + ", utilizzoRouter="
				+ utilizzoRouter + ", idBusiness=" + idBusiness + ", business=" + business + ", dataRicevimentoBene="
				+ dataRicevimentoBene + ", dataAttivazioneBene=" + dataAttivazioneBene + "]";
	}

	public Long getNumeroOda() {
		return numeroOda;
	}

	public void setNumeroOda(Long numeroOda) {
		this.numeroOda = numeroOda;
	}

	public Date getDataAcquisto() {
		return dataAcquisto;
	}

	public void setDataAcquisto(Date dataAcquisto) {
		this.dataAcquisto = dataAcquisto;
	}

	public Integer getQuantitaOrdinata() {
		return quantitaOrdinata;
	}

	public void setQuantitaOrdinata(Integer quantitaOrdinata) {
		this.quantitaOrdinata = quantitaOrdinata;
	}

	public Date getDataPrevistaConsegna() {
		return dataPrevistaConsegna;
	}

	public void setDataPrevistaConsegna(Date dataPrevistaConsegna) {
		this.dataPrevistaConsegna = dataPrevistaConsegna;
	}

	public List<DestinatariOda> getDestinatariOdas() {
		return destinatariOdas;
	}

	public void setDestinatariOdas(List<DestinatariOda> destinatariOdas) {
		this.destinatariOdas = destinatariOdas;
	}

	public Integer getQuantitaRiscontrata() {
		return quantitaRiscontrata;
	}

	public void setQuantitaRiscontrata(Integer quantitaRiscontrata) {
		this.quantitaRiscontrata = quantitaRiscontrata;
	}

	public List<TipoApparato> getTipoApparatos() {
		return tipoApparatos;
	}

	public void setTipoApparatos(List<TipoApparato> tipoApparatos) {
		this.tipoApparatos = tipoApparatos;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public String getUserMod() {
		return userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}


	public Long getIdBusiness() {
		return idBusiness;
	}

	public void setIdBusiness(Long idBusiness) {
		this.idBusiness = idBusiness;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public void setIdApparatoOrdineAcquisto(Long idApparatoOrdineAcquisto) {
		this.idApparatoOrdineAcquisto = idApparatoOrdineAcquisto;
	}

	public Long getIdUtilizzoRouter() {
		return idUtilizzoRouter;
	}

	public void setIdUtilizzoRouter(Long idUtilizzoRouter) {
		this.idUtilizzoRouter = idUtilizzoRouter;
	}

	public UtilizzoRouter getUtilizzoRouter() {
		return utilizzoRouter;
	}

	public void setUtilizzoRouter(UtilizzoRouter utilizzoRouter) {
		this.utilizzoRouter = utilizzoRouter;
	}

	public Date getDataRicevimentoBene() {
		return dataRicevimentoBene;
	}

	public void setDataRicevimentoBene(Date dataRicevimentoBene) {
		this.dataRicevimentoBene = dataRicevimentoBene;
	}

	public Date getDataAttivazioneBene() {
		return dataAttivazioneBene;
	}

	public void setDataAttivazioneBene(Date dataAttivazioneBene) {
		this.dataAttivazioneBene = dataAttivazioneBene;
	}


}