package com.mycompany.mainproyecto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.IOException;

public class GestionArchivo {

    public static void asignarVotantesDesdeArchivo(String archivoVotantesURL, MapaComunas mapaComunas) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new URL(archivoVotantesURL).openStream()))) {
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

    public static void agregarLocalesDesdeArchivo(String archivoLocalesURL, MapaComunas mapaComunas) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new URL(archivoLocalesURL).openStream()))) {
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
}
