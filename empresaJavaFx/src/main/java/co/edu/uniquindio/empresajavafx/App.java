package co.edu.uniquindio.empresajavafx;

import co.edu.uniquindio.empresajavafx.model.Cliente;
import co.edu.uniquindio.empresajavafx.model.Empresa;
import co.edu.uniquindio.empresajavafx.viewcontroller.PrimaryViewController;
import co.edu.uniquindio.empresajavafx.viewcontroller.ClienteViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private Stage primaryStage; //Obligatorio
    public static Empresa empresa = new Empresa("UQ");

    //Obligatorio
    public static void main(String[] args) {
        launch();
    }
    //Obligatorio
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Gestion de Clientes"); //Cambia
        openViewPrincipal();
    }
    //Obligatorio
    private void openViewPrincipal() {
        inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("primary.fxml"));//Cambia
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            PrimaryViewController primaryController = loader.getController();//Cambia
            primaryController.setApp(this);//Cambia

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openCrudCliente() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("crudCliente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            ClienteViewController clienteViewController = loader.getController();
            clienteViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //servicios
    public void inicializarData(){
        Cliente cliente = new Cliente("12233", "juan", "apellido");
        empresa.agregarCliente(cliente);
    }
}
