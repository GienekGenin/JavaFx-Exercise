package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller3 implements Initializable {

    @FXML
    private WebView browser = new WebView();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        WebEngine engine = browser.getEngine();
        engine.load("https://gienekgenin.github.io/blog-sample/");
    }
}
