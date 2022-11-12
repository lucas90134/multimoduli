package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
@Entity
@Table(name = "storico_coms_blocco_sblocco")
public class StoricoComsBloccoSblocco implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idStoricoComsBloccoSblocco")
  @SequenceGenerator(name="idStoricoComsBloccoSblocco", sequenceName = "storico_coms_blocco_sblocco_seq", allocationSize=1)
  @Column(name = "id_storico_coms_blocco_sblocco", nullable = false)
  private Long idStoricoComsBloccoSblocco;

  @Column(name = "descrizione")
  private String descrizione;

  @Column(name = "path_file")
  private String pathFile;

  @Column(name = "path_file_start")
  private String pathFileStart;

  @Column(name = "data")
  private Date data;

  @Column(name = "user_mod")
  private String userMod;

  @Column(name = "operazione")
  private  String operazione;

  @Column(name = "tag_massivo")
  private String tagMassivo;

  @Column(name = "retry")
  private Integer retry;

  @Column(name = "stato")
  private String stato;

  @Column(name = "retry_begin")
  private Integer retryBegin;

  @Column(name = "approvato")
  private Boolean approvato;

  @Column(name = "user_mod_approvatore")
  private String userModApprovatore;

  @Column(name = "data_approvazione")
  private Date dataApprovazione;

  @Column(name = "tot_ok")
  private Integer totOk;

  @Column(name = "tot_ko")
  private Integer totKo;

  @Column(name = "data_start")
  private Date dataStart;

  @JsonIgnore
	@OneToMany(mappedBy = "storicoComsBloccoSblocco", fetch = FetchType.LAZY)
	private List<StoricoMassivoBloccoSbloccoComsDettaglio> storicoMassivoBloccoSbloccoComsDettaglio;

  public Long getIdStoricoComsBloccoSblocco() {
    return idStoricoComsBloccoSblocco;
  }

  public void setIdStoricoComsBloccoSblocco(Long idStoricoComsBloccoSblocco) {
    this.idStoricoComsBloccoSblocco = idStoricoComsBloccoSblocco;
  }

  public String getDescrizione() {
    return descrizione;
  }

  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  public String getPathFile() {
    return pathFile;
  }

  public void setPathFile(String pathFile) {
    this.pathFile = pathFile;
  }

  public String getPathFileStart() {
    return pathFileStart;
  }

  public void setPathFileStart(String pathFileStart) {
    this.pathFileStart = pathFileStart;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public String getUserMod() {
    return userMod;
  }

  public void setUserMod(String userMod) {
    this.userMod = userMod;
  }

  public String getOperazione() {
    return operazione;
  }

  public void setOperazione(String operazione) {
    this.operazione = operazione;
  }

  public String getTagMassivo() {
    return tagMassivo;
  }

  public void setTagMassivo(String tagMassivo) {
    this.tagMassivo = tagMassivo;
  }

  public Integer getRetry() {
    return retry;
  }

  public void setRetry(Integer retry) {
    this.retry = retry;
  }

  public String getStato() {
    return stato;
  }

  public void setStato(String stato) {
    this.stato = stato;
  }

  public Integer getRetryBegin() {
    return retryBegin;
  }

  public void setRetryBegin(Integer retryBegin) {
    this.retryBegin = retryBegin;
  }

  public Boolean getApprovato() {
    return approvato;
  }

  public void setApprovato(Boolean approvato) {
    this.approvato = approvato;
  }

  public String getUserModApprovatore() {
    return userModApprovatore;
  }

  public void setUserModApprovatore(String userModApprovatore) {
    this.userModApprovatore = userModApprovatore;
  }

  public Date getDataApprovazione() {
    return dataApprovazione;
  }

  public void setDataApprovazione(Date dataApprovazione) {
    this.dataApprovazione = dataApprovazione;
  }

  public Integer getTotOk() {
    return totOk;
  }

  public void setTotOk(Integer totOk) {
    this.totOk = totOk;
  }

  public Integer getTotKo() {
    return totKo;
  }

  public void setTotKo(Integer totKo) {
    this.totKo = totKo;
  }

  public Date getDataStart() {
    return dataStart;
  }

  public void setDataStart(Date dataStart) {
    this.dataStart = dataStart;
  }

  public List<StoricoMassivoBloccoSbloccoComsDettaglio> getStoricoMassivoBloccoSbloccoComsDettaglio() {
    return storicoMassivoBloccoSbloccoComsDettaglio;
  }

  public void setStoricoMassivoBloccoSbloccoComsDettaglio(List<StoricoMassivoBloccoSbloccoComsDettaglio> storicoMassivoBloccoSbloccoComsDettaglio) {
    this.storicoMassivoBloccoSbloccoComsDettaglio = storicoMassivoBloccoSbloccoComsDettaglio;
  }
}