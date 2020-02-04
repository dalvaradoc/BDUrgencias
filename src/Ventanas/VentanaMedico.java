/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.sql.SQLException;
import java.util.Collection;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Menu;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Alejandro
 */
public class VentanaMedico {
    private StackPane pane;
    private Text username;
    private Button btnCerrarSesion;
    private Tab tabVerTablas;
    
    private TabPane tabPane;
    
    private Tab tabSPHistoriaPaciente;
    private TextField sppHistoriaPaciente;
    private TableView sptHistoriaPaciente;
    private Button spbHistoriaPaciente;
    
    private Tab tabSPEntregarOR;
    private TextField SPP1EntregaOR;
    private TextField SPP2EntregaOR;
    private Button SPBEntregaOR;
    
    private Tab tabSPCompletarEv;
    private TextField SPPCompletarEv;
    private Text SPEMCompletarEv;
    private Button SPBCompletarEv;
    
    private Tab tabSPHoraMuerte;
    private TextField SPP1HoraMuerte;
    private TextField SPP2HoraMuerte;
    private Text SPEMHoraMuerte;
    private Button SPBHoraMuerte;
    
    private Tab tabSPIngresarNuPac;
    private TextField SPP1IngresarNuPac;
    private TextField SPP2IngresarNuPac;
    private TextField SPP3IngresarNuPac;
    private TextField SPP4IngresarNuPac;
    private TextField SPP5IngresarNuPac;
    private TextField SPP6IngresarNuPac;
    private TextField SPP7IngresarNuPac;
    private TextField SPP8IngresarNuPac;
    private TextField SPP9IngresarNuPac;
    private TextField SPP10IngresarNuPac;
    private TextField SPP11IngresarNuPac;
    private TextField SPP12IngresarNuPac;
    private TextField SPP13IngresarNuPac;
    private TextField SPP14IngresarNuPac;
    private TextField SPP15IngresarNuPac;
    private TextField SPP16IngresarNuPac;
    private Text SPEMIngresarNuPac;
    private Button SPBIngresarNuPac;
    
    private Tab tabSPInvout;
    private TextField SPP1Invout;
    private TextField SPP2Invout;
    private Text SPEMInvout;
    private Button SPBInvout;
    
    private Tab tabSPMisPac;
    private TextField SPPMisPac;
    private Text SPEMMisPac;
    private TableView SPTMisPac;
    private Button SPBMisPac;
    
    private Tab tabSPNuevaDir;
    private TextField SPP1NuevaDir;
    private TextField SPP2NuevaDir;
    private TextField SPP3NuevaDir;
    private TextField SPP4NuevaDir;
    private TextField SPP5NuevaDir;
    private TextField SPP6NuevaDir;
    private TextField SPP7NuevaDir;
    private TextField SPP8NuevaDir;
    private Text SPEMNuevaDir;
    private TableView SPTNuevaDir;
    private Button SPBNuevaDir;
    
    private Tab tabSPPersonaNuDir;
    private TextField SPP1PersonaNuDir;
    private TextField SPP2PersonaNuDir;
    private TextField SPP3PersonaNuDir;
    private TextField SPP4PersonaNuDir;
    private TextField SPP5PersonaNuDir;
    private TextField SPP6PersonaNuDir;
    private TextField SPP7PersonaNuDir;
    private TextField SPP8PersonaNuDir;
    private TextField SPP9PersonaNuDir;
    private TextField SPP10PersonaNuDir;
    private TextField SPP11PersonaNuDir;
    private TextField SPP12PersonaNuDir;
    private TextField SPP13PersonaNuDir;
    private TextField SPP14PersonaNuDir;
    private TextField SPP15PersonaNuDir;
    private Button SPBPersonaNuDir;
    
    private Tab tabSPPersonaOlDir;
    private TextField SPP1PersonaOlDir;
    private TextField SPP2PersonaOlDir;
    private TextField SPP3PersonaOlDir;
    private TextField SPP4PersonaOlDir;
    private TextField SPP5PersonaOlDir;
    private TextField SPP6PersonaOlDir;
    private TextField SPP7PersonaOlDir;
    private TextField SPP8PersonaOlDir;
    private TextField SPP9PersonaOlDir;
    private Button SPBPersonaOLDir;
    
    private Tab tabSPRegIngreso;
    private TextField SPP1RegIngreso;
    private TextField SPP2RegIngreso;
    private TextField SPP3RegIngreso;
    private TextField SPP4RegIngreso;
    private TextField SPP5RegIngreso;
    private TextField SPP6RegIngreso;
    private Button SPBRegIngreso;
    private Text SPEMRegIngreso;
    
    private Tab tabSPRegNuEval;
    private TextField SPP1RegNuEval;
    private TextField SPP2RegNuEval;
    private TextField SPP3RegNuEval;
    private TextField SPP4RegNuEval;
    private TextField SPP5RegNuEval;
    private TextField SPP6RegNuEval;
    private TextField SPP7RegNuEval;
    private Button SPBRegNuEval;
    private Text SPEMRegNuEval;
    
    private Tab tabSPRegTrat;
    private TextField SPP1RegTrat;
    private TextField SPP2RegTrat;
    private TextField SPP3RegTrat;
    private TextField SPP4RegTrat;
    private TextField SPP5RegTrat;
    private TextField SPP6RegTrat;
    private TextField SPP7RegTrat;
    private TextField SPP8RegTrat;
    private TextField SPP9RegTrat;
    private TextField SPP10RegTrat;
    private TextField SPP11RegTrat;
    private TextField SPP12RegTrat;
    private TextField SPP13RegTrat;
    private TextField SPP14RegTrat;
    private Text SPEMRegTrat;
    private Button SPBRegTrat;
    
    private Tab tabSPSalidaPac;
    private TextField SPPSalidaPac;
    private Text SPEMSalidaPac;
    private Button SPBSalidaPac;
    
    private ChoiceBox choiceBox;
    private Button btnMostrarDirecciones;
    private TableView table;
    private Scene scene;

