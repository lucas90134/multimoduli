package com.toomuch2learn.microservices.serviceb.dto;

import com.toomuch2learn.microservices.servicea.exception.CommonsException;
import com.toomuch2learn.microservices.serviceb.util.DateUtil;
import com.toomuch2learn.microservices.servicec.model.AnagraficaFornitore;
import com.toomuch2learn.microservices.servicec.model.CategoriaServizio;
import com.toomuch2learn.microservices.servicec.model.Linea;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.criteria.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;



public class LineaSpecification{
    //1 equal,2 is null,3 is not null,4 startWith,5 endwith, 6 total like,7 is less then, 8 is greaten then

    private static Logger log = LoggerFactory.getLogger(LineaSpecification.class);

    public <T> Predicate toPredicate(Root<Linea> linea, Join<Linea, AnagraficaFornitore>anagraficaFornitoreJoin,
                                     Join<Linea, CategoriaServizio> categoriaServizioJoin, CriteriaQuery<?> query,
                                     CriteriaBuilder cb, HashMap<String, Filter> filterModel) throws CommonsException {
        Predicate p = cb.and();
        Predicate orP = cb.or();
        Date dataStatoFrom = null;
        Date dataStatoTo = null;
        Long idStatoLinea = -1L;
        if(filterModel != null) {
            for(Map.Entry<String, Filter> entry : filterModel.entrySet()) {
                Filter filter = entry.getValue();
                if(filter != null) {
                    String name = entry.getKey();
                    String value = filter.getFilter();
                    if(value != null) {
                        if(StringUtils.isBlank(filter.getFilterType())){
                            String msg = "Tipo colonna mancante";
                            log.error(msg);
                            throw new CommonsException(400,msg);
                        }
                        //filtro la descrzione di anagrafica fornitore
                        if(StringUtils.equalsIgnoreCase(name,"descrizione")) {
                            Path<String> descrizioneAnagrafica =anagraficaFornitoreJoin.get("descrizione");
                            orP = cb.or(orP,cb.or(cb.like(  descrizioneAnagrafica, "%" +value.toUpperCase() + "%")));
                            orP = cb.or(orP,cb.or(cb.like(descrizioneAnagrafica, value.toUpperCase() + "%")));
                            if(StringUtils.startsWith(value.toUpperCase(), "L") || StringUtils.startsWith(value.toUpperCase(), "S")) {
                                orP = cb.or(orP,cb.or(cb.like(descrizioneAnagrafica , value.toUpperCase() + "%")));
                                orP = cb.or(orP,cb.or(cb.like(descrizioneAnagrafica, "%"+value.toUpperCase() + "%")));
                            }
                            p = cb.and(p,orP);
                        }else if(StringUtils.equalsIgnoreCase(name, "idLinea")) {
                            Path<Long> pathLong = linea.get(name);
                            p = cb.and(p,pathLong.in(value));
                        }else if(StringUtils.equalsIgnoreCase(name, "idCategoriaServizio")) {
                            Path<Long> pathLong = categoriaServizioJoin.get(name);
                            p = cb.and(p,pathLong.in(value));
                        }else if(StringUtils.equalsIgnoreCase(filter.getFilterType(),"String") || StringUtils.equalsIgnoreCase(filter.getFilterType(),"text")){
                            Path<String> path = linea.get( entry.getKey());
                            switch (filter.getType().intValue()) {
                                case 1:
                                    p = cb.and(p,cb.equal(cb.upper(path), value.toUpperCase()));
                                    break;
                                case 4:
                                    p = cb.and(p,cb.like(cb.upper(path), value.toUpperCase() + "%"));
                                    break;
                                case 5:
                                    p = cb.and(p,cb.like(cb.upper(path), "%" + value.toUpperCase()));
                                    break;
                                case 6:
                                    p = cb.and(p,cb.like(cb.upper(path), "%" + value.toUpperCase() + "%"));
                                    break;
                                default:
                                    break;
                            }
                        }else if(StringUtils.equalsIgnoreCase(filter.getFilterType(),"integer") || StringUtils.equalsIgnoreCase(filter.getFilterType(),"int") ||
                                StringUtils.equalsIgnoreCase(filter.getFilterType(),"long") || StringUtils.equalsIgnoreCase(filter.getFilterType(),"number")) {
                            try {
                                if(value != null) {
                                    Path<Long> pathLong = linea.get(entry.getKey());
                                    p = cb.and(p,pathLong.in(value));
                                }
                            } catch (NumberFormatException e) {
                                String msg = "Il valore inserito non è di tipo int/long mentre il colunm type specificato è int/long";
                                log.error(msg);
                                throw new CommonsException(400,msg);
                            }
                        }else if(StringUtils.equalsIgnoreCase(filter.getFilterType(),"date") || StringUtils.equalsIgnoreCase(filter.getFilterType(),"datetime")) {
                            try {
                                if(value != null) {
                                    String format = DateUtil.determineDateFormat(value);
                                    if(format != null) {
                                        SimpleDateFormat formatter = new SimpleDateFormat(format, Locale.ITALIAN);
                                        Date date = formatter.parse(value);
                                        Path<Date> path = linea.get(entry.getKey());
                                        p = cb.and(p,cb.equal(cb.function("date", Date.class, path), cb.function("date", Date.class, cb.literal(date))));
                                    }else {
                                        String msg = "formato data non corretto";
                                        log.error(msg);
                                        throw new CommonsException(400,msg);
                                    }
                                }
                            } catch (ParseException e) {
                                String msg = "Il valore inserito non è di tipo date mentre il colunm type specificato è date";
                                log.error(msg);
                                throw new CommonsException(400,msg);
                            }
                        }else if(StringUtils.equalsIgnoreCase(filter.getFilterType(),"bool") || StringUtils.equalsIgnoreCase(filter.getFilterType(),"boolean")) {
                            if(value != null) {
                                Path<Boolean> path = linea.get(entry.getKey());
                                p = cb.and(p,cb.equal(path, new Boolean(value)));
                            }
                        }else {
                            String msg = "Tipo colonna non gestita";
                            log.error(msg);
                            throw new CommonsException(400,msg);
                        }
                    }
                }

            }
            // GESTIONE LINEA DATE
            if(dataStatoFrom != null && dataStatoTo == null) {
                throw new CommonsException(409, "se viene specificata una data di inizio è necessario specificare anche una data fine");
            }else if(dataStatoFrom == null && dataStatoTo != null) {
                throw new CommonsException(409, "se viene specificata una data di fine è necessario specificare anche una data inizio");
            }else if(dataStatoFrom != null && dataStatoTo != null   && dataStatoFrom.after(dataStatoTo)) {
                throw new CommonsException(409, "La data di inizio non può essere maggiore della data fine");
            }
        }
        return p;
    }

}
