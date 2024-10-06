package com.mycompany.mainproyecto;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un Local de Sufragio, el cual contiene información sobre
 * la comuna, capacidad máxima y una lista de votantes registrados.
 */
public class LocalDeSufragio {
    private String nombre; // Nombre del local de sufragio
    private String comuna; // Comuna a la que pertenece el local
    private int capacidadMax; // Capacidad máxima de votantes en el local
    private List<Votante> votantes; // Lista de votantes registrados en el local
    
    /**
     * Constructor que inicializa un nuevo Local de Sufragio con nombre, comuna y capacidad máxima.
     * 
     * @param nombre Nombre del local.
     * @param comuna Nombre de la comuna a la que pertenece el local.
     * @param capacidadMax Capacidad máxima de votantes en el local.
     */
    public LocalDeSufragio(String nombre, String comuna, int capacidadMax) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.capacidadMax = capacidadMax;
        this.votantes = new ArrayList<>(); // Inicializa la lista de votantes como vacía
    }
    
    /**
     * Establece el nombre del local de sufragio.
     * 
     * @param nombre Nuevo nombre del local.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Devuelve el nombre del local de sufragio.
     * 
     * @return El nombre del local.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece la comuna a la que pertenece el local de sufragio.
     * 
     * @param comuna Nueva comuna del local.
     */
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    
    /**
     * Devuelve la comuna a la que pertenece el local de sufragio.
     * 
     * @return La comuna del local.
     */
    public String getComuna() {
        return comuna;
    }
    
    /**
     * Establece la capacidad máxima del local de sufragio.
     * 
     * @param capacidadMax Nueva capacidad máxima.
     */
    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }
    
    /**
     * Devuelve la capacidad máxima del local de sufragio.
     * 
     * @return La capacidad máxima del local.
     */
    public int getCapacidadMax() {
        return capacidadMax;
    }
    
    /**
     * Devuelve una copia de la lista de votantes registrados en el local.
     * 
     * @return Lista de votantes.
     */
    public List<Votante> getVotantes() {
        return new ArrayList<>(votantes); // Retorna una copia de la lista de votantes
    }
    
    /**
     * Método para verificar si un votante ya está registrado en el local usando un objeto Votante.
     * 
     * @param votante El objeto Votante a verificar.
     * @return true si el votante ya está registrado, false en caso contrario.
     */
    public boolean votanteYaRegistrado(Votante votante) {
        for (Votante v : votantes) {
            // Compara los RUNs de los votantes
            if (v.getRun() == votante.getRun()) {
                return true; // Retorna true si el votante ya está registrado
            }
        }
        return false; // Retorna false si el votante no está registrado
    }
    
    /**
     * Sobrecarga del método para verificar si un votante ya está registrado usando su RUN.
     * 
     * @param run RUN del votante a verificar.
     * @return true si el votante ya está registrado, false en caso contrario.
     */
    public boolean votanteYaRegistrado(int run) {
        for (Votante v : votantes) {
            // Compara el RUN del votante con el RUN proporcionado
            if (v.getRun() == run) {
                return true; // Retorna true si el votante ya está registrado
            }
        }
        return false; // Retorna false si el votante no está registrado
    }

    /**
     * Método para verificar si hay capacidad disponible en el local para registrar más votantes.
     * 
     * @return true si hay capacidad, false en caso contrario.
     */
    public boolean verificarCapacidad() {
        return votantes.size() < capacidadMax;
    }

    /**
     * Método para verificar si el local puede aceptar un nuevo votante.
     * 
     * @param votante El votante a verificar.
     * @return true si el local puede aceptar al votante, false en caso contrario.
     */
    public boolean puedeAceptarVotante(Votante votante) {
        return verificarCapacidad() && !votanteYaRegistrado(votante);
    }

    /**
     * Método para agregar un votante al local, solo si no está repetido y hay espacio.
     * 
     * @param votante El votante a agregar.
     */
    public void agregarVotante(Votante votante) {
        if (puedeAceptarVotante(votante))
            votantes.add(votante);
    }

    /**
     * Método para eliminar un votante por su RUN.
     * 
     * @param run RUN del votante a eliminar.
     * @return true si se eliminó el votante, false en caso contrario.
     */
    public boolean eliminarVotante(int run) {
        Votante votante = buscarVotantePorRun(run); // Busca el votante por RUN
        if (votante != null) {
            votantes.remove(votante); // Elimina el votante si se encuentra
            return true; // Retorna true si la eliminación fue exitosa
        }
        return false; // Retorna false si el votante no se encontró
    }

    /**
     * Método para buscar un votante por su RUN.
     * 
     * @param run RUN del votante a buscar.
     * @return El objeto Votante si se encuentra, null en caso contrario.
     */
    public Votante buscarVotantePorRun(int run) {
        for (Votante votante : votantes) {
            // Compara el RUN del votante con el RUN proporcionado
            if (votante.getRun() == run) {
                return votante; // Retorna el votante si se encuentra
            }
        }
        return null; // Retorna null si el votante no se encuentra
    }
}