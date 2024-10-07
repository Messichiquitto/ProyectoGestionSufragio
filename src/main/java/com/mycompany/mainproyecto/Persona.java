package com.mycompany.mainproyecto;

/**
 * Clase que representa una persona con un RUN y un nombre.
 */
public class Persona {
    private int run;
    private String nombre;
    
    /**
     * Constructor que inicializa el RUN y el nombre de la persona.
     * 
     * @param run   El RUN de la persona.
     * @param nombre El nombre completo de la persona.
     */
    public Persona(int run, String nombre){
        this.run = run;
        this.nombre = nombre; // Nombre completo de la persona
    }
    
    /**
     * Establece el RUN de la persona.
     * 
     * @param run El nuevo RUN de la persona.
     */
    public void setRun(int run){
        this.run = run;
    }
    
    /**
     * Devuelve el RUN de la persona.
     * 
     * @return El RUN de la persona.
     */
    public int getRun(){
        return run;
    }
    
    /**
     * Establece el nombre de la persona.
     * 
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * Devuelve el nombre completo de la persona.
     * 
     * @return El nombre completo de la persona.
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Sobrecarga del método getNombre. Devuelve la primera letra del apellido de la persona 
     * si el apellido comienza con la letra especificada.
     *
     * @param letra La letra con la que debe comenzar el apellido.
     * @return La primera letra del apellido si comienza con la letra especificada, 
     *         o un String vacío si no hay apellido o no comienza con la letra especificada.
     */
    public String getNombre(char letra) {
        String[] partes = nombre.split(" "); // Divide el nombre por espacios
        if (partes.length > 1) { // Verifica si hay al menos un apellido
            String apellido = partes[1]; // Asume que el apellido está en la segunda posición
            if (apellido.toLowerCase().startsWith(String.valueOf(letra).toLowerCase())) {
                return apellido.substring(0, 1); // Retorna la primera letra del apellido
            }
        }
        return ""; // Retorna vacío si no hay apellido o no comienza con la letra especificada
    }
 
    /**
     * Realiza una acción indicando que la persona fue registrada como votante.
     * 
     * @return Un mensaje indicando que la persona fue registrada exitosamente.
     */
    public String realizarAccion(){
        return nombre + " fue registrado como votante de manera exitosa";
    }
}
