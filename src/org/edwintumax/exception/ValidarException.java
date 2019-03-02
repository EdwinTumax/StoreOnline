package org.edwintumax.exception;
public class ValidarException extends Exception{
    @Override
    public String getMessage(){
        return "Indice fuera del alcance del vector";
    }
}
