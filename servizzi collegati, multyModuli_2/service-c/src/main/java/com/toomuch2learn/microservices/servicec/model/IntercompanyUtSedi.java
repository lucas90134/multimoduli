package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the intercompany_ut_sedi database table.
 * 
 */
@Entity
@Table(name="intercompany_ut_sedi")
@NamedQuery(name="IntercompanyUtSedi.findAll", query="SELECT i FROM IntercompanyUtSedi i")
public class IntercompanyUtSedi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSediFatturazioneIntercompanyUt")
	@SequenceGenerator(name="idSediFatturazioneIntercompanyUt", sequenceName = "intercompany_ut_sedi_id_sedi_fatturazione_intercompany_ut_seq", allocationSize=1)
	@Column(name="id_sedi_fatturazione_intercompany_ut")
	private Long idSediFatturazioneIntercompanyUt;

	private BigDecimal canone;

	@Column(name="cod_cliente_finale")
	private String codClienteFinale;

	private Date data;

	@Column(name="id_intercompany_tipo_ut")
	private Long idIntercompanyTipoUt;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="id_sede")
	private Long idSede;

	private BigDecimal importo;

	public IntercompanyUtSedi() {
	}

	public Long getIdSediFatturazioneIntercompanyUt() {
		return this.idSediFatturazioneIntercompanyUt;
	}

	public void setIdSediFatturazioneIntercompanyUt(Long idSediFatturazioneIntercompanyUt) {
		this.idSediFatturazioneIntercompanyUt = idSediFatturazioneIntercompanyUt;
	}

	public BigDecimal getCanone() {
		return this.canone;
	}

	public void setCanone(BigDecimal canone) {
		this.canone = canone;
	}

	public String getCodClienteFinale() {
		return this.codClienteFinale;
	}

	public void setCodClienteFinale(String codClienteFinale) {
		this.codClienteFinale = codClienteFinale;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Long getIdIntercompanyTipoUt() {
		return this.idIntercompanyTipoUt;
	}

	public void setIdIntercompanyTipoUt(Long idIntercompanyTipoUt) {
		this.idIntercompanyTipoUt = idIntercompanyTipoUt;
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Long getIdSede() {
		return this.idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public BigDecimal getImporto() {
		return this.importo;
	}

	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

}