
package fx;

import java.io.File;
import java.util.*;

/**
 * 
 * @author Sam Belbeck
 * @author ashkanmohseni
 */

public class GameList extends Game {
    
    ArrayList<Game> GameList = new ArrayList<Game>();

    public GameList() {
    }

    public GameList(String homeTeam, int homeScore, String awayTeam, int awayScore, String gameDate) {
        super(homeTeam, homeScore, awayTeam, awayScore, gameDate);
    }
    
    public void add(Game add){
        
    }
    
    public void remove(Game remove){
        
    }

    @Override
    public String toString() {
        return "GameList=" + GameList ;
    }
    
    public GameList searchGameByTeam(String searchGameByTeam){
        
        return null;
    }
    
    public GameList searchGameByDate(String searchGameByDate){
        
        return null;
    }
    
    public void writeToFile(File writeToFile){
        
    }
    
    public void loadFromFile(File loadFromFile){
        
    }
    
}
