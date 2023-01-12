package nl.novi.tictacttoe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welkom bij Boter, kaas en eieren");

        // Stap 1 : MAKEN EN WEERGEVEN VAN HET BORD IN DE CONSOLE
        String[] board = new String[9];

        for (int i = 0; i < 9; i++) {
            board[i] = Integer.toString(i);
//            System.out.println(board[i]);
        }

        printBoard(board);

        String currentPlayer = "x";

        while (true) {

            //Stap 2: SPELER MOGELIJKHEID GEVEN OM EEN ZET TE DOEN

            System.out.println("\nVul het getal in van het veld waar jij een " + currentPlayer + " wil zetten");

            Scanner userInput = new Scanner(System.in);
            int selectedField = userInput.nextInt();

            board[selectedField] = currentPlayer;


            //Stap 3: KIJKEN OF SPELER HEEFT GEWONNEN

            printBoard(board);


            //Stap 4: GEEF ANDERE SPELER MOGELIJKHEID OM EEN ZET TE DOEN


            currentPlayer = switchPlayer(currentPlayer);

        }


        //Stap 5: OPNIEUW KIJKEN OF SPELER HEEFT GEWONNEN



        //HERHAAL STAPPEN 2/5


    }

    public static void printBoard(String[] board) {

        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i]);

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

    public static String switchPlayer(String currentPlayer) {
        if (currentPlayer == "x") {
            return "o";
        } else {
            return "x";
        }

    }

}




