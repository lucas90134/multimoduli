package com.toomuch2learn.microservices.serviceb.service.impl;


import com.toomuch2learn.microservices.servicea.exception.CommonsException;
import com.toomuch2learn.microservices.servicea.exception.RicercaResponseDTO;
import com.toomuch2learn.microservices.serviceb.dto.RicercaLineaDTO;
import com.toomuch2learn.microservices.serviceb.lineaRepository.LineaRepository;
import com.toomuch2learn.microservices.serviceb.service.LineaService;
import com.toomuch2learn.microservices.servicec.model.Linea;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.procedure.ProcedureCall;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Service
public class LineaServiceImpl implements LineaService {
    private static Logger log = LoggerFactory.getLogger(LineaServiceImpl.class);
    private static SessionFactory sessionFactory;
    @Autowired
    public LineaRepository lineaRepository;



    @PersistenceContext
    private EntityManager em;
   @Override
    public RicercaResponseDTO<RicercaLineaDTO> getMeseCategoriaServizio(Long idLinea, String descrizione) throws CommonsException {
        log.info("controllo");
        RicercaResponseDTO ricercaResponseDTO=new RicercaResponseDTO();
        RicercaLineaDTO ricercaLineaDTO=new RicercaLineaDTO();
        //controllo eccezione;
        if(idLinea==null){
            throw new CommonsException(400,"idLinea mancante");
        }
        Linea linea=this.lineaRepository.findAllByIdLinea(1L);
       log.info("IDLINEA-----"+linea);


        Session session = em.unwrap(Session.class);
        //L INSERIMENTO FUNZIONA --------------------------- è QUESTA SOTTO

         try {
            ProcedureCall call = session.createStoredProcedureCall("LISTALINEA");
            call.registerParameter("start_n", Long.class, ParameterMode.IN);
            call.registerParameter("end_n", Long.class, ParameterMode.IN);
            call.setParameter("start_n",1L);
            call.setParameter("end_n",10L);
            call.execute();
           ;   log.info("FINE prima store procedures ");
           ricercaLineaDTO.setDescrizione("Prima store procedures");
        } catch (Exception e) {
            log.info(e.getMessage());
        } finally {
            session.close();
        }
        //SECONDO INSERIEMENTO CON LA STORE PROCEDURES ----------------------------------
      /*  try {
            ProcedureCall call = session.createStoredProcedureCall("NUOVALINEA");
            call.registerParameter("idLinea", Long.class, ParameterMode.IN);
            call.registerParameter("id_categoria_servizio", Long.class, ParameterMode.IN);
            call.setParameter("idLinea",34L);
            call.setParameter("id_categoria_servizio",10L);
            call.execute();
           ;   log.info("FINE");
                 ricercaLineaDTO.setDescrizione("Seconda store procedures"
        } catch (Exception e) {
            log.info(e.getMessage());
        } finally {
            session.close();
        }*/
        //--------------------------------------------------------------------------------------


        //LA SELECT NON FUNZIONA IL RITORNO DELLA STORE PROCEDURES
       /* try {
            ProcedureCall call = session.createStoredProcedureCall("ROWLINEA");
            call.registerParameter("idLinea", Long.class, ParameterMode.IN).bindValue(32L);
            call.registerParameter("resultlinea", Long.class, ParameterMode.OUT);

            Long phoneCount = (Long) call.getOutputs().getOutputParameterValue("resultlinea");
        } catch (Exception e) {
            log.info(e.getMessage());
        }*/
        //  assertEquals( Long.valueOf( 2 ), phoneCount );

        /*StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("rowLinea");
        storedProcedureQuery.registerStoredProcedureParameter("idLinea", Long.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("resultlinea",Long.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter("idLinea", 1L);
        storedProcedureQuery.execute();
        List<Long> outputValue2 =  storedProcedureQuery.getResultList();
        log.info("IDLINEA-----", outputValue2);*/

  List<RicercaLineaDTO> ricercaLineaDTOS=new ArrayList<>();
  ricercaLineaDTOS.add(ricercaLineaDTO);
  ricercaResponseDTO.setList(ricercaLineaDTOS);
        return  ricercaResponseDTO;
    }

/*
    @Transactional(value = "funzionalitaLineaTransactionManager", rollbackFor = Throwable.class)
    @Override
    public RicercaResponseDTO<List<LineaDTO>> ricercaLinea(PaginationParams paginationParams,Long count) throws CommonsException {
        RicercaResponseDTO<LineaDTO> response = new RicercaResponseDTO<LineaDTO>();
        Page<Tuple> page = null;
    //    PageRequest pageRequest = paginationGenericService.getPagination("idLinea",paginationParams);
      //page= lineaRepository.getAll(paginationParams,null,count);
        log.info("tuple", page);


        return null;
    }*/
}
