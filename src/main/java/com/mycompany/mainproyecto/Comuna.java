package com.mycompany.mainproyecto;
import java.util.ArrayList;
import java.util.List;

//Listo
public class Comuna {
    private String nombre;
    private List<LocalDeSufragio> locales;
    
    public Comuna(String nombre){
        this.nombre = nombre;
        this.locales = new ArrayList<>();
    }
    
    //Sobrecarga constructor
    public Comuna(String nombre, List<LocalDeSufragio> locales) {
        this.nombre = nombre;
        this.locales = locales;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setLocales(List<LocalDeSufragio> locales) {
        this.locales = locales;
    }
    
    public List<LocalDeSufragio> getLocales(){
        return locales;
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
