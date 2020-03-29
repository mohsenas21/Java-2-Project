/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx;

import java.io.File;
import java.io.RandomAccessFile;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author sbelb
 */

public class ScheduleController implements Initializable {
    Stage stage;
    
    //add game variables
    @FXML
    private ComboBox<String> homeTeam;
    
    @FXML
    private ComboBox<String> awayTeam;
    
    @FXML
    private TextField homeScore;
        
    @FXML
    private TextField awayScore;
    
    @FXML
    private TextField date;
        
    @FXML
    private TextField gameNumber;
    
    
    //edit or delete game variables
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // if gamelist != null, set tableview to gamelist
        // set combo boxes to teams array   
        // set selected game info section to selected game info
    }    
    
    @FXML
    public void openFile() throws Exception{
        FileChooser chooseFile = new FileChooser();
        File fileSelected = chooseFile.showOpenDialog(stage);
        if (fileSelected != null) {
        RandomAccessFile file = new RandomAccessFile(fileSelected.getPath(), "rw");
//         //read file & display in table
        }
//        File file = new File("game.dat");

    }
    
    // file length: game number: string of 5 numbers = 10bytes?, hometeam = 
    @FXML
    private void readFile() throws Exception {
        //read file to input each game into game list.
    
    }

    @FXML
    private void writeFile() throws Exception {
        //write to file on add, edit or delete
    
    }
    
//    // Add Button Clicked
//    public void addMethod(){
//        Game game = new Game();
//        game.setHomeTeam(homeTeam.getText());
//        game.setHomeScore(Integer.parseInt(homeScore.getText()));
//        game.setAwayTeam(awayTeam.getText());
//        game.setAwayScore(Integer.parseInt(awayScore.getText()));
//        game.setGameDate(gameDate.getText());
//        
//        table.getItems().addAll(game);
//
//        homeTeam.clear();
//        homeScore.clear();
//        awayTeam.clear();
//        awayScore.clear();
//        gameDate.clear();
//    }
    
//    // Delete Button Clicked
//    public void deleteMethod(){
//        ObservableList<Game> gameSelected, allGame;
//        allGame = table.getItems();
//        gameSelected = table.getSelectionModel().getSelectedItems();
//        
//        allGame.removeAll(gameSelected);
//    }
    
}
