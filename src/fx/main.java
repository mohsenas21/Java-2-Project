package fx;

import java.awt.Color;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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
        
        // added font
        Label welcome = new Label("Welcome to the NHL Stat System");
        welcome.setFont(Font.loadFont("file:resources/fonts/Noteworthy-Lt.woff", 35));

        //First button
        Button loginBtn = new Button();
        loginBtn.setText("Submit");
        loginBtn.setFont(Font.loadFont("file:resources/fonts/GillSansStd-Light.otf", 20));
        loginBtn.setOnAction(e -> window.setScene(scene2));//switch to scene2 where we can display the scores

        //HBox for logo and description
        HBox logoDesc = new HBox(25);
        ImageView logo = new ImageView(new Image("file:resources/images/nhl.png"));
        logo.setFitHeight(100);
        logo.setFitWidth(80);
        logoDesc.setAlignment(Pos.CENTER);
        Label description = new Label("Our app does blah blah _____");
        description.setFont(Font.loadFont("file:resources/fonts/MADE Mirage Regular PERSONAL USE.otf", 20));
        logoDesc.getChildren().addAll(logo, description);
        
        
        //instruction label
        Label login = new Label("Please login to be able to change the schedule!");
        login.setFont(Font.loadFont("file:resources/fonts/Calibri Light.ttf", 27));
        
        //username text field
        TextField userName = new TextField("username");
        userName.setFont(Font.loadFont("file:resources/fonts/AvenirLTStd-Light.otf", 14));
        userName.setMaxWidth(200);
        
        //password text field
        PasswordField password = new PasswordField();
        password.setMaxWidth(200);
        
        // VBox is used for the spaces between our bottuns (so like a header I guess)
        VBox layout1 = new VBox(15);
        layout1.setAlignment(Pos.CENTER);
        layout1.getChildren().addAll(welcome, logoDesc,login, userName, password, loginBtn);
        scene1 = new Scene(layout1, 600, 375);
        scene1.getStylesheets().add(getClass().getResource("fxml.css").toExternalForm());

        //Second button
        Button btn2 = new Button();
        btn2.setText("Back to the main page");
        btn2.setOnAction(e -> window.setScene(scene1));
        
        Label welcome2 = new Label("Welcome to the NHL Stat System");
        welcome2.setFont(Font.font("noteworthy", FontWeight.BOLD, 35));
        

        // Stackpane puts the button in the center
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(btn2);
        scene2 = new Scene(layout2, 600, 375);
        
        //displaying everything
        window.setScene(scene1);
        window.setTitle("NHL Stat System");
        window.show();

    }

}