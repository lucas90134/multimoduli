package com.toomuch2learn.microservices.serviceb.service;


import com.toomuch2learn.microservices.servicea.exception.RicercaResponseDTO;
import com.toomuch2learn.microservices.serviceb.dto.RicercaLineaDTO;

public interface LineaService {

   RicercaResponseDTO<RicercaLineaDTO> getMeseCategoriaServizio(Long idLinea, String descrizione) throws Exception;
  // RicercaResponseDTO<List<LineaDTO>> ricercaLinea(PaginationParams paginationParams,Long count) throws Exception;


}

