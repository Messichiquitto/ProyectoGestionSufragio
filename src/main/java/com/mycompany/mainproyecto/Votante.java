package com.mycompany.mainproyecto;

//Listo
public class Votante {
    private int run;
    private String nombre;
    private String comuna;
    
    public Votante(int run, String nombre, String comuna){
        this.run = run;
        this.nombre = nombre;
        this.comuna = comuna;
    }
    
    public void setRun(int run){
        this.run = run;
    }
    
    public int getRun(){
        return run;
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
}
