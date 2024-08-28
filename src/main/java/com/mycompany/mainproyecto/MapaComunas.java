package com.mycompany.mainproyecto;
import java.util.Map;
import java.util.HashMap;


public class MapaComunas {
    private Map<Integer, Comuna> comunas;
    
    public MapaComunas(){
        this.comunas = new HashMap<>();
    }
    
    public void agregarComuna(Comuna comuna){
        comunas.put(comuna.getId(), comuna);
    }
    
    public Comuna buscarComunaPorId(int id){
        return comunas.get(id);
    }
    
    public Map<Integer, Comuna> obtenerTodasLasComunas(){
        return comunas;
    }
}