    public VentanaMedico() throws SQLException {
        
        username = new Text("Usuario: ");
        
        btnCerrarSesion = new Button("Cerrar Sesion");
        btnCerrarSesion.setAlignment(Pos.TOP_RIGHT);
        
        //-------------------------------------------------------------------------------------------------------
        
        //Procedimiento historiaPaciente
        
        Text spnHistoriaPaciente = new Text("\nPROCEDIMIENTO HISTORIA PACIENTE");
        spnHistoriaPaciente.setFont(Font.font(20));
        sppHistoriaPaciente = new TextField();
        sptHistoriaPaciente = new TableView();
        sppHistoriaPaciente.setPromptText("Ingrese ID del paciente");
        spbHistoriaPaciente = new Button("Ejecutar");
        
        HBox hboxspHistoriaPaciente = new HBox();
        hboxspHistoriaPaciente.getChildren().addAll(sppHistoriaPaciente, spbHistoriaPaciente);
        hboxspHistoriaPaciente.setSpacing(10);
        
        VBox vboxspHistoriaPaciente = new VBox();
        vboxspHistoriaPaciente.setSpacing(20);
        vboxspHistoriaPaciente.getChildren().addAll(spnHistoriaPaciente, hboxspHistoriaPaciente,sptHistoriaPaciente);
//        vboxspHistoriaPaciente.setVisible(false);
//        vboxspHistoriaPaciente.setManaged(false);

        //-------------------------------------------------------------------------------------------------------
        
        //Procedimiento proc_entregaOR
        
        Text SPNEntregaOR = new Text("\nPROCEDIMIENTO ENTREGA OR");
        SPNEntregaOR.setFont(Font.font(20));
        SPP1EntregaOR = new TextField();
        SPP1EntregaOR.setPromptText("Ingrese ID Cirujano");
        SPP2EntregaOR = new TextField();
        SPP2EntregaOR.setPromptText("Ingrese No Sala operaciones");
        SPBEntregaOR = new Button("Ejecutar");
        
        HBox hboxSPEntregaOR = new HBox();
        hboxSPEntregaOR.getChildren().addAll(SPP1EntregaOR,SPP2EntregaOR, SPBEntregaOR);
        hboxSPEntregaOR.setSpacing(10);
        
        VBox vboxSPEntregarOR = new VBox();
        vboxSPEntregarOR.setSpacing(20);
        vboxSPEntregarOR.getChildren().addAll(SPNEntregaOR, hboxSPEntregaOR);
//        vboxSPEntregarOR.setVisible(false);
//        vboxSPEntregarOR.setManaged(false);

        //-------------------------------------------------------------------------------------------------------

        //SP Completar Evaluacion
        
        Text SPNCompletarEv = new Text("\nPROCEDIMIENTO COMPLETAR EVALUACION");
        SPNCompletarEv.setFont(Font.font(20));
        SPPCompletarEv = new TextField();
        SPPCompletarEv.setPromptText("Ingrese ID Evaluacion");
        SPBCompletarEv = new Button("Ejecutar");
        SPEMCompletarEv = new Text("El paciente tiene tratamientos incompletos");
        SPEMCompletarEv.setFill(Color.RED);
        SPEMCompletarEv.setVisible(false);
        SPEMCompletarEv.setManaged(false);
        
        HBox hboxSPCompletarEv = new HBox();
        hboxSPCompletarEv.getChildren().addAll(SPPCompletarEv, SPBCompletarEv);
        hboxSPCompletarEv.setSpacing(10);
        
        VBox vboxSPCompletarEv = new VBox();
        vboxSPCompletarEv.setSpacing(20);
        vboxSPCompletarEv.getChildren().addAll(SPNCompletarEv, hboxSPCompletarEv, SPEMCompletarEv);
        
        //-------------------------------------------------------------------------------------------------------
        
        //Procedimiento Hora Muerte
        
        Text SPNHoraMuerte = new Text("\nPROCEDIMIENTO COMPLETAR EVALUACION");
        SPNHoraMuerte.setFont(Font.font(20));
        SPP1HoraMuerte = new TextField();
        SPP1HoraMuerte.setPromptText("Ingrese ID Paciente");
        SPP2HoraMuerte = new TextField();
        SPP2HoraMuerte.setPromptText("Ingrese Hora");
        SPBHoraMuerte = new Button("Ejecutar");
        SPEMHoraMuerte = new Text("El paciente tiene tratamientos incompletos");
        SPEMHoraMuerte.setFill(Color.RED);
        SPEMHoraMuerte.setVisible(false);
        SPEMHoraMuerte.setManaged(false);
        
        HBox hboxSPHoraMuerte = new HBox();
        hboxSPHoraMuerte.getChildren().addAll(SPP1HoraMuerte,SPP2HoraMuerte, SPBHoraMuerte);
        hboxSPHoraMuerte.setSpacing(10);
        
        VBox vboxSPHoraMuerte = new VBox();
        vboxSPHoraMuerte.setSpacing(20);
        vboxSPHoraMuerte.getChildren().addAll(SPNHoraMuerte, hboxSPHoraMuerte);
        
        //-------------------------------------------------------------------------------------------------------
        
        //Procedimiento ingresar nuevo paciente
        
        Text SPNIngresarNuPac = new Text("\nROCEDIMIENTO INGRESAR NUEVO PACIENTE");
        SPNIngresarNuPac.setFont(Font.font(20));
        SPP1IngresarNuPac = new TextField();
        SPP1IngresarNuPac.setPromptText("ID Paramedico");
        SPP2IngresarNuPac = new TextField();
        SPP2IngresarNuPac.setPromptText("Calle");
        SPP3IngresarNuPac = new TextField();
        SPP3IngresarNuPac.setPromptText("Carrera");
        SPP4IngresarNuPac = new TextField();
        SPP4IngresarNuPac.setPromptText("Letra");
        SPP5IngresarNuPac = new TextField();
        SPP5IngresarNuPac.setPromptText("Numero");
        SPP6IngresarNuPac = new TextField();
        SPP6IngresarNuPac.setPromptText("Sector");
        SPP7IngresarNuPac = new TextField();
        SPP7IngresarNuPac.setPromptText("Barrio");
        SPP8IngresarNuPac = new TextField();
        SPP8IngresarNuPac.setPromptText("Extra");
        SPP9IngresarNuPac = new TextField();
        SPP9IngresarNuPac.setPromptText("ID Persona");
        SPP10IngresarNuPac = new TextField();
        SPP10IngresarNuPac.setPromptText("Nombre 1");
        SPP11IngresarNuPac = new TextField();
        SPP11IngresarNuPac.setPromptText("Nombre 2");
        SPP12IngresarNuPac = new TextField();
        SPP12IngresarNuPac.setPromptText("Apellido 1");
        SPP13IngresarNuPac = new TextField();
        SPP13IngresarNuPac.setPromptText("Apellido 2");
        SPP14IngresarNuPac = new TextField();
        SPP14IngresarNuPac.setPromptText("Fecha Nacimiento");
        SPP15IngresarNuPac = new TextField();
        SPP15IngresarNuPac.setPromptText("Telefono");
        SPP16IngresarNuPac = new TextField();
        SPP16IngresarNuPac.setPromptText("Celular");
        SPEMIngresarNuPac = new Text();
        SPEMIngresarNuPac = new Text();
        SPBIngresarNuPac = new Button("Ejecutar");
        
        VBox vboxSPIngresarNuPac = new VBox();
        vboxSPIngresarNuPac.getChildren().addAll(SPNIngresarNuPac,SPP1IngresarNuPac, SPP2IngresarNuPac, SPP3IngresarNuPac, SPP4IngresarNuPac, 
                SPP5IngresarNuPac, SPP6IngresarNuPac, SPP7IngresarNuPac, SPP8IngresarNuPac, SPP9IngresarNuPac, 
                SPP10IngresarNuPac, SPP11IngresarNuPac, SPP12IngresarNuPac, SPP13IngresarNuPac, SPP14IngresarNuPac, SPBIngresarNuPac);
        vboxSPIngresarNuPac.setSpacing(10);
        
        //-------------------------------------------------------------------------------------------------------
        
        Text SPNInvout = new Text("\nPROCEDIMIENTO INVOUT");
        SPNInvout.setFont(Font.font(20));
        SPP1Invout = new TextField();
        SPP1Invout.setPromptText("limite");
        SPP2Invout = new TextField();
        SPP2Invout.setPromptText("propo");
        SPBInvout = new Button("Ejecutar");
        
        VBox vboxSPInvout = new VBox();
        vboxSPInvout.getChildren().addAll(SPNInvout, SPP1Invout, SPP2Invout, SPBInvout);
        vboxSPInvout.setSpacing(10);
        
        //-------------------------------------------------------------------------------------------------------
        
        Text SPNMisPac = new Text("\nPROCEDIMIENTO MIS PACIENTES");
        SPNMisPac.setFont(Font.font(20));
        SPPMisPac = new TextField();
        SPPMisPac.setPromptText("Ingrese el ID Paciente");
        SPTMisPac = new TableView();
        SPBMisPac = new Button("Ejecutar");
        
        VBox vboxSPMisPac = new VBox();
        vboxSPMisPac.getChildren().addAll(SPNMisPac, SPPMisPac, SPTMisPac, SPBMisPac);
        vboxSPMisPac.setSpacing(10);
        
        //-------------------------------------------------------------------------------------------------------

        //Procedimiento Nueva Direccion
        
        Text SPNNuevaDir = new Text("\nPROCEDIMIENTO NUEVA DIRECCION");
        SPNNuevaDir.setFont(Font.font(20));
        SPP1NuevaDir = new TextField();
        SPP1NuevaDir.setPromptText("nDir");
        SPP2NuevaDir = new TextField();
        SPP2NuevaDir.setPromptText("Calle");
        SPP3NuevaDir = new TextField();
        SPP3NuevaDir.setPromptText("Carrera");
        SPP4NuevaDir = new TextField();
        SPP4NuevaDir.setPromptText("Letra");
        SPP5NuevaDir = new TextField();
        SPP5NuevaDir.setPromptText("Num");
        SPP6NuevaDir = new TextField();
        SPP6NuevaDir.setPromptText("Sector");
        SPP7NuevaDir = new TextField();
        SPP7NuevaDir.setPromptText("Barrio");
        SPP8NuevaDir = new TextField();
        SPP8NuevaDir.setPromptText("Extra");
        SPBNuevaDir = new Button("Ejecutar");
        
        VBox vboxSPNuevaDir = new VBox();
        vboxSPNuevaDir.getChildren().addAll(SPNNuevaDir, SPP1NuevaDir,SPP2NuevaDir,SPP3NuevaDir,SPP4NuevaDir,SPP5NuevaDir,
                SPP6NuevaDir,SPP7NuevaDir,SPP8NuevaDir, SPBNuevaDir);
        
        vboxSPNuevaDir.setSpacing(10);
        
        //-------------------------------------------------------------------------------------------------------
        
        Text SPNPersonaNuDir = new Text("\nPROCEDIMIENTO PERSONA NUEVA DIR");
        SPNPersonaNuDir.setFont(Font.font(20));
        SPP1PersonaNuDir = new TextField();
        SPP1PersonaNuDir.setPromptText("Calle");
        SPP2PersonaNuDir = new TextField();
        SPP2PersonaNuDir.setPromptText("Carrera");
        SPP3PersonaNuDir = new TextField();
        SPP3PersonaNuDir.setPromptText("Letra");
        SPP4PersonaNuDir = new TextField();
        SPP4PersonaNuDir.setPromptText("Num");
        SPP5PersonaNuDir = new TextField();
        SPP5PersonaNuDir.setPromptText("Sector");
        SPP6PersonaNuDir = new TextField();
        SPP6PersonaNuDir.setPromptText("Barrio");
        SPP7PersonaNuDir = new TextField();
        SPP7PersonaNuDir.setPromptText("Extra");
        SPP8PersonaNuDir = new TextField();
        SPP8PersonaNuDir.setPromptText("ID");
        SPP9PersonaNuDir = new TextField();
        SPP9PersonaNuDir.setPromptText("Nombre 1");
        SPP10PersonaNuDir = new TextField();
        SPP10PersonaNuDir.setPromptText("Nombre 2");
        SPP11PersonaNuDir = new TextField();
        SPP11PersonaNuDir.setPromptText("Apellido 1");
        SPP12PersonaNuDir = new TextField();
        SPP12PersonaNuDir.setPromptText("Apellido 2");
        SPP13PersonaNuDir = new TextField();
        SPP13PersonaNuDir.setPromptText("Nacimiento");
        SPP14PersonaNuDir = new TextField();
        SPP14PersonaNuDir.setPromptText("Telefono");
        SPP15PersonaNuDir = new TextField();
        SPP15PersonaNuDir.setPromptText("Celular");
        SPBPersonaNuDir = new Button("Ejecutar");
        
        VBox vboxSPPersonaNuDir = new VBox();
        vboxSPPersonaNuDir.getChildren().addAll(SPNPersonaNuDir, SPP1PersonaNuDir, SPP2PersonaNuDir, 
                SPP3PersonaNuDir, SPP4PersonaNuDir, SPP5PersonaNuDir, SPP6PersonaNuDir, SPP7PersonaNuDir, SPP8PersonaNuDir, 
                SPP9PersonaNuDir, SPP10PersonaNuDir, SPP11PersonaNuDir, SPP12PersonaNuDir, SPP13PersonaNuDir, SPP14PersonaNuDir, SPP15PersonaNuDir,
                SPBPersonaNuDir);
        
        vboxSPPersonaNuDir.setSpacing(10);
        
        //-------------------------------------------------------------------------------------------------------
        
        // Procedimiento Persona OlDir
        
        Text SPNPersonaOlDir = new Text("\nPROCEDIMIENTO OLDIR");
        SPNPersonaOlDir.setFont(Font.font(20));
        SPP1PersonaOlDir = new TextField();
        SPP1PersonaOlDir.setPromptText("ID Peronas Ref");
        SPP2PersonaOlDir = new TextField();
        SPP2PersonaOlDir.setPromptText("ID");
        SPP3PersonaOlDir = new TextField();
        SPP3PersonaOlDir.setPromptText("Nombre 1");
        SPP4PersonaOlDir = new TextField();
        SPP4PersonaOlDir.setPromptText("Nombre 2");
        SPP5PersonaOlDir = new TextField();
        SPP5PersonaOlDir.setPromptText("Apellido 1");
        SPP6PersonaOlDir = new TextField();
        SPP6PersonaOlDir.setPromptText("Apellido 2");
        SPP7PersonaOlDir = new TextField();
        SPP7PersonaOlDir.setPromptText("Nacimiento");
        SPP8PersonaOlDir = new TextField();
        SPP8PersonaOlDir.setPromptText("Telefono");
        SPP9PersonaOlDir = new TextField();
        SPP9PersonaOlDir.setPromptText("Celular");
        SPBPersonaOLDir = new Button("Ejecutar");
        
        VBox vboxSPPersonaOlDir = new VBox();
        vboxSPPersonaOlDir.getChildren().addAll(SPNPersonaOlDir, SPP1PersonaOlDir,SPP2PersonaOlDir,SPP3PersonaOlDir,SPP4PersonaOlDir,
        SPP5PersonaOlDir,SPP6PersonaOlDir,SPP7PersonaOlDir,SPP8PersonaOlDir,SPP9PersonaOlDir,SPBPersonaOLDir);
        vboxSPPersonaOlDir.setSpacing(10);
        
        //-------------------------------------------------------------------------------------------------------
        
        // Procedimiento Reg Ingreso

        Text SPNRegIngreso = new Text("\nPROCEDIMIENTO REGISTRAR INGRESO");
        SPNRegIngreso.setFont(Font.font(20));
        SPP1RegIngreso = new TextField();
        SPP1RegIngreso.setPromptText("ID Peronas");
        SPP2RegIngreso = new TextField();
        SPP2RegIngreso.setPromptText("ID Paramedico");
        SPP3RegIngreso = new TextField();
        SPP3RegIngreso.setPromptText("Temperatura");
        SPP4RegIngreso = new TextField();
        SPP4RegIngreso.setPromptText("Presion");
        SPP5RegIngreso = new TextField();
        SPP5RegIngreso.setPromptText("Ritmo Cardiaco");
        SPP6RegIngreso = new TextField();
        SPP6RegIngreso.setPromptText("Peso");
        
        SPEMRegIngreso = new Text("El paciente ya fue ingresado. Dele de alta o revisa");
        SPEMRegIngreso.setVisible(false);
        SPEMRegIngreso.setManaged(false);
 
        SPBRegIngreso = new Button("Ejecutar");
        
        VBox vboxSPRegIngreso = new VBox();
        vboxSPRegIngreso.getChildren().addAll(SPNRegIngreso, SPP1RegIngreso,SPP2RegIngreso,SPP3RegIngreso,SPP4RegIngreso,
        SPP5RegIngreso,SPP6RegIngreso,SPBRegIngreso, SPEMRegIngreso);
        vboxSPRegIngreso.setSpacing(10);
        
        
        //-------------------------------------------------------------------------------------------------------
        
        // Procedimiento regNuEval
        
        Text SPNRegNuEval = new Text("\nPROCEDIMIENTO REGISTRAR NUEVA EVALUACION");
        SPNRegNuEval.setFont(Font.font(20));
        SPP1RegNuEval = new TextField();
        SPP1RegNuEval.setPromptText("ID Peronas Ref");
        SPP2RegNuEval = new TextField();
        SPP2RegNuEval.setPromptText("ID");
        SPP3RegNuEval = new TextField();
        SPP3RegNuEval.setPromptText("Nombre 1");
        SPP4RegNuEval = new TextField();
        SPP4RegNuEval.setPromptText("Nombre 2");
        SPP5RegNuEval = new TextField();
        SPP5RegNuEval.setPromptText("Apellido 1");
        SPP6RegNuEval = new TextField();
        SPP6RegNuEval.setPromptText("Apellido 2");
        SPP7RegNuEval = new TextField();
        SPP7RegNuEval.setPromptText("Apellido 2");
        
        SPEMRegNuEval = new Text("El paciente ya fue ingresado. Dele de alta o revisa");
        SPEMRegNuEval.setVisible(false);
        SPEMRegNuEval.setManaged(false);
 
        SPBRegNuEval = new Button("Ejecutar");
        
        VBox vboxSPRegNuEval = new VBox();
        vboxSPRegNuEval.getChildren().addAll(SPNRegNuEval, SPP1RegNuEval,SPP2RegNuEval,SPP3RegNuEval,SPP4RegNuEval,
        SPP5RegNuEval,SPP6RegNuEval,SPP7RegNuEval, SPBRegNuEval, SPEMRegNuEval);
        vboxSPRegNuEval.setSpacing(10);
        
        //-------------------------------------------------------------------------------------------------------

        // Procedimiento Reg Tratamiento
      
        Text SPNRegTrat = new Text("\nPROCEDIMIENTO REGISTRAR TRATAMIENTO");
        SPNRegTrat.setFont(Font.font(20));
        SPP1RegTrat = new TextField();
        SPP1RegTrat.setPromptText("Temperatura");
        SPP2RegTrat = new TextField();
        SPP2RegTrat.setPromptText("Presion");
        SPP3RegTrat = new TextField();
        SPP3RegTrat.setPromptText("Ritmo");
        SPP4RegTrat = new TextField();
        SPP4RegTrat.setPromptText("Peso");
        SPP5RegTrat = new TextField();
        SPP5RegTrat.setPromptText("ID Ingreso");
        SPP6RegTrat = new TextField();
        SPP6RegTrat.setPromptText("ID Evaluacion");
        SPP7RegTrat = new TextField();
        SPP7RegTrat.setPromptText("No. Tratamiento");
        SPP8RegTrat = new TextField();
        SPP8RegTrat.setPromptText("Cantidad Tratamiento");
        SPP9RegTrat = new TextField();
        SPP9RegTrat.setPromptText("Duracion");
        SPP10RegTrat = new TextField();
        SPP10RegTrat.setPromptText("Zona");
        SPP11RegTrat = new TextField();
        SPP11RegTrat.setPromptText("ID Tratamiento");
        SPP12RegTrat = new TextField();
        SPP12RegTrat.setPromptText("Tipo Tratamiento");
        SPP13RegTrat = new TextField();
        SPP13RegTrat.setPromptText("ID pmedico");
        SPP14RegTrat = new TextField();
        SPP14RegTrat.setPromptText("Medicamento");
        SPBRegTrat = new Button("Ejecutar");
        SPEMRegTrat = new Text("Probablemente ID de: Persona, Personal médico, Evaluacion o Tratamiento no existe(n), revíselos");
        SPEMRegTrat.setVisible(false);
        SPEMRegTrat.setManaged(false);
        
       VBox vboxSPRegTrat = new VBox();
       vboxSPRegTrat.getChildren().addAll(SPNRegTrat, SPP1RegTrat, SPP2RegTrat, SPP3RegTrat, SPP4RegTrat, SPP5RegTrat ,SPP6RegTrat ,SPP7RegTrat ,SPP8RegTrat,
       SPP9RegTrat, SPP10RegTrat, SPP11RegTrat, SPP12RegTrat, SPP13RegTrat, SPP14RegTrat, SPBRegTrat, SPEMRegTrat);
       vboxSPRegTrat.setSpacing(10);
        
        
        //-------------------------------------------------------------------------------------------------------
        
        // Procedimiento Salida Paciente
        
        Text SPNSalidaPac = new Text("\nPROCEDIMIENTO SALIDA PACIENTE");
        SPNSalidaPac.setFont(Font.font(20));
        
        SPPSalidaPac = new TextField();
        SPPSalidaPac.setPromptText("Ingrese ID Paciente");
        SPBSalidaPac = new Button("Ejecutar");
        SPEMSalidaPac = new Text("El paciente tiene evaluaciones incompletas o no existe");
        SPEMSalidaPac.setVisible(false);
        SPEMSalidaPac.setManaged(false);
        
        
        HBox hbox1SPSalidaPac = new HBox(SPPSalidaPac, SPBSalidaPac);
        hbox1SPSalidaPac.setSpacing(10);
        
        VBox vboxSPSalidaPac = new VBox();
        vboxSPSalidaPac.getChildren().addAll(SPNSalidaPac, hbox1SPSalidaPac, SPEMSalidaPac);
        vboxSPSalidaPac.setSpacing(20);
        
        
        //-------------------------------------------------------------------------------------------------------
        
        Text textTablasOVistas = new Text("\nVER TABLAS O VISTAS");
        textTablasOVistas.setFont(Font.font(20));
        btnMostrarDirecciones = new Button("Mostrar Tabla/Vista");
        
        table = new TableView();
        
        choiceBox = new ChoiceBox();;

        HBox hbox2 = new HBox();
        
        Pane spacer = new Pane();
        hbox2.setHgrow(spacer, Priority.ALWAYS);
        spacer.setMinSize(10, 1);
        btnCerrarSesion.setMinSize(Button.USE_PREF_SIZE, Button.USE_PREF_SIZE);
                
        HBox hbox = new HBox();
        
        hbox2.getChildren().addAll(username, spacer, btnCerrarSesion);
        
        hbox.getChildren().add(choiceBox);
        hbox.getChildren().add(btnMostrarDirecciones);
        hbox.setSpacing(10);
        
        VBox vboxVerTablas = new VBox();
        vboxVerTablas.getChildren().addAll(textTablasOVistas, hbox, table);
        vboxVerTablas.setSpacing(20);
        
        //vbox.getChildren().add(hbox2);

        
        tabPane = new TabPane();
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        tabVerTablas = new Tab("Ver Tablas/Vistas", vboxVerTablas);
        tabSPHistoriaPaciente = new Tab("Historia Paciente", vboxspHistoriaPaciente);
        tabSPEntregarOR = new Tab("Entregar OR", vboxSPEntregarOR);
        tabSPCompletarEv = new Tab("Completar Ev", vboxSPCompletarEv);
        tabSPHoraMuerte = new Tab("Hora Muerte", vboxSPHoraMuerte);
        tabSPIngresarNuPac = new Tab("Ingresar Paciente", vboxSPIngresarNuPac);
        tabSPInvout = new Tab("Invout", vboxSPInvout);
        tabSPMisPac = new Tab("Mis Pacientes", vboxSPMisPac);
        tabSPNuevaDir = new Tab("Nueva Direccion", vboxSPNuevaDir);
        tabSPPersonaNuDir = new Tab("Nuevo Pac/Dir", vboxSPPersonaNuDir);
        tabSPPersonaOlDir = new Tab("Persona OlDir", vboxSPPersonaOlDir);
        tabSPRegIngreso = new Tab("Registrar Ingreso", vboxSPRegIngreso);
        tabSPRegNuEval = new Tab("Registrar Nu Eval", vboxSPRegNuEval);
        tabSPRegTrat = new Tab("Reg Trat", vboxSPRegTrat);
        tabSPSalidaPac = new Tab("Salida Pac", vboxSPSalidaPac);
        tabPane.getTabs().add(tabVerTablas);
        
        VBox vbox = new VBox();
        
        vbox.getChildren().addAll(hbox2, tabPane);
        vbox.setSpacing(20);
        
//        vbox.getChildren().add(vboxspHistoriaPaciente);
//        vbox.getChildren().add(vboxSPEntregarOR);
//        vbox.getChildren().add(textTablasOVistas);
//        vbox.getChildren().add(hbox);
//        vbox.getChildren().add(table);
//        vbox.setSpacing(20);
//        
        ScrollPane pane = new ScrollPane();
        pane.setContent(vbox);
        pane.setFitToWidth(true);
        
        pane.setPadding(new Insets(20));
        
        this.scene = new Scene(pane, 1300, 500);
    }

