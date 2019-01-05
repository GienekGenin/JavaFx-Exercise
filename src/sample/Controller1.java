package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller1 implements Initializable {

    @FXML
    private Button btn1 = new Button();

    @FXML
    private AnchorPane anchorPane1 = new AnchorPane();

    @FXML
    private StackPane stackPane = new StackPane();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void loadSecondScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/fxml/sample2.fxml"));
        Scene scene = btn1.getScene();
        root.translateYProperty().set(scene.getHeight());
        scene.getStylesheets().add(getClass().getResource("/resources/css/sample2.css").toExternalForm());
        SwitchScene.sceneSwitcher(root, stackPane, scene, anchorPane1);
    }
}
