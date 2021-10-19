package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
public class JavaFxDatePickerTutorial extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        try {

            primaryStage.setTitle("JavaFX Date Picker - tutorialkart.com");// set title
            DatePicker datePicker = new DatePicker(); //javafx date picker
            TilePane tilePane = new TilePane();// tile pane
            tilePane.getChildren().add(datePicker);// add date picker to the tile pane
            Scene scene = new Scene(tilePane, 400, 400);//set up scene
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}