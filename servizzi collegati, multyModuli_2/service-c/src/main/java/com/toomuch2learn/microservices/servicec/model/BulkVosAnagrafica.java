package com.toomuch2learn.microservices.servicec.model;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="bulk_vos_anagrafica")
public class BulkVosAnagrafica  implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idBulkVosAnagrafica")
	@SequenceGenerator(name="idBulkVosAnagrafica", sequenceName = "bulk_vos_anagrafica_id_bulk_vos_anagrafica_seq", allocationSize=1)
  @Column(name="id_bulk_vos_anagrafica")
  private long idBulkVosAnagrafica;

  @Column(name="id_lottomatica")
  private String idLottomatica;

  @Column(name="id_amministrativo")
  private String idAmministrativo;

  @Column(name="rivendita")
  private String rivendita;

  @Column(name="comune")
  private String comune;

  @Column(name="prov")
  private String prov;

  @Column(name="cap")
  private String cap;

  @Column(name="indirizzo")
  private String indirizzo;

  @Column(name="cognome")
  private String cognome;

  @Column(name="nome")
  private String nome;

  @Column(name="tel_ricevitoria")
  private String telRicevitoria;

  @Column(name="stato")
  private String stato;

  @Column(name="data_attiv")
  private String dataAttiv;

  @Column(name="data_cessaz")
  private String dataCessaz;

  @Column(name="data_riattiv")
  private String dataRiattiv;

  @Column(name="serv_lotto")
  private String servLotto;

  @Column(name="serv_f101")
  private String servF101;

  @Column(name="serv_rai")
  private String servRai;

  @Column(name="serv_infost")
  private String servInfost;

  @Column(name="serv_bollo")
  private String servBollo;

  @Column(name="serv_bigl")
  private String servBigl;

  @Column(name="serv_serv")
  private String servServ;

  @Column(name="serv_tris")
  private String servTris;

  @Column(name="serv_gv")
  private String servGv;

  @Column(name="serv_cu")
  private String servCu;

  @Column(name="serv_coni")
  private String servConi;

  @Column(name="serv_scom")
  private String servScom;

  @Column(name="campo")
  private String campo;

  public long getIdBulkVosAnagrafica() {
    return this.idBulkVosAnagrafica;
  }

  public void setIdBulkVosAnagrafica(long idBulkVosAnagrafica) {
    this.idBulkVosAnagrafica = idBulkVosAnagrafica;
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
}


