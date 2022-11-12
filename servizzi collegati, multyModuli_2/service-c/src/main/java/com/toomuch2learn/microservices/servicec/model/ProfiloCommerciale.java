package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
@Entity
@Table(name="PROFILO_COMMERCIALE")
public class ProfiloCommerciale implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idProfiloCommerciale")
	@SequenceGenerator(name="idProfiloCommerciale", sequenceName = "profilo_commerciale_id_profilo_commerciale_seq", allocationSize=1)
	@Column(name="ID_PROFILO_COMMERCIALE", nullable=false, precision=10)
	private Long idProfiloCommerciale;
	
	@Column(name="ID_TIPO", precision=10)
	private Long idTipo;
	
	@Column(name="ID_CONTRATTO_SED_FORNITORI", precision=10)
	private Long idContrattoSedFornitori;
	
	@Column(name="NOME_PROFILO", length=100)
	private String nomeProfilo;
	
	@Column(name="id_modello_apparato", precision=10)
	private Long idModelloApparato;
	
	@Column(name="ATTIVO", precision=10)
	private Boolean attivo;
	
	@JsonIgnore
	@OneToMany(mappedBy = "profiloCommerciale", fetch = FetchType.LAZY)
	private List<ProfiliCross> profiloCross;

	@JsonIgnore
	@OneToMany(mappedBy = "profiloCommerciale", fetch = FetchType.LAZY)
	private List<Linea> linea;

	@JsonIgnore
	@OneToMany(mappedBy = "idProfiloCommerciale", fetch = FetchType.LAZY)
	private List<ProfiloLineaPriorita> profiloLineaPriorita;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CONTRATTO_SED_FORNITORI",insertable=false,updatable=false)
	private ContrattiSedFornitori contrattiSedFornitori;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO",insertable=false,updatable=false)
	private TipoLinea tipoLinea;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_modello_apparato",insertable=false,updatable=false)
	private ModelloApparato modelloApparato;

  @JsonIgnore
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumns({
			@JoinColumn(name = "ID_TIPO", referencedColumnName = "ID_TIPO", insertable = false, updatable = false),
			@JoinColumn(name = "ID_PROFILO_COMMERCIALE", referencedColumnName = "ID_PROFILO_COMMERCIALE", insertable = false, updatable = false)
	})
	private XmlMappaturaTipoLinea xmlMappaturaTipoLinea;

  public Long getIdProfiloCommerciale() {
		return idProfiloCommerciale;
	}

	public void setIdProfiloCommerciale(Long idProfiloCommerciale) {
		this.idProfiloCommerciale = idProfiloCommerciale;
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

	public String getNomeProfilo() {
		return nomeProfilo;
	}

	public void setNomeProfilo(String nomeProfilo) {
		this.nomeProfilo = nomeProfilo;
	}

	public Long getIdModelloApparato() {
		return idModelloApparato;
	}

	public void setIdModelloApparato(Long idModelloApparato) {
		this.idModelloApparato = idModelloApparato;
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

	public ContrattiSedFornitori getContrattiSedFornitori() {
		return contrattiSedFornitori;
	}

	public void setContrattiSedFornitori(ContrattiSedFornitori contrattiSedFornitori) {
		this.contrattiSedFornitori = contrattiSedFornitori;
	}

	public TipoLinea getTipoLinea() {
		return tipoLinea;
	}

	public void setTipoLinea(TipoLinea tipoLinea) {
		this.tipoLinea = tipoLinea;
	}

	public XmlMappaturaTipoLinea getXmlMappaturaTipoLinea() {
		return xmlMappaturaTipoLinea;
	}

	public void setXmlMappaturaTipoLinea(XmlMappaturaTipoLinea xmlMappaturaTipoLinea) {
		this.xmlMappaturaTipoLinea = xmlMappaturaTipoLinea;
	}

	public List<ProfiloLineaPriorita> getProfiloLineaPriorita() {
		return profiloLineaPriorita;
	}

	public void setProfiloLineaPriorita(List<ProfiloLineaPriorita> profiloLineaPriorita) {
		this.profiloLineaPriorita = profiloLineaPriorita;
	}

	public ModelloApparato getModelloApparato() {
		return modelloApparato;
	}

	public void setModelloApparato(ModelloApparato modelloApparato) {
		this.modelloApparato = modelloApparato;
	}
}
