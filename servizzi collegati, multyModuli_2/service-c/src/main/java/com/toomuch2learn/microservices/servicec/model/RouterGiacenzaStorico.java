package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the router_wind_giacenza database table.
 * 
 */
@Entity
@Table(name="router_giacenza_storico")
public class RouterGiacenzaStorico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRouterGiacenzaStorico")
	//@SequenceGenerator(name="idRouterGiacenza", sequenceName = "router_giacenza_id_router_giacenza_seq", allocationSize=1)
	@GenericGenerator(name = "idRouterGiacenzaStorico", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
	parameters = {
			@Parameter(name = "sequence_name", value = "router_giacenza_storico_id_router_giacenza_storico_seq"),
			@Parameter(name = "optimizer", value = "pooled-lo")
	}
			)
	@Column(name="id_router_giacenza_storico")
	private Long idRouterGiacenzaStorico;

	@Column(name="id_router_giacenza")
	private Long idRouterGiacenza;
	
	@Column(name="id_fornitore")
	private Long idFornitore;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_fornitore",insertable=false,updatable=false) 
	private Fornitore fornitore;

	private String contratto;

	@Column(name="data_inserimento")
	private Date dataInserimento;

	@Column(name="data_primo_inserimento")
	private Date dataPrimoInserimento;

	private String dislocato;

	private String marca;

	private String matricola;

	private String modello;

	private Integer quantita;

	private String tipologia;

	private String utilizzo;

	public RouterGiacenzaStorico() {
	}

	
	public Long getIdRouterGiacenzaStorico() {
		return idRouterGiacenzaStorico;
	}

	public void setIdRouterGiacenzaStorico(Long idRouterGiacenzaStorico) {
		this.idRouterGiacenzaStorico = idRouterGiacenzaStorico;
	}

	public Long getIdRouterGiacenza() {
		return this.idRouterGiacenza;
	}

	public void setIdRouterGiacenza(Long idRouterGiacenza) {
		this.idRouterGiacenza = idRouterGiacenza;
	}

	public String getContratto() {
		return this.contratto;
	}

	public void setContratto(String contratto) {
		this.contratto = contratto;
	}

	public Date getDataInserimento() {
		return this.dataInserimento;
	}

	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public Date getDataPrimoInserimento() {
		return this.dataPrimoInserimento;
	}

	public void setDataPrimoInserimento(Date dataPrimoInserimento) {
		this.dataPrimoInserimento = dataPrimoInserimento;
	}

	public String getDislocato() {
		return this.dislocato;
	}

	public void setDislocato(String dislocato) {
		this.dislocato = dislocato;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getModello() {
		return this.modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public Integer getQuantita() {
		return this.quantita;
	}

	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}

	public String getTipologia() {
		return this.tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getUtilizzo() {
		return this.utilizzo;
	}

	public void setUtilizzo(String utilizzo) {
		this.utilizzo = utilizzo;
	}

	public Long getIdFornitore() {
		return idFornitore;
	}

	public void setIdFornitore(Long idFornitore) {
		this.idFornitore = idFornitore;
	}

	public Fornitore getFornitore() {
		return fornitore;
	}

	public void setFornitore(Fornitore fornitore) {
		this.fornitore = fornitore;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contratto == null) ? 0 : contratto.hashCode());
		result = prime * result + ((dataInserimento == null) ? 0 : dataInserimento.hashCode());
		result = prime * result + ((dataPrimoInserimento == null) ? 0 : dataPrimoInserimento.hashCode());
		result = prime * result + ((dislocato == null) ? 0 : dislocato.hashCode());
		result = prime * result + ((fornitore == null) ? 0 : fornitore.hashCode());
		result = prime * result + ((idFornitore == null) ? 0 : idFornitore.hashCode());
		result = prime * result + ((idRouterGiacenza == null) ? 0 : idRouterGiacenza.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((matricola == null) ? 0 : matricola.hashCode());
		result = prime * result + ((modello == null) ? 0 : modello.hashCode());
		result = prime * result + ((quantita == null) ? 0 : quantita.hashCode());
		result = prime * result + ((tipologia == null) ? 0 : tipologia.hashCode());
		result = prime * result + ((utilizzo == null) ? 0 : utilizzo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RouterGiacenzaStorico other = (RouterGiacenzaStorico) obj;
		if (contratto == null) {
			if (other.contratto != null)
				return false;
		} else if (!contratto.equals(other.contratto))
			return false;
		if (dataInserimento == null) {
			if (other.dataInserimento != null)
				return false;
		} else if (!dataInserimento.equals(other.dataInserimento))
			return false;
		if (dataPrimoInserimento == null) {
			if (other.dataPrimoInserimento != null)
				return false;
		} else if (!dataPrimoInserimento.equals(other.dataPrimoInserimento))
			return false;
		if (dislocato == null) {
			if (other.dislocato != null)
				return false;
		} else if (!dislocato.equals(other.dislocato))
			return false;
		if (idFornitore == null) {
			if (other.idFornitore != null)
				return false;
		} else if (!idFornitore.equals(other.idFornitore))
			return false;
		if (idRouterGiacenza == null) {
			if (other.idRouterGiacenza != null)
				return false;
		} else if (!idRouterGiacenza.equals(other.idRouterGiacenza))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (matricola == null) {
			if (other.matricola != null)
				return false;
		} else if (!matricola.equals(other.matricola))
			return false;
		if (modello == null) {
			if (other.modello != null)
				return false;
		} else if (!modello.equals(other.modello))
			return false;
		if (quantita == null) {
			if (other.quantita != null)
				return false;
		} else if (!quantita.equals(other.quantita))
			return false;
		if (tipologia == null) {
			if (other.tipologia != null)
				return false;
		} else if (!tipologia.equals(other.tipologia))
			return false;
		if (utilizzo == null) {
			if (other.utilizzo != null)
				return false;
		} else if (!utilizzo.equals(other.utilizzo))
			return false;
		return true;
	}

}