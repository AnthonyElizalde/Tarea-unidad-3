// Importar la clase Exception para crear nuestras excepciones personalizadas
package poo;

// Clase de excepción personalizada para edad inválida
class EdadInvalidaException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

// Clase de excepción personalizada para pago inválido
class PagoInvalidoException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PagoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

public class ClaseExcepcionesPersonalizadas {

    public static void main(String[] args) {
        // Ejemplo de uso de excepciones personalizadas
        try {
            validarEdad(30);
        } catch (EdadInvalidaException e) {
            System.out.println("¡Error! " + e.getMessage());
        }

        // Ejemplo práctico de excepción personalizada
        try {
            procesarPago(500);
        } catch (PagoInvalidoException e) {
            System.out.println("¡Error! " + e.getMessage());
        }
    }

    // Método que lanza una excepción personalizada para validar la edad
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 18) {
            throw new EdadInvalidaException("La persona debe ser mayor de 18 años.");
        }
        System.out.println("Edad válida: " + edad);
    }

    // Método que lanza una excepción personalizada para procesar pagos
    public static void procesarPago(double monto) throws PagoInvalidoException {
        if (monto <= 0) {
            throw new PagoInvalidoException("El monto del pago debe ser mayor que cero.");
        }
        System.out.println("Pago procesado por un monto de: $" + monto);
    }
}