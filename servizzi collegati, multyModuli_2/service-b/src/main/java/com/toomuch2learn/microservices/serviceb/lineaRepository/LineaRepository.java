package com.toomuch2learn.microservices.serviceb.lineaRepository;


import com.toomuch2learn.microservices.servicec.model.Linea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineaRepository extends JpaRepository<Linea, Long> {

   /* @Procedure(name = "getRowLinea")
    Long getRowLinea(@Param("idLinea") Long idLinea, @Param("resultlinea") Long resultlinea);*/


    Linea findAllByIdLinea(Long idLinea);
}
