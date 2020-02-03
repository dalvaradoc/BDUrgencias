/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.io.IOException;
import java.sql.Connection;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import java.sql.*;

/**
 *
 * @author Alejandro
 */
public class ControladorLogin {
    
    private static Connection conexion;
    private static String bd="urgencias2";
//    private static String user="root";
//    private static String password="1234";
    private static String host="localhost";
    private static String server="jdbc:mysql://"+host+"/"+bd+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    private VentanaLogin ventana;

    public ControladorLogin() throws IOException {
        ventana = new VentanaLogin();
        ventana.getBtnLogIn().setOnAction(new EventoBotonLogIn());
    }
    
    public void mostrarVista () {
        Singleton singleton = Singleton.getSingleton();
        ventana.getScene().setCursor(Cursor.DEFAULT);
        this.ventana.mostrar(singleton.getStage());
    }
    
    class EventoBotonLogIn implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            try {
                System.out.println("User: " + ventana.getTfUser().getText() + " Password: " + ventana.getTfPassword().getText());
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(server,ventana.getTfUser().getText(),ventana.getTfPassword().getText());
                System.out.println("Conexion a base de datos "+server+" ... OK");
                ventana.getErrorMessage().setVisible(false);
                
                Singleton singleton = Singleton.getSingleton();
                singleton.setConexion(conexion);
                
                ControladorMedico medico = new ControladorMedico();
                medico.mostrarVista();
                
            } catch (ClassNotFoundException ex) {
                System.out.println("Error cargando el Driver MySQL JDBC ... FAIL");
            } catch (SQLException ex) {
                System.out.println("Imposible realizar conexion con "+server+" ... FAIL");
                ventana.getErrorMessage().setVisible(true);
            }
            
//            try {
//                conexion.close();
//                System.out.println("Cerrar conexion con "+server+" ... OK");
//            } catch (SQLException ex) {
//                System.out.println("Imposible cerrar conexion ... FAIL");
//            } catch (NullPointerException ex){
//                System.out.println("No se pudo realizar la conexion");
//                ventana.getErrorMessage().setVisible(true);
//            }
        }
        
    }
}
