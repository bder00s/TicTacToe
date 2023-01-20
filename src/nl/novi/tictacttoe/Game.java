package nl.novi.tictacttoe;

public class Game {

    //velden
   private Player playerA;
   private Player playerB;
   private Player currentPlayer;


    //constructor
    public Game(Player playerA, Player playerB){
        this.playerA = playerA;
        this.playerB = playerB;

        currentPlayer = playerA;
    }

    public Player getCurrentPlayer(){
        return currentPlayer;
    }


    //methodes
    public void switchPlayer(){
       if (currentPlayer == playerA){
           currentPlayer = playerB;
       } else {
           currentPlayer = playerA;
       }
    }

    public boolean hasPlayerWon(Field[] board){
String currentPlayerToken = currentPlayer.getToken();

        //Horizontale opties
        if (board[0].getToken() == currentPlayer.getToken() && board[1].getToken() == currentPlayer.getToken() && board[2].getToken() == currentPlayer.getToken()) {
            return true;
        }

        if (board[3].getToken() == currentPlayer.getToken() && board[4].getToken() == currentPlayer.getToken() && board[5].getToken() == currentPlayer.getToken()) {
            return true;
        }

        if (board[6].getToken() == currentPlayer.getToken() && board[7].getToken() == currentPlayer.getToken() && board[8].getToken() == currentPlayer.getToken()) {
            return true;
        }

        //Verticale opties

        if (board[0].getToken() == currentPlayer.getToken() && board[3].getToken() == currentPlayer.getToken() && board[6].getToken() == currentPlayer.getToken()) {
            return true;
        }

        if (board[1].getToken() == currentPlayer.getToken() && board[4].getToken() == currentPlayer.getToken() && board[7].getToken() == currentPlayer.getToken()) {
            return true;
        }

        if (board[2].getToken() == currentPlayer.getToken() && board[5].getToken() == currentPlayer.getToken() && board[8].getToken() == currentPlayer.getToken()) {
            return true;
        }

        //Diagonale opties

        if (board[0].getToken() == currentPlayer.getToken() && board[4].getToken() == currentPlayer.getToken() && board[8].getToken() == currentPlayer.getToken()) {
            return true;
        }

        if (board[6].getToken() == currentPlayer.getToken() && board[4].getToken() == currentPlayer.getToken() && board[2].getToken() == currentPlayer.getToken()) {
            return true;
        } else {
            return false;
        }

    }


}
