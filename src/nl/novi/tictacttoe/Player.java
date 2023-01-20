package nl.novi.tictacttoe;

public class Player {

    //attributen of velden
    private String name;
    private String token;
    private int score;

    //constructors
    public Player(String name, String token) {
        this.name = name;
        this.token = token;
        this.score = 0;
    }


    //methodes/functies
    public int getScore() {
        return this.score;
    }

    public String getName() {
        return this.name;
    }

    public String getToken() {
        return this.token;
    }

    public void setScore(int extraPoints) {
        score = score + extraPoints;
    }

}
