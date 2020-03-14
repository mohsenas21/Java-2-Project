
package fx;

/**
 *
 * @author Sam Belbeck
 * @author Ashkan Mohseni
 */

public class Game {
    
    protected Team homeTeam;
    protected Team awayTeam;
    protected int homeScore;
    protected int awayScore;
    protected String gameDate;

    public Game() {
    }

    protected Game(Team homeTeam, Team awayTeam, int homeScore, int awayScore, String gameDate) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.gameDate = gameDate;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
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

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(Team awayTeam) {
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
