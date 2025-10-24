
public class Main {
    public static void main(String[] args) {
      Gamesystem system = new Gamesystem(2, 2);

      system.addGame(new Game(1,"Minecraft","Sandbox",300.99,2));
      system.addGame(new Game(2,"deadlock","Fps-moba",100.00,2));

      system.displayAllGames();

      system.addPlayer(new Player(201,"bob",20,200.40));
      system.addPlayer(new Player(202,"frank",21,2010.24));

      system.displayAllPlayers();

      system.updatePlayerScore(201,2000);

      System.out.println("Fundet Spil: " + system.findGamesByID(1));
      System.out.println("Fundet Spiller: " + system.findPlayerById(201));
      system.calculatetotalrevenue();
      system.displayTopScoringPlayer();
    }
}