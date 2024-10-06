package com.mycompany.mainproyecto.ClasesVentanas;

import com.mycompany.mainproyecto.ClasesException.VotanteExceptions;
import com.mycompany.mainproyecto.ClasesException.ComunaExceptions;
import com.mycompany.mainproyecto.Comuna;
import com.mycompany.mainproyecto.GestionArchivo;
import com.mycompany.mainproyecto.LocalDeSufragio;
import com.mycompany.mainproyecto.MapaComunas;
import com.mycompany.mainproyecto.Votante;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class VentanaMain extends JFrame {
    private MapaComunas mapaComunas;
    private static final String archivoLocales = "src/main/java/archivos/arLocales.csv";
    private static final String archivoVotantes = "src/main/java/archivos/arVotantes.csv";
    private static final String archivoReporte = "src/main/java/archivos/Reporte.txt";
    
    public VentanaMain(MapaComunas mapaComunas) {
        this.mapaComunas = mapaComunas;
        List<Votante> votantesTotales = new ArrayList<Votante>();
        initComponents();
    }
    
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonEliminarVotante = new javax.swing.JButton();
        botonModificarVotante = new javax.swing.JButton();
        botonMostrarVotantesComuna = new javax.swing.JButton();
        botonMostrarTodosLosVotantes = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonAgregarVotantes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonEliminarVotante.setText("Eliminar Votante");
        botonEliminarVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarVotanteActionPerformed(evt);
            }
        });

        botonModificarVotante.setText("Modificar Votante");
        botonModificarVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarVotanteActionPerformed(evt);
            }
        });

        botonMostrarVotantesComuna.setText("Mostrar Votantes de una Comuna");
        botonMostrarVotantesComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarVotantesComunaActionPerformed(evt);
            }
        });

        botonMostrarTodosLosVotantes.setText("Mostrar todos los Votantes");
        botonMostrarTodosLosVotantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarTodosLosVotantesActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Gestión de Votantes");

        botonAgregarVotantes.setText("Agregar Votante");
        botonAgregarVotantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarVotantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregarVotantes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonModificarVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonMostrarVotantesComuna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMostrarTodosLosVotantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAgregarVotantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEliminarVotante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonModificarVotante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonMostrarVotantesComuna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonMostrarTodosLosVotantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonSalir)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonEliminarVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarVotanteActionPerformed
        try {
            //Funcionamiento del botón eliminar votantes
            String runInput = JOptionPane.showInputDialog(this, "Ingrese el RUN del votante:");
            
            //Verificar si el usuario cancela la operación
            if (runInput == null) {
                JOptionPane.showMessageDialog(this, "Operación cancelada.");
                return;
            }
            
            if (runInput.length() != 9) {
                throw new VotanteExceptions(VotanteExceptions.getMensajeRutInvalido());
            }
            
            int run = Integer.parseInt(runInput);
            
            //Solicitar la comuna
            String comunaEliminar = JOptionPane.showInputDialog(this, "Ingrese la Comuna del votante a eliminar:");
            comunaEliminar = comunaEliminar.toLowerCase();
            
            //Verificar si la comuna es válida
            Comuna comunaEliminarObj = mapaComunas.getComuna(comunaEliminar);
            if (comunaEliminarObj == null) {
                throw new ComunaExceptions(ComunaExceptions.getMensajeComunaNoEncontrada());
            }
            
            //Solicitar el nombre del local
            String localEliminar = JOptionPane.showInputDialog(this, "Ingrese el nombre del local del votante a eliminar:");
            localEliminar = localEliminar.toLowerCase();
            //Verificar si el local de sufragio es válido
            LocalDeSufragio localEliminarObj = comunaEliminarObj.buscarLocal(localEliminar);
            if (localEliminarObj == null) {
                throw new ComunaExceptions(ComunaExceptions.getMensajeErrorLocalNoEncontrado());
            }
            
            if (localEliminarObj.eliminarVotante(run)) {
                JOptionPane.showMessageDialog(this, "Votante eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un votante con el RUN ingresado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El RUN ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (VotanteExceptions e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ComunaExceptions e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarVotanteActionPerformed

    private void botonModificarVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarVotanteActionPerformed
        try {
            //Solicitar RUT del votante a modificar
            String runInput = JOptionPane.showInputDialog(this, "Ingrese el RUN del votante que quiere modificar:");
            
            //Si se cancela la operación...
            if (runInput == null) {
                JOptionPane.showMessageDialog(this, "Operación cancelada");
                return;
            }
            
            //Validar el RUT
            if (runInput.length() != 9) {
                throw new VotanteExceptions(VotanteExceptions.getMensajeRutInvalido());
            }
            
            int runModificar = Integer.parseInt(runInput);
            
            //Solicitar la comuna actual
            String comunaActual = JOptionPane.showInputDialog(this, "Ingrese la comuna del votante:");
            comunaActual = comunaActual.toLowerCase();
            
            //Buscar la comuna dentro del mapa
            Comuna comunaOrigen = mapaComunas.getComuna(comunaActual);
            if (comunaOrigen == null) {
                throw new ComunaExceptions(ComunaExceptions.getMensajeComunaNoEncontrada());
            }
            
            //Buscar al votante en la comuna y local
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
                throw new VotanteExceptions("Votante no encontrado con el RUN especificado dentro de la comuna.");
            }
            
            //Solicitar nuevos datos para modificar
            String nombreNuevo = JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre del votante:");
            String comunaNueva = JOptionPane.showInputDialog(this, "Ingrese la nueva comuna:");
            String localNuevo = JOptionPane.showInputDialog(this, "Ingrese el nuevo local de sufragio del votante:");
            
            comunaNueva = comunaNueva.toLowerCase();
            localNuevo = localNuevo.toLowerCase();
            //Actualizar nombre/comuna del votante
            votanteEncontrado.setNombre(nombreNuevo);
            votanteEncontrado.setComuna(comunaNueva);
            
            //Eliminar del local actual
            localOrigen.eliminarVotante(runModificar);
            
            //Asignar al nuevo local
            Comuna comunaDestino = mapaComunas.getComuna(comunaNueva);
            if (comunaDestino == null) {
                throw new ComunaExceptions("No se pudo encontrar la nueva comuna.");
            }
            
            LocalDeSufragio localDestino = comunaDestino.buscarLocal(localNuevo);
            if (localDestino == null) {
                throw new ComunaExceptions("No se pudo agregar al votante al nuevo local.");
            }
            
            localDestino.agregarVotante(votanteEncontrado);
            JOptionPane.showMessageDialog(this, "Votante movido al nuevo local de sufragio en " + comunaNueva + ".");
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El RUN ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (VotanteExceptions e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ComunaExceptions e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " +e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonModificarVotanteActionPerformed

    private void botonMostrarVotantesComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarVotantesComunaActionPerformed
        try {
            //Pedir nombre de la comuna
            String comunaMostrar = JOptionPane.showInputDialog(this, "Ingrese el nombre de la comuna para mostrar los votantes:");
            
            
            //Si se cancela la operación...
            if (comunaMostrar == null) {
                JOptionPane.showMessageDialog(this, "Operación cancelada");
                return;
            }
            
            //Si la comuna existe
            comunaMostrar = comunaMostrar.toLowerCase();
            Comuna comunaMostrarObj = mapaComunas.getComuna(comunaMostrar);
            if (comunaMostrarObj == null) {
                throw new ComunaExceptions(ComunaExceptions.getMensajeComunaNoEncontrada());
            }
            
            //Obtener la lista de locales de sufragio
            List<LocalDeSufragio> locales = comunaMostrarObj.getLocales();
            if (locales.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay locales en la comuna " + comunaMostrar);
                return;
            }
            
            //Lista para almacenar los datos de votantes
            List<Votante> votantesTotales = new ArrayList<>();
            
            //Recorrer los locales y obtener los votantes
            for (LocalDeSufragio local : locales) {
                List<Votante> votantes = local.getVotantes();
                votantesTotales.addAll(votantes);
            }
            
            //Crear JTable para así mostrar los votantes
            String [] columnNames = {"Run", "Nombre"};
            Object[][] data = new Object[votantesTotales.size()][2];
            
            for (int i = 0 ; i < votantesTotales.size() ; i++) {
                data[i][0] = votantesTotales.get(i).getRun();
                data[i][1] = votantesTotales.get(i).getNombre();
            }
            
            JTable tabla = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane(tabla);
            
            //Mostrar la JTable
            JOptionPane.showMessageDialog(this, scrollPane, "Votantes de la Comuna: " + GestionArchivo.capitalize(comunaMostrar), JOptionPane.PLAIN_MESSAGE);
            
        } catch (ComunaExceptions e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonMostrarVotantesComunaActionPerformed

    private void botonMostrarTodosLosVotantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarTodosLosVotantesActionPerformed
        try {
            //Verificar si el mapa de Comunas está vacío
            if (mapaComunas.getMapaComunas().isEmpty()) {
                throw new ComunaExceptions("No hay comunas disponibles en el mapa.");
            }
            
            //Lista para guardar a todos los votantes
            List<Votante> todosLosVotantes = new ArrayList<>();
            
            //Recorrer todas las comunas del objeto mapaComunas
            for (Comuna comuna : mapaComunas.getMapaComunas().values()) {
                //Recorrer todos los locales de las comunas
                for (LocalDeSufragio local : comuna.getLocales()) {
                    List<Votante> votantes = local.getVotantes();
                    todosLosVotantes.addAll(votantes);
                }
            }
            
            //Crear JTable para mostrar todos los votantes
            String[] columnNames = {"RUN", "Nombre"};
            Object[][] data = new Object[todosLosVotantes.size()][2];
            
            for (int i = 0 ; i < todosLosVotantes.size() ; i++) {
                data[i][0] = todosLosVotantes.get(i).getRun();
                data[i][1] = todosLosVotantes.get(i).getNombre();
            }
            
            JTable table = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane(table);
            
            //Mostrar el JTable en un JOptionPane
            JOptionPane.showMessageDialog(this, scrollPane, "Todos los Votantes", JOptionPane.PLAIN_MESSAGE);
            
        } catch (ComunaExceptions e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonMostrarTodosLosVotantesActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        try {
            //Mensaje para confirmar si desea salir
            int confirmar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea salir?", "Confirmar Salida", JOptionPane.YES_NO_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                
                //Se llama al método de reescribir archivos antes de salir
                GestionArchivo.guardarDatos(archivoLocales, archivoVotantes, mapaComunas);
                GestionArchivo.generarReporteVotantesPorLocal(mapaComunas, archivoReporte);
                
                System.exit(0); //Termina la aplicación
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al salir: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonAgregarVotantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarVotantesActionPerformed
        try {
        // Solicitar el RUN del votante
        String runInput = JOptionPane.showInputDialog(this, "Ingrese el RUN del votante: ");
        
        // Si se cancela la operación o el RUN es vacío
        if (runInput == null || runInput.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Operación cancelada o RUN no proporcionado");
            return; // Sale del método para no continuar
        }

        int run;
        try {
            run = Integer.parseInt(runInput); // Validar si es un número
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El RUN debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Solicitar nombre del votante
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del votante:");

        // Si se cancela la operación o el nombre es vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Operación cancelada o nombre no proporcionado");
            return; // Sale del método para no continuar
        }

        // Solicitar la comuna del votante
        String comuna = JOptionPane.showInputDialog(this, "Ingrese la comuna del votante:");
        comuna = comuna.toLowerCase();
        
        // Si se cancela la operación o la comuna es vacía
        if (comuna == null || comuna.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Operación cancelada o comuna no proporcionada");
            return; // Sale del método para no continuar
        }

        // Agregar el votante al sistema
        Votante nuevoVotante = new Votante(run, nombre, comuna);
        if(mapaComunas.asignarVotante(nuevoVotante))
            JOptionPane.showMessageDialog(this, "Votante agregado exitosamente.");
        else
            JOptionPane.showMessageDialog(this, "Votante NO se pudo agregar.");
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_botonAgregarVotantesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarVotantes;
    private javax.swing.JButton botonEliminarVotante;
    private javax.swing.JButton botonModificarVotante;
    private javax.swing.JButton botonMostrarTodosLosVotantes;
    private javax.swing.JButton botonMostrarVotantesComuna;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
