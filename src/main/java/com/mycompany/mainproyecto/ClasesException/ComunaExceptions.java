package com.mycompany.mainproyecto.ClasesException;

public class ComunaExceptions extends Exception {
    public ComunaExceptions(String message) {
        super(message);
    }
    
    public static String getMensajeComunaNoEncontrada() {
        return "Comuna no encontrada. Verifica el nombre";
    }
    
    public static String getMensajeErrorLocalNoEncontrado() {
        return "Local no encontrado en la comuna especificada.";
    }
}
