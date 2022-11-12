package com.toomuch2learn.microservices.servicec.model;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the coms_md5 database table.
 * 
 */
@Entity
@Table(name="coms_md5")
@NamedQuery(name="ComsMd5.findAll", query="SELECT c FROM ComsMd5 c")
public class ComsMd5 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idComsMd5")
	@SequenceGenerator(name="idComsMd5", sequenceName = "coms_md5_id_coms_md5_seq", allocationSize=1)
	@Column(name="id_coms_md5")
	private Long idComsMd5;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="md5")
	private String md5;

	@Column(name="data_aggiornamento")
	private Date dataAggiornamento;


	public Long getIdComsMd5() {
		return idComsMd5;
	}

	public void setIdComsMd5(Long idComsMd5) {
		this.idComsMd5 = idComsMd5;
	}

	public Long getIdLinea() {
		return idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public Date getDataAggiornamento() {
		return dataAggiornamento;
	}

	public void setDataAggiornamento(Date dataAggiornamento) {
		this.dataAggiornamento = dataAggiornamento;
	}
}