/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import DE.DynamicTable;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;

/**
 *
 * @author Alejandro
 */
public class ControladorMedico {
    private VentanaMedico ventana;

    public ControladorMedico() throws SQLException {
        ventana = new VentanaMedico();
        ventana.getSpbHistoriaPaciente().setOnAction(new EventoSPHistoriaPaciente());
        ventana.getBtnMostrarDirecciones().setOnAction(new EventoTestVista());
        ventana.getSPBEntregaOR().setOnAction(new EventoSPEntregaOR());
        ventana.getBtnCerrarSesion().setOnAction(new EventoCerrarSesion());
        ventana.getSPBCompletarEv().setOnAction(new EventoSPCompletarEv());
        ventana.getSPBHoraMuerte().setOnAction(new EventoHoraMuerte());
        
        
        ventana.getSPBRegTrat().setOnAction(new EventoRegTrat());
        ventana.getSPBSalidaPac().setOnAction(new EventoSalidaPac());
        ventana.getSPBIngresarNuPac().setOnAction(new EventoIngresarNuPac());
    }
    
    public void mostrarVista () throws SQLException {
        Singleton singleton = Singleton.getSingleton();
        
        ventana.setUsername("Username: " + singleton.getConexion().getMetaData().getUserName());
        
        ventana.getScene().setCursor(Cursor.DEFAULT);
        Connection c = singleton.getConexion();
        ResultSet rs = c.createStatement().executeQuery("SELECT table_name FROM information_schema.tables WHERE table_schema='urgencias2'");
        //ResultSet rs = c.createStatement().executeQuery("show procedure status where Db = 'urgencias2'");
        while (rs.next()){
            ventana.getChoiceBox().getItems().add(rs.getString(1));
        }
        
        rs = c.createStatement().executeQuery("show procedure status where Db = 'urgencias2'");
        while (rs.next()){
            String procName = rs.getString(2);
            switch (procName){
                case "historiaPaciente":
//                    ventana.getVboxspHistoriaPaciente().setVisible(true);
//                    ventana.getVboxspHistoriaPaciente().setManaged(true);
                    ventana.getTabPane().getTabs().add(ventana.getTabSPHistoriaPaciente());
                    break;
                case "proc_entregarOR":
//                    ventana.getVboxSPEntregarOR().setVisible(true);
//                    ventana.getVboxSPEntregarOR().setManaged(true);
                    ventana.getTabPane().getTabs().add(ventana.getTabSPEntregarOR());
                    break;
                case "proc_completarEval":
                    ventana.getTabPane().getTabs().add(ventana.getTabSPCompletarEv());
                    break;
                case "proc_horaMuerte":
                    ventana.getTabPane().getTabs().add(ventana.getTabSPHoraMuerte());
                    break;
                case "proc_ingresarNuPac":
                    ventana.getTabPane().getTabs().add(ventana.getTabSPIngresarNuPac());
                    break;
                case "proc_invout":
                    ventana.getTabPane().getTabs().add(ventana.getTabSPInvout());
                    break;
                case "proc_misPacientes":
                    ventana.getTabPane().getTabs().add(ventana.getTabSPMisPac());
                    break;
                case "proc_nuevaDir":
                    ventana.getTabPane().getTabs().add(ventana.getTabSPNuevaDir());
                    break;
                case "proc_personaNuDir":
                    ventana.getTabPane().getTabs().add(ventana.getTabSPPersonaNuDir());
                    break;
                case "proc_personaOlDir":
                    ventana.getTabPane().getTabs().add(ventana.getTabSPPersonaOlDir());
                    break; 
                case "proc_regIngreso":
                    ventana.getTabPane().getTabs().add(ventana.getTabSPRegIngreso());
                    break;
                case "proc_regNuEval":
                    ventana.getTabPane().getTabs().add(ventana.getTabSPRegNuEval());
                    break;
                case "proc_regTratamiento":
                    ventana.getTabPane().getTabs().add(ventana.getTabSPRegTrat());
                    break;
                case "proc_salidaPac":
                    ventana.getTabPane().getTabs().add(ventana.getTabSPSalidaPac());
                    break;
            }
        }
        
        this.ventana.mostrar(singleton.getStage());
    }
    
