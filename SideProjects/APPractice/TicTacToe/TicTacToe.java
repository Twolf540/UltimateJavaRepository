package SideProjects.APPractice.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    private String[][] board;

    public TicTacToe() {
        board = new String[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = "[]";
            }
        }
    }

    public void printBoard() {
        for (int r = 0; r < 3; r++) {
            if (r == 0) {
                System.out.println("----------");
            }
            for (int c = 0; c < 3; c++) {
                if (c == 0) {
                    System.out.print("|" + board[r][c] + "|");
                } else {
                    System.out.print(board[r][c] + "|");
                }
            }
            System.out.println("\n----------");
        }
    }

    public boolean playerWin() {
        for (int r = 0; r < 3; r++) {
            if (board[r][0].equals("O")
                    && board[r][1].equals("O")
                    && board[r][2].equals("O")) {
                return true;
            }
        }
        for (int c = 0; c < 3; c++) {
            if (board[0][c].equals("O")
                    && board[1][c].equals("O")
                    && board[2][c].equals("O")) {
                return true;
            }
        }
        if (board[0][0].equals("O")
                && board[1][1].equals("O")
                && board[2][2].equals("O")) {
            return true;
        }
        if (board[0][2].equals("O")
                && board[1][1].equals("O")
                && board[2][0].equals("O")) {
            return true;
        }
        return false;
    }

    public boolean botWin() {
        for (int r = 0; r < 3; r++) {
            if (board[r][0].equals("X")
                    && board[r][1].equals("X")
                    && board[r][2].equals("X")) {
                return true;
            }
        }
        for (int c = 0; c < 3; c++) {
            if (board[0][c].equals("X")
                    && board[1][c].equals("X")
                    && board[2][c].equals("X")) {
                return true;
            }
        }
        if (board[0][0].equals("X")
                && board[1][1].equals("X")
                && board[2][2].equals("X")) {
            return true;
        }
        if (board[0][2].equals("X")
                && board[1][1].equals("X")
                && board[2][0].equals("X")) {
            return true;
        }
        return false;
    }

    public void playGame() {
        Scanner s = new Scanner(System.in);
        boolean notFull = true;
        while (notFull) {
            this.printBoard();
            boolean playerMove = true;
            while (playerMove) {
                System.out.println("Which row?");
                int row = Integer.parseInt(s.next());
                System.out.println("Which column?");
                int col = Integer.parseInt(s.next());
                if (board[row][col].equals("[]")) {
                    board[row][col] = "O";
                    playerMove = false;
                } else {
                    System.out.println("That space is already full. Please choose a different one.");
                }
            }
            boolean botMove = true;
            int count = 0;
            System.out.println("test");
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    if (board[r][c].equals("[]")) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                notFull = false;
                botMove = false;
                System.out.println("The game is a draw.");
            }
            while (botMove) {
                int botRow = (int) ((Math.random() * 3));
                int botCol = (int) ((Math.random() * 3));
                if (board[botRow][botCol].equals("[]")) {
                    board[botRow][botCol] = "X";
                    botMove = false;
                }
            }
            if (this.playerWin()) {
                this.printBoard();
                System.out.println("You won!");
                notFull = false;
            } else if (this.botWin()) {
                this.printBoard();
                System.out.println("The bot won.");
                notFull = false;
            }
        }
        s.close();
    }

    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.playGame();
    }
}