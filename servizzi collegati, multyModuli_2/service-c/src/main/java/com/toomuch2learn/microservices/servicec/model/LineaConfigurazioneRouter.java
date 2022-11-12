package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the linea_configurazione_router database table.
 * 
 */
@Entity
@Table(name="linea_configurazione_router")
@NamedQuery(name="LineaConfigurazioneRouter.findAll", query="SELECT l FROM LineaConfigurazioneRouter l")
public class LineaConfigurazioneRouter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idLineaConfigurazioneRouter")
	@SequenceGenerator(name="idLineaConfigurazioneRouter", sequenceName = "linea_configurazione_router_id_linea_configurazione_router_seq", allocationSize=1)
	@Column(name="id_linea_configurazione_router")
	private Long idLineaConfigurazioneRouter;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_configurazione_router",insertable=false,updatable=false)
	private ConfigurazioneRouter configurazioneRouter;

	@Column(name="id_configurazione_router")
	private Long idConfigurazioneRouter;

	@Column(name="id_linea")
	private Long idLinea;

	public LineaConfigurazioneRouter() {
	}

	public Long getIdLineaConfigurazioneRouter() {
		return this.idLineaConfigurazioneRouter;
	}

	public void setIdLineaConfigurazioneRouter(Long idLineaConfigurazioneRouter) {
		this.idLineaConfigurazioneRouter = idLineaConfigurazioneRouter;
	}

	public Long getIdConfigurazioneRouter() {
		return this.idConfigurazioneRouter;
	}

	public void setIdConfigurazioneRouter(Long idConfigurazioneRouter) {
		this.idConfigurazioneRouter = idConfigurazioneRouter;
	}

	public Long getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}

	public ConfigurazioneRouter getConfigurazioneRouter() {
		return configurazioneRouter;
	}

	public void setConfigurazioneRouter(ConfigurazioneRouter configurazioneRouter) {
		this.configurazioneRouter = configurazioneRouter;
	}

}