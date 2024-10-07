package com.mycompany.mainproyecto;
    
import com.mycompany.mainproyecto.ClasesVentanas.VentanaMain;

/**
 * Clase principal que inicia la aplicación de gestión de votantes.
 * Carga los datos iniciales desde archivos y muestra la ventana principal.
 */
public class MainProyecto {
    
    //Se definen las variables de archivos a nivel de clase
    private static final String archivoLocales = "src/main/java/archivos/arLocales.csv";
    private static final String archivoVotantes = "src/main/java/archivos/arVotantes.csv";

    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     * 
     * @param args Argumentos de línea de comandos (no se utilizan en esta implementación).
     */
    public static void main(String[] args) {
        // Cargar datos iniciales desde archivos y crear el mapa de comunas
        MapaComunas mapaComunas = cargarDatosIniciales();
        
        // Crear e inicializar la ventana principal con el mapa de comunas
        VentanaMain ventanaPrincipal = new VentanaMain(mapaComunas);
        ventanaPrincipal.setVisible(true); // Hacer visible la ventana principal
    }
    
    /**
     * Carga los datos iniciales desde los archivos de locales y votantes.
     * 
     * @return Un objeto MapaComunas que contiene las comunas y sus locales/votantes.
     */
    private static MapaComunas cargarDatosIniciales() {
        //Crear mapa que guarda las comunas
        MapaComunas mapaComunas = new MapaComunas();
        
        // Cargar datos desde archivos de locales y votantes
        GestionArchivo.agregarLocalesDesdeArchivo(archivoLocales, mapaComunas);
        GestionArchivo.asignarVotantesDesdeArchivo(archivoVotantes, mapaComunas);
        // Devolver el mapa de comunas cargado
        return mapaComunas;
    }
}
