
public class Main {
    public static void main(String[] args) {
      gamesystem system = new gamesystem(2, 2);

      system.addGame(new game(1,"Minecraft","Sandbox",300.99,2));
      system.addGame(new game(2,"deadlock","Fps-moba",00.00,5));

      system.displayAllGames();

      system.addPlayer(new player(201,"bob",20,200.40));
      system.addPlayer(new player(202,"frank",21,2010.24));

      system.displayAllPlayers();

      system.updatePlayerScore(201,2000);

      System.out.println("Fundet Spil: " + system.findGamesByID(1));
      System.out.println("Fundet Spiller: " + system.findPlayerById(201));
    }
}