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
    
    public void asignarVotantes(List<Votante> votantes) {
        for (Votante votante : votantes) {
            String comunaVotante = votante.getComuna();

            if (comunaVotante.equals(this.nombre)) {
                boolean asignacion = false;
                
                for (LocalDeSufragio local : locales) {
                    if (local.verificarCapacidad()) {
                        local.agregarVotante(votante);
                        System.out.println("Votante " + votante.getNombre() + " asignado al local " + local.getNombre());
                        asignacion = true;
                        break;
                    }
                }
                
                if (!asignacion) {
                    System.out.println("No se puede agregar al votante " + votante.getNombre() + " en la comuna " + comunaVotante + " porque todos los locales están llenos.");
                }
                return;
            }
        }
        // Si no se encontró la comuna del votante en la lista de locales
        System.out.println("Comuna " + comunaVotante + " no encontrada en los locales de esta comuna.");
    }
}
