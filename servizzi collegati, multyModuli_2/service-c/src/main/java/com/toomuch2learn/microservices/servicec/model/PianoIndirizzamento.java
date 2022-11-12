package com.toomuch2learn.microservices.servicec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name="piano_indirizzamento")
public class PianoIndirizzamento implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idPianoIndirizzamento")
	@SequenceGenerator(name="idPianoIndirizzamento", sequenceName = "piano_indirizzamento_id_piano_indirizzamento_seq", allocationSize=1)
	@Column(name="id_piano_indirizzamento")
	private Long idPianoIndirizzamento;

	@Column(name="id_anagrafica_fornitore")
	private Long idAnagraficaFornitore;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_anagrafica_fornitore",insertable=false,updatable=false)
	private AnagraficaFornitore anagraficaFornitore;

	@Column(name="id_contratto_ltm_sed")
	private Long idContrattoLtmSed;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_contratto_ltm_sed",insertable=false,updatable=false)
	private ContrattiLtmSed contrattiLtmSed;

	@Column(name="id_sede")
	private Long idSede;

	@Column(name="id_linea")
	private Long idLinea;

	@Column(name="codice_servizio")
	private String codiceServizio;

	@Column(name="network")
	private String network;

	@Column(name="netmask")
	private String netmask;

	@Column(name="numero_lan")
	private String numeroLan;
	
	@Column(name="stato")
	private String stato;

	@Column(name="note")
	private String note;

	@Column(name="data_assegnazione")
	private Date dataAssegnazione;
	
	@Column(name="tipologia_piano")
	private String tipologiaPiano;

	@Column(name="identificativo")
	private String identificativo;
	
	@Transient
	private String identificativoRimappato;
	
	@Transient
	private String anagraficaFornitoreDesc;
	
	@Transient
	private String contrattoLtmSedDesc;

	public Long getIdPianoIndirizzamento() {
		return idPianoIndirizzamento;
	}


	public void setIdPianoIndirizzamento(Long idPianoIndirizzamento) {
		this.idPianoIndirizzamento = idPianoIndirizzamento;
	}


	public Long getIdAnagraficaFornitore() {
		return idAnagraficaFornitore;
	}


	public void setIdAnagraficaFornitore(Long idAnagraficaFornitore) {
		this.idAnagraficaFornitore = idAnagraficaFornitore;
	}


	public AnagraficaFornitore getAnagraficaFornitore() {
		return anagraficaFornitore;
	}


	public void setAnagraficaFornitore(AnagraficaFornitore anagraficaFornitore) {
		this.anagraficaFornitore = anagraficaFornitore;
	}


	public Long getIdContrattoLtmSed() {
		return idContrattoLtmSed;
	}


	public void setIdContrattoLtmSed(Long idContrattoLtmSed) {
		this.idContrattoLtmSed = idContrattoLtmSed;
	}


	public ContrattiLtmSed getContrattiLtmSed() {
		return contrattiLtmSed;
	}


	public void setContrattiLtmSed(ContrattiLtmSed contrattiLtmSed) {
		this.contrattiLtmSed = contrattiLtmSed;
	}


	public Long getIdSede() {
		return idSede;
	}


	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}


	public Long getIdLinea() {
		return idLinea;
	}


	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}


	public String getCodiceServizio() {
		return codiceServizio;
	}


	public void setCodiceServizio(String codiceServizio) {
		this.codiceServizio = codiceServizio;
	}


	public String getNetwork() {
		return network;
	}


	public void setNetwork(String network) {
		this.network = network;
	}


	public String getNetmask() {
		return netmask;
	}


	public void setNetmask(String netmask) {
		this.netmask = netmask;
	}


	public String getNumeroLan() {
		return numeroLan;
	}


	public void setNumeroLan(String numeroLan) {
		this.numeroLan = numeroLan;
	}


	public String getStato() {
		return stato;
	}


	public void setStato(String stato) {
		this.stato = stato;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public Date getDataAssegnazione() {
		return dataAssegnazione;
	}


	public void setDataAssegnazione(Date dataAssegnazione) {
		this.dataAssegnazione = dataAssegnazione;
	}


	public String getTipologiaPiano() {
		return tipologiaPiano;
	}


	public void setTipologiaPiano(String tipologiaPiano) {
		this.tipologiaPiano = tipologiaPiano;
	}


	public String getIdentificativo() {
		return identificativo;
	}


	public void setIdentificativo(String identificativo) {
		this.identificativo = identificativo;
	}


	public String getAnagraficaFornitoreDesc() {
		return anagraficaFornitoreDesc;
	}


	public void setAnagraficaFornitoreDesc(String anagraficaFornitoreDesc) {
		this.anagraficaFornitoreDesc = anagraficaFornitoreDesc;
	}


	public String getContrattoLtmSedDesc() {
		return contrattoLtmSedDesc;
	}


	public void setContrattoLtmSedDesc(String contrattoLtmSedDesc) {
		this.contrattoLtmSedDesc = contrattoLtmSedDesc;
	}


	public String getIdentificativoRimappato() {
		return getIdentificativoRimappato(identificativo);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PianoIndirizzamento [idPianoIndirizzamento=");
		builder.append(idPianoIndirizzamento);
		builder.append(", idAnagraficaFornitore=");
		builder.append(idAnagraficaFornitore);
		builder.append(", idContrattoLtmSed=");
		builder.append(idContrattoLtmSed);
		builder.append(", idSede=");
		builder.append(idSede);
		builder.append(", idLinea=");
		builder.append(idLinea);
		builder.append(", codiceServizio=");
		builder.append(codiceServizio);
		builder.append(", network=");
		builder.append(network);
		builder.append(", netmask=");
		builder.append(netmask);
		builder.append(", numeroLan=");
		builder.append(numeroLan);
		builder.append(", stato=");
		builder.append(stato);
		builder.append(", note=");
		builder.append(note);
		builder.append(", dataAssegnazione=");
		builder.append(dataAssegnazione);
		builder.append(", tipologiaPiano=");
		builder.append(tipologiaPiano);
		builder.append(", identificativo=");
		builder.append(identificativo);
		builder.append(", identificativoRimappato=");
		builder.append(identificativoRimappato);
		builder.append(", anagraficaFornitoreDesc=");
		builder.append(anagraficaFornitoreDesc);
		builder.append(", contrattoLtmSedDesc=");
		builder.append(contrattoLtmSedDesc);
		builder.append("]");
		return builder.toString();
	}


	public void setIdentificativoRimappato(String identificativoRimappato) {
		this.identificativoRimappato = identificativoRimappato;
	}
	
	public String getIdentificativoRimappato(String identificativo) {
		if(identificativo != null) {
			switch (identificativo.toLowerCase()) {
			case "ip_lan_better_mono":
				return "IP Better Mono";
			case "ip_lan_better_fittizia":
				return "IP Network Better Fittizia";
			case "ip_loopback_l2tp":
				return "IP Loopback L2TP";
			case "ip_lan_better_doppia":
				return "IP Better Doppia";
			case "ip_lan_self_service":
				return "IP Self Service";
			case "ip_loopback":
				return "IP Loopback";
			case "ip_lan_better_virtual":
				return "IP Virtual";
			case "ip_lan_mgmt":
				return "LAN MGMT";
			case "ip_erice_mgmt":
				return "Ip Erice MGMT";
			case "ip_lan_spielo_loc_24":
				return "Network Spielo Loc 24";
			case "ip_lan_spielo_loc_25":
				return "Network Spielo Loc 25";
			case "ip_lan_spielo_loc_26":
				return "Network Spielo Loc 26";
			case "ip_lan_inspired_24":
				return "IP LAN Inspired 24";
			case "ip_lan_novomatic_24":
				return "IP LAN Novomatic 24";
			case "ip_spielo_statica_24":
				return "Network Spielo Statica 24";
			case "ip_spielo_bgp_24":
				return "Spielo BGP 24";
			case "ip_lan_playtec_26":
				return "IP LAN Playtec 26";
			case "ip_lan_inspired_25":
				return "IP LAN Inspired 25";
			case "ip_lan_novomatic_25":
				return "IP LAN Novomatic 25";
			case "ip_spielo_statica_25":
				return "Network Spielo Statica 25";
			case "ip_spielo_bgp_25":
				return "Spielo BGP 25";
			case "ip_lan_mag_26":
				return "IP LAN MAG 26";
			case "ip_lan_inspired_26":
				return "IP LAN Inspired 26";
			case "ip_lan_novomatic_26":
				return "IP LAN Novomatic 26";
			case "ip_spielo_statica_26":
				return "Network Spielo Statica 26";
			case "ip_spielo_bgp_26":
				return "Spielo BGP 26";
			case "ip_lan_fornitore_lotto_26":
				return "IP Network Lotto 26";
			case "ip_network_servizi":
				return "Network Servizi";
			case "ip_lan_fornitore_lotto_27":
				return "IP Network Lotto 27";
			case "ip_loopback_2_l2tp":
				return "IP Loopback 2 L2TP";
			case "ip_loopback_servizi":
				return "Loopback Servizi";
			case "ip_lan_fornitore_lotto_28":
				return "IP Network Lotto 28";
			case "ip_loopback_gev":
				return "Ip Loopback GeV";
			case "ip_network_gev":
				return "Network GeV";
			case "ip_lan_tlv_tim":
				return "IP Lan TLV Telecom";
			case "ip_lan_tlv_fw":
				return "IP Lan TLV Fastweb";
			case "ip_lan_tlv_wind":
				return "IP Lan TLV Wind";
			case "ip_lan_tlv_internet":
				return "IP Lan TLV Internet";
			default:
				return identificativo;
			}
		}
		return identificativoRimappato;
	}


}
