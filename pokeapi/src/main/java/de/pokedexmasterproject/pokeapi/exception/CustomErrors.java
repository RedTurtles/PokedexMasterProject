package de.pokedexmasterproject.pokeapi.exception;

import org.springframework.http.HttpStatus;

public class CustomErrors {

    public static final int UNKNOWN_ERROR = 1000;

    public static Error internalError = Error.create(UNKNOWN_ERROR, "Internal error, please contact an admin",
            HttpStatus.INTERNAL_SERVER_ERROR);

    public static Error badRequest = Error.create(1000 + HttpStatus.BAD_REQUEST.value(), "Internal request error",
            HttpStatus.BAD_REQUEST);

    public static Error noSession = Error.create(HttpStatus.UNAUTHORIZED.value(), HttpStatus.UNAUTHORIZED.getReasonPhrase(),
            HttpStatus.UNAUTHORIZED);

    public static Error forbidden = Error.create(HttpStatus.FORBIDDEN.value(), HttpStatus.FORBIDDEN.getReasonPhrase(),
            HttpStatus.FORBIDDEN);

    public static Error notFound = Error.create(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.getReasonPhrase(),
            HttpStatus.NOT_FOUND);

    public static class AuthErrors {
        public static int AUTH_CODE = 2000;
        public static Error requestError = Error.create(AUTH_CODE + 1,
                "Error while requesting data from decontainerservice.servicemanager.service api", HttpStatus.BAD_REQUEST);
    }
}