    public StackPane getPane() {
        return pane;
    }

    public Button getBtnMostrarDirecciones() {
        return btnMostrarDirecciones;
    }

    public TableView getTable() {
        return table;
    }

    public Scene getScene() {
        return scene;
    }

    public void setPane(StackPane pane) {
        this.pane = pane;
    }
    
    public void setBtnMostrarDirecciones(Button btnMostrarDirecciones) {
        this.btnMostrarDirecciones = btnMostrarDirecciones;
    }

    public void setTable(TableView table) {
        this.table = table;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public ChoiceBox getChoiceBox() {
        return choiceBox;
    }

    public void setChoiceBox(ChoiceBox choiceBox) {
        this.choiceBox = choiceBox;
    }

    public Text getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username.setText(username);
    }

    public Button getBtnCerrarSesion() {
        return btnCerrarSesion;
    }

    public void setBtnCerrarSesion(Button btnCerrarSesion) {
        this.btnCerrarSesion = btnCerrarSesion;
    }

    public TextField getSppHistoriaPaciente() {
        return sppHistoriaPaciente;
    }

    public void setSppHistoriaPaciente(TextField sppHistoriaPaciente) {
        this.sppHistoriaPaciente = sppHistoriaPaciente;
    }

    public TableView getSptHistoriaPaciente () {
        return sptHistoriaPaciente;
    }

