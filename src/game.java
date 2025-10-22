public class game {
    private int gameId;
    private String title;
    private String genre;
    private Double price;
    private int copiesSold;

    public game(int gameId, String title, String genre, Double price) {
        this.gameId = gameId;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.copiesSold = copiesSold;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getTitle() {
        return title;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    public void displayDetails() {
        System.out.println("Game ID: " + gameId);
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);

    }

    @Override
    public String toString() {
        return title + " (ID: " + gameId + ")";
    }
}
