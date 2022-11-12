package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
 * The persistent class for the intercompany_canoni database table.
 * 
 */
@Entity
@Table(name="intercompany_canoni")
@NamedQuery(name="IntercompanyCanoni.findAll", query="SELECT i FROM IntercompanyCanoni i")
public class IntercompanyCanoni implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idIntercompanyCanoni")
	@SequenceGenerator(name="idIntercompanyCanoni", sequenceName = "intercompany_canoni_id_intercompany_canoni_seq", allocationSize=1)
	@Column(name="id_intercompany_canoni")
	private Long idIntercompanyCanoni;

	@Column(name="id_intercompany_servizio_accesso")
	private Long idIntercompanyServizioAccesso;

	private BigDecimal importo;

	public IntercompanyCanoni() {
	}

	public Long getIdIntercompanyCanoni() {
		return this.idIntercompanyCanoni;
	}

	public void setIdIntercompanyCanoni(Long idIntercompanyCanoni) {
		this.idIntercompanyCanoni = idIntercompanyCanoni;
	}

	public Long getIdIntercompanyServizioAccesso() {
		return this.idIntercompanyServizioAccesso;
	}

	public void setIdIntercompanyServizioAccesso(Long idIntercompanyServizioAccesso) {
		this.idIntercompanyServizioAccesso = idIntercompanyServizioAccesso;
	}

	public BigDecimal getImporto() {
		return this.importo;
	}

	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

}