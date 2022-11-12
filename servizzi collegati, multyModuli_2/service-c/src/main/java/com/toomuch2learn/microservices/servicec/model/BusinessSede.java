package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the business_sede database table.
 * 
 */
@Entity
@Table(name="business_sede")
@NamedQuery(name="BusinessSede.findAll", query="SELECT b FROM BusinessSede b")
public class BusinessSede implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descrizione;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idBusinessSede")
	@SequenceGenerator(name="idBusinessSede", sequenceName = "business_sede_id_business_sede_seq", allocationSize=1)
	@Column(name="id_business_sede")
	private Long idBusinessSede;

	public BusinessSede() {
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getIdBusinessSede() {
		return this.idBusinessSede;
	}

	public void setIdBusinessSede(Long idBusinessSede) {
		this.idBusinessSede = idBusinessSede;
	}

}