    public void setSptHistoriaPaciente (TableView sprHistoriaPaciente) {
        this.sptHistoriaPaciente = sprHistoriaPaciente;
    }

    public Button getSpbHistoriaPaciente() {
        return spbHistoriaPaciente;
    }

    public void setSpbHistoriaPaciente(Button spbHistoriaPaciente) {
        this.spbHistoriaPaciente = spbHistoriaPaciente;
    }
    

    public TextField getSPP1EntregaOR() {
        return SPP1EntregaOR;
    }

    public void setSPP1EntregaOR(TextField SPP1EntregaOR) {
        this.SPP1EntregaOR = SPP1EntregaOR;
    }

    public TextField getSPP2EntregaOR() {
        return SPP2EntregaOR;
    }

    public void setSPP2EntregaOR(TextField SPP2EntregaOR) {
        this.SPP2EntregaOR = SPP2EntregaOR;
    }

    public Tab getTabVerTablas() {
        return tabVerTablas;
    }

    public void setTabVerTablas(Tab tabVerTablas) {
        this.tabVerTablas = tabVerTablas;
    }

    public Tab getTabSPHistoriaPaciente() {
        return tabSPHistoriaPaciente;
    }

    public void setTabSPHistoriaPaciente(Tab tabSPHistoriaPaciente) {
        this.tabSPHistoriaPaciente = tabSPHistoriaPaciente;
    }

