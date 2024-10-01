package com.mycompany.mainproyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class GestionArchivo {

    public static void asignarVotantesDesdeArchivo(String archivoVotantes, MapaComunas mapaComunas) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoVotantes))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Para formato "run,nombre,comuna"
                String[] datosVotante = linea.split(",");
                int run = Integer.parseInt(datosVotante[0]);
                String nombre = datosVotante[1];
                String comuna = datosVotante[2];
                
                Votante votante = new Votante(run, nombre, comuna);
                mapaComunas.asignarVotante(votante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void agregarLocalesDesdeArchivo(String archivoLocales, MapaComunas mapaComunas) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoLocales))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Para formato "NombreComuna,LocalNombre,CapacidadMax"
                String[] datosLocal = linea.split(",");
                String nombreComuna = datosLocal[0];
                String nombreLocal = datosLocal[1];
                int capacidadMax = Integer.parseInt(datosLocal[2].trim());
                
                LocalDeSufragio local = new LocalDeSufragio(nombreLocal, nombreComuna, capacidadMax);
                
                // Obtener la comuna desde el mapa, o crear una nueva si no existe
                Comuna comuna = mapaComunas.getComuna(nombreComuna);
                if (comuna == null) {
                    // Si la comuna no existe, crear una nueva comuna con una lista vacía de locales
                    comuna = new Comuna(nombreComuna);
                    mapaComunas.addComuna(comuna);
                }

                // Agregar el local a la comuna
                comuna.addLocal(local);
                System.out.println("Local " + nombreLocal + " agregado a la comuna " + nombreComuna);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void guardarDatos(String archivoLocales, String archivoVotantes, MapaComunas mapaComunas){
        try (BufferedWriter bwLocales = new BufferedWriter(new FileWriter(archivoLocales));
         BufferedWriter bwVotantes = new BufferedWriter(new FileWriter(archivoVotantes))) {
            //Recorrer todas las comuna
            for(Comuna comuna : mapaComunas.getMapaComunas().values()){
                //Recorrer todos los locales
                for(LocalDeSufragio local : comuna.getLocales()){
                    //Guardar la información del local
                    bwLocales.write(comuna.getNombre() + "," + local.getNombre() + "," + local.getCapacidadMax());
                    bwLocales.newLine(); // Añadir salto de línea
                    
                    //Guardar la información del votante
                    for(Votante votante : local.getVotantes()){
                        //Escribir en el archivo el formato "run,nombre,comuna"
                        bwVotantes.write(votante.getRun() + "," + votante.getNombre() + "," + votante.getComuna());
                        bwVotantes.newLine(); // Agregar salto de línea
                    }
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
