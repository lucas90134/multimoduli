package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the backup_linea database table.
 * 
 */
@Entity
@Table(name="backup_linea")
@NamedQuery(name="BackupLinea.findAll", query="SELECT b FROM BackupLinea b")
public class BackupLinea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idBackupLinea")
	@SequenceGenerator(name="idBackupLinea", sequenceName = "backup_linea_id_backup_linea_seq", allocationSize=1)
	@Column(name="id_backup_linea")
	private Long idBackupLinea;

	@Column(name="data_attivazione_linea")
	private Date dataAttivazioneLinea;

	@Column(name="data_backup_ko")
	private Date dataBackupKo;

	@Column(name="data_backup_ok")
	private Date dataBackupOk;

	@Column(name="data_richiesta")
	private Date dataRichiesta;

	@Column(name="esito_backup")
	private String esitoBackup;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="id_linea_backup")
	private Long idLineaBackup;

	@Column(name="id_tipo_backup")
	private Long idTipoBackup;

	@Column(name="user_mod")
	private String userMod;

	public BackupLinea() {
	}

	public Long getIdBackupLinea() {
		return this.idBackupLinea;
	}

	public void setIdBackupLinea(Long idBackupLinea) {
		this.idBackupLinea = idBackupLinea;
	}

	public Date getDataAttivazioneLinea() {
		return this.dataAttivazioneLinea;
	}

	public void setDataAttivazioneLinea(Date dataAttivazioneLinea) {
		this.dataAttivazioneLinea = dataAttivazioneLinea;
	}

	public Date getDataBackupKo() {
		return this.dataBackupKo;
	}

	public void setDataBackupKo(Date dataBackupKo) {
		this.dataBackupKo = dataBackupKo;
	}

	public Date getDataBackupOk() {
		return this.dataBackupOk;
	}

	public void setDataBackupOk(Date dataBackupOk) {
		this.dataBackupOk = dataBackupOk;
	}

	public Date getDataRichiesta() {
		return this.dataRichiesta;
	}

	public void setDataRichiesta(Date dataRichiesta) {
		this.dataRichiesta = dataRichiesta;
	}

	public String getEsitoBackup() {
		return this.esitoBackup;
	}

	public void setEsitoBackup(String esitoBackup) {
		this.esitoBackup = esitoBackup;
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public Long getIdLineaBackup() {
		return this.idLineaBackup;
	}

	public void setIdLineaBackup(Long idLineaBackup) {
		this.idLineaBackup = idLineaBackup;
	}

	public Long getIdTipoBackup() {
		return this.idTipoBackup;
	}

	public void setIdTipoBackup(Long idTipoBackup) {
		this.idTipoBackup = idTipoBackup;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

}