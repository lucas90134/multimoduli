package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
/**
 * The persistent class for the maintainer attach database table.
 * 
 */
@Entity
@Table(name="maintainer_attach")
@NamedQuery(name="MaintainerAttach.findAll", query="SELECT m FROM MaintainerAttach m")
public class MaintainerAttach implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idMaintainerAttach")
	@SequenceGenerator(name="idMaintainerAttach", sequenceName = "maintainer_attach_id_maintainer_attach_seq", allocationSize=1)
	@Column(name="id_maintainer_attach")
	private Long idMaintainerAttach;

	@Column(name="id_maintainer")
	private Long idMaintainer;
	
	@Column(name="file_name")
	private String fileName;
	
	@Column(name="date_insert")
	private Date dateInsert;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_maintainer",insertable=false,updatable=false)    
	private Maintainer maintainer;
	
	public Long getIdMaintainerAttach() {
		return idMaintainerAttach;
	}

	public void setIdMaintainerAttach(Long idMaintainerAttach) {
		this.idMaintainerAttach = idMaintainerAttach;
	}

	public Long getIdMaintainer() {
		return idMaintainer;
	}

	public void setIdMaintainer(Long idMaintainer) {
		this.idMaintainer = idMaintainer;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getDateInsert() {
		return dateInsert;
	}

	public void setDateInsert(Date dateInsert) {
		this.dateInsert = dateInsert;
	}

	public Maintainer getMaintainer() {
		return maintainer;
	}

	public void setMaintainer(Maintainer maintainer) {
		this.maintainer = maintainer;
	}

}