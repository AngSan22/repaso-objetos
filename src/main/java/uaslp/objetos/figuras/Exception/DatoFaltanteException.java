package uaslp.objetos.figuras.Exception;

public class DatoFaltanteException extends RuntimeException{
    public DatoFaltanteException(){

    }
    public DatoFaltanteException(String message){
        super(message);
    }
}
