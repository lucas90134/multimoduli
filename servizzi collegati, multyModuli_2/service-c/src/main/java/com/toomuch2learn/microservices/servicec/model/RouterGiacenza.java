package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

/**
 * The persistent class for the router_wind_giacenza database table.
 * 
 */
@Entity
@Table(name="router_giacenza")
public class RouterGiacenza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRouterGiacenza")
	//@SequenceGenerator(name="idRouterGiacenza", sequenceName = "router_giacenza_id_router_giacenza_seq", allocationSize=1)
	@GenericGenerator(name = "idRouterGiacenza", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
	parameters = {
			@Parameter(name = "sequence_name", value = "router_giacenza_id_router_giacenza_seq"),
			@Parameter(name = "optimizer", value = "pooled-lo")
	}
			)
	@Column(name="id_router_giacenza")
	private Long idRouterGiacenza;

	@Column(name="id_fornitore")
	private Long idFornitore;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_fornitore",insertable=false,updatable=false) 
	private Fornitore fornitore;

	private String contratto;

	@Column(name="data_inserimento")
	private Date dataInserimento;

	@Column(name="data_primo_inserimento")
	private Date dataPrimoInserimento;

	private String dislocato;

	private String marca;

	private String matricola;

	private String modello;

	private Integer quantita;

	private String tipologia;

	private String utilizzo;

	private String stato;

	@Column(name="mac_address")
	private String  macAddress;

	private Integer imola;

	private String impresa;
	
	//mirko 20210531
	private String note;

	@Override
	public String toString() {
		return "RouterGiacenza [idRouterGiacenza=" + idRouterGiacenza + ", idFornitore=" + idFornitore + ", fornitore="
				+ fornitore + ", contratto=" + contratto + ", dataInserimento=" + dataInserimento
				+ ", dataPrimoInserimento=" + dataPrimoInserimento + ", dislocato=" + dislocato + ", marca=" + marca
				+ ", matricola=" + matricola + ", modello=" + modello + ", quantita=" + quantita + ", tipologia="
				+ tipologia + ", utilizzo=" + utilizzo + ", stato=" + stato + ",  macAddress=" +  macAddress + ", imola="
				+ imola + ", impresa=" + impresa + ", note=" + note + "]";
	}

	public RouterGiacenza() {
	}

	public Long getIdRouterGiacenza() {
		return this.idRouterGiacenza;
	}

	public void setIdRouterGiacenza(Long idRouterGiacenza) {
		this.idRouterGiacenza = idRouterGiacenza;
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
	

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}


	@Override
	public int hashCode() {
		return Objects.hash(contratto, dataInserimento, dataPrimoInserimento, dislocato, fornitore, idFornitore,
				idRouterGiacenza, imola, impresa, macAddress, marca, matricola, modello, note, quantita, stato,
				tipologia, utilizzo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RouterGiacenza other = (RouterGiacenza) obj;
		return Objects.equals(contratto, other.contratto) && Objects.equals(dataInserimento, other.dataInserimento)
				&& Objects.equals(dataPrimoInserimento, other.dataPrimoInserimento)
				&& Objects.equals(dislocato, other.dislocato) && Objects.equals(fornitore, other.fornitore)
				&& Objects.equals(idFornitore, other.idFornitore)
				&& Objects.equals(idRouterGiacenza, other.idRouterGiacenza) && Objects.equals(imola, other.imola)
				&& Objects.equals(impresa, other.impresa) && Objects.equals(macAddress, other.macAddress)
				&& Objects.equals(marca, other.marca) && Objects.equals(matricola, other.matricola)
				&& Objects.equals(modello, other.modello) && Objects.equals(note, other.note)
				&& Objects.equals(quantita, other.quantita) && Objects.equals(stato, other.stato)
				&& Objects.equals(tipologia, other.tipologia) && Objects.equals(utilizzo, other.utilizzo);
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}


	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public Integer getImola() {
		return imola;
	}

	public void setImola(Integer imola) {
		this.imola = imola;
	}

	public String getImpresa() {
		return impresa;
	}

	public void setImpresa(String impresa) {
		this.impresa = impresa;
	}
}