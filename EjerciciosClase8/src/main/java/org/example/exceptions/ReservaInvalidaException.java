package org.example.exceptions;

public class ReservaInvalidaException extends Exception{
    public ReservaInvalidaException(){
        super();
    }

    public ReservaInvalidaException(String mensaje){
        super(mensaje);
    }
}
