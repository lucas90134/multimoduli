package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the MAXIMO_ANAGRAFICA database table.
 * 
 */
@Entity
@Table(name="import_apparato_fabbricato")
@NamedQuery(name="ImportApparatoFabbricato.findAll", query="SELECT i FROM ImportApparatoFabbricato i")
public class ImportApparatoFabbricato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idImportApparatoFabbricato")
	@SequenceGenerator(name="idImportApparatoFabbricato", sequenceName = "import_apparato_fabbricato_id_import_apparato_fabbricato_seq", allocationSize=1)
	@Column(name="id_import_apparato_fabbricato")
	private Long idImportApparatoFabbricato;
	
	@Column(name="descrizione",length=500)
	private String descrizione;
	
	
	@Column(name="nome_file",length=200)
	private String nomeFile;

	@Column(name="data")
	private Date data;
	
	@Column(name="user_mod",length=100)
	private String userMod;

	@Column(name="id_import_owner")
	private Long idImportOwner;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_import_owner",insertable=false,updatable=false) 
	private ImportOwner importOwner;
	
	@Transient
	private String descrizioneImportOwner;
	
	@Override
	public String toString() {
		return "ImportApparatoFabbricato [idImportApparatoFabbricato=" + idImportApparatoFabbricato + ", descrizione="
				+ descrizione + ", nomeFile=" + nomeFile + ", data=" + data + ", userMod=" + userMod
				+ ", idImportOwner=" + idImportOwner + ", descrizioneImportOwner=" + descrizioneImportOwner + "]";
	}

	public Long getIdImportApparatoFabbricato() {
		return idImportApparatoFabbricato;
	}

	public void setIdImportApparatoFabbricato(Long idImportApparatoFabbricato) {
		this.idImportApparatoFabbricato = idImportApparatoFabbricato;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getNomeFile() {
		return nomeFile;
	}

	public void setNomeFile(String nomeFile) {
		this.nomeFile = nomeFile;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getUserMod() {
		return userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public Long getIdImportOwner() {
		return idImportOwner;
	}

	public void setIdImportOwner(Long idImportOwner) {
		this.idImportOwner = idImportOwner;
	}

	public String getDescrizioneImportOwner() {
		return descrizioneImportOwner;
	}

	public void setDescrizioneImportOwner(String descrizioneImportOwner) {
		this.descrizioneImportOwner = descrizioneImportOwner;
	}

	public ImportOwner getImportOwner() {
		return importOwner;
	}

	public void setImportOwner(ImportOwner importOwner) {
		this.importOwner = importOwner;
	}
	
}