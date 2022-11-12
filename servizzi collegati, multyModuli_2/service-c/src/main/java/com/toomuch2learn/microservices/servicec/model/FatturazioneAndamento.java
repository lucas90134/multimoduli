package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name="fatturazione_andamento")
public class FatturazioneAndamento implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idFatturazioneFornitore")
  @SequenceGenerator(name="idFatturazioneFornitore", sequenceName = "fatturazione_andamento_id_fatturazione_andamento_seq", allocationSize=1)
  @Column(name="id_fatturazione_andamento")
  private Long idFatturazioneAndamento;

  @Column(name="id_fatturazione_contratti")
  private Long idFatturazioneContratti;

  @Column(name = "competenza")
  private Long competenza;

  @Column(name = "mese")
  private String mese;

  @Column(name = "fattura_carrier")
  private Long fatturaCarrier;

  @Column(name = "prima_riconciliazione")
  private Long primaRiconciliazione;

  @Column(name = "seconda_riconciliazione")
  private Long secondaRiconciliazione;

  @Column(name = "utente")
  private String utente;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_insert_mod")
  private Date dataInsertMod;

  @Column(name = "nota_credito")
  private Long notaCredito;

  @JsonIgnore
  @ManyToOne(fetch=FetchType.LAZY)
  @JoinColumn(name = "id_fatturazione_contratti", insertable=false, updatable=false)
  private FatturazioneContratti fatturazioneContratti;

  public Long getIdFatturazioneAndamento() {
    return idFatturazioneAndamento;
  }

  public void setIdFatturazioneAndamento(Long idFatturazioneAndamento) {
    this.idFatturazioneAndamento = idFatturazioneAndamento;
  }

  public Long getIdFatturazioneContratti() {
    return idFatturazioneContratti;
  }

  public void setIdFatturazioneContratti(Long idFatturazioneContratti) {
    this.idFatturazioneContratti = idFatturazioneContratti;
  }

  public Long getCompetenza() {
    return competenza;
  }

  public void setCompetenza(Long competenza) {
    this.competenza = competenza;
  }

  public String getMese() {
    return mese;
  }

  public void setMese(String mese) {
    this.mese = mese;
  }

  public Long getFatturaCarrier() {
    return fatturaCarrier;
  }

  public void setFatturaCarrier(Long fatturaCarrier) {
    this.fatturaCarrier = fatturaCarrier;
  }

  public Long getPrimaRiconciliazione() {
    return primaRiconciliazione;
  }

  public void setPrimaRiconciliazione(Long primaRiconciliazione) {
    this.primaRiconciliazione = primaRiconciliazione;
  }

  public Long getSecondaRiconciliazione() {
    return secondaRiconciliazione;
  }

  public void setSecondaRiconciliazione(Long secondaRiconciliazione) {
    this.secondaRiconciliazione = secondaRiconciliazione;
  }

  public String getUtente() {
    return utente;
  }

  public void setUtente(String utente) {
    this.utente = utente;
  }

  public Date getDataInsertMod() {
    return dataInsertMod;
  }

  public void setDataInsertMod(Date dataInsertMod) {
    this.dataInsertMod = dataInsertMod;
  }

  public Long getNotaCredito() {
    return notaCredito;
  }

  public void setNotaCredito(Long notaCredito) {
    this.notaCredito = notaCredito;
  }

  public FatturazioneContratti getFatturazioneContratti() {
    return fatturazioneContratti;
  }

  public void setFatturazioneContratti(FatturazioneContratti fatturazioneContratti) {
    this.fatturazioneContratti = fatturazioneContratti;
  }
}
