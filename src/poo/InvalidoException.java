package poo;

/**
 * Excepción personalizada para manejar pagos inválidos.
 */
public class InvalidoException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor con mensaje personalizado.
     * 
     * @param mensaje Mensaje de error.
     */
    public InvalidoException(String mensaje) {
        super(mensaje);
    }
}