    public Tab getTabSPEntregarOR() {
        return tabSPEntregarOR;
    }

    public void setTabSPEntregarOR(Tab tabSPEntregarOR) {
        this.tabSPEntregarOR = tabSPEntregarOR;
    }

    public TabPane getTabPane() {
        return tabPane;
    }

    public void setTabPane(TabPane tabPane) {
        this.tabPane = tabPane;
    }

    public Button getSPBEntregaOR() {
        return SPBEntregaOR;
    }

    public void setSPBEntregaOR(Button SPBEntregaOR) {
        this.SPBEntregaOR = SPBEntregaOR;
    }

    public Tab getTabSPCompletarEv() {
        return tabSPCompletarEv;
    }

    public TextField getSPPCompletarEv() {
        return SPPCompletarEv;
    }

    public Button getSPBCompletarEv() {
        return SPBCompletarEv;
    }

    public Text getSPEMCompletarEv() {
        return SPEMCompletarEv;
    }

    public Tab getTabSPHoraMuerte() {
        return tabSPHoraMuerte;
    }

    public TextField getSPP1HoraMuerte() {
        return SPP1HoraMuerte;
    }

    public TextField getSPP2HoraMuerte() {
        return SPP2HoraMuerte;
    }

    public Button getSPBHoraMuerte() {
        return SPBHoraMuerte;
    }

