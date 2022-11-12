package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the cluster database table.
 * 
 */
@Entity
@NamedQuery(name="Cluster.findAll", query="SELECT c FROM Cluster c")
public class Cluster implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descrizione;
	
	@Column(name="id_business_sede")
	private Long idBusinessSede;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idCluster")
	@SequenceGenerator(name="idCluster", sequenceName = "cluster_id_cluster_seq", allocationSize=1)
	@Column(name="id_cluster")
	private Long idCluster;

	public Cluster() {
	}


	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getIdBusinessSede() {
		return this.idBusinessSede;
	}

	public void setIdBusinessSede(Long idBusinessSede) {
		this.idBusinessSede = idBusinessSede;
	}

	public Long getIdCluster() {
		return this.idCluster;
	}

	public void setIdCluster(Long idCluster) {
		this.idCluster = idCluster;
	}

}