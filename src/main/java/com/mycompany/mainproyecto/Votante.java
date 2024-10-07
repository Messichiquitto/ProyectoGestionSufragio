package com.mycompany.mainproyecto;

/**
 * Clase que representa un votante, que es una extensión de la clase Persona.
 */
public class Votante extends Persona{
    private String comuna; // Comuna en la que el votante está registrado
    
    /**
     * Constructor que inicializa el RUN, nombre y comuna del votante.
     * 
     * @param run    El RUN del votante.
     * @param nombre El nombre completo del votante.
     * @param comuna La comuna en la que el votante está registrado.
     */
    public Votante(int run, String nombre, String comuna){
        super(run, nombre);
        this.comuna = comuna;
    }
    
    /**
     * Establece la comuna del votante.
     * 
     * @param comuna La nueva comuna del votante.
     */
    public void setComuna(String comuna){
        this.comuna = comuna;
    }
    
    /**
     * Devuelve la comuna del votante.
     * 
     * @return La comuna del votante.
     */
    public String getComuna(){
        return comuna;
    }
    
    /**
     * Sobreescribe el método realizarAccion para proporcionar un mensaje 
     * que indique que el votante está votando en una comuna específica.
     * 
     * @return Un mensaje indicando que el votante está votando en su comuna.
     */
    @Override
    public String realizarAccion(){
         return getNombre() + " está votando en la comuna "+ comuna + ".";
    }
}
