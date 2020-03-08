package fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author AshkanMohseni
 * @author SamBelbeck
 */
public class main extends Application {

    Button btn;
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;

        Label label1 = new Label("Welcome to the NHL Stat System");

        //First button
        Button btn1 = new Button();
        btn1.setText("Scores");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //switch to scene2 where we can display the scores
                window.setScene(scene2);
            }
        });

        // VBox is used for the spaces between our bottuns (so like a header I guess)
        VBox layout1 = new VBox(25);
        layout1.getChildren().addAll(label1, btn1);
        scene1 = new Scene(layout1, 600, 300);

        //Second button
        Button btn2 = new Button();
        btn2.setText("Back to the main page");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.setScene(scene1);
            }
        });

        // Stackpane puts the button in the center
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(btn2);
        scene2 = new Scene(layout2, 600, 300);

        //displaying everything
        window.setScene(scene1);
        window.setTitle("NHL Stat System");
        window.show();

    }

}
