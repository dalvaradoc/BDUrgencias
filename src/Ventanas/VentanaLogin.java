/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Alejandro
 */
public class VentanaLogin {
    
    private StackPane pane;
    private Button btnLogIn;
    private TextField tfUser;
    private PasswordField tfPassword;
    private Text titulo;
    private Text errorMessage;
    private Scene scene;

    public VentanaLogin() throws IOException {
        tfUser = new TextField();
        tfUser.setPromptText("Nombre de usuario");
        tfPassword = new PasswordField();
        tfPassword.setPromptText("Contraseña");
        
        btnLogIn = new Button("Ingresar");
        
        titulo = new Text("Bienvenido");
        titulo.setScaleX(2);
        titulo.setScaleY(2);
        
        errorMessage = new Text("Usuario o contraseña incorrectos");
        errorMessage.setFill(Color.RED);
        errorMessage.setVisible(false);
        
        pane = new StackPane();
        pane.setAlignment(Pos.CENTER);
        VBox textFields = new VBox();
        textFields.setMaxSize(200, 300);
        textFields.getChildren().add(titulo);
        textFields.getChildren().add(tfUser);
        textFields.getChildren().add(tfPassword);
        textFields.getChildren().add(errorMessage);
        textFields.getChildren().add(btnLogIn);
        textFields.setAlignment(Pos.CENTER);
        textFields.setSpacing(5);
        VBox.setMargin(btnLogIn, new Insets(20, 0, 0, 0));
        VBox.setMargin(titulo, new Insets(0, 0, 30, 0));
        pane.getChildren().add(textFields);
        
        //pane.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        
        this.scene = new Scene(pane, 500, 500);
    }

    public StackPane getLayout () {
        return pane;
    }

    public Button getBtnLogIn() {
        return btnLogIn;
    }

    public TextField getTfUser() {
        return tfUser;
    }

    public Scene getScene() {
        return scene;
    }

    public PasswordField getTfPassword() {
        return tfPassword;
    }

    public Text getTitulo() {
        return titulo;
    }

    public Text getErrorMessage() {
        return errorMessage;
    }   
    
    
    public void mostrar (Stage stage){
        stage.setTitle("Inicio de Sesion");
        stage.setScene(scene);
        stage.show();
    }
}
