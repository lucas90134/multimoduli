package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the router_wind_giacenza database table.
 * 
 */
@Entity
@Table(name="fornitore")
public class Fornitore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_fornitore")
	private Long idFornitore;

	private String descrizione;
	
	@Column(name="data_ultimo_aggiornamento_magazzino")
	private Date dataUltimoAggiornamentoMagazzino;

	@JsonIgnore
	@OneToMany(mappedBy = "fornitore", fetch = FetchType.LAZY)
	private List<RouterGiacenza> routerGiacenza;
	
	public Long getIdFornitore() {
		return idFornitore;
	}

	public void setIdFornitore(Long idFornitore) {
		this.idFornitore = idFornitore;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<RouterGiacenza> getRouterGiacenza() {
		return routerGiacenza;
	}

	public void setRouterGiacenza(List<RouterGiacenza> routerGiacenza) {
		this.routerGiacenza = routerGiacenza;
	}

	public Date getDataUltimoAggiornamentoMagazzino() {
		return dataUltimoAggiornamentoMagazzino;
	}

	public void setDataUltimoAggiornamentoMagazzino(Date dataUltimoAggiornamentoMagazzino) {
		this.dataUltimoAggiornamentoMagazzino = dataUltimoAggiornamentoMagazzino;
	}

	
}