package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name="bulk_vos_anagrafica_storico")
public class BulkVosAnagraficaStorico implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idBulkVosAnagraficaStorico")
  @SequenceGenerator(name="idBulkVosAnagraficaStorico", sequenceName = "bulk_vos_anagrafica_storico_id_bulk_vos_anagrafica_storico_seq", allocationSize=1)
  @Column(name="id_bulk_vos_anagrafica_storico")
  private long idBulkVosAnagraficaStorico;

  @Column(name="id_lottomatica", length=10)
  private String idLottomatica;

  @Column(name="id_amministrativo", length=10)
  private String idAmministrativo;

  @Column(name="rivendita", length=200)
  private String rivendita;

  @Column(name="comune", length=200)
  private String comune;

  @Column(name="prov", length=200)
  private String prov;

  @Column(name="cap", length=200)
  private String cap;

  @Column(name="indirizzo", length=200)
  private String indirizzo;

  @Column(name="cognome", length=200)
  private String cognome;

  @Column(name="nome", length=200)
  private String nome;

  @Column(name="tel_ricevitoria", length=200)
  private String telRicevitoria;

  @Column(name="stato", length=5)
  private String stato;

  @Column(name="data_attiv", length=50)
  private String dataAttiv;

  @Column(name="data_cessaz", length=50)
  private String dataCessaz;

  @Column(name="data_riattiv", length=50)
  private String dataRiattiv;

  @Column(name="serv_lotto", length=2)
  private String servLotto;

  @Column(name="serv_f101", length=2)
  private String servF101;

  @Column(name="serv_rai", length=2)
  private String servRai;

  @Column(name="serv_infost", length=2)
  private String servInfost;

  @Column(name="serv_bollo", length=2)
  private String servBollo;

  @Column(name="serv_bigl", length=2)
  private String servBigl;

  @Column(name="serv_serv", length=2)
  private String servServ;

  @Column(name="serv_tris", length=2)
  private String servTris;

  @Column(name="serv_gv", length=2)
  private String servGv;

  @Column(name="serv_cu", length=2)
  private String servCu;

  @Column(name="serv_coni", length=2)
  private String servConi;

  @Column(name="serv_scom", length=2)
  private String servScom;

  @Column(name="campo", length=100)
  private String campo;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="data_storicizzazione", length=29)
  private Date dataStoricizzazione;

  public long getIdBulkVosAnagraficaStorico() {
    return this.idBulkVosAnagraficaStorico;
  }

  public void setIdBulkVosAnagraficaStorico(long idBulkVosAnagraficaStorico) {
    this.idBulkVosAnagraficaStorico = idBulkVosAnagraficaStorico;
  }

  public String getIdLottomatica() {
    return this.idLottomatica;
  }

  public void setIdLottomatica(String idLottomatica) {
    this.idLottomatica = idLottomatica;
  }

  public String getIdAmministrativo() {
    return this.idAmministrativo;
  }

  public void setIdAmministrativo(String idAmministrativo) {
    this.idAmministrativo = idAmministrativo;
  }

  public String getRivendita() {
    return this.rivendita;
  }

  public void setRivendita(String rivendita) {
    this.rivendita = rivendita;
  }

  public String getComune() {
    return this.comune;
  }

  public void setComune(String comune) {
    this.comune = comune;
  }

  public String getProv() {
    return this.prov;
  }

  public void setProv(String prov) {
    this.prov = prov;
  }

  public String getCap() {
    return this.cap;
  }

  public void setCap(String cap) {
    this.cap = cap;
  }

  public String getIndirizzo() {
    return this.indirizzo;
  }

  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  public String getCognome() {
    return this.cognome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelRicevitoria() {
    return this.telRicevitoria;
  }

  public void setTelRicevitoria(String telRicevitoria) {
    this.telRicevitoria = telRicevitoria;
  }

  public String getStato() {
    return this.stato;
  }

  public void setStato(String stato) {
    this.stato = stato;
  }

  public String getDataAttiv() {
    return this.dataAttiv;
  }

  public void setDataAttiv(String dataAttiv) {
    this.dataAttiv = dataAttiv;
  }

  public String getDataCessaz() {
    return this.dataCessaz;
  }

  public void setDataCessaz(String dataCessaz) {
    this.dataCessaz = dataCessaz;
  }

  public String getDataRiattiv() {
    return this.dataRiattiv;
  }

  public void setDataRiattiv(String dataRiattiv) {
    this.dataRiattiv = dataRiattiv;
  }

  public String getServLotto() {
    return this.servLotto;
  }

  public void setServLotto(String servLotto) {
    this.servLotto = servLotto;
  }

  public String getServF101() {
    return this.servF101;
  }

  public void setServF101(String servF101) {
    this.servF101 = servF101;
  }

  public String getServRai() {
    return this.servRai;
  }

  public void setServRai(String servRai) {
    this.servRai = servRai;
  }

  public String getServInfost() {
    return this.servInfost;
  }

  public void setServInfost(String servInfost) {
    this.servInfost = servInfost;
  }

  public String getServBollo() {
    return this.servBollo;
  }

  public void setServBollo(String servBollo) {
    this.servBollo = servBollo;
  }

  public String getServBigl() {
    return this.servBigl;
  }

  public void setServBigl(String servBigl) {
    this.servBigl = servBigl;
  }

  public String getServServ() {
    return this.servServ;
  }

  public void setServServ(String servServ) {
    this.servServ = servServ;
  }

  public String getServTris() {
    return this.servTris;
  }

  public void setServTris(String servTris) {
    this.servTris = servTris;
  }

  public String getServGv() {
    return this.servGv;
  }

  public void setServGv(String servGv) {
    this.servGv = servGv;
  }

  public String getServCu() {
    return this.servCu;
  }

  public void setServCu(String servCu) {
    this.servCu = servCu;
  }

  public String getServConi() {
    return this.servConi;
  }

  public void setServConi(String servConi) {
    this.servConi = servConi;
  }

  public String getServScom() {
    return this.servScom;
  }

  public void setServScom(String servScom) {
    this.servScom = servScom;
  }

  public String getCampo() {
    return this.campo;
  }

  public void setCampo(String campo) {
    this.campo = campo;
  }

  public Date getDataStoricizzazione() {
    return this.dataStoricizzazione;
  }

  public void setDataStoricizzazione(Date dataStoricizzazione) {
    this.dataStoricizzazione = dataStoricizzazione;
  }
}


