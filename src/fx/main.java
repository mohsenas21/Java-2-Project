package fx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
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
    TableView<Game> table;
    TextField homeTeam,homeScore,awayTeam,awayScore,gameDate;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        // displaying everything
        Pane login = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
        Scene scene1 = new Scene(login, 900, 800);
        Pane root2 = FXMLLoader.load(getClass().getResource("FXMLSchedule.fxml"));
        Scene sceneX = new Scene(root2, 900, 800);
        window.setScene(sceneX);
        window.setTitle("NHL Stat System");
        window.show();
        
        // added font
//        Label welcome = new Label("Welcome to the NHL Stat System");
//        welcome.setFont(Font.loadFont("file:resources/fonts/Noteworthy-Lt.woff", 35));

        //First button
//        Button loginBtn = new Button();
//        loginBtn.setText("Submit");
//        loginBtn.setFont(Font.loadFont("file:resources/fonts/GillSansStd-Light.otf", 20));
//        loginBtn.setOnAction(e -> window.setScene(scene2));//switch to scene2 where we can display the scores

        //HBox for logo and description
//        HBox logoDesc = new HBox(25);
//        ImageView logo = new ImageView(new Image("file:resources/images/nhl.png"));
//        logo.setFitHeight(100);
//        logo.setFitWidth(80);
//        logoDesc.setAlignment(Pos.CENTER);
//        Label description = new Label("Our app does blah blah _____");
//        description.setFont(Font.loadFont("file:resources/fonts/MADE Mirage Regular PERSONAL USE.otf", 20));
//        logoDesc.getChildren().addAll(logo, description);
        
        
        //instruction label
//        Label login = new Label("Please login to be able to change the schedule!");
//        login.setFont(Font.loadFont("file:resources/fonts/Calibri Light.ttf", 27));
        
        //username text field
//        TextField userName = new TextField("username");
//        userName.setFont(Font.loadFont("file:resources/fonts/AvenirLTStd-Light.otf", 14));
//        userName.setMaxWidth(200);
        
        //password text field
//        PasswordField password = new PasswordField();
//        password.setMaxWidth(200);
        
        // VBox is used for the spaces between our bottuns (so like a header I guess)
//        VBox layout1 = new VBox(15);
//        layout1.setAlignment(Pos.CENTER);
//        layout1.getChildren().addAll(welcome, logoDesc,login, userName, password, loginBtn);
//        scene1 = new Scene(layout1, 600, 375);
//        scene1.getStylesheets().add(getClass().getResource("fxml.css").toExternalForm());

        //Second button
//        Button btn2 = new Button();
//        btn2.setText("Back to the main page");
//        btn2.setOnAction(e -> window.setScene(scene1));
        
        //Label welcome2 = new Label("Welcome to the NHL Stat System");
        //welcome2.setFont(Font.font("noteworthy", FontWeight.BOLD, 35));
        
//        //Home team Column
//        TableColumn<Game, String> homeT = new TableColumn<>("Home Team");
//        homeT.setMinWidth(100);
//        homeT.setCellValueFactory(new PropertyValueFactory<>("homeTeam"));
//        homeTeam = new TextField();
//        homeTeam.setPromptText("Home Team");
//        homeTeam.setMinWidth(60);
//       
//        
//        //Home team Score Column
//        TableColumn<Game, String> homeS = new TableColumn<>("Home Score");
//        homeS.setMinWidth(70);
//        homeS.setCellValueFactory(new PropertyValueFactory<>("homeScore"));    
//        homeScore = new TextField();
//        homeScore.setPromptText("Home Score");
//        homeScore.setMinWidth(30); 
//        
//        //Away team Column
//        TableColumn<Game, String> awayT = new TableColumn<>("Away Team");
//        awayT.setMinWidth(100);
//        awayT.setCellValueFactory(new PropertyValueFactory<>("awayTeam"));        
//        awayTeam = new TextField();
//        awayTeam.setPromptText("Away Team");
//        awayTeam.setMinWidth(60);
//        
//        //Away team Score Column
//        TableColumn<Game, String> awayS = new TableColumn<>("Away Score");
//        awayS.setMinWidth(70);
//        awayS.setCellValueFactory(new PropertyValueFactory<>("awayScore"));
//        awayScore = new TextField();
//        awayScore.setPromptText("Away Score");
//        awayScore.setMinWidth(30);
//        
//        //Date Column
//        TableColumn<Game, String> date = new TableColumn<>("Date");
//        date.setMinWidth(100);
//        date.setCellValueFactory(new PropertyValueFactory<>("gameDate"));
//        gameDate = new TextField();
//        gameDate.setPromptText("Game Date");
//        gameDate.setMinWidth(60);

//        // Add Button
//        Button add = new Button("Add");
//        add.setOnAction(e -> addMethod());
//        
//        // Delete Button
//        Button delete = new Button("Delete");
//        delete.setOnAction(e -> deleteMethod());
        
        // Back to main Page Button
//        Button main = new Button("Back");
//        main.setOnAction(e -> window.setScene(scene1));
        
        // The HBox for adding or deleting options
//        HBox hbox = new HBox();
//        hbox.setPadding(new Insets(10,10,10,10));
//        hbox.setSpacing(10);
//        hbox.getChildren().addAll(homeTeam,homeScore,awayTeam,awayScore,gameDate,add,delete,main);
        
        // Our Table
//        table = new TableView<>();
//        table.setItems(schedule());
//        table.getColumns().addAll(homeT,homeS,awayT,awayS,date);

        // Stackpane puts the button in the center
//        VBox layout2 = new VBox();
//        layout2.getChildren().addAll(table,hbox);
//        scene2 = new Scene(layout2, 1070, 405);
        

        
        
    }
    
    
    // The Table
    public ObservableList<Game> schedule(){
        // we can import a file instead or just use it this way?
        ObservableList<Game> schedule = FXCollections.observableArrayList();
        schedule.add(new Game("1", new Team("Pittsburgh Pengiuns"), 3, new Team("Washington Capitals"), 4, "21.09.2026" ));
        return schedule;
    }
}