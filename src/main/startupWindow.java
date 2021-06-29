package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class startupWindow extends Application {

    @FXML
    AnchorPane aPane = new AnchorPane();

    public static void main(String[] args) { launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("startup.fxml")));

        primaryStage.getIcons().add(new Image("pictures/icos.png"));
        primaryStage.setTitle("Character Generator");
        primaryStage.setScene(new Scene(root, 600,400));
        primaryStage.show();
    }

    public void loadSelected(ActionEvent actionEvent) {
        System.out.println("Load Old Character Selected");
    }

    public void exitSelected(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void aboutSelected(ActionEvent actionEvent) {
        System.out.println("Program information selected");
    }

    public void dndSelected(ActionEvent actionEvent) throws IOException {
        AnchorPane ddpane = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("main/DnD/generator.fxml")));
        aPane.getChildren().setAll(ddpane);

        System.out.println("D&D Characters Selected");
    }

    public void pfSelected(ActionEvent actionEvent) {
        System.out.println("Pathfinder Characters Selected");
    }
}
