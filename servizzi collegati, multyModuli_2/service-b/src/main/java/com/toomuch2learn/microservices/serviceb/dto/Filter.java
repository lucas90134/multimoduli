package com.toomuch2learn.microservices.serviceb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;


public class Filter {

    public static final int TYPE_CONTAINS = 1;
    public static final int TYPE_EQUALS = 2;
    public static final int TYPE_NOT_EQUALS = 3;
    public static final int TYPE_STARTS_WITH = 4;
    public static final int TYPE_ENDS_WITH = 5;
    public static final int TYPE_NOT_NULL = 6;

    @JsonProperty("field_name")
    private String fieldName;

    @JsonProperty("type")
    private Integer type;

    @JsonProperty("filter")
    private String filter;

    @JsonProperty("filter_type")
    private String filterType;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public static Filter equalTo(String fieldName, String value) {
        Filter f = new Filter();
        f.setFieldName(fieldName);
        f.setType(2);
        f.setFilter(value);
        return f;
    }

    public static Collection<Filter> fromFilterModel(HashMap<String, Filter> filterModel) {
        for (Entry<String, Filter> filterEntry : filterModel.entrySet()) {
            filterEntry.getValue().setFieldName(filterEntry.getKey());
        }
        return filterModel.values();
    }

    /**
     * torna un predicato che gestisce il tipo di filtro
     * (equals,contains,like,ecc)
     *
     * @param root
     * @param f
     * @param cb
     * @param fieldName
     * @return
     */
    public static Predicate getPredicateByType(Root<?> root, Filter f, CriteriaBuilder cb, String fieldName) {
        return getPredicateByType(root,f,cb,fieldName,f.getFilter());
    }

    /**
     * torna un predicato che gestisce il tipo di filtro
     * (equals,contains,like,ecc)
     *
     * @param root
     * @param f
     * @param cb
     * @param fieldName
     * @return
     */
    public static Predicate getPredicateByType(Root<?> root, Filter f, CriteriaBuilder cb, String fieldName, String value) {
        switch (f.getType().intValue()) {
            case TYPE_CONTAINS: // contains
                return cb.like(root.get(fieldName), "%" + value + "%");
            case TYPE_EQUALS: // equals
                return cb.equal(root.get(fieldName), value);
            case TYPE_NOT_EQUALS: // not equals
                return cb.notEqual(root.get(fieldName), value);
            case TYPE_STARTS_WITH: // starts with
                return cb.like(root.get(fieldName), value + "%");
            case TYPE_ENDS_WITH: // ends with
                return cb.like(root.get(fieldName), value + "%");
            case TYPE_NOT_NULL: // ends with
                return cb.isNotNull(root.get(fieldName));
            default:
                break;
        }
        return null;
    }

    @Override
    public String toString() {
        JsonToStringBuilder builder = new JsonToStringBuilder(this);
        builder.append("fieldName", fieldName);
        builder.append("type", type);
        builder.append("filter", filter);
        builder.append("filterType", filterType);
        return builder.toString();
    }
}
