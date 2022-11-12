package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
@Entity
@Table(name="guasto_stato")
@NamedQuery(name="GuastoStato.findAll", query="SELECT g FROM GuastoStato g")
public class GuastoStato implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_guasto_stato")
	private Long idGuastoStato;

	@Column(name="descrizione")
	private String descrizione;

	@Column(name="inviato_al_fornitore")
	private String inviatoAlFornitore;

	@OneToMany(mappedBy = "guastoStato", fetch = FetchType.LAZY)
	List<Guasti> guasti;
	
	@OneToMany(mappedBy = "statoGuasto", fetch = FetchType.LAZY)
	List<GuastiDettagli> guastiDettagli;
	
	
	public Long getIdGuastoStato() {
		return idGuastoStato;
	}

	public void setIdGuastoStato(Long idGuastoStato) {
		this.idGuastoStato = idGuastoStato;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getInviatoAlFornitore() {
		return inviatoAlFornitore;
	}

	public void setInviatoAlFornitore(String inviatoAlFornitore) {
		this.inviatoAlFornitore = inviatoAlFornitore;
	}

	public List<Guasti> getGuasti() {
		return guasti;
	}

	public void setGuasti(List<Guasti> guasti) {
		this.guasti = guasti;
	}

	public List<GuastiDettagli> getGuastiDettagli() {
		return guastiDettagli;
	}

	public void setGuastiDettagli(List<GuastiDettagli> guastiDettagli) {
		this.guastiDettagli = guastiDettagli;
	}

}
