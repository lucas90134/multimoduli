package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
 * The persistent class for the intercompany_tipo_ut database table.
 * 
 */
@Entity
@Table(name="intercompany_tipo_ut")
@NamedQuery(name="IntercompanyTipoUt.findAll", query="SELECT i FROM IntercompanyTipoUt i")
public class IntercompanyTipoUt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idIntercompanyTipoUt")
	@SequenceGenerator(name="idIntercompanyTipoUt", sequenceName = "intercompany_tipo_ut_id_intercompany_tipo_ut_seq", allocationSize=1)
	@Column(name="id_intercompany_tipo_ut")
	private Long idIntercompanyTipoUt;

	private String descrizione;

	@Column(name="id_intercompany_servizio_accesso")
	private Long idIntercompanyServizioAccesso;

	private BigDecimal importo;

	public IntercompanyTipoUt() {
	}

	public Long getIdIntercompanyTipoUt() {
		return this.idIntercompanyTipoUt;
	}

	public void setIdIntercompanyTipoUt(Long idIntercompanyTipoUt) {
		this.idIntercompanyTipoUt = idIntercompanyTipoUt;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
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