    public void setUsername(Text username) {
        this.username = username;
    }

    public void setTabSPCompletarEv(Tab tabSPCompletarEv) {
        this.tabSPCompletarEv = tabSPCompletarEv;
    }

    public void setSPPCompletarEv(TextField SPPCompletarEv) {
        this.SPPCompletarEv = SPPCompletarEv;
    }

    public void setSPEMCompletarEv(Text SPEMCompletarEv) {
        this.SPEMCompletarEv = SPEMCompletarEv;
    }

    public void setSPBCompletarEv(Button SPBCompletarEv) {
        this.SPBCompletarEv = SPBCompletarEv;
    }

    public void setTabSPHoraMuerte(Tab tabSPHoraMuerte) {
        this.tabSPHoraMuerte = tabSPHoraMuerte;
    }

    public void setSPP1HoraMuerte(TextField SPP1HoraMuerte) {
        this.SPP1HoraMuerte = SPP1HoraMuerte;
    }

    public void setSPP2HoraMuerte(TextField SPP2HoraMuerte) {
        this.SPP2HoraMuerte = SPP2HoraMuerte;
    }

    public void setSPEMHoraMuerte(Text SPEMHoraMuerte) {
        this.SPEMHoraMuerte = SPEMHoraMuerte;
    }

    public void setSPBHoraMuerte(Button SPBHoraMuerte) {
        this.SPBHoraMuerte = SPBHoraMuerte;
    }

    public void setTabSPIngresarNuPac(Tab tabSPIngresarNuPac) {
        this.tabSPIngresarNuPac = tabSPIngresarNuPac;
    }

    public void setSPP1IngresarNuPac(TextField SPP1IngresarNuPac) {
        this.SPP1IngresarNuPac = SPP1IngresarNuPac;
    }

