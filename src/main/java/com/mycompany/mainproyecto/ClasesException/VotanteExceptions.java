package com.mycompany.mainproyecto;

public class VotanteExceptions extends Exception {
    public VotanteExceptions(String mensaje) {
        super(mensaje);
    }
    
    public static String getMensajeRutInvalido() {
        return "El RUN es invalido. Debe tener al menos 9 digitos.";
    }
}
    
