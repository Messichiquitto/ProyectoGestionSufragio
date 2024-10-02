package com.mycompany.mainproyecto;

//Listo
public class Votante extends Persona{
    private String comuna;
    
    public Votante(int run, String nombre, String comuna){
        super(run, nombre);
        this.comuna = comuna;
    }
    
    public void setComuna(String comuna){
        this.comuna = comuna;
    }
    
    public String getComuna(){
        return comuna;
    }
    
    // Se utiliza sobreescritura del metodo realizarAccion, se usa el getNombre para mantener los atributos privados
    @Override
    public void realizarAccion(){
        System.out.println(getNombre() + " está votando en la comuna "+ comuna);
    }
}