    public void setSPP2IngresarNuPac(TextField SPP2IngresarNuPac) {
        this.SPP2IngresarNuPac = SPP2IngresarNuPac;
    }

    public void setSPP3IngresarNuPac(TextField SPP3IngresarNuPac) {
        this.SPP3IngresarNuPac = SPP3IngresarNuPac;
    }

    public void setSPP4IngresarNuPac(TextField SPP4IngresarNuPac) {
        this.SPP4IngresarNuPac = SPP4IngresarNuPac;
    }

    public void setSPP5IngresarNuPac(TextField SPP5IngresarNuPac) {
        this.SPP5IngresarNuPac = SPP5IngresarNuPac;
    }

    public void setSPP6IngresarNuPac(TextField SPP6IngresarNuPac) {
        this.SPP6IngresarNuPac = SPP6IngresarNuPac;
    }

    public void setSPP7IngresarNuPac(TextField SPP7IngresarNuPac) {
        this.SPP7IngresarNuPac = SPP7IngresarNuPac;
    }

    public void setSPP8IngresarNuPac(TextField SPP8IngresarNuPac) {
        this.SPP8IngresarNuPac = SPP8IngresarNuPac;
    }

    public void setSPP9IngresarNuPac(TextField SPP9IngresarNuPac) {
        this.SPP9IngresarNuPac = SPP9IngresarNuPac;
    }

    public void setSPP10IngresarNuPac(TextField SPP10IngresarNuPac) {
        this.SPP10IngresarNuPac = SPP10IngresarNuPac;
    }

    public void setSPP11IngresarNuPac(TextField SPP11IngresarNuPac) {
        this.SPP11IngresarNuPac = SPP11IngresarNuPac;
    }

    public void setSPP12IngresarNuPac(TextField SPP12IngresarNuPac) {
        this.SPP12IngresarNuPac = SPP12IngresarNuPac;
    }

    public void setSPP13IngresarNuPac(TextField SPP13IngresarNuPac) {
        this.SPP13IngresarNuPac = SPP13IngresarNuPac;
    }

    public void setSPP14IngresarNuPac(TextField SPP14IngresarNuPac) {
        this.SPP14IngresarNuPac = SPP14IngresarNuPac;
    }

    public void setSPEMIngresarNuPac(Text SPEMIngresarNuPac) {
        this.SPEMIngresarNuPac = SPEMIngresarNuPac;
    }

    public void setSPBIngresarNuPac(Button SPBIngresarNuPac) {
        this.SPBIngresarNuPac = SPBIngresarNuPac;
    }

    public Text getSPEMHoraMuerte() {
        return SPEMHoraMuerte;
    }

    public Tab getTabSPIngresarNuPac() {
        return tabSPIngresarNuPac;
    }

    public TextField getSPP1IngresarNuPac() {
        return SPP1IngresarNuPac;
    }

    public TextField getSPP2IngresarNuPac() {
        return SPP2IngresarNuPac;
    }

    public TextField getSPP3IngresarNuPac() {
        return SPP3IngresarNuPac;
    }

    public TextField getSPP4IngresarNuPac() {
        return SPP4IngresarNuPac;
    }

    public TextField getSPP5IngresarNuPac() {
        return SPP5IngresarNuPac;
    }

    public TextField getSPP6IngresarNuPac() {
        return SPP6IngresarNuPac;
    }

    public TextField getSPP7IngresarNuPac() {
        return SPP7IngresarNuPac;
    }

    public TextField getSPP8IngresarNuPac() {
        return SPP8IngresarNuPac;
    }

    public TextField getSPP9IngresarNuPac() {
        return SPP9IngresarNuPac;
    }

    public TextField getSPP10IngresarNuPac() {
        return SPP10IngresarNuPac;
    }

    public TextField getSPP11IngresarNuPac() {
        return SPP11IngresarNuPac;
    }

    public TextField getSPP12IngresarNuPac() {
        return SPP12IngresarNuPac;
    }

    public TextField getSPP13IngresarNuPac() {
        return SPP13IngresarNuPac;
    }

    public TextField getSPP14IngresarNuPac() {
        return SPP14IngresarNuPac;
    }

    public Text getSPEMIngresarNuPac() {
        return SPEMIngresarNuPac;
    }

    public Button getSPBIngresarNuPac() {
        return SPBIngresarNuPac;
    }

    public Tab getTabSPInvout() {
        return tabSPInvout;
    }

    public TextField getSPP1Invout() {
        return SPP1Invout;
    }

    public TextField getSPP2Invout() {
        return SPP2Invout;
    }

    public Text getSPEMInvout() {
        return SPEMInvout;
    }

    public Button getSPBInvout() {
        return SPBInvout;
    }

    public Tab getTabSPMisPac() {
        return tabSPMisPac;
    }

    public TextField getSPPMisPac() {
        return SPPMisPac;
    }

    public Text getSPEMMisPac() {
        return SPEMMisPac;
    }

    public TableView getSPTMisPac() {
        return SPTMisPac;
    }

    public Button getSPBMisPac() {
        return SPBMisPac;
    }

    public Tab getTabSPNuevaDir() {
        return tabSPNuevaDir;
    }

    public TextField getSPP1NuevaDir() {
        return SPP1NuevaDir;
    }

    public TextField getSPP2NuevaDir() {
        return SPP2NuevaDir;
    }

    public TextField getSPP3NuevaDir() {
        return SPP3NuevaDir;
    }

    public TextField getSPP4NuevaDir() {
        return SPP4NuevaDir;
    }

    public TextField getSPP5NuevaDir() {
        return SPP5NuevaDir;
    }

    public TextField getSPP6NuevaDir() {
        return SPP6NuevaDir;
    }

    public TextField getSPP7NuevaDir() {
        return SPP7NuevaDir;
    }

    public TextField getSPP8NuevaDir() {
        return SPP8NuevaDir;
    }

    public Text getSPEMNuevaDir() {
        return SPEMNuevaDir;
    }

    public TableView getSPTNuevaDir() {
        return SPTNuevaDir;
    }

    public Button getSPBNuevaDir() {
        return SPBNuevaDir;
    }

    public Tab getTabSPPersonaNuDir() {
        return tabSPPersonaNuDir;
    }

    public TextField getSPP1PersonaNuDir() {
        return SPP1PersonaNuDir;
    }

    public TextField getSPP2PersonaNuDir() {
        return SPP2PersonaNuDir;
    }

