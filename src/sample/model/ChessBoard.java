package sample.model;

import javafx.scene.Node;

public class ChessBoard {

    public static Figure[][] board = new Figure[8][8];


    public static boolean isSameColor(int posVertical, int posHorizontal, FigureColor color) {
        return board[posVertical][posHorizontal] != null && board[posVertical][posHorizontal].getColor() == color;
    }

    public static boolean isDifferentColor(int posVertical, int posHorizontal, FigureColor color) {
        return board[posVertical][posHorizontal] != null && board[posVertical][posHorizontal].getColor() != color;
    }
    public static Figure[][] getBoard() {
        return board;
    }

    public static Figure at(int posVertical,int posHorizontal) {
        return board[posVertical][posHorizontal];
    }
}
