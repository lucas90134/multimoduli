package com.toomuch2learn.microservices.serviceb;

import java.util.concurrent.atomic.AtomicLong;

import com.toomuch2learn.microservices.servicea.exception.GenericResponse;
import com.toomuch2learn.microservices.servicea.exception.ResponseUtility;
import com.toomuch2learn.microservices.servicea.exception.RicercaResponseDTO;

import com.toomuch2learn.microservices.serviceb.dto.RicercaLineaDTO;
import com.toomuch2learn.microservices.serviceb.model.Greeting;
import com.toomuch2learn.microservices.serviceb.service.LineaService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rest")
@CrossOrigin(origins = "*")
public class GreetingController {
	private static Logger log = LoggerFactory.getLogger(GreetingController.class);
	private static final String template = "Service-B - Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	@Autowired
	public LineaService lineaService;

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	@ApiOperation(value = "Ottieni il mese e la descrizione della categoria di servizio")
	@PreAuthorize("hasAnyRole('ROLE_USER_ADMIN', 'ROLE_USER_ADMIN_RW','ROLE_CICLO_VITA_ROUTER','ROLE_CICLO_VITA_ROUTER_RW')")
	@RequestMapping(value = "/dettagli/linea", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GenericResponse<RicercaResponseDTO<RicercaLineaDTO>>> getRicercaLinea() {
		try {
			RicercaResponseDTO<RicercaLineaDTO> res = this.lineaService.getMeseCategoriaServizio(1L,null);
			log.info("RESULLL---",res);

			return ResponseUtility.responseOK(res);
		} catch (Exception e) {
			log.error("Errore generico",e.getMessage());

			return  ResponseUtility.responseGenericKO();
		}
	}
	/*@ApiOperation(value = "Ottieni la linea la descrizione della categoria di servizio , ")
	@PreAuthorize("hasAnyRole('ROLE_USER_ADMIN', 'ROLE_USER_ADMIN_RW','ROLE_CICLO_VITA_ROUTER','ROLE_CICLO_VITA_ROUTER_RW')")
	@RequestMapping(value = "/ricerca/linea/{id}", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GenericResponse<RicercaResponseDTO<List<LineaDTO>>>> getListLinea(@Validated @RequestBody PaginationParams paginationParams) {
		try {
			RicercaResponseDTO<List<LineaDTO>> res = this.lineaService.ricercaLinea(paginationParams,null);
			log.info("RESULLL---",res);

			return ResponseUtility.responseOK(res);
		} catch (Exception e) {
			log.error("Errore generico",e.getMessage());

			return  ResponseUtility.responseGenericKO();
		}
	}*/
}