package com.mycompany.mainproyecto;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una Comuna, la cual contiene una lista de locales de sufragio.
 */
public class Comuna {
    private String nombre; // Nombre de la comuna
    private List<LocalDeSufragio> locales; // Lista de locales de sufragio en la comuna
    
    /**
     * Constructor que inicializa la comuna con un nombre y una lista vacía de locales.
     * 
     * @param nombre Nombre de la comuna.
     */
    public Comuna(String nombre){
        this.nombre = nombre;
        this.locales = new ArrayList<>();
    }
    
    /**
     * Constructor sobrecargado que inicializa la comuna con un nombre y una lista de locales.
     * 
     * @param nombre Nombre de la comuna.
     * @param locales Lista de locales de sufragio pertenecientes a la comuna.
     */
    public Comuna(String nombre, List<LocalDeSufragio> locales) {
        this.nombre = nombre;
        this.locales = locales;
    }
    
    /**
     * Establece el nombre de la comuna.
     * 
     * @param nombre Nuevo nombre de la comuna.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * Devuelve el nombre de la comuna.
     * 
     * @return El nombre de la comuna.
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Establece la lista de locales de sufragio de la comuna.
     * 
     * @param locales Nueva lista de locales de sufragio.
     */
    public void setLocales(List<LocalDeSufragio> locales) {
        this.locales = locales;
    }
    
    /**
     * Devuelve una copia de la lista de locales de sufragio de la comuna.
     * 
     * @return Lista de locales de sufragio.
     */
    public List<LocalDeSufragio> getLocales(){
        return new ArrayList<>(locales);
    }
    
    public void addLocal(LocalDeSufragio local){
        locales.add(local);
    }
    
    // Método para buscar un LocalDeSufragio por su nombre en la lista de locales
    public LocalDeSufragio buscarLocal(String nombreLocal) {
        for (LocalDeSufragio local : locales) {
            if (local.getNombre().equals(nombreLocal)) {
                return local;
            }
        }
        return null; // Retorna null si el local no se encuentra en la lista
    }
}
