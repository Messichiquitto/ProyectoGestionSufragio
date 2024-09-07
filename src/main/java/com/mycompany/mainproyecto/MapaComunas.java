package com.mycompany.mainproyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class MapaComunas {
    private Map<String, Comuna> mapaComunas;
    
    public MapaComunas(){
        this.mapaComunas = new HashMap<>();
    }
    
    public Comuna getComuna(String nombre){
        return mapaComunas.get(nombre);
    }
    
    // Sobrecarga del método para obtener una comuna con el nombre y una lista de locales
    public Comuna getComuna(String nombre, List<LocalDeSufragio> locales) {
        Comuna comuna = new Comuna(nombre, locales);
        mapaComunas.put(nombre, comuna);
        return comuna;
    }
    
    public Map<String, Comuna> getMapaComunas(){
        return mapaComunas;
    }
    
    public void addComuna(Comuna comuna){
        mapaComunas.put(comuna.getNombre(), comuna);
    }
    
    public void asignarVotantesDesdeArchivo(String archivoVotantes) {
        GestionArchivo.asignarVotantesDesdeArchivo(archivoVotantes, this);
    }
    
    public void agregarLocalesDesdeArchivo(String archivoLocales) {
        GestionArchivo.agregarLocalesDesdeArchivo(archivoLocales, this);
    }
    
    public void asignarVotante(Votante votante){
        String comunaVotante = votante.getComuna();
        
        Comuna comuna = mapaComunas.get(comunaVotante);
        if(comuna != null){
            boolean asignacion = false;
            
            for(LocalDeSufragio local : comuna.getLocales()){
                if(local.verificarCapacidad() && !local.votanteYaRegistrado(votante)){
                    local.agregarVotante(votante);
                    System.out.println("Votante " + votante.getNombre() + " asignado al " + local.getNombre());
                    asignacion = true;
                    break;
                }
            }
            if(!asignacion){
                System.out.println("No se puede agregar al votante " + votante.getNombre());
            }
        } else{
            System.out.println("Comuna " + comunaVotante + " no encontrada en el mapa.");
        }
    }
}
