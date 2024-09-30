package com.mycompany.mainproyecto;

import java.util.*;

public class MainProyecto {

    public static void main(String[] args) {
        //Crear mapa que guarda las comunas
        MapaComunas mapaComunas = new MapaComunas();
        
        //Datos iniciales de Votantes
        Votante votante1 = new Votante(101231983, "Ariel Carrasco", "Belloto");
        Votante votante2 = new Votante(398072314, "Benjamin Peredo", "Forestal");
        Votante votante3 = new Votante(398072777, "Uriol Churrasco", "Belloto");
        
        //Datos iniciales de Comunas
        Comuna comuna1 = new Comuna("Belloto");
        Comuna comuna2 = new Comuna("Forestal");
        
        //Datos iniciales Locales de Sufragia
        LocalDeSufragio local1 = new LocalDeSufragio("Local Bakan", "Belloto", 15);
        LocalDeSufragio local2 = new LocalDeSufragio("Local Perkin", "Forestal", 30);
        LocalDeSufragio local3 = new LocalDeSufragio("Local Maso", "Belloto", 10);
        
        
        //Agregar locales a su respectiva comuna
        comuna1.addLocal(local1);
        comuna2.addLocal(local2);
        comuna1.addLocal(local3);
        
        //Agregar comunas al mapa
        mapaComunas.addComuna(comuna1);
        mapaComunas.addComuna(comuna2);
        
        //Asignar votantes
        local1.agregarVotante(votante1);
        local2.agregarVotante(votante2);
        local3.agregarVotante(votante3);
        
        //Mostrar votantes
        System.out.println("Votantes en " + local1.getNombre() + ":");
        for(Votante votante : local1.getVotantes()){
            System.out.println("- " + votante.getNombre());
        }
        
        System.out.println("\nVotantes en " + local2.getNombre() + ":");
        for (Votante votante : local2.getVotantes()) {
            System.out.println("- " + votante.getNombre());
        }
        
        System.out.println("\nVotantes en " + local3.getNombre() + ":");
        for (Votante votante : local3.getVotantes()) {
            System.out.println("- " + votante.getNombre());
        }
        
        //Buscar y mostrar comuna
        String clave = "Belloto";
        Comuna comunaBuscada = mapaComunas.getComuna(clave);
        if (comunaBuscada != null){
            System.out.println("\nComuna encontrada: " + comunaBuscada.getNombre());
        } else{
            System.out.println("\nNo se encontró la comuna: " + clave);
        }
        
        //Llamar menú principal
        gestionDeVotantes(mapaComunas);
    }
        public static void gestionDeVotantes(MapaComunas mapaComunas){
           Scanner lector = new Scanner(System.in);

           while (true){
            System.out.println("Sistema de Gestion de Votantes");
            System.out.println("1.- Agregar Votante");
            System.out.println("2.- Eliminar Votante");
            System.out.println("3.- Modificar Votante");
            System.out.println("4.- Mostrar Votantes de una Comuna");
            System.out.println("5.- Mostrar Todos los Votantes");
            System.out.println("6.- Cargar datos desde Archivos");
            System.out.println("7.- Salir");
            System.out.println("Ingrese la opcion que desea usar: ");
            
            int opcion = 0;
            try {
                opcion = lector.nextInt();
                lector.nextLine(); // Limpiar el buffer
            } catch (InputMismatchException e) {
                System.out.println("Entrada no valida. Por favor, ingrese un numero.");
                lector.nextLine(); // Limpiar el buffer
                continue;
            }

            switch(opcion){
                case 1: // Agregar Votante
                    try {
                        System.out.println("Ingrese el RUN del votante: ");
                        int runAdd = lector.nextInt();
                        lector.nextLine();
                        System.out.println("Ingrese el Nombre del votante: ");
                        String nombreAdd = lector.nextLine();
                        System.out.println("Ingrese la Comuna del votante: ");
                        String comunaAdd = lector.nextLine();

                        Votante votante = new Votante(runAdd, nombreAdd, comunaAdd);
                        Comuna comuna = mapaComunas.getComuna(comunaAdd);
                        if (comuna != null) {
                            System.out.println("Ingrese el nombre del Local de Sufragio:");
                            String nombreLocal = lector.nextLine();

                            LocalDeSufragio local = comuna.buscarLocal(nombreLocal);
                            if (local != null) {
                                if (local.puedeAceptarVotante(votante)) {
                                    local.agregarVotante(votante);
                                    System.out.println("Votante agregado exitosamente!!");
                                } else {
                                    System.out.println("No se puede agregar al votante. Verifique la capacidad o si el votante ya está registrado.");
                                }
                            } else {
                                System.out.println("Local no encontrado en la comuna solicitada.");
                            }
                        } else {
                            System.out.println("Comuna no encontrada.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada no valida. Por favor, ingrese un numero para el RUN.");
                        lector.nextLine(); // Limpiar el buffer
                    }
                    break;

                     
                case 2: // Eliminar Votante
                    try {
                        System.out.println("Ingrese el RUN del votante a eliminar: ");
                        int runEliminar = lector.nextInt();
                        lector.nextLine();
                        System.out.println("Ingrese la Comuna del votante a eliminar:");
                        String comunaEliminar = lector.nextLine();

                        Comuna comunaEliminarObj = mapaComunas.getComuna(comunaEliminar);
                        if (comunaEliminarObj != null) {
                            System.out.println("Ingrese el nombre del local del votante a eliminar:");
                            String localEliminar = lector.nextLine();

                            LocalDeSufragio localEliminarObj = comunaEliminarObj.buscarLocal(localEliminar);

                            if (localEliminarObj != null) {
                                if (localEliminarObj.eliminarVotante(runEliminar)) {
                                    System.out.println("Votante eliminado exitosamente!!");
                                } else {
                                    System.out.println("Votante no encontrado dentro del local especificado.");
                                }
                            } else {
                                System.out.println("Local de sufragio no encontrado dentro de la comuna especificada.");
                            }
                        } else {
                            System.out.println("Comuna no encontrada.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada no valida. Por favor, ingrese un numero para el RUN.");
                        lector.nextLine(); // Limpiar el buffer
                    }
                    break;
                       
                case 3: // Modificar Votante
                    try {
                        System.out.println("Ingrese el RUN del votante que quiere modificar: ");
                        int runModificar = lector.nextInt();
                        lector.nextLine();
                        System.out.println("Ingrese la comuna del votante: ");
                        String comunaActual = lector.nextLine();

                        // Buscar la comuna en el mapa
                        Comuna comunaOrigen = mapaComunas.getComuna(comunaActual);
                        if (comunaOrigen != null) {
                            // Buscar al votante en la comuna y en sus locales
                            Votante votanteEncontrado = null;
                            LocalDeSufragio localOrigen = null;

                            for (LocalDeSufragio local : comunaOrigen.getLocales()) {
                                votanteEncontrado = local.buscarVotantePorRun(runModificar);
                                if (votanteEncontrado != null) {
                                    localOrigen = local;
                                    break;
                                }
                            }

                            if (votanteEncontrado != null) {
                                // Solicitar los nuevos datos
                                System.out.println("Ingrese el nuevo nombre del votante: ");
                                String nombreNuevo = lector.nextLine();
                                System.out.println("Ingrese la nueva comuna: ");
                                String comunaNueva = lector.nextLine();
                                System.out.println("Ingrese el nuevo local de sufragio del votante:");
                                String localNuevo = lector.nextLine();

                                // Actualizar nombre y comuna del votante
                                votanteEncontrado.setNombre(nombreNuevo);
                                votanteEncontrado.setComuna(comunaNueva);

                                // Eliminar del local actual
                                localOrigen.eliminarVotante(runModificar);

                                // Asignar al nuevo local
                                Comuna comunaDestino = mapaComunas.getComuna(comunaNueva);
                                if (comunaDestino != null) {
                                    LocalDeSufragio localDestino = comunaDestino.buscarLocal(localNuevo);
                                    if (localDestino != null) {
                                        if (localDestino.puedeAceptarVotante(votanteEncontrado)) {
                                            localDestino.agregarVotante(votanteEncontrado);
                                            System.out.println("Votante movido al nuevo local de sufragio en " + comunaNueva + ".");
                                        } else {
                                            System.out.println("No se puede agregar al votante al nuevo local.");
                                        }
                                    } else {
                                        System.out.println("No se pudo encontrar el nuevo local de sufragio.");
                                    }
                                } else {
                                    System.out.println("No se pudo encontrar la comuna especificada.");
                                }
                            } else {
                                System.out.println("Votante no encontrado con el RUN especificado en la comuna.");
                            }
                        } else {
                            System.out.println("No se pudo encontrar la comuna especificada.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada no valida. Por favor, ingrese un numero para el RUN.");
                        lector.nextLine(); // Limpiar el buffer
                    }
                    break;
                case 4: // Mostrar Votantes de una Comuna
                    System.out.println("Ingrese el nombre de la comuna para mostrar sus votantes: ");
                    String comunaMostrar = lector.nextLine();

                    Comuna comunaMostrarObj = mapaComunas.getComuna(comunaMostrar);
                    if (comunaMostrarObj != null) {
                        List<LocalDeSufragio> locales = comunaMostrarObj.getLocales();
                        if (locales.isEmpty()) {
                            System.out.println("No hay locales en la comuna " + comunaMostrar);
                        } else {
                            boolean encontrados = false;
                            for (LocalDeSufragio local : locales) {
                                List<Votante> votantes = local.getVotantes();
                                if (!votantes.isEmpty()) {
                                    System.out.println("Local de Sufragio: " + local.getNombre());
                                    for (Votante votante : votantes) {
                                        System.out.println("RUN: " + votante.getRun() + ", Nombre: " + votante.getNombre());
                                    }
                                    encontrados = true;
                                }
                            }
                            if (!encontrados) {
                                System.out.println("No se encontraron votantes en la comuna " + comunaMostrar);
                            }
                        }
                    } else {
                        System.out.println("Comuna no encontrada.");
                    }
                    break;
                
                case 5: // Mostrar Todos los Votantes
                    System.out.println("Mostrando todos los votantes en el mapa de comunas:");

                    // Recorrer todas las comunas del objeto mapaComunas
                    for (Comuna comuna : mapaComunas.getMapaComunas().values()) {
                        System.out.println("\nComuna: " + comuna.getNombre());

                        // Recorrer todos los locales de la comuna
                        for (LocalDeSufragio local : comuna.getLocales()) {
                            System.out.println("  Local: " + local.getNombre());
                            List<Votante> votantes = local.getVotantes();
                            if (votantes.isEmpty()) {
                                System.out.println("    No hay votantes en este local.");
                            } else {
                                // Mostrar los votantes de cada local
                                for (Votante votante : votantes) {
                                    System.out.println("    Votante: " + votante.getNombre() + ", RUN: " + votante.getRun());
                                }
                            }
                        }
                    }
                    break;
                
                case 6:
                    String archivoLocales = "src/main/java/archivos/arLocales.txt";
                    mapaComunas.agregarLocalesDesdeArchivo(archivoLocales);
                    
                    String archivoVotantes = "src/main/java/archivos/arVotantes.txt";
                    mapaComunas.asignarVotantesDesdeArchivo(archivoVotantes);
                    break;
                    
                case 7:
                    System.out.println("Saliendo de la gestion!!");
                    lector.close();
                    return;
                default:
                    System.out.println("Opcion no valida, intentelo de nuevo.");
            }
           }
        }
}
