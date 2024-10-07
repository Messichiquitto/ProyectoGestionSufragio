package com.mycompany.mainproyecto.ClasesVentanas;

import com.mycompany.mainproyecto.ClasesException.VotanteExceptions;
import com.mycompany.mainproyecto.ClasesException.ComunaExceptions;
import com.mycompany.mainproyecto.Comuna;
import com.mycompany.mainproyecto.GestionArchivo;
import com.mycompany.mainproyecto.LocalDeSufragio;
import com.mycompany.mainproyecto.MapaComunas;
import com.mycompany.mainproyecto.Votante;
import com.mycompany.mainproyecto.Persona;
import com.mycompany.mainproyecto.VocalDeMesa;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Clase VentanaMain que representa la ventana principal del sistema de gestión de votantes.
 * Esta clase permite realizar diversas operaciones como agregar, modificar y eliminar votantes.
 */
public class VentanaMain extends JFrame {
    private MapaComunas mapaComunas;
    private static final String archivoLocales = "src/main/java/archivos/arLocales.csv";
    private static final String archivoVotantes = "src/main/java/archivos/arVotantes.csv";
    private static final String archivoReporte = "src/main/java/archivos/Reporte.txt";
    
    /**
     * Constructor de la clase VentanaMain.
     *
     * @param mapaComunas El mapa de comunas que contiene los votantes y locales.
     */
    public VentanaMain(MapaComunas mapaComunas) {
        this.mapaComunas = mapaComunas;
        List<Votante> votantesTotales = new ArrayList<Votante>();
        initComponents();
    }
    
   
    /**
     * Inicializa los componentes de la ventana.
     * Este método configura todos los elementos visuales y su comportamiento.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonEliminarVotante = new javax.swing.JButton();
        botonModificarVotante = new javax.swing.JButton();
        botonMostrarPorInicial = new javax.swing.JButton();
        botonMostrarTodosLosVotantes = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonAgregarVotantes = new javax.swing.JButton();
        BotonAsignarVocal = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        botonMostrarPorInicial.setText("Buscar por Comuna e Inicial de apellido");
        botonMostrarPorInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarPorInicialActionPerformed(evt);
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

        BotonAsignarVocal.setText("Asignar Vocal de Mesa");
        BotonAsignarVocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAsignarVocalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregarVotantes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonModificarVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonMostrarPorInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botonMostrarTodosLosVotantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                .addComponent(BotonAsignarVocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(19, 19, 19)))
                    .addComponent(jLabel1))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAgregarVotantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEliminarVotante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonModificarVotante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMostrarPorInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMostrarTodosLosVotantes)
                .addGap(5, 5, 5)
                .addComponent(BotonAsignarVocal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonSalir)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción realizada al presionar el botón para eliminar un votante.
     * Solicita el RUN del votante y la comuna y elimina al votante de la lista.
     *
     * @param evt El evento que ocurre al presionar el botón.
     */
    private void botonEliminarVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarVotanteActionPerformed
        try {
            //Funcionamiento del botón eliminar votantes
            String runInput = JOptionPane.showInputDialog(this, "Ingrese el RUN del votante:");
            
            //Verificar si el usuario cancela la operación
            if (runInput == null) {
                JOptionPane.showMessageDialog(this, "Operación cancelada.");
                return;
            }
            
            // Validar que el RUN ingresado tenga 9 caracteres
            if (runInput.length() != 9) {
                throw new VotanteExceptions(VotanteExceptions.getMensajeRutInvalido());
            }
            
            // Convertir el RUN ingresado a un número entero
            int run = Integer.parseInt(runInput);
            
            // Solicitar al usuario la comuna del votante a eliminar
            String comunaEliminar = JOptionPane.showInputDialog(this, "Ingrese la Comuna del votante a eliminar:");
            
            //Verificar si la comuna es válida
            Comuna comunaEliminarObj = mapaComunas.getComuna(comunaEliminar);
            if (comunaEliminarObj == null) {
                throw new ComunaExceptions(ComunaExceptions.getMensajeComunaNoEncontrada());
            }
            comunaEliminar = comunaEliminar.toLowerCase();
            
            //Solicitar el nombre del local
            String localEliminar = JOptionPane.showInputDialog(this, "Ingrese el nombre del local del votante a eliminar:");
            
            //Verificar si el local de sufragio es válido
            LocalDeSufragio localEliminarObj = comunaEliminarObj.buscarLocal(localEliminar);
            if (localEliminarObj == null) {
                throw new ComunaExceptions(ComunaExceptions.getMensajeErrorLocalNoEncontrado());
            }
            localEliminar = localEliminar.toLowerCase();
            
            // Intentar eliminar al votante y mostrar un mensaje de resultado
            if (localEliminarObj.eliminarVotante(run)) {
                JOptionPane.showMessageDialog(this, "Votante eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un votante con el RUN ingresado.");
            }
        } catch (NumberFormatException e) {
            // Manejar error de formato de número para el RUN
            JOptionPane.showMessageDialog(this, "El RUN ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (VotanteExceptions e) {
            // Manejar excepciones relacionadas con votantes
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ComunaExceptions e) {
            // Manejar excepciones relacionadas con comunas
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Manejar cualquier otro error inesperado
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarVotanteActionPerformed

    /**
     * Acción realizada al presionar el botón para modificar los datos de un votante.
     * Solicita el RUN del votante y otros datos para actualizar su información.
     *
     * @param evt El evento que ocurre al presionar el botón.
     */
    private void botonModificarVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarVotanteActionPerformed
        try {
            //Solicitar RUN del votante a modificar
            String runInput = JOptionPane.showInputDialog(this, "Ingrese el RUN del votante que quiere modificar:");
            
            // Verificar si el usuario cancela la operación
            if (runInput == null) {
                JOptionPane.showMessageDialog(this, "Operación cancelada");
                return;
            }
            
            // Validar que el RUN ingresado tenga 9 caracteres
            if (runInput.length() != 9) {
                throw new VotanteExceptions(VotanteExceptions.getMensajeRutInvalido());
            }
            
            // Convertir el RUN a número
            int runModificar = Integer.parseInt(runInput);
            
            //Solicitar la comuna actual
            String comunaActual = JOptionPane.showInputDialog(this, "Ingrese la comuna del votante:");
            if (comunaActual == null) {
                JOptionPane.showMessageDialog(this, "Operación cancelada");
                return;
            }
            comunaActual = comunaActual.toLowerCase(); // Convertir a minúsculas
            
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
                    localOrigen = local; // Guardar el local donde se encontró el votante
                    break;
                }
            }
            
            // Verificar si se encontró al votante
            if (votanteEncontrado == null) {
                throw new VotanteExceptions("Votante no encontrado con el RUN especificado dentro de la comuna.");
            }
            
            //Solicitar nuevos datos para modificar
            String nombreNuevo = JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre del votante:");
            if (nombreNuevo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se ingresó un nombre");
                return;
            }
            
            String comunaNueva = JOptionPane.showInputDialog(this, "Ingrese la nueva comuna:");
            if (comunaNueva.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se ingresó una comuna");
                return;
            }
            comunaNueva = comunaNueva.toLowerCase(); // Convertir a minúsculas
            
            String localNuevo = JOptionPane.showInputDialog(this, "Ingrese el nuevo local de sufragio del votante:");
            if (localNuevo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se ingresó un local");
                return;
            }
            localNuevo = localNuevo.toLowerCase(); // Convertir a minúsculas
            
            //Actualizar nombre/comuna del votante
            votanteEncontrado.setNombre(nombreNuevo);
            votanteEncontrado.setComuna(comunaNueva);
            
            //Eliminar al votante del local actual
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
            
            // Agregar al votante al nuevo local
            localDestino.agregarVotante(votanteEncontrado);
            JOptionPane.showMessageDialog(this, "Votante movido al nuevo local de sufragio en " + comunaNueva + ".");
            
        } catch (NumberFormatException e) {
            // Manejar error de formato de número para el RUN
            JOptionPane.showMessageDialog(this, "El RUN ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (VotanteExceptions e) {
            // Manejar excepciones relacionadas con votantes
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ComunaExceptions e) {
            // Manejar excepciones relacionadas con comunas
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Manejar cualquier otro error inesperado
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " +e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonModificarVotanteActionPerformed

    /**
     * Acción realizada al presionar el botón para mostrar votantes de una comuna filtrados por la letra inicial de su apellido.
     * Solicita el nombre de la comuna y la letra inicial del apellido para mostrar los votantes que cumplen con esos criterios.
     *
     * @param evt El evento que ocurre al presionar el botón.
     */
    private void botonMostrarPorInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarPorInicialActionPerformed
        try {
            //Pedir nombre de la comuna
            String comunaMostrar = JOptionPane.showInputDialog(this, "Ingrese el nombre de la comuna para mostrar los votantes:");
            
            
            // Verificar si el usuario cancela la operación o deja el campo vacío
            if (comunaMostrar == null || comunaMostrar.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Operación cancelada");
                return;
            }
            
            // Pedir la letra para filtrar los apellidos
            String letraStr = JOptionPane.showInputDialog(this, "Ingrese la letra inicial del apellido para filtrar:");
            if (letraStr == null || letraStr.length() != 1) {
                JOptionPane.showMessageDialog(this, "Operación cancelada o entrada inválida");
                return;
            }
            char letra = letraStr.toLowerCase().charAt(0); // Convertir a minúscula para evitar problemas de mayúsculas/minúsculas
            
            // Verificar si la comuna existe
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
                for (Votante votante : votantes) {
                    // Verificar si el apellido del votante comienza con la letra ingresada
                    if (!votante.getNombre(letra).isEmpty() && !votantesTotales.contains(votante)) {
                        votantesTotales.add(votante); // Agregar votante a la lista
                    }
                }
            }
            
            
            //Crear JTable para así mostrar los votantes
            String [] columnNames = {"Run", "Nombre"};
            Object[][] data = new Object[votantesTotales.size()][2];
            
            // Llenar la tabla con los datos de los votantes
            for (int i = 0 ; i < votantesTotales.size() ; i++) {
                data[i][0] = votantesTotales.get(i).getRun(); // Obtener RUN
                data[i][1] = votantesTotales.get(i).getNombre(); // Obtener nombre
            }
            
            JTable tabla = new JTable(data, columnNames); // Crear la tabla
            JScrollPane scrollPane = new JScrollPane(tabla); // Crear un JScrollPane para la tabla
            
            //Mostrar la JTable
            JOptionPane.showMessageDialog(this, scrollPane, "Votantes de la Comuna: " + GestionArchivo.capitalize(comunaMostrar), JOptionPane.PLAIN_MESSAGE);
            
        } catch (ComunaExceptions e) {
            // Manejar excepciones relacionadas con comunas
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Manejar cualquier otro error inesperado
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonMostrarPorInicialActionPerformed

    /**
     * Acción realizada al presionar el botón para mostrar todos los votantes de todas las comunas.
     * Si no hay comunas disponibles, se lanza una excepción. 
     * Los votantes se muestran en una tabla dentro de un JOptionPane.
     *
     * @param evt El evento que ocurre al presionar el botón.
     */
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
                    List<Votante> votantes = local.getVotantes(); // Obtener votantes del local
                    todosLosVotantes.addAll(votantes); // Agregar votantes a la lista total
                }
            }
            
            
            
