package com.toomuch2learn.microservices.servicea.exception;

import java.io.Serializable;

public class CommonsException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 9067555352023085505L;
    int codice;
    String desc;

    public CommonsException(Exception e, int codice, String desc) {
        super(e);
        this.codice = codice;
        this.desc = desc;
    }

    public CommonsException(int codice, String desc) {
        super(desc);
        this.codice = codice;
        this.desc = desc;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}