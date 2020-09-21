package co.uco.electrodomesticos.electrodomesticos.model.exception;

public class BusinessException extends RuntimeException {

    public BusinessException(String mensaje){
        super(mensaje);
    }
}
