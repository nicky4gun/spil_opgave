public class gamesystem {
    private game[] games;
    private player[] players;

    private int playerCount;
    private int gameCount;

    public gamesystem(int maxGames, int maxPlayers) {
        this.games = new game[maxGames];
        this.players = new player[maxPlayers];
        this.gameCount = 0;
        this.playerCount = 0;
    }

    public void addGame(game game) {
        if (gameCount < games.length && game != null) {
            games[gameCount++] = game;
            System.out.println("Spil er blivet tilføjet: " + game);
        }


    }

    public void addPlayer(player player) {
        if (playerCount < players.length && player != null) {
            players[playerCount++] = player;
            System.out.println("Spiller er blivet tilføjet: " + player);
        }


    }

    public void displayAllGames(){
        System.out.println("All games");
        for (game g : games) {
            System.out.println(g);
        }

    }

    public void displayAllPlayers(){
        System.out.println("All players");
        for (player p : players){
            System.out.println(p);
        }
    }

     public void updatePlayerScore(int playerId, double newScore) {
        player p = findPlayerById(playerId);
        if (p != null) {
            p.setScore(newScore);
            System.out.println("score opdateret for "+ p);

        } else  {
            System.out.println("Player " + playerId + " not found");
        }
     }

     public game findGamesByID(int gameId) {
        for (game g : games){
            if (g.getGameId() == gameId) {
                return g;
            }
        }
         return null;
     }

     public player findPlayerById(int playerId) {
        for  (player p : players) {
            if (p.getPlayerId() == playerId) {
                return p;
            }
        }
        return null;
     }

    public double calculateTotalRevenue() {
        double total = 0;
        for (int i = 0; i < gameCount; i++) {
            if (games[i] != null) {
                total += games[i].getPrice() * games[i].getCopiesSold();

            }
        }
        return total;
    }

    public player findTopScoringPlayer(){
        if(playerCount ==0) return null;
        player topplayer = players[0];
        for (int i=1;i< playerCount;i++){
            if (players[i] != null && players[i].getScore() > topplayer.getScore()){
                topplayer = players[i];
            }
        }
        return topplayer;
    }
}
