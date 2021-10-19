package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
public class JavaFxRadioButtonTutorial extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        try {

            primaryStage.setTitle("Radio Button Tutorial - tutorialkart.com"); // set title
            RadioButton radioButton1 = new RadioButton("Option 1");  //javafx radio buttons
            RadioButton radioButton2 = new RadioButton("Option 2");
            RadioButton radioButton3 = new RadioButton("Option 3");
            ToggleGroup radioGroup = new ToggleGroup(); //a group for radio buttons
            radioButton1.setToggleGroup(radioGroup); //to group radio buttons
            radioButton2.setToggleGroup(radioGroup);
            radioButton3.setToggleGroup(radioGroup);
            TilePane tilePane = new TilePane();// tile pane
            tilePane.getChildren().add(radioButton1);// add radio buttons to the tile pane
            tilePane.getChildren().add(radioButton2);
            tilePane.getChildren().add(radioButton3);
            Scene scene = new Scene(tilePane, 400, 100); //set up scene
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}