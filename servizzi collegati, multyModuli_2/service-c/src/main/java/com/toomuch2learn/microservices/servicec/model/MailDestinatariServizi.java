package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the mail_destinatari_servizi database table.
 * 
 */
@Entity
@Table(name="mail_destinatari_servizi")
@NamedQuery(name="MailDestinatariServizi.findAll", query="SELECT m FROM MailDestinatariServizi m")
public class MailDestinatariServizi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idMailDestinatarioServizio")
	@SequenceGenerator(name="idMailDestinatarioServizio", sequenceName = "mail_destinatari_servizi_id_mail_destinatario_servizio_seq", allocationSize=1)
	@Column(name="id_mail_destinatario_servizio")
	private Long idMailDestinatarioServizio;

	@Column(name="id_destinatario")
	private Long idDestinatario;

	@Column(name="id_servizio")
	private Long idServizio;

	@Column(name="copia_conoscenza")
	private Boolean copiaConoscenza;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_destinatario",updatable=false,insertable=false)
	private MailDestinatari destinatario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_servizio",updatable=false,insertable=false)
	private MailServizi servizio;
	
	public MailDestinatariServizi() {
	}

	public Long getIdMailDestinatarioServizio() {
		return this.idMailDestinatarioServizio;
	}

	public void setIdMailDestinatarioServizio(Long idMailDestinatarioServizio) {
		this.idMailDestinatarioServizio = idMailDestinatarioServizio;
	}

	public Long getIdDestinatario() {
		return this.idDestinatario;
	}

	public void setIdDestinatario(Long idDestinatario) {
		this.idDestinatario = idDestinatario;
	}

	public Long getIdServizio() {
		return this.idServizio;
	}

	public void setIdServizio(Long idServizio) {
		this.idServizio = idServizio;
	}

	public MailDestinatari getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(MailDestinatari destinatario) {
		this.destinatario = destinatario;
	}

	public MailServizi getServizio() {
		return servizio;
	}

	public void setServizio(MailServizi servizio) {
		this.servizio = servizio;
	}

	public Boolean getCopiaConoscienza() {
		return copiaConoscenza;
	}

	public void setCopiaConoscenza(Boolean copiaConoscenza) {
		this.copiaConoscenza = copiaConoscenza;
	}

}