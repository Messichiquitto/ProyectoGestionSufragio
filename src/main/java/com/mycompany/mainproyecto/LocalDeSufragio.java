package com.mycompany.mainproyecto;

import java.util.ArrayList;
import java.util.List;

public class LocalDeSufragio {
    private String nombre;
    private String comuna;
    private int capacidadMax;
    private List<Votante> votantes;
    
    public LocalDeSufragio(String nombre, String comuna, int capacidadMax) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.capacidadMax = capacidadMax;
        this.votantes = new ArrayList<>();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    
    public String getComuna() {
        return comuna;
    }
    
    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }
    
    public int getCapacidadMax() {
        return capacidadMax;
    }
    
    public List<Votante> getVotantes() {
        return votantes;
    }
    
    // Método para verificar si un votante ya está registrado en el local usando un objeto Votante
    public boolean votanteYaRegistrado(Votante votante) {
        for (Votante v : votantes) {
            if (v.getRun() == votante.getRun()) {
                return true;
            }
        }
        return false;
    }
    
    // Sobrecarga del método para verificar si un votante ya está registrado usando su RUN
    public boolean votanteYaRegistrado(int run) {
        for (Votante v : votantes) {
            if (v.getRun() == run) {
                return true;
            }
        }
        return false;
    }

    // Método para verificar si hay capacidad disponible
    public boolean verificarCapacidad() {
        return votantes.size() < capacidadMax;
    }

    // Método para verificar si puede aceptar un votante
    public boolean puedeAceptarVotante(Votante votante) {
        return verificarCapacidad() && !votanteYaRegistrado(votante);
    }

    // Método para agregar un votante, solo si no está repetido y hay espacio
    public void agregarVotante(Votante votante) {
        if (puedeAceptarVotante(votante)) {
            votantes.add(votante);
            System.out.println("Votante agregado: " + votante.getNombre());
        } else {
            System.out.println("No se pudo agregar al votante " + votante.getNombre());
        }
    }

    // Método para eliminar un votante por su RUN
    public boolean eliminarVotante(int run) {
        Votante votante = buscarVotantePorRun(run);
        if (votante != null) {
            votantes.remove(votante);
            System.out.println("Votante eliminado: " + votante.getNombre());
            return true;
        } else {
            System.out.println("Votante con RUN " + run + " no encontrado.");
        }
        return false;
    }

    // Método para buscar un votante por su RUN
    public Votante buscarVotantePorRun(int run) {
        for (Votante votante : votantes) {
            if (votante.getRun() == run) {
                return votante;
            }
        }
        return null;
    }
}