package com.toomuch2learn.microservices.servicea.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;

@JsonPropertyOrder({"pageNumber","pageSize","totalRecord","list"})
public class RicercaResponseDTO<T> implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @JsonProperty("page_number")
    private Long pageNumber;

    @JsonProperty("page_size")
    private Long pageSize;

    @JsonProperty("total_record")
    private Long totalRecord;

    @JsonProperty("list")
    private List<T> list;


    @Override
    public String toString() {
        return "{\n\t\"pageNumber\":\"" + pageNumber + "\",\n\t\"pageSize\":\"" + pageSize + "\",\n\t\"totalRecord\":\""
                + totalRecord + "\",\n\t\"list\":\"" + list + "\"\n}";
    }

    public Long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageNumberInt(Integer pageNumber) {
        if(pageNumber != null) {
            this.pageNumber = Long.valueOf(pageNumber);
        }
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageSizeInt(Integer pageSize) {
        if(pageSize != null) {
            this.pageSize = Long.valueOf(pageSize);
        }
    }

    public Long getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Long totalRecord) {
        this.totalRecord = totalRecord;
    }

    public void setTotalRecordInt(Integer totalRecord) {
        if(totalRecord != null) {
            this.totalRecord = Long.valueOf(totalRecord);
        }
    }


    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }


}
