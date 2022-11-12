package com.toomuch2learn.microservices.serviceb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SortColumn {

    @JsonProperty("col_id")
    private String colId;
    @JsonProperty("sort")
    private String sort;

}