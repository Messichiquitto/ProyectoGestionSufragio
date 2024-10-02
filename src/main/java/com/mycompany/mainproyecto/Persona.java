package com.mycompany.mainproyecto;

public class Persona {
    private int run;
    private String nombre;
    
    public Persona(int run, String nombre){
        this.run = run;
        this.nombre = nombre;
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
    
    public void realizarAccion(){
        System.out.println(nombre + " fué registrado como votante de manera exitosa");
    }
}
