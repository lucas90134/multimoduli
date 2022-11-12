package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the configurazione_router database table.
 * 
 */
@Entity
@Table(name="configurazione_router")
@NamedQuery(name="ConfigurazioneRouter.findAll", query="SELECT c FROM ConfigurazioneRouter c")
public class ConfigurazioneRouter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idConfigurazioneRouter")
	@SequenceGenerator(name="idConfigurazioneRouter", sequenceName = "configurazione_router_id_configurazione_router_seq", allocationSize=1)
	@Column(name="id_configurazione_router")
	private Long idConfigurazioneRouter;
	
	@JsonIgnore
	@OneToMany(mappedBy = "configurazioneRouter", fetch = FetchType.LAZY)
	private List<LineaConfigurazioneRouter> lineaConfigurazioneRouter;

	@Column(name="id_master_apparato")
	private Long idMasterApparato;

	@Column(name="id_master_linea")
	private Long idMasterLinea;

	@Column(name="id_sede")
	private Long idSede;
	
	@Column(name="ip_loopback")
	private String ipLoopback;
	

	public Long getIdConfigurazioneRouter() {
		return idConfigurazioneRouter;
	}

	public void setIdConfigurazioneRouter(Long idConfigurazioneRouter) {
		this.idConfigurazioneRouter = idConfigurazioneRouter;
	}

	public Long getIdMasterApparato() {
		return idMasterApparato;
	}

	public void setIdMasterApparato(Long idMasterApparato) {
		this.idMasterApparato = idMasterApparato;
	}

	public Long getIdMasterLinea() {
		return idMasterLinea;
	}

	public void setIdMasterLinea(Long idMasterLinea) {
		this.idMasterLinea = idMasterLinea;
	}

	public Long getIdSede() {
		return idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public List<LineaConfigurazioneRouter> getLineaConfigurazioneRouter() {
		return lineaConfigurazioneRouter;
	}

	public void setLineaConfigurazioneRouter(List<LineaConfigurazioneRouter> lineaConfigurazioneRouter) {
		this.lineaConfigurazioneRouter = lineaConfigurazioneRouter;
	}

	public String getIpLoopback() {
		return ipLoopback;
	}

	public void setIpLoopback(String ipLoopback) {
		this.ipLoopback = ipLoopback;
	}

}