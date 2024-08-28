package com.mycompany.mainproyecto;
import java.util.ArrayList;
import java.util.List;

//Listo
public class Comuna {
    private int id;
    private String nombre;
    private List<LocalDeSufragio> locales;
    
    public Comuna(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.locales = new ArrayList<>();
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void agregarLocal(LocalDeSufragio local){
        locales.add(local);
    }
    
    public List<LocalDeSufragio> obtenerLocales(){
        return locales;
    }
}
