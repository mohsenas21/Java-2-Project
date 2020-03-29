/*
        [Class name]
        Author:
        Date:

        Description
        
    */

package fx;

/**
 *
 * @author S.B.
 */
public class Team {
    private String teamName;
    private int wins;
    private int losses;
    private int oTLosses;
    
    public Team () {
        this.teamName = "";
        this.wins = 0;
        this.losses = 0;
        this.oTLosses = 0;
    }

    public Team (String teamName) {
        this.teamName = teamName;
        this.wins = 0;
        this.losses = 0;
        this.oTLosses = 0;
    }    

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getoTLosses() {
        return oTLosses;
    }

    public void setoTLosses(int oTLosses) {
        this.oTLosses = oTLosses;
    }

    private double calculatePoints(int wins, int oTLosses) {
        return 2 * wins + 1 * oTLosses;
    }

    @Override
    public String toString() {
        return "W-L-OTL: " + wins + "-" + losses + "-" + oTLosses 
                + " Total Points:" + calculatePoints(wins, oTLosses);
            
    }
    
    
    
    
}
