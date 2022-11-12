package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the dettaglio_richiesta database table.
 * 
 */
@Entity
@Table(name="dettaglio_richiesta")
@NamedQuery(name="DettaglioRichiesta.findAll", query="SELECT d FROM DettaglioRichiesta d")
public class DettaglioRichiesta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idDettaglioRichiesta")
	@SequenceGenerator(name="idDettaglioRichiesta", sequenceName = "dettaglio_richiesta_id_dettaglio_richiesta_seq", allocationSize=1)
	@Column(name="id_dettaglio_richiesta")
	private Long idDettaglioRichiesta;

	@JsonIgnore
	@OneToMany(mappedBy = "dettaglioRichiesta", fetch = FetchType.LAZY)
	private List<RichiestaLinea> richiestaLinea;
	
	private String descrizione;

	@Column(name="id_contratti_ltm_sed")
	private Long idContrattiLtmSed;

	@Column(name="id_gruppo")
	private Integer idGruppo;

	@Column(name="id_tipo_richiesta")
	private Long idTipoRichiesta;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_richiesta",insertable=false,updatable=false)
	private TipoRichiesta tipoRichiesta;
	
	public DettaglioRichiesta() {
	}

	public Long getIdDettaglioRichiesta() {
		return this.idDettaglioRichiesta;
	}

	public void setIdDettaglioRichiesta(Long idDettaglioRichiesta) {
		this.idDettaglioRichiesta = idDettaglioRichiesta;
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

	public Integer getIdGruppo() {
		return this.idGruppo;
	}

	public void setIdGruppo(Integer idGruppo) {
		this.idGruppo = idGruppo;
	}

	public Long getIdTipoRichiesta() {
		return this.idTipoRichiesta;
	}

	public void setIdTipoRichiesta(Long idTipoRichiesta) {
		this.idTipoRichiesta = idTipoRichiesta;
	}

	public List<RichiestaLinea> getRichiestaLinea() {
		return richiestaLinea;
	}

	public void setRichiestaLinea(List<RichiestaLinea> richiestaLinea) {
		this.richiestaLinea = richiestaLinea;
	}

	public TipoRichiesta getTipoRichiesta() {
		return tipoRichiesta;
	}

	public void setTipoRichiesta(TipoRichiesta tipoRichiesta) {
		this.tipoRichiesta = tipoRichiesta;
	}

}