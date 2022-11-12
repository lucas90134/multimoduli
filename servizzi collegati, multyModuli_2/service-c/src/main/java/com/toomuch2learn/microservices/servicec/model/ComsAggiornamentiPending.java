package com.toomuch2learn.microservices.servicec.model;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the coms_aggiornamenti_pending database table.
 * 
 */
@Entity
@Table(name="coms_aggiornamenti_pending")
@NamedQuery(name="ComsAggiornamentiPending.findAll", query="SELECT c FROM ComsAggiornamentiPending c")
public class ComsAggiornamentiPending implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idComsAggiornamentiPending")
	@SequenceGenerator(name="idComsAggiornamentiPending", sequenceName = "coms_aggiornamenti_pending_id_coms_aggiornamenti_pending_seq", allocationSize=1)
	@Column(name="id_coms_aggiornamenti_pending")
	private Long idComsAggiornamentiPending;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="mac")
	private String mac;

	@Column(name="ip_pt_p")
	private String ipPtP;

	@Column(name="client_code")
	private String clientCode;

	@Column(name="line_id")
	private String lineId;

	@Column(name="curr_fw_version")
	private String currFwVersion;

	@Column(name="curr_conf_version")
	private String currConfVersion;

	@Column(name="update_type")
	private String updateType;

	@Column(name="data_inserimento")
	private Date dataInserimento;


	public Long getIdComsAggiornamentiPending() {
		return idComsAggiornamentiPending;
	}

	public void setIdComsAggiornamentiPending(Long idComsAggiornamentiPending) {
		this.idComsAggiornamentiPending = idComsAggiornamentiPending;
	}

	public Long getIdLinea() {
		return idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getIpPtP() {
		return ipPtP;
	}

	public void setIpPtP(String ipPtP) {
		this.ipPtP = ipPtP;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getCurrFwVersion() {
		return currFwVersion;
	}

	public void setCurrFwVersion(String currFwVersion) {
		this.currFwVersion = currFwVersion;
	}

	public String getCurrConfVersion() {
		return currConfVersion;
	}

	public void setCurrConfVersion(String currConfVersion) {
		this.currConfVersion = currConfVersion;
	}

	public String getUpdateType() {
		return updateType;
	}

	public void setUpdateType(String updateType) {
		this.updateType = updateType;
	}

	public Date getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}
}