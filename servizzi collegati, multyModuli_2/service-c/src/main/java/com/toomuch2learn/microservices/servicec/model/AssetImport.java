package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the maintainer attach database table.
 * 
 */
@Entity
@Table(name="asset_import")
@NamedQuery(name="AssetImport.findAll", query="SELECT m FROM AssetImport m")
public class AssetImport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idAssetImport")
	@SequenceGenerator(name="idAssetImport", sequenceName = "asset_import_id_asset_import_seq", allocationSize=1)
	@Column(name="id_asset_import")
	private Long idAssetImport;

	@Column(name="file_name")
	private String fileName;
	
	@Column(name="date_insert")
	private Date dateInsert;
	
	@Column(name="description")
	private String description;
	
	@Column(name="import_type")
	private String importType;
	
	@Column(name="user_mod")
	private String userMod;
	
	@Column(name="type")
	private String type;
	
	public Long getIdAssetImport() {
		return idAssetImport;
	}

	public void setIdAssetImport(Long idAssetImport) {
		this.idAssetImport = idAssetImport;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImportType() {
		return importType;
	}

	public void setImportType(String importType) {
		this.importType = importType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserMod() {
		return userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}
}