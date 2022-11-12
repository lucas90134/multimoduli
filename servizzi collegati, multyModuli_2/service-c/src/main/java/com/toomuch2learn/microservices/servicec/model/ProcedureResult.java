package com.toomuch2learn.microservices.servicec.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProcedureResult implements Serializable {

    private String descrizione;

}
