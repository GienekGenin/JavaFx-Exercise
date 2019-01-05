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

public class Controller2 implements Initializable {

    @FXML
    private Button btn2 = new Button();

    @FXML
    private AnchorPane anchorPane2 = new AnchorPane();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void loadThirdScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/fxml/sample3.fxml"));
        Scene scene = btn2.getScene();
        root.translateYProperty().set(scene.getHeight());
        scene.getStylesheets().add(getClass().getResource("/resources/css/sample3.css").toExternalForm());
        StackPane stackPane = (StackPane) scene.getRoot();
        SwitchScene.sceneSwitcher(root, stackPane, scene, anchorPane2);
    }
}
