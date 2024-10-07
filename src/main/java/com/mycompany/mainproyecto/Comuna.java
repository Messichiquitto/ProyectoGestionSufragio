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
        this.locales = new ArrayList<>(); // Inicializa la lista de locales como vacía
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
     * Devuelve una copia de la lista de locales de sufragio de la comuna.
     * 
     * @return Lista de locales de sufragio.
     */
    public List<LocalDeSufragio> getLocales(){
        return new ArrayList<>(locales); // Retorna una copia de la lista de locales
    }
    
    /**
     * Agrega un nuevo local de sufragio a la comuna.
     * 
     * @param local El local de sufragio a agregar.
     */
    public void addLocal(LocalDeSufragio local){
        locales.add(local);
    }
    
    /**
     * Método para buscar un LocalDeSufragio por su nombre en la lista de locales.
     * 
     * @param nombreLocal Nombre del local de sufragio a buscar.
     * @return El objeto LocalDeSufragio si se encuentra, null en caso contrario.
     */
    public LocalDeSufragio buscarLocal(String nombreLocal) {
        for (LocalDeSufragio local : locales) {
            // Comparar el nombre del local con el nombre proporcionado
            if (local.getNombre().equals(nombreLocal)) {
                return local; // Retorna el local si se encuentra
            }
        }
        return null; // Retorna null si el local no se encuentra en la lista
    }
}
