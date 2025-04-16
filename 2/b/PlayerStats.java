package b;
public class PlayerStats {
    private String playerName;
    private int gamesPlayed;
    private int goalsScored;

    public PlayerStats(String playerName) {
        this.playerName = playerName;
        this.gamesPlayed = 0;
        this.goalsScored = 0;
    }

    public void playGame() {
        gamesPlayed++;
    }

    public void scoreGoal() {
        goalsScored++;
    }

    public void displayStats() {
        System.out.println("Player: " + playerName);
        System.out.println("Games Played: " + gamesPlayed);
        System.out.println("Goals Scored: " + goalsScored);
    }
}


class FootballStats extends PlayerStats {
    private int assists;

    public FootballStats(String playerName) {
        super(playerName);
        this.assists = 0;
    }

    public void assistGoal() {
        assists++;
    }


    public void displayStats() {
        super.displayStats();
        System.out.println("Assists: " + assists);
    }
}


class CricketStats extends PlayerStats {
    private int runsScored;

    public CricketStats(String playerName) {
        super(playerName);
        this.runsScored = 0;
    }

    public void scoreRuns(int runs) {
        runsScored += runs;
    }


    public void displayStats() {
        super.displayStats();
        System.out.println("Runs Scored: " + runsScored);
    }
}


