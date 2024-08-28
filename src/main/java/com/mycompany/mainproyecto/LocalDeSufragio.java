package com.mycompany.mainproyecto;
import java.util.ArrayList;
import java.util.List;
//Listo
public class LocalDeSufragio {
    private int id;
    private String nombre;
    private String comuna;
    private int capacidadMax;
    private List<Votante> votantes;
    
    
    public LocalDeSufragio(int id, String nombre, String comuna, int capacidadMax){
        this.id = id;
        this.nombre = nombre;
        this.comuna = comuna;
        this.capacidadMax = capacidadMax;
        this.votantes = new ArrayList<>();
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
    
    public void setComuna(String comuna){
        this.comuna = comuna;
    }
    
    public String getComuna(){
        return comuna;
    }
    
    public void setCapacidadMax(int capacidadMax){
        this.capacidadMax = capacidadMax;
    }
    
    public int getCapacidadMax(){
        return capacidadMax;
    }
    
    //Recibe un votante
    public void agregarVotante(Votante votante){
        if (verificarCapacidad()){ //Se verifica si hay espacio en la lista
            votantes.add(votante);
        }
        else{
            System.out.println("No se puede agregar al votante, capacidad máxima alcanzada");
        }
    }
    
    public boolean verificarCapacidad(){
        return votantes.size() < capacidadMax;
    }
    
    public List<Votante> obtenerVotantes(){
        return votantes;
    }
}
