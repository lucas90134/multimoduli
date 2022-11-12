package com.toomuch2learn.microservices.servicec.model;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the coms_md5 database table.
 * 
 */
@Entity
@Table(name="coms_router_bloccati")
@NamedQuery(name="ComsRouterBloccati.findAll", query="SELECT c FROM ComsRouterBloccati c")
public class ComsRouterBloccati implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idComsRouterBloccati")
	@SequenceGenerator(name="idComsRouterBloccati", sequenceName = "coms_router_bloccati_id_coms_router_bloccati_seq", allocationSize=1)
	@Column(name="id_coms_router_bloccati")
	private Long idComsRouterBloccati;



	@Column(name="line_id")
	private Long lineId;

	@Column(name="mac")
	private String mac;

	@Column(name="ip_pt_p")
	private String ipPtp;

	@Column(name="client_code")
	private String clientCode;

	@Column(name="curr_fw_version")
	private String currFwVersion;

	@Column(name="curr_conf_version")
	private String currConfVersion;

	@Column(name="update_type")
	private String updateType;

	@Column(name="data_inserimento")
	private Date dataInserimento;

	public Long getIdComsRouterBloccati() {
		return idComsRouterBloccati;
	}

	public void setIdComsRouterBloccati(Long idComsRouterBloccati) {
		this.idComsRouterBloccati = idComsRouterBloccati;
	}

	public Long getLineId() {
		return lineId;
	}

	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getIpPtp() {
		return ipPtp;
	}

	public void setIpPtp(String ipPtp) {
		this.ipPtp = ipPtp;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
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