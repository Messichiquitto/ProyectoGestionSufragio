package com.mycompany.mainproyecto;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase que representa un mapa de comunas, permitiendo el almacenamiento y gestión
 * de objetos Comuna y sus respectivos locales de sufragio.
 */
public class MapaComunas {
    
    // Mapa que asocia el nombre de una comuna con su objeto Comuna correspondiente
    private Map<String, Comuna> mapaComunas;
    
    /**
     * Constructor que inicializa el mapa de comunas.
     */
    public MapaComunas(){
        this.mapaComunas = new HashMap<>();
    }
    
    /**
     * Obtiene una comuna por su nombre.
     * 
     * @param nombre Nombre de la comuna a buscar.
     * @return El objeto Comuna asociado al nombre proporcionado, o null si no existe.
     */
    public Comuna getComuna(String nombre){
        return mapaComunas.get(nombre);
    }
    
    /**
     * Sobrecarga del método para obtener una nueva comuna con el nombre y una lista de locales.
     * 
     * @param nombre Nombre de la comuna a crear.
     * @param locales Lista de locales de sufragio asociados a la comuna.
     * @return La nueva comuna creada y almacenada en el mapa.
     */
    public Comuna getComuna(String nombre, List<LocalDeSufragio> locales) {
        Comuna comuna = new Comuna(nombre, locales);
        mapaComunas.put(nombre, comuna);
        return comuna;
    }
    
    /**
     * Obtiene una copia del mapa de comunas.
     * 
     * @return Un nuevo mapa que contiene todas las comunas actuales.
     */
    public Map<String, Comuna> getMapaComunas(){
        return new HashMap<>(mapaComunas);
    }
    
    /**
     * Agrega una nueva comuna al mapa.
     * 
     * @param comuna La comuna a agregar.
     */
    public void addComuna(Comuna comuna){
        mapaComunas.put(comuna.getNombre(), comuna);
    }
    
    /**
     * Asigna votantes desde un archivo al mapa de comunas.
     * 
     * @param archivoVotantes Ruta del archivo que contiene los votantes.
     */
    public void asignarVotantesDesdeArchivo(String archivoVotantes) {
        GestionArchivo.asignarVotantesDesdeArchivo(archivoVotantes, this);
    }
    
    /**
     * Agrega locales desde un archivo al mapa de comunas.
     * 
     * @param archivoLocales Ruta del archivo que contiene los locales.
     */
    public void agregarLocalesDesdeArchivo(String archivoLocales) {
        GestionArchivo.agregarLocalesDesdeArchivo(archivoLocales, this);
    }
    
    /**
     * Asigna un votante a un local dentro de la comuna correspondiente.
     * 
     * @param votante El votante a asignar.
     * @return true si el votante fue asignado exitosamente, false de lo contrario.
     */
    public boolean asignarVotante(Votante votante){
        String comunaVotante = votante.getComuna();
        boolean asignacion = false;
                
        // Buscar la comuna correspondiente al votante
        Comuna comuna = mapaComunas.get(comunaVotante);
        if(comuna != null){
            // Recorrer los locales de la comuna para asignar el votante
            for(LocalDeSufragio local : comuna.getLocales()){
                // Verificar si el local tiene capacidad y si el votante no está registrado
                if(local.verificarCapacidad() && !local.votanteYaRegistrado(votante)){
                    local.agregarVotante(votante); // Asignar el votante al local
                    asignacion = true; // Indicar que la asignación fue exitosa
                    break; // Salir del bucle tras la asignación
                }
            }
        }
        return asignacion; // Devolver el resultado de la asignación
    }
}
