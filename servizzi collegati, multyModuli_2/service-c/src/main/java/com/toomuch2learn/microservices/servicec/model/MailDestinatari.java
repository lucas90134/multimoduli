package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the mail_destinatari database table.
 * 
 */
@Entity
@Table(name="mail_destinatari")
@NamedQuery(name="MailDestinatari.findAll", query="SELECT m FROM MailDestinatari m")
public class MailDestinatari implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idDestinatario")
	@SequenceGenerator(name="idDestinatario", sequenceName = "mail_destinatari_id_destinatario_seq", allocationSize=1)
	@Column(name="id_destinatario")
	private Long idDestinatario;

	@JsonIgnore
	@OneToMany(mappedBy = "servizio", fetch = FetchType.LAZY)
	private List<MailDestinatariServizi> destinatariServizi;
	
	@Column(name="flag_abilitato")
	private Boolean flagAbilitato;
	
	@Column(name="mail")
	private String mail;

	public MailDestinatari() {
	}

	public Long getIdDestinatario() {
		return this.idDestinatario;
	}

	public void setIdDestinatario(Long idDestinatario) {
		this.idDestinatario = idDestinatario;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<MailDestinatariServizi> getDestinatariServizi() {
		return destinatariServizi;
	}

	public void setDestinatariServizi(List<MailDestinatariServizi> destinatariServizi) {
		this.destinatariServizi = destinatariServizi;
	}

	public Boolean getFlagAbilitato() {
		return flagAbilitato;
	}

	public void setFlagAbilitato(Boolean flagAbilitato) {
		this.flagAbilitato = flagAbilitato;
	}

}