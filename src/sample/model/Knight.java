package sample.model;

import java.util.ArrayList;
import java.util.List;

import static sample.model.FigureColor.black;
import static sample.model.FigureColor.white;

public class Knight extends Figure {

    public Knight(int pos_vertical, int pos_horizontal, FigureColor color) {
        this.posVertical = pos_vertical;
        this.posHorizontal = pos_horizontal;
        this.color = color;
    }




    public List<Pair<Integer, Integer>> getPossibleMoves() {
        List<Pair<Integer, Integer>> possibleMoves = new ArrayList<>();
        if (ChessBoard.board[posVertical][posHorizontal] == this) {
            if (posVertical - 2 >= 0 && posHorizontal - 1 >= 0 && !ChessBoard.isSameColor(posVertical - 2, posHorizontal - 1, color))
                possibleMoves.add(new Pair<>(posVertical - 2, posHorizontal - 1));
            if (posVertical - 2 >= 0 && posHorizontal + 1 <= 7 && !ChessBoard.isSameColor(posVertical - 2, posHorizontal + 1, color))
                possibleMoves.add(new Pair<>(posVertical - 2, posHorizontal + 1));
            if (posVertical + 2 <= 7 && posHorizontal - 1 >= 0 && !ChessBoard.isSameColor(posVertical + 2, posHorizontal - 1, color))
                possibleMoves.add(new Pair<>(posVertical + 2, posHorizontal - 1));
            if (posVertical + 2 <= 7 && posHorizontal + 1 <= 7 && !ChessBoard.isSameColor(posVertical + 2, posHorizontal + 1, color))
                possibleMoves.add(new Pair<>(posVertical + 2, posHorizontal + 1));
            if (posVertical - 1 >= 0 && posHorizontal - 2 >= 0 && !ChessBoard.isSameColor(posVertical - 1, posHorizontal - 2, color))
                possibleMoves.add(new Pair<>(posVertical - 1, posHorizontal - 2));
            if (posVertical + 1 <= 7 && posHorizontal - 2 >= 0 && !ChessBoard.isSameColor(posVertical + 1, posHorizontal - 2, color))
                possibleMoves.add(new Pair<>(posVertical - 1, posHorizontal + 2));
            if (posVertical - 1 >= 0 && posHorizontal + 2 <= 7 && !ChessBoard.isSameColor(posVertical - 1, posHorizontal + 2, color))
                possibleMoves.add(new Pair<>(posVertical - 1, posHorizontal + 2));
            if (posVertical + 1 <= 7 && posHorizontal + 2 <= 7 && !ChessBoard.isSameColor(posVertical + 1, posHorizontal + 2, color))
                possibleMoves.add(new Pair<>(posVertical + 1, posHorizontal + 2));
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
