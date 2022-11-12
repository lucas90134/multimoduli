package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the mail_servizi database table.
 * 
 */
@Entity
@Table(name="mail_servizi")
@NamedQuery(name="MailServizi.findAll", query="SELECT m FROM MailServizi m")
public class MailServizi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idServizio")
	@SequenceGenerator(name="idServizio", sequenceName = "mail_servizi_id_servizio_seq", allocationSize=1)
	@Column(name="id_servizio")
	private Long idServizio;

	@JsonIgnore
	@OneToMany(mappedBy = "destinatario", fetch = FetchType.LAZY)
	private List<MailDestinatariServizi> destinatariServizi;
	
	
	@Column(name="nome_servizio")
	private String nomeServizio;

	public MailServizi() {
	}

	public Long getIdServizio() {
		return this.idServizio;
	}

	public void setIdServizio(Long idServizio) {
		this.idServizio = idServizio;
	}

	public String getNomeServizio() {
		return this.nomeServizio;
	}

	public void setNomeServizio(String nomeServizio) {
		this.nomeServizio = nomeServizio;
	}

	public List<MailDestinatariServizi> getDestinatariServizi() {
		return destinatariServizi;
	}

	public void setDestinatariServizi(List<MailDestinatariServizi> destinatariServizi) {
		this.destinatariServizi = destinatariServizi;
	}

}