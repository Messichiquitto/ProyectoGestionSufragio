package com.mycompany.mainproyecto;

import java.util.*;


public class MainProyecto {

    public static void main(String[] args) {
        
        //mapa que guarda las comunas
        Map<String, List<LocalDeSufragio>> mapaComunas = new HashMap<>();
        
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
        //mapaComunas.put("Viña del Mar", new ArrayList<LocalDeSufragio>());
        //mapaComunas.put("Valparaiso", new ArrayList<LocalDeSufragio>());
        
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
        
        //Buscar y mostrar comuna
        String clave = "Viña del Mar";
        List comunaBuscada = mapaComunas.get(clave);
        if (comunaBuscada != null){
            System.out.println("\nComuna encontrada: " + comunaBuscada);
        }
        else{
            System.out.println("\nNo se encontró la comuna: ");
        }
    }
        public static void gestionDeVotantes(Map mapaComunas){
           Scanner lector = new Scanner(System.in);
           List <LocalDeSufragio> locales;

           while (true){
            System.out.println("Sistema de Gestión de Votantes");
            System.out.println("1.- Agregar Votante");
            System.out.println("2.- Eliminar Votante");
            System.out.println("3.- Modificar Votante");
            System.out.println("4.- Salir");
            System.out.println("Ingrese la opción que desea usar: ");
            int opcion = lector.nextInt(); 
            lector.nextLine();

            switch(opcion)
            {
                case 1:
                    System.out.println("Ingrese el RUN del votante: ");
                    int runAdd = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Ingrese el Nombre del votante: ");
                    String nombreAdd = lector.nextLine();
                    System.out.println("Ingrese la Comuna del votante: ");
                    String comunaAdd = lector.nextLine();

                    Votante votante = new Votante(runAdd, nombreAdd, comunaAdd);
                    locales = (List) mapaComunas.get(comunaAdd);
                    if (locales != null){
                        System.out.println("Ingrese el nombre del Local de Sufragio");
                        String nombreLocal = lector.nextLine();
                        
                        //Buscar el local por el nombre
                        LocalDeSufragio localEncontrado = null;
                        for (LocalDeSufragio local : locales){
                            if (local.getNombre().equals(nombreLocal)){
                                localEncontrado = local;
                                break;
                            }
                        }
                        if (localEncontrado != null){
                            localEncontrado.agregarVotante(votante);
                            System.out.println("Votante <gregado exitosamente!!");
                        }
                        else{
                            System.out.println("Local no encontrado en la comuna solicitada");
                        }
                    }
                    else{
                        System.out.println("Comuna no encontrada");
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el RUN del votante a eliminar: ");
                    int runEliminar = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Ingrese la Comuna del votante a eliminar");
                    String comunaEliminar = lector.nextLine();
                    
                    locales = (List) mapaComunas.get(comunaEliminar);
                    if (locales != null){
                        System.out.println("Ingrese el local del votante a eliminar");
                        String localEliminar = lector.nextLine();
                        
                        LocalDeSufragio localEncontrado = null;
                        for (LocalDeSufragio local : locales){
                            if (local.getNombre().equals(localEliminar)){
                                localEncontrado = local;
                                break;
                            }
                        }
                        if (localEncontrado != null){
                            Votante votanteEliminar = null;
                            
                            for (Votante votantes : localEncontrado.obtenerVotantes()){
                                if (votantes.getRun() == runEliminar){
                                    votanteEliminar = votantes;
                                }
                            }
                            if (votanteEliminar != null){
                                localEncontrado.eliminarVotante(runEliminar);
                                System.out.println("Votante eliminado exitosamente!!");
                            }
                            else{
                                System.out.println("Votante no encontrado dentro del local especificado");
                            }
                        }
                        else{
                            System.out.println("Local de sufragio no encontraado dentro de la comuna especificada.");
                        }
                    }
                    else{
                        System.out.println("Comuna no encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el RUN del votante que quiere modificar: ");
                    int runModificar = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Ingrese el nuevo nombre del votante: ");
                    String nombreModificar = lector.nextLine();
                    System.out.println("Ingrese la nueva comuna: ");
                    String comunaModificar = lector.nextLine();
                    System.out.println("Ingrese el nuevo local de sufragio del votante");
                    String localModificar = lector.nextLine();
                    
                    boolean votanteModificado = false;
                    
                    locales = (List) mapaComunas.get(comunaModificar);
                    for (LocalDeSufragio local : locales){
                        Votante votanteEncontrado = local.buscarVotantePorRun(runModificar);
                        
                        if (votanteEncontrado != null){
                            votanteEncontrado.setNombre(nombreModificar);
                            votanteEncontrado.setComuna(comunaModificar);
                            
                            local.eliminarVotante(runModificar);
                            System.out.println("Votante encontrado y modificado");
                            List<LocalDeSufragio> nuevoLocal = (List) mapaComunas.get(comunaModificar);
                            
                            if (nuevoLocal != null){
                                for (LocalDeSufragio nuevosLocales : nuevoLocal){
                                    if (nuevosLocales.getNombre().equals(localModificar)){
                                        nuevosLocales.agregarVotante(votanteEncontrado);
                                        System.out.println("Votante movido al nuevo local de sufragio en " + comunaModificar +".");
                                        votanteModificado = true;
                                        break;
                                    }
                                }
                            }
                            else{
                                System.out.println("No se pudo encontrar la comuna especificada.");
                            }
                            break;
                        }
                    }
                    if (!votanteModificado){
                        System.out.println("No se pudo encontrar el votante con el run especificado.");
                    }
                    
                    break;
                case 4:
                    System.out.println("Saliendo de la modificación!!");
                    lector.close();
                    break;
                default:
                    System.out.println("Opción no válida, inténtelo de nuevo.");
            }
           }
        }
}