    class EventoTestVista implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            Singleton singleton = Singleton.getSingleton();
            Connection conexion = singleton.getConexion();
//            Statement st;
//            ResultSet rs;
            try {
//                st = conexion.createStatement();
//                rs = st.executeQuery("select * from vw_direcciones");
//                while (rs.next()){
//                    System.out.println(rs.getInt("dir_id") + "\t" + rs.getString("Direccion"));
//                }
                DynamicTable dT = new DynamicTable();
                dT.buildData(ventana.getTable(), conexion, "select * from " + (String)ventana.getChoiceBox().getValue());
            } catch (Exception ex) {
                Logger.getLogger(ControladorMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    class EventoCerrarSesion implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            Singleton singleton = Singleton.getSingleton();
            Connection conexion = singleton.getConexion();
            try {
                conexion.close();
                System.out.println("Cerrar conexion... OK");
            } catch (SQLException ex) {
                System.out.println("Imposible cerrar conexion ... FAIL");
            } catch (NullPointerException ex){
                System.out.println("No existe la conexion ... FAIL");
            }
            
            ControladorLogin login;
            try {
                login = new ControladorLogin();
                login.mostrarVista();
            } catch (IOException ex) {
                Logger.getLogger(ControladorMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    class EventoSPHistoriaPaciente implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            Singleton sintleton = Singleton.getSingleton();
            DynamicTable dT = new DynamicTable();
            dT.buildData(ventana.getSptHistoriaPaciente(),sintleton.getConexion(), "call historiaPaciente(" + ventana.getSppHistoriaPaciente().getText() + ")");
        }
    }
    
    class EventoSPEntregaOR implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            Singleton singleton = Singleton.getSingleton();
            Connection conexion = singleton.getConexion();
            try {
                conexion.createStatement().executeQuery("call proc_entregarOR(" + ventana.getSPP1EntregaOR().getText() + "," + ventana.getSPP2EntregaOR().getText() + ")");
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }
    
    class EventoSPCompletarEv implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            Singleton singleton = Singleton.getSingleton();
            Connection conexion = singleton.getConexion();
            try {
                conexion.createStatement().executeQuery("call proc_completarEval(" + ventana.getSPPCompletarEv().getText() + ")");
                ventana.getSPEMCompletarEv().setVisible(false);
                ventana.getSPEMCompletarEv().setManaged(false);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMedico.class.getName()).log(Level.SEVERE, null, ex);
                ventana.getSPEMCompletarEv().setVisible(true);
                ventana.getSPEMCompletarEv().setManaged(true);
            }
        }
    }
    
    class EventoHoraMuerte implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            Singleton singleton = Singleton.getSingleton();
            Connection conexion = singleton.getConexion();
            try {
                conexion.createStatement().executeQuery("call proc_horaMuerte(" + ventana.getSPP1HoraMuerte().getText() + ",'" + ventana.getSPP2HoraMuerte().getText() + "')");
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    class EventoRegTrat implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            Singleton singleton = Singleton.getSingleton();
            Connection conexion = singleton.getConexion();
            try {
                ResultSet rs = conexion.createStatement().executeQuery("call proc_regTratamiento(" + ventana.getSPP1RegTrat().getText() + "," + ventana.getSPP2RegTrat().getText() + "," +
                        ventana.getSPP3RegTrat().getText() + "," + ventana.getSPP4RegTrat().getText() + "," + ventana.getSPP5RegTrat().getText() + "," + ventana.getSPP6RegTrat().getText() + "," +
                        ventana.getSPP7RegTrat().getText() + "," + ventana.getSPP8RegTrat().getText() + "," + ventana.getSPP9RegTrat().getText() + ",'" + ventana.getSPP10RegTrat().getText() + "'," +
                        ventana.getSPP11RegTrat().getText() + "," + ventana.getSPP12RegTrat().getText() + "," + ventana.getSPP13RegTrat().getText() + "," + ventana.getSPP14RegTrat().getText() + ")");
                ventana.getSPEMRegTrat().setVisible(false);
                ventana.getSPEMRegTrat().setManaged(false);
                while (rs.next()){
                    ventana.getSPEMRegTrat().setVisible(true);
                    ventana.getSPEMRegTrat().setManaged(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    class EventoSalidaPac implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            Singleton singleton = Singleton.getSingleton();
            Connection conexion = singleton.getConexion();
            try {
                conexion.createStatement().executeQuery("call proc_salidaPac(" + ventana.getSPPSalidaPac().getText() + ")");
                ventana.getSPEMSalidaPac().setVisible(false);
                ventana.getSPEMSalidaPac().setManaged(false);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMedico.class.getName()).log(Level.SEVERE, null, ex);
                ventana.getSPEMSalidaPac().setVisible(true);
                ventana.getSPEMSalidaPac().setManaged(true);
            }
        }
    }
    
    class EventoIngresarNuPac implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            Singleton singleton = Singleton.getSingleton();
            Connection conexion = singleton.getConexion();
            try {
                conexion.createStatement().executeQuery("call proc_ingresarNuPac(" + ventana.getSPP1IngresarNuPac().getText() + "," + ventana.getSPP2IngresarNuPac().getText() + "," + ventana.getSPP3IngresarNuPac().getText() + ", '" + ventana.getSPP4IngresarNuPac().getText() + "', " + ventana.getSPP5IngresarNuPac().getText() + ", '" + ventana.getSPP6IngresarNuPac().getText() + "', '" + ventana.getSPP7IngresarNuPac().getText() + "', '"+ ventana.getSPP8IngresarNuPac().getText() + "', " + ventana.getSPP9IngresarNuPac().getText() + ", '" + ventana.getSPP10IngresarNuPac().getText() + "', '" + ventana.getSPP11IngresarNuPac().getText() + "', '" + ventana.getSPP12IngresarNuPac().getText() + "', '" + ventana.getSPP13IngresarNuPac().getText() + "', '" + ventana.getSPP14IngresarNuPac().getText() + "', " + ventana.getSPP15IngresarNuPac().getText() + ", " + ventana.getSPP16IngresarNuPac().getText() + ")");
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
