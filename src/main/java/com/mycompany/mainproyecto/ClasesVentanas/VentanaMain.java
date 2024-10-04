package com.mycompany.mainproyecto;

import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class VentanaMain extends JFrame {
    private MapaComunas mapaComunas;
    private String archivoLocales;
    private String archivoVotantes;
    private String archivoReporte;
    
    public VentanaMain(MapaComunas mapaComunas) {
        this.mapaComunas = mapaComunas;
        this.archivoLocales = archivoLocales;
        this.archivoVotantes = archivoVotantes;
        this.archivoReporte = archivoReporte;
        List<Votante> votantesTotales = new ArrayList<Votante>();
        initComponents();
        initListeners();
    }
    
    private void initListeners() {
        botonAgregarVotantes.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarVotantesActionPerformed(evt);
            }
        });
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAgregarVotantes = new javax.swing.JButton();
        botonEliminarVotante = new javax.swing.JButton();
        botonModificarVotante = new javax.swing.JButton();
        botonMostrarVotantesComuna = new javax.swing.JButton();
        botonMostrarTodosLosVotantes = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonAgregarVotantes.setText("1.- Agregar Votantes");
        botonAgregarVotantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarVotantesActionPerformed(evt);
            }
        });

        botonEliminarVotante.setText("2.- Eliminar Votante");
        botonEliminarVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarVotanteActionPerformed(evt);
            }
        });

        botonModificarVotante.setText("3.- Modificar Votante");
        botonModificarVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarVotanteActionPerformed(evt);
            }
        });

        botonMostrarVotantesComuna.setText("4.- Mostrar Votantes de una Comuna");
        botonMostrarVotantesComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarVotantesComunaActionPerformed(evt);
            }
        });

        botonMostrarTodosLosVotantes.setText("5.- Mostrar todos los Votantes");
        botonMostrarTodosLosVotantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarTodosLosVotantesActionPerformed(evt);
            }
        });

        botonSalir.setText("6.- Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Sistema de Gestión de Votantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(botonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botonModificarVotante)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(botonAgregarVotantes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(botonEliminarVotante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(botonMostrarVotantesComuna, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botonMostrarTodosLosVotantes)
                                .addGap(17, 17, 17)))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(botonAgregarVotantes)
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
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarVotantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarVotantesActionPerformed
        try {
            //Solicitar el RUN del votante
            String runInput = JOptionPane.showInputDialog(this, "Ingrese el RUN del votante:");
            
            //Si se cancela la operación...
            if (runInput == null) {
                JOptionPane.showMessageDialog(this, "Operación cancelada");
                return; //Sale del método para no continuar
            }
            
            //Validar que el RUN no esté vacío
            if (runInput.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El RUN debe ser rellenado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            int run = Integer.parseInt(runInput);
            
            //Solicitar nombre del votante
            String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del votante:");
            
            //Si se cancela la operación...
            if (nombre == null) {
                JOptionPane.showMessageDialog(this, "Operación cancelada");
                return;
            }

            if (nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El nombre debe ser rellenado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Solicitar la comuna del votante
            String comuna = JOptionPane.showInputDialog(this, "Ingrese la comuna del votante:");
            
            //Si se cancela la operación...
            if (comuna == null) {
                JOptionPane.showMessageDialog(this, "Operación cancelada");
                return;
            }
            
            //Validar que la comuna no esté vacía
            if (comuna.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El comuna debe ser rellenada.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Crear un nuevo votante y asignarlo a la comuna correspondiente
            Votante nuevoVotante = new Votante(run, nombre, comuna);
            mapaComunas.asignarVotante(nuevoVotante);
            JOptionPane.showMessageDialog(this, "Votante agregado exitosamente.");
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El RUN ingresado no es válido. Debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAgregarVotantesActionPerformed

    private void botonEliminarVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarVotanteActionPerformed
        try {
            //Funcionamiento del botón eliminar votantes
            String runInput = JOptionPane.showInputDialog(this, "Ingrese el RUT del votante:");
            
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
            
            //Verificar si la comuna es válida
            Comuna comunaEliminarObj = mapaComunas.getComuna(comunaEliminar);
            if (comunaEliminarObj == null) {
                throw new ComunaExceptions(ComunaExceptions.getMensajeComunaNoEncontrada());
            }
            
            //Solicitar el nombre del local
            String localEliminar = JOptionPane.showInputDialog(this, "Ingrese el nombre del local del votante a eliminar:");
            
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
            JOptionPane.showMessageDialog(this, "El RUT ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showInputDialog(this, "Operación cancelada");
                return;
            }
            
            //Si la comuna existe
            Comuna comunaMostrarObj = mapaComunas.getComuna(comunaMostrar);
            if (comunaMostrarObj == null) {
                throw new ComunaExceptions(ComunaExceptions.getMensajeComunaNoEncontrada());
            }
            
            //Obtener la lista de locales de sufragio
            List<LocalDeSufragio> locales = comunaMostrarObj.getLocales();
            if (locales.isEmpty()) {
                JOptionPane.showInputDialog(this, "No hay locales en la comuna " + comunaMostrar);
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
            JOptionPane.showInputDialog(this, scrollPane, "Votantes de la Comuna: " + comunaMostrar, JOptionPane.PLAIN_MESSAGE);
            
        } catch (ComunaExceptions e) {
            JOptionPane.showInputDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showInputDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
                System.out.println("Saliendo...");
                
                //Se llama al método de reescribir archivos antes de salir
                GestionArchivo.guardarDatos(archivoLocales, archivoVotantes, mapaComunas);
                GestionArchivo.generarReporteVotantesPorLocal(mapaComunas, archivoReporte);
                
                System.out.println("Saliendo de la gestión...");
                System.exit(0); //Termina la aplicación
                
            } else {
                System.out.println("Operación de salida cancelada");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al salir: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonSalirActionPerformed


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
