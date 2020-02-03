/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.sql.SQLException;
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
    
    
    
    public void mostrar (Stage stage){
        stage.setTitle("Urgencias DB");
        stage.setScene(scene);
        stage.show();
    }
}
