package sample.model;

import static sample.model.FigureColor.black;
import static sample.model.FigureColor.white;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Figure {

    private boolean isFirstMove = true;


    public Pawn(int pos_vertical, int pos_horizontal, FigureColor color) {
        this.posVertical = pos_vertical;
        this.posHorizontal = pos_horizontal;
        this.color = color;
    }

    public List<Pair<Integer, Integer>> getPossibleMoves() {
        List<Pair<Integer, Integer>> possibleMoves = new ArrayList<>();
        if (color == white) {
            if (isFirstMove && ChessBoard.board[posVertical - 2][posHorizontal] == null) {
                possibleMoves.add(new Pair<>(posVertical - 2, posHorizontal));
                isFirstMove = false;
            }

            if (posVertical - 1 >= 0 && ChessBoard.board[posVertical - 1][posHorizontal] == null) {
                possibleMoves.add(new Pair<>(posVertical - 1, posHorizontal));

            } else if (ChessBoard.board[posVertical - 1][posHorizontal + 1] != null) {       // <-------------capture condition
                if (posVertical - 2 >= 0 && posHorizontal + 2 <= 7 && ChessBoard.board[posVertical - 1][posHorizontal + 1].getColor() == black)
                    possibleMoves.add(new Pair<>(posVertical - 2, posHorizontal + 2));
                else if (posVertical - 2 >= 0 && posHorizontal - 2 >= 0 && ChessBoard.board[posVertical - 1][posHorizontal - 1].getColor() == black)
                    possibleMoves.add(new Pair<>(posVertical - 2, posHorizontal - 2));
            }

        } else if (color == black) {

            if (isFirstMove && ChessBoard.board[posVertical + 2][posHorizontal] == null) {
                possibleMoves.add(new Pair<>(posVertical + 2, posHorizontal));
                isFirstMove = false;
            }
            if (posVertical + 1 <= 7 && ChessBoard.board[posVertical + 1][posHorizontal] == null) {
                possibleMoves.add(new Pair<>(posVertical + 1, posHorizontal));

            } else if (ChessBoard.board[posVertical + 1][posHorizontal + 1] != null) {       // <-------------capture condition
                if (posVertical + 2 <= 7 && posHorizontal + 2 <= 7 && ChessBoard.board[posVertical + 1][posHorizontal + 1].getColor() == white)
                    possibleMoves.add(new Pair<>(posVertical + 2, posHorizontal + 2));
                else if (posVertical + 2 <= 7 && posHorizontal - 2 >= 0 && ChessBoard.board[posVertical + 1][posHorizontal - 1].getColor() == white)
                    possibleMoves.add(new Pair<>(posVertical + 2, posHorizontal - 2));
            }

        }
        return possibleMoves;
    }





    @Override
    public int getPosVertical() {
        return posVertical;
    }

    public void setPosVertical(int posVertical) {
        this.posVertical = posVertical;
    }

    public int getPosHorizontal() {
        return posHorizontal;
    }

    public void setPosHorizontal(int posHorizontal) {
        this.posHorizontal = posHorizontal;
    }
}
