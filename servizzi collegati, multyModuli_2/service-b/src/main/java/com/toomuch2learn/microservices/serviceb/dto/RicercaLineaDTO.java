package com.toomuch2learn.microservices.serviceb.dto;


import lombok.Data;

@Data
public class RicercaLineaDTO {
    String mese;
    String descrizione;

    Long linea;

    public String getMese() {
        return mese;
    }

    public void setMese(String mese) {
        this.mese = mese;
    }


}
