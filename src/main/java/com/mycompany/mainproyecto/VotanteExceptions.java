package com.mycompany.mainproyecto;

public class VotanteExceptions extends Exception {
    public VotanteExceptions(String mensaje) {
        super(mensaje);
    }
    
    public static String getMensajeRutInvalido() {
        return "El RUN es inválido. Debe tener al menos 9 dígitos.";
    }
    
    public static String getMensajeComunaNoEncontrada() {
        return "La comuna no ha sido encontrada. Intenta verificar el nombre";
    }
    
    public static String getMensajeErrorLocalNoEncontrado() {
        return "El local no ha sido encontrado en la comuna solicitada.";
    }
}
