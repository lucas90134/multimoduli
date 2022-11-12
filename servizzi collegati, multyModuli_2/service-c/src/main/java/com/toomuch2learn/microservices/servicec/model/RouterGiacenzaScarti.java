package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the router_wind_giacenza database table.
 * 
 */
@Entity
@Table(name="router_giacenza_scarti")
public class RouterGiacenzaScarti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRouterGiacenzaScarti")
	//@SequenceGenerator(name="idRouterGiacenza", sequenceName = "router_giacenza_id_router_giacenza_seq", allocationSize=1)
	@GenericGenerator(name = "idRouterGiacenzaScarti", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
	parameters = {
			@Parameter(name = "sequence_name", value = "router_giacenza_scarti_id_router_giacenza_scarti_seq"),
			@Parameter(name = "optimizer", value = "pooled-lo")
	}
			)
	@Column(name="id_router_giacenza_scarti")
	private Long idRouterGiacenzaScarti;

	@Column(name="id_fornitore")
	private Long idFornitore;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_fornitore",insertable=false,updatable=false) 
	private Fornitore fornitore;

	private String contratto;

	@JsonFormat(pattern="dd/MM/yyyy")
	@Column(name="data_inserimento")
	private Date dataInserimento;

	@JsonFormat(pattern="dd/MM/yyyy")
	@Column(name="data_primo_inserimento")
	private Date dataPrimoInserimento;

	private String dislocato;

	private String marca;

	private String matricola;

	private String modello;

	private Integer quantita;

	private String tipologia;

	private String utilizzo;

	@Column(name="motivo_scarto")
	private String motivoScarto;

	private String stato;
	
	@Transient//fornitore descrizione
	private String magazzino;
	
	public RouterGiacenzaScarti() {
	}


	public Long getIdRouterGiacenzaScarti() {
		return idRouterGiacenzaScarti;
	}


	public void setIdRouterGiacenzaScarti(Long idRouterGiacenzaScarti) {
		this.idRouterGiacenzaScarti = idRouterGiacenzaScarti;
	}


	public String getMotivoScarto() {
		return motivoScarto;
	}


	public void setMotivoScarto(String motivoScarto) {
		this.motivoScarto = motivoScarto;
	}


	public String getContratto() {
		return this.contratto;
	}

	public void setContratto(String contratto) {
		this.contratto = contratto;
	}

	public Date getDataInserimento() {
		return this.dataInserimento;
	}

	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public Date getDataPrimoInserimento() {
		return this.dataPrimoInserimento;
	}

	public void setDataPrimoInserimento(Date dataPrimoInserimento) {
		this.dataPrimoInserimento = dataPrimoInserimento;
	}

	public String getDislocato() {
		return this.dislocato;
	}

	public void setDislocato(String dislocato) {
		this.dislocato = dislocato;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getModello() {
		return this.modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public Integer getQuantita() {
		return this.quantita;
	}

	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}

	public String getTipologia() {
		return this.tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getUtilizzo() {
		return this.utilizzo;
	}

	public void setUtilizzo(String utilizzo) {
		this.utilizzo = utilizzo;
	}

	public Long getIdFornitore() {
		return idFornitore;
	}

	public void setIdFornitore(Long idFornitore) {
		this.idFornitore = idFornitore;
	}

	public Fornitore getFornitore() {
		return fornitore;
	}

	public void setFornitore(Fornitore fornitore) {
		this.fornitore = fornitore;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}


	public String getMagazzino() {
		return magazzino;
	}


	public void setMagazzino(String magazzino) {
		this.magazzino = magazzino;
	}
	
}