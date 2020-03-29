
package fx;

/**
 *
 * @author Sam Belbeck
 * @author Ashkan Mohseni
 */

public class Game {
    
    private String gameNumber;
    protected Team homeTeam;
    protected int homeScore;
    protected Team awayTeam;
    protected int awayScore;
    protected String gameDate;

    public Game() {
    }

    protected Game(String gameNumber, Team homeTeam, int homeScore, Team awayTeam, int awayScore, String gameDate) {
        this.gameNumber = gameNumber;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.gameDate = gameDate;
    }

    public String getGameNumber() {
        return gameNumber;
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

    public void setGameNumber(String gameNumber) {
        this.gameNumber = gameNumber;
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
        return "Game{" + "gameNumber=" + gameNumber + ", homeTeam=" + homeTeam 
                + ", homeScore=" + homeScore + ", awayTeam=" + awayTeam 
                + ", awayScore=" + awayScore + ", gameDate=" + gameDate + '}';
    }

    
}
