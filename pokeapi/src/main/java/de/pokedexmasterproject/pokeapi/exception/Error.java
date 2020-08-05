package de.pokedexmasterproject.pokeapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;

public class Error extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private Integer code;
    private HttpStatus httpStatus;
    private String message;

    public static Error create(int code, String message) {
        return Error.create(code, message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static Error create(int code, String message, HttpStatus httpStatus) {
        return new Error().code(code).message(message).httpStatus(httpStatus);
    }

    public ResponseEntity toResponse() {
        HttpStatus status = httpStatus != null ? httpStatus : HttpStatus.INTERNAL_SERVER_ERROR;
        return new ResponseEntity<>(new ErrorMessage(new Date(),this.message,""),status);
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Error code(Integer code) {
        this.code = code;
        return this;
    }

    public Error httpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    public Error message(String message) {
        this.message = message;
        return this;
    }

}