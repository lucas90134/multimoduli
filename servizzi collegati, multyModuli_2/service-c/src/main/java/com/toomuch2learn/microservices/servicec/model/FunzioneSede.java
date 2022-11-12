package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the funzione_sede database table.
 * 
 */
@Entity
@Table(name="funzione_sede")
@NamedQuery(name="FunzioneSede.findAll", query="SELECT f FROM FunzioneSede f")
public class FunzioneSede implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descrizione;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idFunzioneSede")
	@SequenceGenerator(name="idFunzioneSede", sequenceName = "funzione_sede_id_funzione_sede_seq", allocationSize=1)
	@Column(name="id_funzione_sede")
	private Long idFunzioneSede;

	private String sigla;

	public FunzioneSede() {
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getIdFunzioneSede() {
		return this.idFunzioneSede;
	}

	public void setIdFunzioneSede(Long idFunzioneSede) {
		this.idFunzioneSede = idFunzioneSede;
	}

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}