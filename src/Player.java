public class Player {
    private int playerId;
    private String playerName;
    private int age;
    private Double score;

    public Player(int playerId, String playerName, int age, Double score) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.age = age;
        this.score = score;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void displayDetails() {
        System.out.println("Player ID: " + playerId);
        System.out.println("Player Name: " + playerName);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
    }

    public void updateScore(double newScore) {
        score += newScore;
        System.out.println(playerName + " gained " + " points -> + " + newScore + " points (now " + score + ")");
    }

    @Override
    public String toString() {
        return playerName + " (ID: " + playerId + ")";
    }
}

