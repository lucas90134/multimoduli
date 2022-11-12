package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;


/**
 * The persistent class for the APPARATI_LINEA database table.
 * 
 */
@Entity
@Table(name="APPARATI_LINEA")
@NamedQuery(name="ApparatiLinea.findAll", query="SELECT a FROM ApparatiLinea a")
public class ApparatiLinea implements Serializable{// ,PersistentAttributeInterceptable{
	private static final long serialVersionUID = 1L;
	
//	@Transient
//	private PersistentAttributeInterceptor interceptor;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idApparatiLinea")
	@SequenceGenerator(name="idApparatiLinea", sequenceName = "apparati_linea_id_apparati_linea_seq", allocationSize=1)
	@Column(name="ID_APPARATI_LINEA")
	private Long idApparatiLinea;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "apparatiLinea", fetch = FetchType.LAZY)
	private List<MatriceLinea> matriceLinea;
	
	@JsonIgnore
	@OneToMany(mappedBy = "apparatiLinea", fetch = FetchType.LAZY)
	private List<IpAddressApparato> ipAddressApparato;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_APPARATO_FABBRICATO",insertable=false,updatable=false)       
	private ApparatoFabbricato apparatoFabbricato;

	@Column(name="APPARATO_COMPLETO")
	private String apparatoCompleto;

	@Column(name="CONFIGVERSION")
	private String configversion;

	@Column(name="CONTROLLO")
	private String controllo;

	@Column(name="DATA")
	private Date data;

	@Column(name="DATA_PRESA_IN_CARICO")
	private Date dataPresaInCarico;

	@Column(name="DATA_TEMPLATE")
	private Date dataTemplate;

	@Column(name="ERICE")
	private Integer erice;

	@Column(name="ESITO_PRESA_IN_CARICO")
	private String esitoPresaInCarico;

	@Column(name="FIRMWARE")
	private String firmware;

	@Column(name="FLAG_ANTENNA_ALTO_GUADAGNO")
	private Boolean flagAntennaAltoGuadagno;

	@Column(name="FLAG_STATO_APPARATO")
	private Boolean flagStatoApparato;

	@Column(name="Fuori_Standard")
	private String fuori_Standard;

	@Column(name="HOST_NAME")
	private String hostName;

	@Column(name="ID_APPARATI_MIGRATO")
	private Integer idApparatiMigrato;

	@Column(name="ID_FUNZIONE_ROUTER")
	private Long idFunzioneRouter;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "ID_FUNZIONE_ROUTER",insertable=false,updatable=false)    
	private FunzioneRouter funzioneRouter;

	@Column(name="ID_MODELLO_APPARATO")
	private Long idModelloApparato;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "ID_MODELLO_APPARATO",insertable=false,updatable=false)    
	private ModelloApparato modelloApparato;

	@Column(name="MAAF")
	private Integer maaf;

	@Column(name="MANUTENZIONE")
	private String manutenzione;

	@Column(name="MATRICOLA")
	private String matricola;

	@Column(name="PORTA_SERIALE_APPAR")
	private String portaSerialeAppar;

	@Column(name="PROGRESSIVO_GARA")
	private Integer progressivoGara;

	@Column(name="RACK")
	private String rack;

	@Column(name="RISPOSTA_COMS")
	private String rispostaComs;

	@Column(name="SEMAFORO_COMS")
	private Integer semaforoComs;

	@Column(name="SEMAFORO_COMS_BLOCCO")
	private Integer semaforoComsBlocco;

	@Column(name="SERIAL_NUMBER")
	private String serialNumber;

	@Column(name="SIST_OPER")
	private String sistOper;

	@Column(name="TABLET")
	private Integer tablet;

	@Column(name="TIPO_TEMPLATE")
	private String tipoTemplate;

	@Column(name="USER_MOD")
	private String userMod;

	@Column(name="VERS_SIST_OPER")
	private String versSistOper;

	@Column(name="WIFI")
	private Integer wifi;

	@Column(name="ID_APPARATO_FABBRICATO")
	private Long idApparatoFabbricato;

	
	public ApparatiLinea() {
	}

	public Long getIdApparatiLinea() {
		return this.idApparatiLinea;
	}

	public void setIdApparatiLinea(Long idApparatiLinea) {
		this.idApparatiLinea = idApparatiLinea;
	}

	public String getApparatoCompleto() {
		return this.apparatoCompleto;
	}

	public void setApparatoCompleto(String apparatoCompleto) {
		this.apparatoCompleto = apparatoCompleto;
	}

	public String getConfigversion() {
		return this.configversion;
	}

	public void setConfigversion(String configversion) {
		this.configversion = configversion;
	}

	public String getControllo() {
		return this.controllo;
	}

	public void setControllo(String controllo) {
		this.controllo = controllo;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getDataPresaInCarico() {
		return this.dataPresaInCarico;
	}

	public void setDataPresaInCarico(Date dataPresaInCarico) {
		this.dataPresaInCarico = dataPresaInCarico;
	}

	public Date getDataTemplate() {
		return this.dataTemplate;
	}

	public void setDataTemplate(Date dataTemplate) {
		this.dataTemplate = dataTemplate;
	}

	public Integer getErice() {
		return this.erice;
	}

	public void setErice(Integer erice) {
		this.erice = erice;
	}

	public String getEsitoPresaInCarico() {
		return this.esitoPresaInCarico;
	}

	public void setEsitoPresaInCarico(String esitoPresaInCarico) {
		this.esitoPresaInCarico = esitoPresaInCarico;
	}

	public String getFirmware() {
		return this.firmware;
	}

	public void setFirmware(String firmware) {
		this.firmware = firmware;
	}

	public Boolean getFlagAntennaAltoGuadagno() {
		return this.flagAntennaAltoGuadagno;
	}

	public void setFlagAntennaAltoGuadagno(Boolean flagAntennaAltoGuadagno) {
		this.flagAntennaAltoGuadagno = flagAntennaAltoGuadagno;
	}

	public Boolean getFlagStatoApparato() {
		return this.flagStatoApparato;
	}

	public void setFlagStatoApparato(Boolean flagStatoApparato) {
		this.flagStatoApparato = flagStatoApparato;
	}

	public String getFuori_Standard() {
		return this.fuori_Standard;
	}

	public void setFuori_Standard(String fuori_Standard) {
		this.fuori_Standard = fuori_Standard;
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public Integer getIdApparatiMigrato() {
		return this.idApparatiMigrato;
	}

	public void setIdApparatiMigrato(Integer idApparatiMigrato) {
		this.idApparatiMigrato = idApparatiMigrato;
	}

	public Long getIdFunzioneRouter() {
		return this.idFunzioneRouter;
	}

	public void setIdFunzioneRouter(Long idFunzioneRouter) {
		this.idFunzioneRouter = idFunzioneRouter;
	}

	public Long getIdModelloApparato() {
		return this.idModelloApparato;
	}

	public void setIdModelloApparato(Long idModelloApparato) {
		this.idModelloApparato = idModelloApparato;
	}

	public Integer getMaaf() {
		return this.maaf;
	}

	public void setMaaf(Integer maaf) {
		this.maaf = maaf;
	}

	public String getManutenzione() {
		return this.manutenzione;
	}

	public void setManutenzione(String manutenzione) {
		this.manutenzione = manutenzione;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getPortaSerialeAppar() {
		return this.portaSerialeAppar;
	}

	public void setPortaSerialeAppar(String portaSerialeAppar) {
		this.portaSerialeAppar = portaSerialeAppar;
	}

	public Integer getProgressivoGara() {
		return this.progressivoGara;
	}

	public void setProgressivoGara(Integer progressivoGara) {
		this.progressivoGara = progressivoGara;
	}

	public String getRack() {
		return this.rack;
	}

	public void setRack(String rack) {
		this.rack = rack;
	}

	public String getRispostaComs() {
		return this.rispostaComs;
	}

	public void setRispostaComs(String rispostaComs) {
		this.rispostaComs = rispostaComs;
	}

	public Integer getSemaforoComs() {
		return this.semaforoComs;
	}

	public void setSemaforoComs(Integer semaforoComs) {
		this.semaforoComs = semaforoComs;
	}

	public Integer getSemaforoComsBlocco() {
		return this.semaforoComsBlocco;
	}

	public void setSemaforoComsBlocco(Integer semaforoComsBlocco) {
		this.semaforoComsBlocco = semaforoComsBlocco;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSistOper() {
		return this.sistOper;
	}

	public void setSistOper(String sistOper) {
		this.sistOper = sistOper;
	}

	public Integer getTablet() {
		return this.tablet;
	}

	public void setTablet(Integer tablet) {
		this.tablet = tablet;
	}

	public String getTipoTemplate() {
		return this.tipoTemplate;
	}

	public void setTipoTemplate(String tipoTemplate) {
		this.tipoTemplate = tipoTemplate;
	}

	public String getUserMod() {
		return this.userMod;
	}

	public void setUserMod(String userMod) {
		this.userMod = userMod;
	}

	public String getVersSistOper() {
		return this.versSistOper;
	}

	public void setVersSistOper(String versSistOper) {
		this.versSistOper = versSistOper;
	}

	public Integer getWifi() {
		return this.wifi;
	}

	public void setWifi(Integer wifi) {
		this.wifi = wifi;
	}

	public List<MatriceLinea> getMatriceLinea() {
		return matriceLinea;
	}

	public void setMatriceLinea(List<MatriceLinea> matriceLinea) {
		this.matriceLinea = matriceLinea;
	}

	public ApparatoFabbricato getApparatoFabbricato() {
		return apparatoFabbricato;
	}

	public void setApparatoFabbricato(ApparatoFabbricato apparatoFabbricato) {
		this.apparatoFabbricato = apparatoFabbricato;
	}

	public FunzioneRouter getFunzioneRouter() {
		return funzioneRouter;
	}

	public void setFunzioneRouter(FunzioneRouter funzioneRouter) {
		this.funzioneRouter = funzioneRouter;
	}

	public ModelloApparato getModelloApparato() {
		return modelloApparato;
	}

	public void setModelloApparato(ModelloApparato modelloApparato) {
		this.modelloApparato = modelloApparato;
	}

	public Long getIdApparatoFabbricato() {
		return idApparatoFabbricato;
	}

	public void setIdApparatoFabbricato(Long idApparatoFabbricato) {
		this.idApparatoFabbricato = idApparatoFabbricato;
	}

	public List<IpAddressApparato> getIpAddressApparato() {
		return ipAddressApparato;
	}

	public void setIpAddressApparato(List<IpAddressApparato> ipAddressApparato) {
		this.ipAddressApparato = ipAddressApparato;
	}

	//	public IpMacaddressLineeGprsLotto getIpMacAddressLineeGprsLotto() {
////		if (interceptor != null) {
////			 return (IpMacaddressLineeGprsLotto) interceptor.readObject(this, "ipMacAddressLineeGprsLotto", ipMacAddressLineeGprsLotto);
////       }
//		return ipMacAddressLineeGprsLotto;
//	}
//
//	public void setIpMacAddressLineeGprsLotto(IpMacaddressLineeGprsLotto ipMacAddressLineeGprsLotto) {
////		
////		if (interceptor != null) {
////            this.ipMacAddressLineeGprsLotto = (IpMacaddressLineeGprsLotto) interceptor.writeObject(this, "ipMacAddressLineeGprsLotto", this.ipMacAddressLineeGprsLotto, ipMacAddressLineeGprsLotto);
////            return;
////        }
//		this.ipMacAddressLineeGprsLotto = ipMacAddressLineeGprsLotto;
//	}
//
//	public ModelloApparato getModelloApparato() {
//		return modelloApparato;
//	}
//
//	public void setModelloApparato(ModelloApparato modelloApparato) {
//		this.modelloApparato = modelloApparato;
//	}
//
//	public FunzioneRouter getFunzioneRouter() {
//		return funzioneRouter;
//	}
//
//	public void setFunzioneRouter(FunzioneRouter funzioneRouter) {
//		this.funzioneRouter = funzioneRouter;
//	}

//	@Override
//	public PersistentAttributeInterceptor $$_hibernate_getInterceptor() {
//		return interceptor;
//	}
//
//	@Override
//	public void $$_hibernate_setInterceptor(PersistentAttributeInterceptor interceptor) {
//		this.interceptor = interceptor;
//	}

}
