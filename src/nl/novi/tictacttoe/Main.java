package nl.novi.tictacttoe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welkom bij Boter, kaas en eieren");

        // Stap 1 : MAKEN EN WEERGEVEN VAN HET BORD IN DE CONSOLE
        Field[] board = new Field[9];

        for (int i = 0; i < 9; i++) {
            board[i] = new Field(Integer.toString(i));
//
        }

        printBoard(board);

        Player playerA = new Player("kruisje", "x");
        Player playerB = new Player("rondje", "o");

        Game game = new Game(playerA, playerB);


        boolean hasWon = false;

        while (hasWon == false) {

            //Stap 2: SPELER MOGELIJKHEID GEVEN OM EEN ZET TE DOEN

            System.out.println("\nVul het getal in van het veld waar jij een " + game.getCurrentPlayer().getName() + " wil zetten");

            Scanner userInput = new Scanner(System.in);
            int selectedField = userInput.nextInt();

            String currentPlayerToken = game.getCurrentPlayer().getToken();

            board[selectedField].setToken(currentPlayerToken);


            //Stap 3: KIJKEN OF SPELER HEEFT GEWONNEN
//show board
            printBoard(board);

            hasWon = game.hasPlayerWon(board);

            if (hasWon) {
                game.getCurrentPlayer().setScore(1);
            }
            //wissel van speler
            game.switchPlayer();

        }
        //melding einde ronde
        System.out.println("\nSpeler " + playerA.getName() + " heeft een score van " + playerA.getScore());
        System.out.println("\nSpeler " + playerB.getName() + " heeft een score van " + playerB.getScore());

    }

    public static void printBoard(Field[] board) {

        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i].getToken());

            boolean isEndOfRow = (i + 1) % 3 == 0;
            boolean isLastField = i == 8;

            if (isEndOfRow == false) {
                System.out.print(" | ");
            }
            if (isEndOfRow && !isLastField) {
                System.out.println("\n__________");
            }

        }

    }
}






