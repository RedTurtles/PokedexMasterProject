package de.pokedexmasterproject.pokeapi.exception;

import java.util.Date;

//Simple custom error details bean
public class ErrorMessage {

    private Date timestamp;
    private String message;
    private String errordetails;

    //Fields Constructor
    public ErrorMessage(Date timestamp, String message, String errordetails) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.errordetails = errordetails;
    }

    //GETTERS
    public Date getTimestamp() {
        return timestamp;
    }
    public String getMessage() {
        return message;
    }
    public String getErrordetails() {
        return errordetails;
    }



}

