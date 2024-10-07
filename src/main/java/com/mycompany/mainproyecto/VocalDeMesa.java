package com.mycompany.mainproyecto;

/**
 * Clase que representa a un Vocal de Mesa, que es una extensión de la clase Persona.
 */
public class VocalDeMesa extends Persona{
    private boolean esVocal; // Indica si la persona es vocal de mesa
    private String comuna; // Comuna en la que el vocal de mesa está registrado
    
    /**
     * Constructor que inicializa el RUN, nombre, comuna y estado de vocal del Vocal de Mesa.
     * 
     * @param run     El RUN del vocal de mesa.
     * @param nombre  El nombre completo del vocal de mesa.
     * @param comuna  La comuna en la que el vocal de mesa está registrado.
     * @param esVocal Indica si la persona es vocal de mesa (true) o no (false).
     */
    public VocalDeMesa(int run, String nombre, String comuna, boolean esVocal){
        super(run,nombre);
        this.esVocal = esVocal;
        this.comuna = comuna;
    }
    
    /**
     * Establece el estado de vocal de mesa de la persona.
     * 
     * @param esVocal El nuevo estado de vocal de mesa (true o false).
     */
    public void setEsVocal(boolean esVocal){
        this.esVocal = esVocal;
    }
    
    /**
     * Devuelve el estado de vocal de mesa de la persona.
     * 
     * @return true si la persona es vocal de mesa, false en caso contrario.
     */
    public boolean getEsVocal(){
        return esVocal;
    }
    
    /**
     * Establece la comuna del vocal de mesa.
     * 
     * @param comuna La nueva comuna del vocal de mesa.
     */
    public void setComuna(String comuna){
        this.comuna = comuna;
    }
    
    /**
     * Devuelve la comuna del vocal de mesa.
     * 
     * @return La comuna del vocal de mesa.
     */
    public String getComuna(){
        return comuna;
    }
    
    /**
     * Sobreescribe el método realizarAccion para proporcionar un mensaje 
     * que indique si la persona es vocal de mesa o no.
     * 
     * @return Un mensaje indicando el estado del vocal de mesa y su comuna.
     */
    @Override
    public String realizarAccion(){
        if (esVocal){
            return getNombre() + " es vocal de mesa en la comuna "+ comuna + ".";
        }
        else{
            return getNombre() + " no es vocal de mesa.";
        }
    }
}