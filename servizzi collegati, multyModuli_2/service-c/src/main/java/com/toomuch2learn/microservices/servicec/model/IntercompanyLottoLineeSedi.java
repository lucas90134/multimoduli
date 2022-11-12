package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the intercompany_lotto_linee_sedi database table.
 * 
 */
@Entity
@Table(name="intercompany_lotto_linee_sedi")
@NamedQuery(name="IntercompanyLottoLineeSedi.findAll", query="SELECT i FROM IntercompanyLottoLineeSedi i")
public class IntercompanyLottoLineeSedi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idIntercompanyLottoLineeSedi")
	@SequenceGenerator(name="idIntercompanyLottoLineeSedi", sequenceName = "intercompany_lotto_linee_sedi_id_intercompany_lotto_linee_s_seq", allocationSize=1)
	@Column(name="id_intercompany_lotto_linee_sedi")
	private Long idIntercompanyLottoLineeSedi;

	private BigDecimal canone;

	@Column(name="cod_cliente_finale")
	private String codClienteFinale;

	@Column(name="data_intercompany_lotto_linee_sedi")
	private Date dataIntercompanyLottoLineeSedi;

	private Integer free;

	@Column(name="id_intercompany_tipo_ut")
	private Long idIntercompanyTipoUt;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="id_sede")
	private Long idSede;

	private Integer iron;

	private Integer light;

	@Column(name="linea_back_up")
	private Integer lineaBackUp;

	@Column(name="linea_base")
	private Integer lineaBase;

	@Column(name="linea_classic")
	private Integer lineaClassic;

	private BigDecimal ut;

	public IntercompanyLottoLineeSedi() {
	}

	public Long getIdIntercompanyLottoLineeSedi() {
		return this.idIntercompanyLottoLineeSedi;
	}

	public void setIdIntercompanyLottoLineeSedi(Long idIntercompanyLottoLineeSedi) {
		this.idIntercompanyLottoLineeSedi = idIntercompanyLottoLineeSedi;
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

	public Date getDataIntercompanyLottoLineeSedi() {
		return this.dataIntercompanyLottoLineeSedi;
	}

	public void setDataIntercompanyLottoLineeSedi(Date dataIntercompanyLottoLineeSedi) {
		this.dataIntercompanyLottoLineeSedi = dataIntercompanyLottoLineeSedi;
	}

	public Integer getFree() {
		return this.free;
	}

	public void setFree(Integer free) {
		this.free = free;
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

	public Integer getIron() {
		return this.iron;
	}

	public void setIron(Integer iron) {
		this.iron = iron;
	}

	public Integer getLight() {
		return this.light;
	}

	public void setLight(Integer light) {
		this.light = light;
	}

	public Integer getLineaBackUp() {
		return this.lineaBackUp;
	}

	public void setLineaBackUp(Integer lineaBackUp) {
		this.lineaBackUp = lineaBackUp;
	}

	public Integer getLineaBase() {
		return this.lineaBase;
	}

	public void setLineaBase(Integer lineaBase) {
		this.lineaBase = lineaBase;
	}

	public Integer getLineaClassic() {
		return this.lineaClassic;
	}

	public void setLineaClassic(Integer lineaClassic) {
		this.lineaClassic = lineaClassic;
	}

	public BigDecimal getUt() {
		return this.ut;
	}

	public void setUt(BigDecimal ut) {
		this.ut = ut;
	}

}