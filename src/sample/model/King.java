package sample.model;

import java.util.ArrayList;
import java.util.List;

import static sample.model.FigureColor.white;
import static sample.model.FigureColor.black;

public class King extends Figure {

    public King(int posVertical, int posHorizontal, FigureColor color) {
        this.posVertical = posVertical;
        this.posHorizontal = posHorizontal;
        this.color = color;
    }


    public List<Pair<Integer, Integer>> getPossibleMoves() {
        List<Pair<Integer, Integer>> possibleMoves = new ArrayList<>();
        if (ChessBoard.board[posVertical][posHorizontal] == this) {
            if (posVertical - 1 >= 0 && posHorizontal - 1 >= 0 && !ChessBoard.isSameColor(posVertical - 1, posHorizontal - 1, color))
                possibleMoves.add(new Pair<>(posVertical - 1, posHorizontal - 1));
            if (posVertical - 1 >= 0 && posHorizontal + 1 <= 7 && !ChessBoard.isSameColor(posVertical - 1, posHorizontal + 1, color))
                possibleMoves.add(new Pair<>(posVertical - 1, posHorizontal + 1));
            if (posVertical + 1 <= 7 && posHorizontal - 1 >= 0 && !ChessBoard.isSameColor(posVertical + 1, posHorizontal - 1, color))
                possibleMoves.add(new Pair<>(posVertical + 1, posHorizontal - 1));
            if (posVertical + 1 <= 7 && posHorizontal + 1 <= 7 && !ChessBoard.isSameColor(posVertical + 1, posHorizontal + 1, color))
                possibleMoves.add(new Pair<>(posVertical + 1, posHorizontal + 1));
            if (posVertical - 1 >= 0 && !ChessBoard.isSameColor(posVertical - 1, posHorizontal, color))
                possibleMoves.add(new Pair<>(posVertical - 1, posHorizontal));
            if (posVertical + 1 <= 7 && !ChessBoard.isSameColor(posVertical + 1, posHorizontal, color))
                possibleMoves.add(new Pair<>(posVertical + 1, posHorizontal));
            if (posHorizontal - 1 >= 0 && !ChessBoard.isSameColor(posVertical, posHorizontal - 1, color))
                possibleMoves.add(new Pair<>(posVertical, posHorizontal - 1));
            if (posHorizontal + 1 <= 7 && !ChessBoard.isSameColor(posVertical, posHorizontal + 1, color))
                possibleMoves.add(new Pair<>(posVertical, posHorizontal + 1));

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (ChessBoard.isDifferentColor(i, j, color)) {
                        for (Pair<Integer, Integer> possibleMove : possibleMoves)
                            if (ChessBoard.board[i][j].getPossibleMoves().contains(possibleMove))
                                possibleMoves.remove(possibleMove);

                    }
                }
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
