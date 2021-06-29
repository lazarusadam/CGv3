package main.DnD;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import main.Dice;

import java.io.IOException;


public class genController extends Application {
    // Window elements
    public Button btn4d6;
    public Button btn3d6;
    public Button btnAccept;
    public AnchorPane ddPane;
    public TextField tfSet1;
    public TextField tfSet2;
    public TextField tfSet3;
    public TextField tfSet4;
    public TextField tfSet5;
    public TextField tfSet6;

    Integer[] scores = new Integer[6];
    String selection;

    public void select4d6() {
        selection = "4d6";
        Dice dieRoll = new Dice();
        String[] results = new String[6];
        int[] sum = new int[6];
        int[][] value = new int[6][4];
        for (int x = 0; x < 6; x++){
            for (int y = 0; y < 4; y++){
                value[x][y] = dieRoll.d6();
            }
        }
        int[][] sorted = sortvalues(value);
        for (int i = 0; i < 6; i++){
            results[i] = "";
            for (int j = 0; j < 2; j++){
                sum[i] += sorted [i][j];
                results[i] += sorted[i][j] + " + ";
            }
            sum[i] += sorted [i][2];
            results[i] += sorted[i][2] + " = " + sum[i] + "  Dropped:" + sorted[i][3];
        }
        for (int x = 0; x < 6; x++){
            scores[x] = sum[x];
        }
        tfSet1.setText(results[0]);
        tfSet2.setText(results[1]);
        tfSet3.setText(results[2]);
        tfSet4.setText(results[3]);
        tfSet5.setText(results[4]);
        tfSet6.setText(results[5]);
        btn3d6.setDisable(false); btnAccept.setDisable(false);
        btn4d6.setDisable(true);
    }

    private int[][]sortvalues(int[][] value) {
        for (int x = 0; x < 6; x++){
            int i,j,temp;
            int[] a = new int[4];
            for (int y =0; y<4; y++){
                a[y] = value[x][y];
            }
            for (i=0;i<4;i++){
                for(j=i+1;j<4;j++){
                    if (a[j]>a[i]){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            for (int z=0; z<4; z++){
                value[x][z] = a[z];
            }
        }
        return value;
    }

    public void select3d6() {
        selection = "3d6";
        Dice dieRoll = new Dice();
        String[] result = new String[6];
        int[][] value = new int[6][3];
        int[] sum = new int[6];
        for (int x = 0; x <= 5; x++){
            result[x] = "";
            for (int y = 0; y < 2; y++){
                value[x][y] = dieRoll.d6();
                sum[x] += value[x][y];
                result[x] += value[x][y] + " + ";
            }
            value[x][2] = dieRoll.d6();
            sum[x] += value[x][2];
            result[x] += value[x][2] + " = " + sum[x];
        }
        for (int x = 0; x < 6; x++){
            scores[x] = sum[x];
        }
        tfSet1.setText(result[0]);
        tfSet2.setText(result[1]);
        tfSet3.setText(result[2]);
        tfSet4.setText(result[3]);
        tfSet5.setText(result[4]);
        tfSet6.setText(result[5]);
        btn3d6.setDisable(true);
        btn4d6.setDisable(false); btnAccept.setDisable(false);
    }

    public void acceptScores(ActionEvent actionEvent) throws IOException {
        final Stage stage, stage1;
        int i,j,temp;
        String eventHandle;

        for (i = 0; i < 6; i++){
            for (j = i+1; j < 6; j++){
                if (scores[j] > scores [i]){
                    temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        }
        for (int x = 0; x < 6; x++){
            System.out.print(scores[x] + " ");
        }
        System.out.println("\nScores Accepted");

        eventHandle = actionEvent.getEventType().toString();
        if ("ACTION".equals(eventHandle)){
            stage = (Stage) btnAccept.getScene().getWindow();
            stage.close();
        }

        FXMLLoader loader =  new FXMLLoader(getClass().getResource("selections.fxml"));
        Parent selScene = (Parent) loader.load();

        selController sController = loader.getController();
        sController.dataTransfer(scores);

        stage1 = new Stage();
        stage1.getIcons().add(new Image("pictures/DnDBW.jpg"));
        stage1.setTitle("D&D Character Generator");
        stage1.setScene(new Scene(selScene));
        stage1.show();
    }

    public void rerollSelected() {
        if (selection.equals("3d6")){
            select3d6();
        }else{
            select4d6();
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
    }
}
