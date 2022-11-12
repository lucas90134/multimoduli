package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the intercompany_lotto_linee_target database table.
 * 
 */
@Entity
@Table(name="intercompany_lotto_linee_target")
@NamedQuery(name="IntercompanyLottoLineeTarget.findAll", query="SELECT i FROM IntercompanyLottoLineeTarget i")
public class IntercompanyLottoLineeTarget implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idIntercompanyLottoLineeTarget")
	@SequenceGenerator(name="idIntercompanyLottoLineeTarget", sequenceName = "intercompany_lotto_linee_targ_id_intercompany_lotto_linee_t_seq", allocationSize=1)
	@Column(name="id_intercompany_lotto_linee_target")
	private Long idIntercompanyLottoLineeTarget;

	private Integer attuale;

	@Column(name="id_sede")
	private Long idSede;

	private Boolean raggiunto;

	private Long target;

	public IntercompanyLottoLineeTarget() {
	}

	public Long getIdIntercompanyLottoLineeTarget() {
		return this.idIntercompanyLottoLineeTarget;
	}

	public void setIdIntercompanyLottoLineeTarget(Long idIntercompanyLottoLineeTarget) {
		this.idIntercompanyLottoLineeTarget = idIntercompanyLottoLineeTarget;
	}

	public Integer getAttuale() {
		return this.attuale;
	}

	public void setAttuale(Integer attuale) {
		this.attuale = attuale;
	}

	public Long getIdSede() {
		return this.idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public Boolean getRaggiunto() {
		return this.raggiunto;
	}

	public void setRaggiunto(Boolean raggiunto) {
		this.raggiunto = raggiunto;
	}

	public Long getTarget() {
		return this.target;
	}

	public void setTarget(Long target) {
		this.target = target;
	}

}