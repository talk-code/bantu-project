package org.bantuproject.cortex;

public class CortexException extends RuntimeException {

    public CortexException(String message){
        super(message);
    }

    public CortexException(String message, Throwable cause){
        super(message, cause);
    }

}