            //Crear JTable para mostrar todos los votantes
            String[] columnNames = {"RUN", "Nombre"}; // Nombres de las columnas
            Object[][] data = new Object[todosLosVotantes.size()][2]; // Crear matriz de datos
            
            // Llenar la matriz de datos con información de los votantes
            for (int i = 0 ; i < todosLosVotantes.size() ; i++) {
                data[i][0] = todosLosVotantes.get(i).getRun(); // Obtener RUN
                data[i][1] = todosLosVotantes.get(i).getNombre(); // Obtener nombre
            }
            
            JTable table = new JTable(data, columnNames); // Crear la tabla
            JScrollPane scrollPane = new JScrollPane(table); // Crear un JScrollPane para la tabla
            
            //Mostrar el JTable en un JOptionPane
            JOptionPane.showMessageDialog(this, scrollPane, "Todos los Votantes", JOptionPane.PLAIN_MESSAGE);
            
        } catch (ComunaExceptions e) {
            // Manejar excepciones relacionadas con comunas
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Manejar cualquier otro error inesperado
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonMostrarTodosLosVotantesActionPerformed

    /**
     * Acción realizada al presionar el botón de salir de la aplicación.
     * Se solicita confirmación al usuario antes de cerrar la aplicación.
     * Se guarda la información de votantes y locales antes de salir.
     *
     * @param evt El evento que ocurre al presionar el botón.
     */
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
            // Manejo de excepciones en caso de un error de puntero nulo
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Manejar cualquier otro error inesperado
            JOptionPane.showMessageDialog(this, "Ocurrió un error al salir: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonSalirActionPerformed

    /**
     * Acción realizada al presionar el botón para agregar votantes.
     * Solicita los datos del votante y los registra en el sistema,
     * verificando que el RUN no esté duplicado.
     *
     * @param evt El evento que ocurre al presionar el botón.
     */
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
        
        // Verificar si el votante ya está registrado en algún local
        for (Comuna comuna : mapaComunas.getMapaComunas().values()) {
            for (LocalDeSufragio local : comuna.getLocales()) {
                if(local.votanteYaRegistrado(run)){
                    JOptionPane.showMessageDialog(this, "El RUN ya está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
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
        // Manejo de excepciones específicas de argumento ilegal
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        // Manejo de cualquier otro error inesperado
        JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_botonAgregarVotantesActionPerformed

    /**
     * Acción realizada al presionar el botón para asignar un vocal de mesa o votante.
     * Solicita los datos del votante y crea un objeto correspondiente según la elección del usuario.
     *
     * @param evt El evento que ocurre al presionar el botón.
     */
    private void BotonAsignarVocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAsignarVocalActionPerformed
        try {
            // Solicitar el RUN del votante
            String runInput = JOptionPane.showInputDialog(this, "Ingrese el RUN del votante: ");
            if (runInput == null || runInput.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Operación cancelada o RUN no proporcionado");
                return;
            }
            
            // Verificar la longitud del RUN
            if (runInput.length() != 9) {
                 throw new VotanteExceptions(VotanteExceptions.getMensajeRutInvalido());
            }
            
            int run;
            try{
                run = Integer.parseInt(runInput); // Validar si es un número              
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "El RUN debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Solicitar nombre del votante
            String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del votante:");
            if (nombre == null || nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Operación cancelada o nombre no proporcionado");
                return;
            }
            nombre = nombre.toLowerCase(); // Convertir a minúscula
            
            // Solicitar la comuna del votante
            String comuna = JOptionPane.showInputDialog(this, "Ingrese la comuna del votante:");            
            if (comuna == null || comuna.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Operación cancelada o comuna no proporcionada");
                return;
            }
            comuna = comuna.toLowerCase(); // Convertir a minúscula
            
            // Verificar si la comuna existe
            Comuna comunaOrigen = mapaComunas.getComuna(comuna);
            if (comunaOrigen == null){
                throw new ComunaExceptions(ComunaExceptions.getMensajeComunaNoEncontrada());
            }
            
            // Preguntar al usuario si desea asignar vocal de mesa
            int respuestaVocal = JOptionPane.showConfirmDialog(this, "¿Asignar Vocal de Mesa?", "Vocal de Mesa", JOptionPane.YES_NO_OPTION);
            boolean esVocal = (respuestaVocal == JOptionPane.YES_OPTION);
            
            // Crear objeto correspondiente según la elección
            Persona persona;
            if(esVocal){
                persona = new VocalDeMesa(run, nombre, comuna, esVocal);
            }else{
                persona = new Votante(run, nombre, comuna);
            }
            
            // Mostrar mensaje con la acción realizada
            JOptionPane.showMessageDialog(this, persona.realizarAccion());
        }catch(Exception e){
            // Manejo de cualquier error inesperado
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonAsignarVocalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAsignarVocal;
    private javax.swing.JButton botonAgregarVotantes;
    private javax.swing.JButton botonEliminarVotante;
    private javax.swing.JButton botonModificarVotante;
    private javax.swing.JButton botonMostrarPorInicial;
    private javax.swing.JButton botonMostrarTodosLosVotantes;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
