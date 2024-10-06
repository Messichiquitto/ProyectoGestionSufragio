package com.mycompany.mainproyecto.ClasesException;

/**
 * Clase de excepción personalizada que representa errores relacionados con la gestión de votantes.
 */
public class VotanteExceptions extends Exception {
    
    /**
     * Constructor que inicializa la excepción con un mensaje específico.
     * 
     * @param mensaje Mensaje de error que describe la excepción.
     */
    public VotanteExceptions(String mensaje) {
        super(mensaje);
    }
    
    /**
     * Método estático que devuelve un mensaje de error cuando el RUN es inválido.
     * 
     * @return Mensaje que indica que el RUN es inválido.
     */
    public static String getMensajeRutInvalido() {
        return "El RUN es invalido. Debe tener 9 digitos.";
    }
}
    
