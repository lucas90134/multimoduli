package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;

import javax.persistence.*;
/**
 * The persistent class for the stato_richiesta database table.
 * 
 */
@Entity
@Table(name="stato_richiesta")
@NamedQuery(name="StatoRichiesta.findAll", query="SELECT s FROM StatoRichiesta s")
public class StatoRichiesta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idStatoRichiesta")
	@SequenceGenerator(name="idStatoRichiesta", sequenceName = "stato_richiesta_id_stato_richiesta_seq", allocationSize=1)
	@Column(name="id_stato_richiesta")
	private Long idStatoRichiesta;

	private String descrizione;

	public StatoRichiesta() {
	}

	public Long getIdStatoRichiesta() {
		return this.idStatoRichiesta;
	}

	public void setIdStatoRichiesta(Long idStatoRichiesta) {
		this.idStatoRichiesta = idStatoRichiesta;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}