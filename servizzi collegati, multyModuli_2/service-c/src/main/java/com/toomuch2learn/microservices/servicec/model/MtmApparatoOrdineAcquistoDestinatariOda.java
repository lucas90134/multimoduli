package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the MAXIMO_ANAGRAFICA database table.
 * 
 */
@Entity
@Table(name="mtm_apparato_ordine_acquisto_destinatari_oda")
@NamedQuery(name="MtmApparatoOrdineAcquistoDestinatariOda.findAll", query="SELECT m FROM MtmApparatoOrdineAcquistoDestinatariOda m")
public class MtmApparatoOrdineAcquistoDestinatariOda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idMtmApparatoOrdineAcquistoDestinatariOda")
	@SequenceGenerator(name="idMtmApparatoOrdineAcquistoDestinatariOda", sequenceName = "mtm_apparato_ordine_acquisto__id_mtm_apparato_ordine_acquis_seq", allocationSize=1)
	@Column(name="id_mtm_apparato_ordine_acquisto_destinatari_oda")
	private Long idMtmApparatoOrdineAcquistoDestinatariOda;
	
	@Column(name="id_apparato_ordine_acquisto")
	private Long idApparatoOrdineAcquisto;
	
	@Column(name="id_destinatario_oda")
	private Long idDestinatarioOda;

	@Override
	public String toString() {
		return "{\n\t\"idMtmApparatoOrdineAcquistoDestinatariOda\":\"" + idMtmApparatoOrdineAcquistoDestinatariOda
				+ "\",\n\t\"idApparatoOrdineAcquisto\":\"" + idApparatoOrdineAcquisto
				+ "\",\n\t\"idDestinatarioOda\":\"" + idDestinatarioOda + "\"\n}";
	}

	public Long getIdMtmApparatoOrdineAcquistoDestinatariOda() {
		return idMtmApparatoOrdineAcquistoDestinatariOda;
	}

	public void setIdMtmApparatoOrdineAcquistoDestinatariOda(Long idMtmApparatoOrdineAcquistoDestinatariOda) {
		this.idMtmApparatoOrdineAcquistoDestinatariOda = idMtmApparatoOrdineAcquistoDestinatariOda;
	}

	public Long getIdApparatoOrdineAcquisto() {
		return idApparatoOrdineAcquisto;
	}

	public void setIdApparatoOrdineAcquisto(Long idApparatoOrdineAcquisto) {
		this.idApparatoOrdineAcquisto = idApparatoOrdineAcquisto;
	}

	public Long getIdDestinatarioOda() {
		return idDestinatarioOda;
	}

	public void setIdDestinatarioOda(Long idDestinatarioOda) {
		this.idDestinatarioOda = idDestinatarioOda;
	}
	
}