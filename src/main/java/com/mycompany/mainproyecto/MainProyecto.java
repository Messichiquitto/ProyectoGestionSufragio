package com.mycompany.mainproyecto;
    
import java.util.*;

public class MainProyecto {
    //Se definen las variables de archivos a nivel de clase
    private static final String archivoLocales = "src/main/java/archivos/arLocales.csv";
    private static final String archivoVotantes = "src/main/java/archivos/arVotantes.csv";
    private static final String archivoReporte = "src/main/java/archivos/Reporte.txt";

    public static void main(String[] args) {
        MapaComunas mapaComunas = cargarDatosIniciales();
        
        VentanaMain ventanaPrincipal = new VentanaMain(mapaComunas);
        ventanaPrincipal.setVisible(true);
    }
    
    private static MapaComunas cargarDatosIniciales() {
        //Crear mapa que guarda las comunas
        MapaComunas mapaComunas = new MapaComunas();
        
        //Cargar datos desde archivos
        GestionArchivo.agregarLocalesDesdeArchivo(archivoLocales, mapaComunas);
        GestionArchivo.asignarVotantesDesdeArchivo(archivoVotantes, mapaComunas);
        return mapaComunas;
    }
    
    

       
        /*
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
            System.out.println("6.- Salir");
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
                    try { //Se piden datos
                        System.out.println("Ingrese el RUN del votante: ");
                        int runAdd = lector.nextInt();
                        lector.nextLine();
                                              
                        //Validar el RUN
                        if (String.valueOf(runAdd).length() != 9){
                            throw new VotanteExceptions(VotanteExceptions.getMensajeRutInvalido());
                        }
                        
                        // Verificar si el votante ya está registrado en algún local
                        boolean registrado = false;
                        for (Comuna comuna : mapaComunas.getMapaComunas().values()) {
                            for (LocalDeSufragio local : comuna.getLocales()) {
                                if(local.votanteYaRegistrado(runAdd)){
                                    System.out.println("El votante con RUN " + runAdd + " ya esta registrado en el local " + local.getNombre() + " de la comuna " + comuna.getNombre());
                                    registrado = true;
                                    break;
                                }
                            }
                            if (registrado) break;
                        }
                        
                        //Si no está registrado, continuar con la creación del votante
                        if(!registrado){
                            System.out.println("Ingrese el Nombre del votante: ");
                            String nombreAdd = lector.nextLine();
                            System.out.println("Ingrese la Comuna del votante: ");
                            String comunaAdd = lector.nextLine();
                            
                            //Crear objeto persona
                            Persona p = new Persona(runAdd, nombreAdd);
                            //Crear objeto votante
                            Votante votante = new Votante(runAdd, nombreAdd, comunaAdd);

                            //Se busca la comuna en la que debería ser agregado      
                            Comuna comuna = mapaComunas.getComuna(comunaAdd);
                            if (comuna == null) {
                                throw new ComunaExceptions(ComunaExceptions.getMensajeComunaNoEncontrada());
                            }
                            
                            System.out.println("Ingrese el nombre del Local de Sufragio:");
                            String nombreLocal = lector.nextLine();

                            //Si existe el local
                            LocalDeSufragio local = comuna.buscarLocal(nombreLocal);
                            if (local == null) {
                                throw new ComunaExceptions(ComunaExceptions.getMensajeErrorLocalNoEncontrado());
                            }

                            //Si el local puede aceptar al nuevo votante, se agrega
                            if (local.puedeAceptarVotante(votante)) {
                                local.agregarVotante(votante);
                                p.realizarAccion();
                                votante.realizarAccion();
                                System.out.println("Votante agregado exitosamente!!");
                            } else {
                                System.out.println("No se puede agregar al votante. Verifique la capacidad o si el votante ya está registrado.");
                            }
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada no valida. Por favor, ingrese un numero para el RUN.");
                        lector.nextLine(); // Limpiar el buffer
                    } catch (VotanteExceptions e) {
                        System.out.println(e.getMessage()); //Arroja el mensaje específico de la excepción
                    } catch (ComunaExceptions e) {
                        System.out.println(e.getMessage()); //Arroja el mensaje específico de la excepción de comuna
                    }
                    break;
  
                case 2: // Eliminar Votante
                    try {
                        //Se piden datos
                        System.out.println("Ingrese el RUN del votante a eliminar: ");
                        int runEliminar = lector.nextInt();
                        lector.nextLine();
                        
                        //Validar el RUN
                        if (String.valueOf(runEliminar).length() != 9) {
                            throw new VotanteExceptions(VotanteExceptions.getMensajeRutInvalido());
                        }
                        
                        System.out.println("Ingrese la Comuna del votante a eliminar:");
                        String comunaEliminar = lector.nextLine();
                        
                        //Si existe la comuna
                        Comuna comunaEliminarObj = mapaComunas.getComuna(comunaEliminar);
                        if (comunaEliminarObj == null) {
                            throw new ComunaExceptions(ComunaExceptions.getMensajeComunaNoEncontrada());
                        }
                        System.out.println("Ingrese el nombre del local del votante a eliminar:");
                        String localEliminar = lector.nextLine();
                            
                        //Si existe el local buscado
                        LocalDeSufragio localEliminarObj = comunaEliminarObj.buscarLocal(localEliminar);
                        if (localEliminarObj == null) {
                            throw new ComunaExceptions(ComunaExceptions.getMensajeErrorLocalNoEncontrado());
                        }
                        
                        //Eliminar votante
                        if (localEliminarObj.eliminarVotante(runEliminar)) {
                            System.out.println("Votante eliminado exitosamente!!");
                        } else {
                            throw new VotanteExceptions("Votante no encontrado dentro del local");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada no valida. Por favor, ingrese un numero para el RUN.");
                        lector.nextLine(); // Limpiar el buffer
                    } catch (VotanteExceptions e) {
                        System.out.println(e.getMessage());
                    } catch (ComunaExceptions e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 3: // Modificar Votante
                    try { 
                        //Se piden datos
                        System.out.println("Ingrese el RUN del votante que quiere modificar: ");
                        int runModificar = lector.nextInt();
                        lector.nextLine();
                        
                        if (String.valueOf(runModificar).length() != 9) {
                            throw new VotanteExceptions(VotanteExceptions.getMensajeRutInvalido());
                        }
                        
                        System.out.println("Ingrese la comuna del votante: ");
                        String comunaActual = lector.nextLine();

                        // Buscar la comuna en el mapa
                        Comuna comunaOrigen = mapaComunas.getComuna(comunaActual);
                        if (comunaOrigen == null) {
                            throw new ComunaExceptions(ComunaExceptions.getMensajeComunaNoEncontrada());
                        }
                        
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

                        if (votanteEncontrado == null) {
                            throw new VotanteExceptions("Votante no encontrado con el RUN especificado en la comuna");
                        }
                        
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
                        if (comunaDestino == null) {
                            throw new ComunaExceptions("No se pudo encontrar la nueva comuna especificada");
                        }
                        
                        LocalDeSufragio localDestino = comunaDestino.buscarLocal(localNuevo);
                        if (localDestino == null) {
                            throw new ComunaExceptions("No se pudo agregar al votante al nuevo local, capacidad excedida");
                        }

                        localDestino.agregarVotante(votanteEncontrado);
                        System.out.println("Votante movido al nuevo local de sufragio en " + comunaNueva + ".");
                        
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada no valida. Por favor, ingrese un numero para el RUN");
                        lector.nextLine();
                    } catch (VotanteExceptions e) {
                        System.out.println(e.getMessage());
                    } catch (ComunaExceptions e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                  /*if (localDestino.puedeAceptarVotante(votanteEncontrado)) {
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
                    try {
                        System.out.println("Ingrese el nombre de la comuna para mostrar sus votantes: ");
                        String comunaMostrar = lector.nextLine();

                        //Si la comuna existe
                        Comuna comunaMostrarObj = mapaComunas.getComuna(comunaMostrar);
                        if (comunaMostrarObj == null) {
                            throw new ComunaExceptions(ComunaExceptions.getMensajeComunaNoEncontrada());
                        }
                    
                        //Se obtiene la lista de locales de sufragio
                        List<LocalDeSufragio> locales = comunaMostrarObj.getLocales();
                        if (locales.isEmpty()) {
                            System.out.println("No hay locales en la comuna " + comunaMostrar);
                        } else {
                            boolean encontrados = false;
                            //Se recorre la lista de locales
                            for (LocalDeSufragio local : locales) {
                                //Se obtiene la lista de votantes
                                List<Votante> votantes = local.getVotantes();
                                if (!votantes.isEmpty()) {
                                    System.out.println("Local de Sufragio: " + local.getNombre());
                                    //Se imprime la información del votante
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
                    } catch (ComunaExceptions e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                    }
                    break;
                    
             
                
                case 5: // Mostrar Todos los Votantes
                    try {
                        System.out.println("Mostrando todos los votantes en el mapa de comunas:");
                        
                        //Verificar si el mapa de comunas está vacío
                        if (mapaComunas.getMapaComunas().isEmpty()) {
                            throw new ComunaExceptions("No hay comunas disponibles en el mapa.");
                        }
                        
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
                    } catch (ComunaExceptions e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                    }
                    break;
                
                case 6:
                    System.out.println("Guardando datos y generando reporte antes de salir...");
                    //Se llama al método para reescribir los archivos antes de salir
                    GestionArchivo.guardarDatos(archivoLocales, archivoVotantes, mapaComunas);
                    GestionArchivo.generarReporteVotantesPorLocal(mapaComunas, archivoReporte);
                    System.out.println("Saliendo de la gestion!!");
                    lector.close();
                    return;

                default:
                    System.out.println("Opcion no valida, intentelo de nuevo.");
            }
           }
        }*/
}