    public TextField getSPP3PersonaNuDir() {
        return SPP3PersonaNuDir;
    }

    public TextField getSPP4PersonaNuDir() {
        return SPP4PersonaNuDir;
    }

    public TextField getSPP5PersonaNuDir() {
        return SPP5PersonaNuDir;
    }

    public TextField getSPP6PersonaNuDir() {
        return SPP6PersonaNuDir;
    }

    public TextField getSPP7PersonaNuDir() {
        return SPP7PersonaNuDir;
    }

    public TextField getSPP8PersonaNuDir() {
        return SPP8PersonaNuDir;
    }

    public TextField getSPP9PersonaNuDir() {
        return SPP9PersonaNuDir;
    }

    public TextField getSPP10PersonaNuDir() {
        return SPP10PersonaNuDir;
    }

    public TextField getSPP11PersonaNuDir() {
        return SPP11PersonaNuDir;
    }

    public TextField getSPP12PersonaNuDir() {
        return SPP12PersonaNuDir;
    }

    public TextField getSPP13PersonaNuDir() {
        return SPP13PersonaNuDir;
    }

    public TextField getSPP14PersonaNuDir() {
        return SPP14PersonaNuDir;
    }

    public TextField getSPP15PersonaNuDir() {
        return SPP15PersonaNuDir;
    }

    public Button getSPBPersonaNuDir() {
        return SPBPersonaNuDir;
    }

    public Tab getTabSPPersonaOlDir() {
        return tabSPPersonaOlDir;
    }

    public TextField getSPP1PersonaOlDir() {
        return SPP1PersonaOlDir;
    }

    public TextField getSPP2PersonaOlDir() {
        return SPP2PersonaOlDir;
    }

    public TextField getSPP3PersonaOlDir() {
        return SPP3PersonaOlDir;
    }

    public TextField getSPP4PersonaOlDir() {
        return SPP4PersonaOlDir;
    }

    public TextField getSPP5PersonaOlDir() {
        return SPP5PersonaOlDir;
    }

    public TextField getSPP6PersonaOlDir() {
        return SPP6PersonaOlDir;
    }

    public TextField getSPP7PersonaOlDir() {
        return SPP7PersonaOlDir;
    }

    public TextField getSPP8PersonaOlDir() {
        return SPP8PersonaOlDir;
    }

    public TextField getSPP9PersonaOlDir() {
        return SPP9PersonaOlDir;
    }

    public Button getSPBPersonaOLDir() {
        return SPBPersonaOLDir;
    }

    public Tab getTabSPRegTrat() {
        return tabSPRegTrat;
    }

    public TextField getSPP1RegTrat() {
        return SPP1RegTrat;
    }

    public TextField getSPP2RegTrat() {
        return SPP2RegTrat;
    }

    public TextField getSPP3RegTrat() {
        return SPP3RegTrat;
    }

    public TextField getSPP4RegTrat() {
        return SPP4RegTrat;
    }

    public TextField getSPP5RegTrat() {
        return SPP5RegTrat;
    }

    public TextField getSPP6RegTrat() {
        return SPP6RegTrat;
    }

    public TextField getSPP7RegTrat() {
        return SPP7RegTrat;
    }

    public TextField getSPP8RegTrat() {
        return SPP8RegTrat;
    }

    public TextField getSPP9RegTrat() {
        return SPP9RegTrat;
    }

    public TextField getSPP10RegTrat() {
        return SPP10RegTrat;
    }

    public TextField getSPP11RegTrat() {
        return SPP11RegTrat;
    }

    public TextField getSPP12RegTrat() {
        return SPP12RegTrat;
    }

    public TextField getSPP13RegTrat() {
        return SPP13RegTrat;
    }

    public TextField getSPP14RegTrat() {
        return SPP14RegTrat;
    }

    public Text getSPEMRegTrat() {
        return SPEMRegTrat;
    }

    public Button getSPBRegTrat() {
        return SPBRegTrat;
    }

    public Tab getTabSPSalidaPac() {
        return tabSPSalidaPac;
    }

    public TextField getSPPSalidaPac() {
        return SPPSalidaPac;
    }

    public Button getSPBSalidaPac() {
        return SPBSalidaPac;
    }

    public Text getSPEMSalidaPac() {
        return SPEMSalidaPac;
    }

    public Tab getTabSPRegIngreso() {
        return tabSPRegIngreso;
    }

    public TextField getSPP1RegIngreso() {
        return SPP1RegIngreso;
    }

    public TextField getSPP2RegIngreso() {
        return SPP2RegIngreso;
    }

    public TextField getSPP3RegIngreso() {
        return SPP3RegIngreso;
    }

    public TextField getSPP4RegIngreso() {
        return SPP4RegIngreso;
    }

    public TextField getSPP5RegIngreso() {
        return SPP5RegIngreso;
    }

    public TextField getSPP6RegIngreso() {
        return SPP6RegIngreso;
    }

    public Button getSPBRegIngreso() {
        return SPBRegIngreso;
    }

    public Text getSPEMRegIngreso() {
        return SPEMRegIngreso;
    }

    public Tab getTabSPRegNuEval() {
        return tabSPRegNuEval;
    }

    public TextField getSPP1RegNuEval() {
        return SPP1RegNuEval;
    }

    public TextField getSPP2RegNuEval() {
        return SPP2RegNuEval;
    }

    public TextField getSPP3RegNuEval() {
        return SPP3RegNuEval;
    }

    public TextField getSPP4RegNuEval() {
        return SPP4RegNuEval;
    }

    public TextField getSPP5RegNuEval() {
        return SPP5RegNuEval;
    }

    public TextField getSPP6RegNuEval() {
        return SPP6RegNuEval;
    }

    public TextField getSPP7RegNuEval() {
        return SPP7RegNuEval;
    }

    public Button getSPBRegNuEval() {
        return SPBRegNuEval;
    }

    public Text getSPEMRegNuEval() {
        return SPEMRegNuEval;
    }

    public TextField getSPP15IngresarNuPac() {
        return SPP15IngresarNuPac;
    }

    public TextField getSPP16IngresarNuPac() {
        return SPP16IngresarNuPac;
    }
    
    
    
    public void mostrar (Stage stage){
        stage.setTitle("Urgencias DB");
        stage.setScene(scene);
        stage.show();
    }
}
