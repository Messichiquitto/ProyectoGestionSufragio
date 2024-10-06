
package com.mycompany.mainproyecto;

public class VocalDeMesa extends Persona{
    private boolean esVocal;
    private String comuna;
    
    public VocalDeMesa(int run, String nombre, String comuna, boolean esVocal){
        super(run,nombre);
        this.esVocal = esVocal;
        this.comuna = comuna;
    }
    
    public void setEsVocal(boolean esVocal){
        this.esVocal = esVocal;
    }
    public boolean getEsVocal(){
        return esVocal;
    }
    
    public void setComuna(String comuna){
        this.comuna = comuna;
    }
    public String getComuna(){
        return comuna;
    }
    
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