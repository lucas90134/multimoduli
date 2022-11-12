package com.toomuch2learn.microservices.servicea.exception;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;



public class ResponseUtility {

    private static Logger log = LoggerFactory.getLogger(ResponseUtility.class);

    public static<T> ResponseEntity<GenericResponse<T>> responseGenericKO() {
        GenericResponse<T> response = new GenericResponse<>();
        response.setCode(400);
        response.setStatus("KO");
        response.setDetail("Errore generico");
        return new ResponseEntity<GenericResponse<T>>(response,HttpStatus.BAD_REQUEST);
    }
    public static<T> ResponseEntity<GenericResponse<T>> responseKO(CommonsException e) {
        GenericResponse<T> response = new GenericResponse<>();
        response.setCode(e.getCodice());
        response.setStatus(String.valueOf(e.getCodice()));
        response.setDetail(e.getDesc());
        return new ResponseEntity<GenericResponse<T>>(response,HttpStatus.CONFLICT);
    }
    public static<T> ResponseEntity<GenericResponse<T>> responseOK(T data) {
        GenericResponse<T> response = new GenericResponse<>();
        response.setCode(200);
        response.setStatus("OK");
        response.setDetail("OK");
        response.setData(data);
        return new ResponseEntity<GenericResponse<T>>(response,HttpStatus.OK);
    }

    public static<T> ResponseEntity<GenericResponse<RicercaResponseDTO<T>>> responseList(List<T> data) {
        GenericResponse<RicercaResponseDTO<T>> response = new GenericResponse<>();
        response.setCode(200);
        response.setStatus("OK");
        response.setDetail("OK");
        RicercaResponseDTO<T> res = new RicercaResponseDTO<T>();
        res.setList(data);
        if(data != null) {
            res.setTotalRecord(Long.valueOf(data.size()));
        }
        response.setData(res);
        return new ResponseEntity<GenericResponse<RicercaResponseDTO<T>>>(response,HttpStatus.OK);
    }


    public static<T> ResponseEntity<GenericResponse<T>> responseBindingResult(BindingResult bindingResult) {
        GenericResponse<T> response = new GenericResponse<>();
        response.setCode(409);
        response.setStatus("KO");
        String detail = "";
        for (FieldError error : bindingResult.getFieldErrors()) {
            if(StringUtils.isNotBlank(detail)) {
                detail = detail + " | " + error.getDefaultMessage();
            }else {
                detail = error.getDefaultMessage();
            }
        }
        response.setDetail(detail);
        return new ResponseEntity<GenericResponse<T>>(response,HttpStatus.CONFLICT);
    }

    public static<T> ResponseEntity<GenericResponse<T>> responseValidKO(String message) {
        GenericResponse<T> response = new GenericResponse<>();
        response.setCode(400);
        response.setStatus("KO");
        response.setDetail(message);
        return new ResponseEntity<GenericResponse<T>>(response,HttpStatus.BAD_REQUEST);
    }

}
