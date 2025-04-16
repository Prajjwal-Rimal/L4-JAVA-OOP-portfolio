package b;

public class SportsStatsDriver {
    public static void main(String[] args) {
        FootballStats footballPlayer = new FootballStats("Lionel Messi");
        footballPlayer.playGame();
        footballPlayer.scoreGoal();
        footballPlayer.assistGoal();
        footballPlayer.displayStats();

        System.out.println();

        CricketStats cricketPlayer = new CricketStats("christ gayle");
        cricketPlayer.playGame();
        cricketPlayer.scoreRuns(90);
        cricketPlayer.scoreRuns(19);
        cricketPlayer.displayStats();
    }
}
