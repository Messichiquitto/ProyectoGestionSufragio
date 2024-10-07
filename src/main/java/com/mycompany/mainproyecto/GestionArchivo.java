package com.mycompany.mainproyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Clase encargada de gestionar operaciones relacionadas con la persistencia de archivos
 * y la generación de reportes en el sistema de votantes.
 */
public class GestionArchivo {

    /**
     * Asigna los votantes a sus respectivas comunas desde un archivo CSV.
     * * El formato esperado del archivo es "run,nombre,comuna".
     * 
     * @param archivoVotantes El nombre del archivo CSV que contiene la información de los votantes.
     * @param mapaComunas El mapa de comunas donde se asignarán los votantes.
     */
    public static void asignarVotantesDesdeArchivo(String archivoVotantes, MapaComunas mapaComunas) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoVotantes))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea por comas
                String[] datosVotante = linea.split(",");
                
                // Asumir que el formato es correcto: run,nombre,comuna
                int run = Integer.parseInt(datosVotante[0]);
                String nombre = datosVotante[1];
                String comuna = datosVotante[2].toLowerCase();
                
                // Crear un objeto Votante y asignarlo a la comuna correspondiente
                Votante votante = new Votante(run, nombre, comuna);
                mapaComunas.asignarVotante(votante);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Imprimir error si el archivo no se puede leer
        }
    }

    /**
     * Agrega locales de sufragio a las comunas desde un archivo CSV.
     * El formato esperado del archivo es "NombreComuna,LocalNombre,CapacidadMax".
     * 
     * @param archivoLocales El nombre del archivo que contiene los locales de sufragio.
     * @param mapaComunas El mapa que contiene las comunas y permite agregar los locales.
     */
    public static void agregarLocalesDesdeArchivo(String archivoLocales, MapaComunas mapaComunas) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoLocales))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea por comas
                String[] datosLocal = linea.split(",");
                
                // Procesar los datos del local
                String nombreComuna = datosLocal[0].toLowerCase();
                String nombreLocal = datosLocal[1].toLowerCase();
                int capacidadMax = Integer.parseInt(datosLocal[2].trim());
                
                // Crear un objeto LocalDeSufragio
                LocalDeSufragio local = new LocalDeSufragio(nombreLocal, nombreComuna, capacidadMax);
                
                // Obtener la comuna correspondiente o crear una nueva si no existe
                Comuna comuna = mapaComunas.getComuna(nombreComuna);
                if (comuna == null) {
                    // Si la comuna no existe, se crea y se agrega al mapa
                    comuna = new Comuna(nombreComuna);
                    mapaComunas.addComuna(comuna);
                }

                // Agregar el local a la comuna
                comuna.addLocal(local);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Imprimir error si el archivo no se puede leer
        }
    }
    
    /**
     * Guarda los datos de los locales y votantes en archivos de texto.
     * Los archivos se sobreescriben con los nuevos datos.
     * 
     * @param archivoLocales El nombre del archivo donde se guardarán los locales.
     * @param archivoVotantes El nombre del archivo donde se guardarán los votantes.
     * @param mapaComunas El mapa de comunas del cual se extraen los datos para guardar.
     */
    public static void guardarDatos(String archivoLocales, String archivoVotantes, MapaComunas mapaComunas){
        try (BufferedWriter bwLocales = new BufferedWriter(new FileWriter(archivoLocales));
         BufferedWriter bwVotantes = new BufferedWriter(new FileWriter(archivoVotantes))) {
            
            //Recorrer todas las comunas
            for(Comuna comuna : mapaComunas.getMapaComunas().values()){
                
                //Recorrer todos los locales de cada comuna
                for(LocalDeSufragio local : comuna.getLocales()){
                    //Escribir la información del local en el archivo
                    bwLocales.write(capitalize(comuna.getNombre()) + "," + capitalize(local.getNombre()) + "," + local.getCapacidadMax());
                    bwLocales.newLine(); // Añadir salto de línea
                    
                    //Escribir la información del votante en el archivo
                    for(Votante votante : local.getVotantes()){
                        //Escribir en el archivo en formato "run,nombre,comuna"
                        bwVotantes.write(votante.getRun() + "," + votante.getNombre() + "," + capitalize(votante.getComuna()));
                        bwVotantes.newLine(); // Agregar salto de línea
                    }
                }
            }
        } catch(IOException e){
            e.printStackTrace(); // Imprimir error si no se pueden escribir los archivos
        }
    }
    
    /**
     * Genera un reporte de votantes agrupados por locales de sufragio.
     * El reporte se guarda en un archivo de texto.
     * 
     * @param mapaComunas El mapa de comunas que contiene los locales y votantes.
     * @param archivoReporte El nombre del archivo donde se guardará el reporte.
     */
    public static void generarReporteVotantesPorLocal(MapaComunas mapaComunas, String archivoReporte) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoReporte))) {
            // Escribir el encabezado del reporte
        writer.write("*******************************************\n");
        writer.write("            REPORTE DE VOTANTES POR LOCAL            \n");
        writer.write("*******************************************\n");
        writer.write("Fecha: " + java.time.LocalDate.now() + "\n\n");

        // Recorrer cada comuna
        for (Comuna comuna : mapaComunas.getMapaComunas().values()) {
            writer.write("=========================================================\n");
            writer.write("              Comuna: " + capitalize(comuna.getNombre()) + "\n");
            writer.write("=========================================================\n\n");

            // Recorrer cada local de sufragio en la comuna
            for (LocalDeSufragio local : comuna.getLocales()) {
                writer.write("---------------------------------------------------------\n");
                writer.write("    Local de Sufragio: " + capitalize(local.getNombre()) + "\n");
                writer.write("---------------------------------------------------------\n");

                // Recorrer cada votante en el local
                for (Votante votante : local.getVotantes()) {
                    writer.write("        RUN: " + votante.getRun() + ", Nombre: " + votante.getNombre() + "\n");
                }

                writer.write("\n"); // Espacio entre locales
            }

            writer.write("\n\n"); // Espacio entre comunas
        }

        writer.write("*******************************************\n");
        writer.write("                Fin del reporte                \n");
        writer.write("*******************************************\n");

    } catch (IOException e) {
        e.printStackTrace(); // Imprimir error si no se puede escribir el reporte
        }
    }
    
    /**
     * Capitaliza la primera letra de una cadena, convirtiendo el resto a minúsculas.
     * 
     * @param str La cadena a capitalizar.
     * @return La cadena capitalizada.
     */
    public static String capitalize(String str) {
    if (str == null || str.isEmpty()) {
        return str; // Retornar la cadena tal como está si es nula o vacía
    }
    // Convierte la primera letra a mayúscula y el resto a minúscula
    return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
