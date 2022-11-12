package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the MAXIMO_ANAGRAFICA database table.
 * 
 */
@Entity
@Table(name="mtm_apparato_ordine_acquisto_tipo_apparato")
@NamedQuery(name="MtmApparatoOrdineAcquistoTipoApparato.findAll", query="SELECT m FROM MtmApparatoOrdineAcquistoTipoApparato m")
public class MtmApparatoOrdineAcquistoTipoApparato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idMtmApparatoOrdineAcquistoTipoApparato")
	@SequenceGenerator(name="idMtmApparatoOrdineAcquistoTipoApparato", sequenceName = "mtm_apparato_ordine_acquisto__id_mtm_apparato_ordine_acqui_seq1", allocationSize=1)
	@Column(name="id_mtm_apparato_ordine_acquisto_tipo_apparato")
	private Long idMtmApparatoOrdineAcquistoTipoApparato;
	
	@Column(name="id_apparato_ordine_acquisto")
	private Long idApparatoOrdineAcquisto;
	
	@Column(name="id_tipo_apparato")
	private Long idTipoApparato;

	@Override
	public String toString() {
		return "{\n\t\"idMtmApparatoOrdineAcquistoTipoApparato\":\"" + idMtmApparatoOrdineAcquistoTipoApparato
				+ "\",\n\t\"idApparatoOrdineAcquisto\":\"" + idApparatoOrdineAcquisto + "\",\n\t\"idTipoApparato\":\""
				+ idTipoApparato + "\"\n}";
	}

	public Long getIdMtmApparatoOrdineAcquistoTipoApparato() {
		return idMtmApparatoOrdineAcquistoTipoApparato;
	}

	public void setIdMtmApparatoOrdineAcquistoTipoApparato(Long idMtmApparatoOrdineAcquistoTipoApparato) {
		this.idMtmApparatoOrdineAcquistoTipoApparato = idMtmApparatoOrdineAcquistoTipoApparato;
	}

	public Long getIdApparatoOrdineAcquisto() {
		return idApparatoOrdineAcquisto;
	}

	public void setIdApparatoOrdineAcquisto(Long idApparatoOrdineAcquisto) {
		this.idApparatoOrdineAcquisto = idApparatoOrdineAcquisto;
	}

	public Long getIdTipoApparato() {
		return idTipoApparato;
	}

	public void setIdTipoApparato(Long idTipoApparato) {
		this.idTipoApparato = idTipoApparato;
	}

}