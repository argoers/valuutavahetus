package valuutavahetus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    Controller controller;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view.fxml"));

        controller = fxmlLoader.getController();

        Scene scene = new Scene(fxmlLoader.load(), 600, 350);
        stage.setMinWidth(600);
        stage.setMinHeight(350);
        stage.setTitle("Valuutavahetus");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}