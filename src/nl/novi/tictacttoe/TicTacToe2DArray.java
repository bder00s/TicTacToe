package nl.novi.tictacttoe;

import java.util.Scanner;

public class TicTacToe2DArray {

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
        boolean hasWon = false;

        while (hasWon == false) {

            //Stap 2: SPELER MOGELIJKHEID GEVEN OM EEN ZET TE DOEN

            System.out.println("\nVul het getal in van het veld waar jij een " + currentPlayer + " wil zetten");

            Scanner userInput = new Scanner(System.in);
            int selectedField = userInput.nextInt();

            board[selectedField] = currentPlayer;


            //Stap 3: KIJKEN OF SPELER HEEFT GEWONNEN

            printBoard(board);

            hasWon = hasPlayerWon(board, currentPlayer);

            if (hasWon == true) {
                System.out.println("\nGefeliciteerd, je hebt gewonnen! " + currentPlayer);
            }

            currentPlayer = switchPlayer(currentPlayer);

        }

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

    public static boolean horizontalWin(String[] board, String currentPlayer) {
        if (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) {
            return true;
        }

        if (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) {
            return true;
        }

        if (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verticalWin(String[] board, String currentPlayer) {
        if (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) {
            return true;
        }

        if (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) {
            return true;
        }

        if (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean diagonalWin(String[] board, String currentPlayer) {
        if (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) {
            return true;
        }
        if (board[6] == currentPlayer && board[4] == currentPlayer && board[2] == currentPlayer) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasPlayerWon(String[] board, String currentPlayer) {

        if (horizontalWin(board, currentPlayer) == true || verticalWin(board, currentPlayer) == true || diagonalWin(board, currentPlayer) == true) {
            return true;
        } else {
            return false;
        }


    }


}






