package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the intercompany_fatturazione_attiva_vecchie_richieste database table.
 * 
 */
@Entity
@Table(name="intercompany_fatturazione_attiva_vecchie_richieste")
@NamedQuery(name="IntercompanyFatturazioneAttivaVecchieRichieste.findAll", query="SELECT i FROM IntercompanyFatturazioneAttivaVecchieRichieste i")
public class IntercompanyFatturazioneAttivaVecchieRichieste implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idIntercompanyFatturazioneAttivaVecchieRichieste")
	@SequenceGenerator(name="idIntercompanyFatturazioneAttivaVecchieRichieste", sequenceName = "intercompany_fatturazione_att_id_intercompany_fatturazione__seq", allocationSize=1)
	@Column(name="id_intercompany_fatturazione_attiva_vecchie_richieste")
	private Long idIntercompanyFatturazioneAttivaVecchieRichieste;

	@Column(name="id_richiesta_linea")
	private Long idRichiestaLinea;

	public IntercompanyFatturazioneAttivaVecchieRichieste() {
	}

	public Long getIdIntercompanyFatturazioneAttivaVecchieRichieste() {
		return this.idIntercompanyFatturazioneAttivaVecchieRichieste;
	}

	public void setIdIntercompanyFatturazioneAttivaVecchieRichieste(Long idIntercompanyFatturazioneAttivaVecchieRichieste) {
		this.idIntercompanyFatturazioneAttivaVecchieRichieste = idIntercompanyFatturazioneAttivaVecchieRichieste;
	}

	public Long getIdRichiestaLinea() {
		return this.idRichiestaLinea;
	}

	public void setIdRichiestaLinea(Long idRichiestaLinea) {
		this.idRichiestaLinea = idRichiestaLinea;
	}

}