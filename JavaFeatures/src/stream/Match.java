package stream;

public class Match {
    private String matchName;
    private int playerCount;

    public Match(String matchName, int playerCount) {
        this.matchName = matchName;
        this.playerCount = playerCount;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public String getMatchName() {
        return matchName;
    }
}
