package main.DnD;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;



public class selController extends Application {

    public AnchorPane ddSelPane;
    public Label lblStat1;
    public Label lblStat2;
    public Label lblStat3;
    public Label lblStat4;
    public Label lblStat5;
    public Label lblStat6;
    public ChoiceBox cbRace;
    public ChoiceBox cbClass;
    public Button btnAccept;
    public TextField tfName;

    public ToggleGroup strGroup;
    public RadioButton rbStr1;    public RadioButton rbStr2;
    public RadioButton rbStr3;    public RadioButton rbStr4;
    public RadioButton rbStr5;    public RadioButton rbStr6;
    public ToggleGroup dexGroup;
    public RadioButton rbDex1;    public RadioButton rbDex2;
    public RadioButton rbDex3;    public RadioButton rbDex4;
    public RadioButton rbDex5;    public RadioButton rbDex6;
    public ToggleGroup conGroup;
    public RadioButton rbCon1;    public RadioButton rbCon2;
    public RadioButton rbCon3;    public RadioButton rbCon4;
    public RadioButton rbCon5;    public RadioButton rbCon6;
    public ToggleGroup intGroup;
    public RadioButton rbInt1;    public RadioButton rbInt2;
    public RadioButton rbInt3;    public RadioButton rbInt4;
    public RadioButton rbInt5;    public RadioButton rbInt6;
    public ToggleGroup wisGroup;
    public RadioButton rbWis1;    public RadioButton rbWis2;
    public RadioButton rbWis3;    public RadioButton rbWis4;
    public RadioButton rbWis5;    public RadioButton rbWis6;
    public ToggleGroup chaGroup;
    public RadioButton rbCha1;    public RadioButton rbCha2;
    public RadioButton rbCha3;    public RadioButton rbCha4;
    public RadioButton rbCha5;    public RadioButton rbCha6;



    ArrayList<String> races =
            new ArrayList<>(Arrays.asList("Dwarf", "Elf", "Halfling", "Human", "Gnome",
                    "Half Elf", "Half Orc", "Tiefling"));
    ArrayList<String> classes =
            new ArrayList<>(Arrays.asList("Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin",
                    "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"));
    public Integer[] scores = new Integer[6];

    @Override
    public void start(Stage stage) throws Exception {
        stage.getIcons().add(new Image("pictures/DnDSilver.jpg"));
        stage.setTitle("D&D Character Generator");



    }
    public void dataTransfer(Integer[] values){
        for (int x=0; x < 6; x++){
            System.out.print(values[x] + "\t");
            scores[x] = values[x];
        }
        System.out.println(" \nScores received");

        lblStat1.setText(scores[0].toString());
        lblStat2.setText(scores[1].toString());
        lblStat3.setText(scores[2].toString());
        lblStat4.setText(scores[3].toString());
        lblStat5.setText(scores[4].toString());
        lblStat6.setText(scores[5].toString());

        cbRace.getItems().addAll(races);
        cbClass.getItems().addAll(classes);
        setDataPoints();


    }

    private void setDataPoints() {
        cbRace.getSelectionModel().select(0);
        cbClass.getSelectionModel().select(0);
        rbStr1.setUserData(0);rbStr2.setUserData(1);rbStr3.setUserData(2);
        rbStr4.setUserData(3);rbStr5.setUserData(4);rbStr6.setUserData(5);
        rbStr1.setSelected(true);
        rbDex1.setUserData(0);rbDex2.setUserData(1);rbDex3.setUserData(2);
        rbDex4.setUserData(3);rbDex5.setUserData(4);rbDex6.setUserData(5);
        rbDex1.setSelected(true);
        rbCon1.setUserData(0);rbCon2.setUserData(1);rbCon3.setUserData(2);
        rbCon4.setUserData(3);rbCon5.setUserData(4);rbCon6.setUserData(5);
        rbCon1.setSelected(true);
        rbInt1.setUserData(0);rbInt2.setUserData(1);rbInt3.setUserData(2);
        rbInt4.setUserData(3);rbInt5.setUserData(4);rbInt6.setUserData(5);
        rbInt1.setSelected(true);
        rbWis1.setUserData(0);rbWis2.setUserData(1);rbWis3.setUserData(2);
        rbWis4.setUserData(3);rbWis5.setUserData(4);rbWis6.setUserData(5);
        rbWis1.setSelected(true);
        rbCha1.setUserData(0);rbCha2.setUserData(1);rbCha3.setUserData(2);
        rbCha4.setUserData(3);rbCha5.setUserData(4);rbCha6.setUserData(5);
        rbCha1.setSelected(true);


    }

