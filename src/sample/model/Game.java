package sample.model;

import java.util.List;
import java.util.Map;

import static sample.model.FigureColor.black;
import static sample.model.FigureColor.white;


public class Game {
    ChessBoard board;

    public Game() {
        board = new ChessBoard();
        startGame();
        printBoard();
    }

    public void startGame() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 6) board.getBoard()[i][j] = new Pawn(i, j, white);
                else if (i == 1) board.getBoard()[i][j] = new Pawn(i, j, black);
                else if (i == 7 && (j == 1 || j == 6)) board.getBoard()[i][j] = new Knight(i, j, white);
                else if (i == 0 && (j == 1 || j == 6)) board.getBoard()[i][j] = new Knight(i, j, black);
                else if (i == 7 && (j == 0 || j == 7)) board.getBoard()[i][j] = new Rook(i, j, white);
                else if (i == 0 && (j == 0 || j == 7)) board.getBoard()[i][j] = new Rook(i, j, black);
                else if (i == 7 && (j == 2 || j == 5)) board.getBoard()[i][j] = new Bishop(i, j, white);
                else if (i == 0 && (j == 2 || j == 5)) board.getBoard()[i][j] = new Bishop(i, j, black);
                else if (i == 7 && (j == 3)) board.getBoard()[i][j] = new Queen(i, j, white);
                else if (i == 0 && (j == 3)) board.getBoard()[i][j] = new Queen(i, j, black);
                else if (i == 7) board.getBoard()[i][j] = new King(i, j, white);
                else if (i == 0) board.getBoard()[i][j] = new King(i, j, black);
                else board.getBoard()[i][j] = null;
            }
        }
    }


    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board.getBoard()[i][j]);
            }
            System.out.println();
        }
    }


}
