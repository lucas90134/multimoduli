package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
@Entity
@Table(name="PROFILO_BANDA")
public class ProfiloBanda implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idProfiloBanda")
	@SequenceGenerator(name="idProfiloBanda", sequenceName = "profilo_banda_id_profilo_banda_seq", allocationSize=1)
	@Column(name="ID_PROFILO_BANDA", nullable=false, precision=10)
	private Long idProfiloBanda;
	
	@Column(name="ID_TIPO", precision=10)
	private Long idTipo;
	
	@Column(name="ID_CONTRATTO_SED_FORNITORI", precision=10)
	private Long idContrattoSedFornitori;
	
	@Column(name="WHS", length=1)
	private Boolean whs;
	
	@Column(name="MCR_DOWN", length=10)
	private String mcrDown;
	
	@Column(name="PCR_DOWN", length=10)
	private String pcrDown;
	
	@Column(name="MCR_UP", length=10)
	private String mcrUp;
	
	@Column(name="PCR_UP", length=10)
	private String pcrUp;
	
	@Column(name="PCR", length=10)
	private String pcr;
	
	@Column(name="MCR", length=10)
	private String mcr;
	
	@Column(name="CANALI", precision=10)
	private Integer canali;
	
	@Column(name="BANDA", precision=10)
	private Integer banda;
	
	@Column(name="NOME_PROFILO", length=100)
	private String nomeProfilo;
	
	@Column(name="ID_SERVIZI_LTM_VENDIBILITA", precision=10)
	private Integer idServiziLtmVendibilita;
	
	@Column(name="ID_PROFILO_TECNICO_LOTTOMATICA", precision=10)
	private Integer idProfiloTecnicoLottomatica;
	
	@Column(name="ATTIVO", precision=10)
	private Boolean attivo;

	@JsonIgnore
	@OneToMany(mappedBy = "profiloBanda", fetch = FetchType.LAZY)
	private List<ProfiliCross> profiloCross;
	
	@JsonIgnore
	@OneToMany(mappedBy = "profiloBanda", fetch = FetchType.LAZY)
	private List<Linea> linea;

	public Long getIdProfiloBanda() {
		return idProfiloBanda;
	}

	public void setIdProfiloBanda(Long idProfiloBanda) {
		this.idProfiloBanda = idProfiloBanda;
	}

	public Long getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}

	public Long getIdContrattoSedFornitori() {
		return idContrattoSedFornitori;
	}

	public void setIdContrattoSedFornitori(Long idContrattoSedFornitori) {
		this.idContrattoSedFornitori = idContrattoSedFornitori;
	}

	public Boolean getWhs() {
		return whs;
	}

	public void setWhs(Boolean whs) {
		this.whs = whs;
	}

	public String getMcrDown() {
		return mcrDown;
	}

	public void setMcrDown(String mcrDown) {
		this.mcrDown = mcrDown;
	}

	public String getPcrDown() {
		return pcrDown;
	}

	public void setPcrDown(String pcrDown) {
		this.pcrDown = pcrDown;
	}

	public String getMcrUp() {
		return mcrUp;
	}

	public void setMcrUp(String mcrUp) {
		this.mcrUp = mcrUp;
	}

	public String getPcrUp() {
		return pcrUp;
	}

	public void setPcrUp(String pcrUp) {
		this.pcrUp = pcrUp;
	}

	public String getPcr() {
		return pcr;
	}

	public void setPcr(String pcr) {
		this.pcr = pcr;
	}

	public String getMcr() {
		return mcr;
	}

	public void setMcr(String mcr) {
		this.mcr = mcr;
	}

	public Integer getCanali() {
		return canali;
	}

	public void setCanali(Integer canali) {
		this.canali = canali;
	}

	public Integer getBanda() {
		return banda;
	}

	public void setBanda(Integer banda) {
		this.banda = banda;
	}

	public String getNomeProfilo() {
		return nomeProfilo;
	}

	public void setNomeProfilo(String nomeProfilo) {
		this.nomeProfilo = nomeProfilo;
	}

	public Integer getIdServiziLtmVendibilita() {
		return idServiziLtmVendibilita;
	}

	public void setIdServiziLtmVendibilita(Integer idServiziLtmVendibilita) {
		this.idServiziLtmVendibilita = idServiziLtmVendibilita;
	}

	public Integer getIdProfiloTecnicoLottomatica() {
		return idProfiloTecnicoLottomatica;
	}

	public void setIdProfiloTecnicoLottomatica(Integer idProfiloTecnicoLottomatica) {
		this.idProfiloTecnicoLottomatica = idProfiloTecnicoLottomatica;
	}

	public Boolean getAttivo() {
		return attivo;
	}

	public void setAttivo(Boolean attivo) {
		this.attivo = attivo;
	}

	public List<Linea> getLinea() {
		return linea;
	}

	public void setLinea(List<Linea> linea) {
		this.linea = linea;
	}

	public List<ProfiliCross> getProfiloCross() {
		return profiloCross;
	}

	public void setProfiloCross(List<ProfiliCross> profiloCross) {
		this.profiloCross = profiloCross;
	}

}
