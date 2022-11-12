package com.toomuch2learn.microservices.servicec.model;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the coms_md5 database table.
 * 
 */
@Entity
@Table(name="coms_md5_scarico_massivo")
@NamedQuery(name="ComsMd5ScaricoMassivo.findAll", query="SELECT c FROM ComsMd5ScaricoMassivo c")
public class ComsMd5ScaricoMassivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idComsMd5ScaricoMassivo")
	@SequenceGenerator(name="idComsMd5ScaricoMassivo", sequenceName = "coms_md5_scarico_massivo_id_coms_md5_scarico_massivo_seq", allocationSize=1)
	@Column(name="id_coms_md5_scarico_massivo")
	private Long idComsMd5ScaricoMassivo;

	@Column(name="md5")
	private String md5;

	@Column(name="line_id")
	private String lineId;

	@Column(name="ip_pt_p")
	private String ipPtp;

	@Column(name="data_inserimento")
	private Date dataInserimento;


	public Long getIdComsMd5ScaricoMassivo() {
		return idComsMd5ScaricoMassivo;
	}

	public void setIdComsMd5ScaricoMassivo(Long idComsMd5ScaricoMassivo) {
		this.idComsMd5ScaricoMassivo = idComsMd5ScaricoMassivo;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getIpPtp() {
		return ipPtp;
	}

	public void setIpPtp(String ipPtp) {
		this.ipPtp = ipPtp;
	}

	public Date getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}
}