package nl.novi.tictacttoe;

public class Field {

    //velden/attributen
    private String token;
    private boolean isOccupied;


    //constructors
    public Field(String token) {
        this.token = token;
        isOccupied = false;
    }

    //methodes

    //SETTER
    public void setToken(String token) {
        if (isOccupied == false) {
            this.token = token;
        }
        isOccupied = true;
    }

    //GETTER
    public String getToken() {
        return token;
    }


}
