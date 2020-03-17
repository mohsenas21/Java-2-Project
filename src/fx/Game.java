
package fx;

/**
 *
 * @author Sam Belbeck
 * @author Ashkan Mohseni
 */

public class Game {
    
    protected String homeTeam;
    protected int homeScore;
    protected String awayTeam;
    protected int awayScore;
    protected String gameDate;

    public Game() {
    }

    protected Game(String homeTeam, int homeScore, String awayTeam, int awayScore, String gameDate) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.gameDate = gameDate;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public String getGameDate() {
        return gameDate;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public void setGameDate(String gameDate) {
        this.gameDate = gameDate;
    }

    @Override
    public String toString() {
        return "homeTeam = " + homeTeam + "\nawayTeam = " 
                + awayTeam + "\nhomeScore = " + homeScore 
                + "\nawayScore = " + awayScore + "\ngameDate = " 
                + gameDate;
    }
    
}
