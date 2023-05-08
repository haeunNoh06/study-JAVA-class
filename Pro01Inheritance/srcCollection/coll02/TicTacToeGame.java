package coll02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeGame {
    private char[][] board;
    private char currentPlayerSymbol;

    public TicTacToeGame() {
        board = new char[3][3];
        currentPlayerSymbol = 'X';
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = '-';
            }
        }
    }

    public void printBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        boolean isFull = true;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == '-') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    public boolean isWinner(char symbol) {
        boolean isWinner = false;
        // Check rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == symbol && board[row][1] == symbol && board[row][2] == symbol) {
                isWinner = true;
            }
        }
        // Check columns
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == symbol && board[1][col] == symbol && board[2][col] == symbol) {
                isWinner = true;
            }
        }
        // Check diagonals
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            isWinner = true;
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            isWinner = true;
        }
        return isWinner;
    }
    
    public char getCurrentPlayerSymbol() {
        return currentPlayerSymbol;
    }

    public void makeMove(int row, int col) {
        if (board[row][col] != '-') {
            System.out.println("Invalid move, try again.");
        } else {
            board[row][col] = currentPlayerSymbol;
            if (isWinner(currentPlayerSymbol)) {
                System.out.println("Congratulations, " + currentPlayerSymbol + " wins!");
            } else if (isBoardFull()) {
                System.out.println("It's a tie!");
            } else {
                switchPlayer();
            }
        }
    }

    private void switchPlayer() {
        if (currentPlayerSymbol == 'X') {
            currentPlayerSymbol = 'O';
        } else {
            currentPlayerSymbol = 'X';
        }
        System.out.println("It's " + currentPlayerSymbol + "'s turn.");
    }

    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
    }
}