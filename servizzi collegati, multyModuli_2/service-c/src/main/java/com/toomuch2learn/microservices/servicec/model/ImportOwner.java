package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the MAXIMO_ANAGRAFICA database table.
 * 
 */
@Entity
@Table(name="import_owner")
@NamedQuery(name="ImportOwner.findAll", query="SELECT i FROM ImportOwner i")
public class ImportOwner implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idImportOwner")
	@SequenceGenerator(name="idImportOwner", sequenceName = "import_owner_id_import_owner_seq", allocationSize=1)
	@Column(name="id_import_owner")
	private Long idImportOwner;
	
	@Column(name="descrizione")
	private String descrizione;
	
	@JsonIgnore
	@OneToMany(mappedBy = "importOwner", fetch = FetchType.LAZY)
	private List<ImportApparatoFabbricato> importApparatoFabbricato;
	
	@Override
	public String toString() {
		return "ImportOwner [idImportOwner=" + idImportOwner + ", descrizione=" + descrizione + "]";
	}


	public Long getIdImportOwner() {
		return idImportOwner;
	}


	public void setIdImportOwner(Long idImportOwner) {
		this.idImportOwner = idImportOwner;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public List<ImportApparatoFabbricato> getImportApparatoFabbricato() {
		return importApparatoFabbricato;
	}


	public void setImportApparatoFabbricato(List<ImportApparatoFabbricato> importApparatoFabbricato) {
		this.importApparatoFabbricato = importApparatoFabbricato;
	}

}