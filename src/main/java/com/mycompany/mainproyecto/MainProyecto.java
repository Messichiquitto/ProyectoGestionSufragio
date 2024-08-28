package com.mycompany.mainproyecto;


public class MainProyecto {

    public static void main(String[] args) {
        
        //Datos iniciales de Votantes
        Votante votante1 = new Votante(101231983, "Ariel Carrasco", "Belloto");
        Votante votante2 = new Votante(398072314, "Benjamin Peredo", "Forestal");
        
        //Datos iniciales de Comunas
        Comuna comuna1 = new Comuna(1, "Comuna Belloto");
        Comuna comuna2 = new Comuna(2, "Comuna Forestal");
        
        //Datos iniciales Locales de Sufragia
        LocalDeSufragio local1 = new LocalDeSufragio(12, "Local Bakan", "Belloto", 15);
        LocalDeSufragio local2 = new LocalDeSufragio(25, "Local Perkin", "Forestal", 30);
        
        
        //Agregar locales a su respectiva comuna
        comuna1.agregarLocal(local1);
        comuna2.agregarLocal(local2);
        
        
        //Mapa de Comunas
        MapaComunas mapaComunas = new MapaComunas();
        mapaComunas.agregarComuna(comuna1);
        mapaComunas.agregarComuna(comuna2);
        
        //Asignar votantes
        local1.agregarVotante(votante1);
        local2.agregarVotante(votante2);
        
        //Mostrar votantes
        System.out.println("Votantes en " + local1.getNombre() + ":");
        for(Votante votante : local1.obtenerVotantes()){
            System.out.println("- " + votante.getNombre());
        }
        
        System.out.println("\nVotantes en " + local2.getNombre() + ":");
        for (Votante votante : local2.obtenerVotantes()) {
            System.out.println("- " + votante.getNombre());
        }
        
        //Buscar y mostrar comunas
        Comuna comunaBuscada = mapaComunas.buscarComunaPorId(1);
        if(comunaBuscada != null){
            System.out.println("\nComuna encontrada: " + comunaBuscada.getNombre());
        }
        comunaBuscada = mapaComunas.buscarComunaPorId(2);
        if(comunaBuscada != null){
            System.out.println("\nComuna encontrada: " + comunaBuscada.getNombre());
        }
    }
}
