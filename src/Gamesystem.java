public class Gamesystem {
    private Game[] games;
    private Player[] players;

    private int playerCount;
    private int gameCount;

    public Gamesystem(int maxGames, int maxPlayers) {
        this.games = new Game[maxGames];
        this.players = new Player[maxPlayers];
        this.gameCount = 0;
        this.playerCount = 0;
    }

    public void addGame(Game game) {
        if (gameCount < games.length && game != null) {
            games[gameCount++] = game;
            System.out.println("Spil er blivet tilføjet: " + game);
        }


    }

    public void addPlayer(Player player) {
        if (playerCount < players.length && player != null) {
            players[playerCount++] = player;
            System.out.println("Spiller er blivet tilføjet: " + player);
        }


    }
    public void displayAllGames(){
        System.out.println("All games");
        for (Game g : games) {
            System.out.println(g);
        }

    }
    public void displayAllPlayers(){
        System.out.println("All players");
        for (Player p : players){
            System.out.println(p);
        }
    }

     public void updatePlayerScore(int playerId, double newScore) {
        Player p = findPlayerById(playerId);
        if (p != null) {
            p.setScore(newScore);
            System.out.println("score opdateret for "+ p);

        } else  {
            System.out.println("Player " + playerId + " not found");
        }
     }

     public Game findGamesByID(int gameId) {
        for (Game g : games){
            if (g.getGameId() == gameId) {
                return g;
            }
        }
         return null;
     }

     public Player findPlayerById(int playerId) {
        for  (Player p : players) {
            if (p.getPlayerId() == playerId) {
                return p;
            }
        }
        return null;
     }
/*
    public double calculateTotalRevenue() {
        double total = 0;
        for (int i = 0; i < gameCount; i++) {
            if (games[i] != null) {
                total += games[i].getPrice() * games[i].

            }
        }

        return total;
        */
 /*
    }

    public Player findTopScoringPlayer(){
        if(playerCount ==0) return null;
        Player topplayer = players[0];
        for (int i=1;i< playerCount;i++){
            if (players[i] != null && players[i].getScore() > topplayer.getScore()){
                topplayer = players[i];
            }
        }
        return topplayer;
    }

  */
}
