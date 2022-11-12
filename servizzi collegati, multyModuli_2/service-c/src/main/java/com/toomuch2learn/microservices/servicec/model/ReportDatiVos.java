package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the report_dati_vos database table.
 * 
 */
@Entity
@Table(name="report_dati_vos")
@NamedQuery(name="ReportDatiVos.findAll", query="SELECT r FROM ReportDatiVos r")
public class ReportDatiVos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idReportDatiVos")
	@SequenceGenerator(name="idReportDatiVos", sequenceName = "report_dati_vos_id_report_dati_vos_seq", allocationSize=1)
	@Column(name="id_report_dati_vos")
	private Long idReportDatiVos;

	@Column(name="cod_cliente_finale")
	private String codClienteFinale;

	private Integer congruenza;

	@Column(name="data_attivazione")
	private Date dataAttivazione;

	@Column(name="data_cessazione")
	private Date dataCessazione;

	@Column(name="data_riattivazione")
	private Date dataRiattivazione;

	@Column(name="linee_backup")
	private Integer lineeBackup;

	@Column(name="linee_na")
	private Integer lineeNa;

	@Column(name="linee_no_backup")
	private Integer lineeNoBackup;

	@Column(name="linee_previste")
	private Integer lineePreviste;

	@Column(name="serv_bigl")
	private String servBigl;

	@Column(name="serv_bollo")
	private String servBollo;

	@Column(name="serv_coni")
	private String servConi;

	@Column(name="serv_cu")
	private String servCu;

	@Column(name="serv_f101")
	private String servF101;

	@Column(name="serv_gv")
	private String servGv;

	@Column(name="serv_infost")
	private String servInfost;

	@Column(name="serv_lotto")
	private String servLotto;

	@Column(name="serv_rai")
	private String servRai;

	@Column(name="serv_scom")
	private String servScom;

	@Column(name="serv_serv")
	private String servServ;

	@Column(name="serv_tris")
	private String servTris;

	@Column(name="stato_vos")
	private String statoVos;

	@Column(name="terminali_installati")
	private String terminaliInstallati;

	public ReportDatiVos() {
	}

	public Long getIdReportDatiVos() {
		return this.idReportDatiVos;
	}

	public void setIdReportDatiVos(Long idReportDatiVos) {
		this.idReportDatiVos = idReportDatiVos;
	}

	public String getCodClienteFinale() {
		return this.codClienteFinale;
	}

	public void setCodClienteFinale(String codClienteFinale) {
		this.codClienteFinale = codClienteFinale;
	}

	public Integer getCongruenza() {
		return this.congruenza;
	}

	public void setCongruenza(Integer congruenza) {
		this.congruenza = congruenza;
	}

	public Date getDataAttivazione() {
		return this.dataAttivazione;
	}

	public void setDataAttivazione(Date dataAttivazione) {
		this.dataAttivazione = dataAttivazione;
	}

	public Date getDataCessazione() {
		return this.dataCessazione;
	}

	public void setDataCessazione(Date dataCessazione) {
		this.dataCessazione = dataCessazione;
	}

	public Date getDataRiattivazione() {
		return this.dataRiattivazione;
	}

	public void setDataRiattivazione(Date dataRiattivazione) {
		this.dataRiattivazione = dataRiattivazione;
	}

	public Integer getLineeBackup() {
		return this.lineeBackup;
	}

	public void setLineeBackup(Integer lineeBackup) {
		this.lineeBackup = lineeBackup;
	}

	public Integer getLineeNa() {
		return this.lineeNa;
	}

	public void setLineeNa(Integer lineeNa) {
		this.lineeNa = lineeNa;
	}

	public Integer getLineeNoBackup() {
		return this.lineeNoBackup;
	}

	public void setLineeNoBackup(Integer lineeNoBackup) {
		this.lineeNoBackup = lineeNoBackup;
	}

	public Integer getLineePreviste() {
		return this.lineePreviste;
	}

	public void setLineePreviste(Integer lineePreviste) {
		this.lineePreviste = lineePreviste;
	}

	public String getServBigl() {
		return this.servBigl;
	}

	public void setServBigl(String servBigl) {
		this.servBigl = servBigl;
	}

	public String getServBollo() {
		return this.servBollo;
	}

	public void setServBollo(String servBollo) {
		this.servBollo = servBollo;
	}

	public String getServConi() {
		return this.servConi;
	}

	public void setServConi(String servConi) {
		this.servConi = servConi;
	}

	public String getServCu() {
		return this.servCu;
	}

	public void setServCu(String servCu) {
		this.servCu = servCu;
	}

	public String getServF101() {
		return this.servF101;
	}

	public void setServF101(String servF101) {
		this.servF101 = servF101;
	}

	public String getServGv() {
		return this.servGv;
	}

	public void setServGv(String servGv) {
		this.servGv = servGv;
	}

	public String getServInfost() {
		return this.servInfost;
	}

	public void setServInfost(String servInfost) {
		this.servInfost = servInfost;
	}

	public String getServLotto() {
		return this.servLotto;
	}

	public void setServLotto(String servLotto) {
		this.servLotto = servLotto;
	}

	public String getServRai() {
		return this.servRai;
	}

	public void setServRai(String servRai) {
		this.servRai = servRai;
	}

	public String getServScom() {
		return this.servScom;
	}

	public void setServScom(String servScom) {
		this.servScom = servScom;
	}

	public String getServServ() {
		return this.servServ;
	}

	public void setServServ(String servServ) {
		this.servServ = servServ;
	}

	public String getServTris() {
		return this.servTris;
	}

	public void setServTris(String servTris) {
		this.servTris = servTris;
	}

	public String getStatoVos() {
		return this.statoVos;
	}

	public void setStatoVos(String statoVos) {
		this.statoVos = statoVos;
	}

	public String getTerminaliInstallati() {
		return this.terminaliInstallati;
	}

	public void setTerminaliInstallati(String terminaliInstallati) {
		this.terminaliInstallati = terminaliInstallati;
	}

}