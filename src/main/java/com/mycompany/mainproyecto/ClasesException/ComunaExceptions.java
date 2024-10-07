package com.mycompany.mainproyecto.ClasesException;

/**
 * Clase de excepción personalizada que representa errores relacionados con la gestión de comunas.
 */
public class ComunaExceptions extends Exception {
    
    /**
     * Constructor que inicializa la excepción con un mensaje específico.
     * 
     * @param message Mensaje de error que describe la excepción.
     */
    public ComunaExceptions(String message) {
        super(message); // Llama al constructor de la clase base Exception con el mensaje
    }
    
    /**
     * Método estático que devuelve un mensaje de error cuando una comuna no se encuentra.
     * 
     * @return Mensaje que indica que la comuna no fue encontrada.
     */
    public static String getMensajeComunaNoEncontrada() {
        return "Comuna no encontrada. Verifica el nombre";
    }
    
    /**
     * Método estático que devuelve un mensaje de error cuando un local no se encuentra en la comuna especificada.
     * 
     * @return Mensaje que indica que el local no fue encontrado en la comuna.
     */
    public static String getMensajeErrorLocalNoEncontrado() {
        return "Local no encontrado en la comuna especificada.";
    }
}
