
package fx;

/**
 * 
 * @author Sam Belbeck
 * @author Ashkan Mohseni
 */

public enum Team {
    
    CAROLINA("Carolina Hurricanes", 1),
    COLUMBUS_BLUEJACKET("Columbus Blue Jackets",2),
    NEW_JERSEY_DEVILS("New Jersey Devils", 3),
    NEW_YORK_ISLANDERS("New York Islanders", 4),
    NEW_JERSEY_DEVILSS("New York Rangers", 5),
    NEW_YORK_ISLANDERS1("Philadelphia Flyers", 6),
    NEW_YORK_ISLANDERS2("Pittsburgh Penguins", 7),
    WASHINGTON_CAPITALS("Washington Capitals", 8),
    CHICAGO_BLACKHAWKS("Chicago Blackhawks", 9),
    COLORADO_AVALANCHE("Colorado Avalanche", 10),
    DALLAS_STARS("Dallas Stars", 11),
    MINNESOTA_WILD("Minnesota Wild", 12),
    NASHVILLE_PREDATORS("Nashville Predators", 13),
    ST_LOUIS_BLUES("St. Louis Blues", 14),
    WINNIPG_JETS("Winnipeg Jets", 15),
    ANAHEIM_DUCKS("Anaheim Ducks", 16),
    ARIZONA_COYOTES("Arizona Coyotes", 17),
    CALGARY_FLAMES("Calgary Flames", 18),
    EDMONTON_OLIERS("Edmonton Oilers", 19),
    LOS_ANGELES_KINGS("Los Angeles Kings", 20),
    SAN_JOSE_SHARKS("San Jose Sharks", 21),
    VANCOUVER_CANUCKS("Vancouver Canucks", 22),
    VEGAS_GOLDEN_KNIGHTS("Vegas Golden Knights", 23),
    BOSTON_BRUINS("Boston Bruins", 24),
    BUFFALO_SABRES("Buffalo Sabres", 25),
    DETROIT_RED_WINGS("Detroit Red Wings", 26),
    FLORIDA_PANTHERS("Florida Panthers", 27),
    MONTRAL_CANADIENS("Montreal Canadiens", 28),
    OTTAWA_SENATORS("Ottawa Senators", 29),
    TAMPA_BAY_LIGHTNING("Tampa Bay Lightning", 30),
    TORONTO_MAPLE_LEAFS("Toronto Maple Leafs", 31);
    
    
    private String fullName;
    private int teamNumber;
    private String division;

    private Team(String fullName, int teamNumber) {
    }

    private Team(String fullName, int teamNumber, String division) {
        this.fullName = fullName;
        this.teamNumber = teamNumber;
        this.division = division;
    }

    public String getFullName() {
        return fullName;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public String getDivision() {
        return division;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    
    
}
