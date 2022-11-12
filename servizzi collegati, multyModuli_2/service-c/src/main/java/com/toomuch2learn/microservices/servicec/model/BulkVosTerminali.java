package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="bulk_vos_terminali")
public class BulkVosTerminali  implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idBulkVosTerminali")
  @SequenceGenerator(name="idBulkVosTerminali", sequenceName = "bulk_vos_terminali_id_bulk_vos_terminali_seq", allocationSize=1)
  @Column(name="id_bulk_vos_terminali")
  private long idBulkVosTerminali;

  @Column(name="matricola", length=30)
  private String matricola;

  @Column(name="id_lottomatica", length=10)
  private String idLottomatica;

  @Column(name="progr_term", length=10)
  private String progrTerm;

  @Column(name="data_instal", length=10)
  private String dataInstal;

  @Column(name="data_disistal", length=50)
  private String dataDisistal;

  @Column(name="stato_term", length=10)
  private String statoTerm;

  @Column(name="campo", length=2)
  private String campo;

  public long getIdBulkVosTerminali() {
    return this.idBulkVosTerminali;
  }

  public void setIdBulkVosTerminali(long idBulkVosTerminali) {
    this.idBulkVosTerminali = idBulkVosTerminali;
  }

  public String getMatricola() {
    return this.matricola;
  }

  public void setMatricola(String matricola) {
    this.matricola = matricola;
  }

  public String getIdLottomatica() {
    return this.idLottomatica;
  }

  public void setIdLottomatica(String idLottomatica) {
    this.idLottomatica = idLottomatica;
  }

  public String getProgrTerm() {
    return this.progrTerm;
  }

  public void setProgrTerm(String progrTerm) {
    this.progrTerm = progrTerm;
  }

  public String getDataInstal() {
    return this.dataInstal;
  }

  public void setDataInstal(String dataInstal) {
    this.dataInstal = dataInstal;
  }

  public String getDataDisistal() {
    return this.dataDisistal;
  }

  public void setDataDisistal(String dataDisistal) {
    this.dataDisistal = dataDisistal;
  }

  public String getStatoTerm() {
    return this.statoTerm;
  }

  public void setStatoTerm(String statoTerm) {
    this.statoTerm = statoTerm;
  }

  public String getCampo() {
    return this.campo;
  }

  public void setCampo(String campo) {
    this.campo = campo;
  }
}
