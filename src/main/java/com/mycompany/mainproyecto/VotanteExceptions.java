package com.mycompany.mainproyecto;

public class VotanteExceptions extends Exception {
    public VotanteExceptions(String mensaje) {
        super(mensaje);
    }
    
    public static String getMensajeRutInvalido() {
        return "El RUN es inválido. Debe tener al menos 9 dígitos.";
    }
}
    