    private boolean checkToggles() {
        boolean check;
        String a; String b; String c; String d; String e; String f;

        a = strGroup.getSelectedToggle().getUserData().toString();
        b = dexGroup.getSelectedToggle().getUserData().toString();
        c = conGroup.getSelectedToggle().getUserData().toString();
        d = intGroup.getSelectedToggle().getUserData().toString();
        e = wisGroup.getSelectedToggle().getUserData().toString();
        f = chaGroup.getSelectedToggle().getUserData().toString();

        check = !a.equals(b) && !a.equals(c) && !a.equals(d) && !a.equals(e) && !a.equals(f)
                && !b.equals(c) && !b.equals(d) && !b.equals(e) && !b.equals(f) &&
                !c.equals(d) && !c.equals(e) && !c.equals(f) && !d.equals(e) &&
                !d.equals(f) && !e.equals(f);


        return check;
    }


    public void acceptSelected(ActionEvent actionEvent) throws IOException {
        String race; String cClass; String name; String eventHandle;
        int str, dex, con, intel, wis, cha;

        race = cbRace.getSelectionModel().getSelectedItem().toString();
        cClass = cbClass.getSelectionModel().getSelectedItem().toString();
        System.out.println(race + " " + cClass);
        name = tfName.getText();

        str = scores[(Integer)strGroup.getSelectedToggle().getUserData()];
        dex = scores[(Integer)dexGroup.getSelectedToggle().getUserData()];
        con = scores[(Integer)conGroup.getSelectedToggle().getUserData()];
        intel = scores[(Integer)intGroup.getSelectedToggle().getUserData()];
        wis = scores[(Integer)wisGroup.getSelectedToggle().getUserData()];
        cha = scores[(Integer)chaGroup.getSelectedToggle().getUserData()];
        System.out.println("Str: "+ str +"\nDex: " + dex +"\nCon: " + con);

        eventHandle = actionEvent.getEventType().toString();
        if("ACTION".equals(eventHandle)){
            final Stage stage = (Stage) btnAccept.getScene().getWindow();
            stage.close();
        }
        FXMLLoader loader = new FXMLLoader(getClass().getResource("summary.fxml"));
        Parent summaryScene = (Parent) loader.load();

        sumController sumControl = loader.getController();
        sumControl.dataIntegration(str, dex, con, intel, wis, cha, name, race, cClass);

        final Stage stage = new Stage();
        stage.getIcons().add(new Image("pictures/DnDBW.jpg"));
        stage.setTitle(name + " Character Summary");
        stage.setHeight(425);  stage.setWidth(600);
        stage.setScene(new Scene(summaryScene));
        stage.show();


    }

    public void resetSelected(ActionEvent actionEvent) {
        rbStr1.setSelected(false);rbStr2.setSelected(false);rbStr3.setSelected(false);rbStr4.setSelected(false);rbStr5.setSelected(false);rbStr6.setSelected(false);
        rbDex1.setSelected(false);rbDex2.setSelected(false);rbDex3.setSelected(false);rbDex4.setSelected(false);rbDex5.setSelected(false);rbDex6.setSelected(false);
        rbCon1.setSelected(false);rbCon2.setSelected(false);rbCon3.setSelected(false);rbCon4.setSelected(false);rbCon5.setSelected(false);rbCon6.setSelected(false);
        rbInt1.setSelected(false);rbInt2.setSelected(false);rbInt3.setSelected(false);rbInt4.setSelected(false);rbInt5.setSelected(false);rbInt6.setSelected(false);
        rbWis1.setSelected(false);rbWis2.setSelected(false);rbWis3.setSelected(false);rbWis4.setSelected(false);rbWis5.setSelected(false);rbWis6.setSelected(false);
        rbCha1.setSelected(false);rbCha2.setSelected(false);rbCha3.setSelected(false);rbCha4.setSelected(false);rbCha5.setSelected(false);rbCha6.setSelected(false);

        btnAccept.setDisable(true);
    }

    public void setScores(ActionEvent actionEvent) {

        if (checkToggles()) {
            btnAccept.setDisable(false);
        } else {
            JOptionPane.showMessageDialog(null, "You cannot use the same score for multiple scores","Error", JOptionPane.ERROR_MESSAGE );
            btnAccept.setDisable(true);
        }
    }
}
