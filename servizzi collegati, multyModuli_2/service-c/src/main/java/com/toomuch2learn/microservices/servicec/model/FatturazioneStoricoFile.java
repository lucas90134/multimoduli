package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="fatturazione_storico_file")
public class FatturazioneStoricoFile implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idFatturazioneStoricoFile")
	@SequenceGenerator(name="idFatturazioneStoricoFile", sequenceName = "fatturazione_storico_file_id_fatturazione_storico_file_seq", allocationSize=1)
	@Column(name="id_fatturazione_storico_file")
	private Long idFatturazioneStoricoFile;

	@Column(name="nome_originale")
	private String nomeOriginale;
	
	@Column(name="path_name")
	private String pathName;
	
	@Column(name="id_marker")
	private Long idMarker;

	public String getNomeOriginale() {
		return nomeOriginale;
	}

	public void setNomeOriginale(String nomeOriginale) {
		this.nomeOriginale = nomeOriginale;
	}

	public String getPathName() {
		return pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	public Long getIdMarker() {
		return idMarker;
	}

	public void setIdMarker(Long idMarker) {
		this.idMarker = idMarker;
	}

	public Long getIdFatturazioneStoricoFile() {
		return idFatturazioneStoricoFile;
	}

	public void setIdFatturazioneStoricoFile(Long idFatturazioneStoricoFile) {
		this.idFatturazioneStoricoFile = idFatturazioneStoricoFile;
	}

}
