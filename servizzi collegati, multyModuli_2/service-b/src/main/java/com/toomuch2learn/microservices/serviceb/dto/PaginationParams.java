package com.toomuch2learn.microservices.serviceb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.HashMap;

public class PaginationParams {

    @JsonProperty("sort_model")
    private ArrayList<SortColumn> sortModel;

    @JsonProperty("start_row")
    private Integer startRow;

    @JsonProperty("end_row")
    private Integer endRow;

    @JsonProperty("filter_model")
    private HashMap<String, Filter> filterModel;

    public ArrayList<SortColumn> getSortModel() {
        return sortModel;
    }

    public void setSortModel(ArrayList<SortColumn> sortModel) {
        this.sortModel = sortModel;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public Integer getEndRow() {
        return endRow;
    }

    public void setEndRow(Integer endRow) {
        this.endRow = endRow;
    }

    public HashMap<String, Filter> getFilterModel() {
        return filterModel;
    }

    public void setFilterModel(HashMap<String, Filter> filterModel) {
        this.filterModel = filterModel;
    }

    public boolean isSortPresent() {
        return sortModel!=null && !sortModel.isEmpty();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("sortModel", sortModel)
                .append("startRow", startRow)
                .append("endRow", endRow)
                .append("filterModel", filterModel)
                .toString();
    }
}
