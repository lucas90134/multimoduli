package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the router_prodotti_ics database table.
 * 
 */
@Entity
@Table(name="router_prodotti_ics")
@NamedQuery(name="RouterProdottiIcs.findAll", query="SELECT r FROM RouterProdottiIcs r")
public class RouterProdottiIcs implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idProdotto")
	@SequenceGenerator(name="idProdotto", sequenceName = "router_prodotti_ics_id_router_prodotti_ics_seq", allocationSize=1)
	@Column(name="id_prodotto")
	private Long idProdotto;

	private String descrizione;

	@Column(name="matricola_necessaria")
	private Boolean matricolaNecessaria;

	@Column(name="tipo_prodotto")
	private String tipoProdotto;

	public RouterProdottiIcs() {
	}

	public Long getIdProdotto() {
		return this.idProdotto;
	}

	public void setIdProdotto(Long idProdotto) {
		this.idProdotto = idProdotto;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Boolean getMatricolaNecessaria() {
		return this.matricolaNecessaria;
	}

	public void setMatricolaNecessaria(Boolean matricolaNecessaria) {
		this.matricolaNecessaria = matricolaNecessaria;
	}

	public String getTipoProdotto() {
		return this.tipoProdotto;
	}

	public void setTipoProdotto(String tipoProdotto) {
		this.tipoProdotto = tipoProdotto;
	}

}