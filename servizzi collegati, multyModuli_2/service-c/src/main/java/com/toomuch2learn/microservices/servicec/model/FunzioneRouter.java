package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the funzione_router database table.
 * 
 */
@Entity
@Table(name="funzione_router")
@NamedQuery(name="FunzioneRouter.findAll", query="SELECT f FROM FunzioneRouter f")
public class FunzioneRouter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idFunzioneRouter")
	@SequenceGenerator(name="idFunzioneRouter", sequenceName = "funzione_router_id_funzione_router_seq", allocationSize=1)
	@Column(name="id_funzione_router")
	private Long idFunzioneRouter;

	private String descrizione;

	@Column(name="id_contratti_ltm_sed")
	private Long idContrattiLtmSed;

	public FunzioneRouter() {
	}

	public Long getIdFunzioneRouter() {
		return this.idFunzioneRouter;
	}

	public void setIdFunzioneRouter(Long idFunzioneRouter) {
		this.idFunzioneRouter = idFunzioneRouter;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getIdContrattiLtmSed() {
		return this.idContrattiLtmSed;
	}

	public void setIdContrattiLtmSed(Long idContrattiLtmSed) {
		this.idContrattiLtmSed = idContrattiLtmSed;
	}

}