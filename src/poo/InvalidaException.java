package poo;

/**
 * Excepción personalizada para manejar edades inválidas.
 */
public class InvalidaException extends Exception  {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor con mensaje personalizado.
     * 
     * @param mensaje Mensaje de error.
     */
    public InvalidaException(String mensaje) {
        super();
    }
}