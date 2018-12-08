package sample.model;

import java.util.ArrayList;
import java.util.List;

import static sample.model.FigureColor.black;
import static sample.model.FigureColor.white;

public class Bishop extends Figure {


    public Bishop(int pos_vertical, int pos_horizontal, FigureColor color) {
        this.posVertical = pos_vertical;
        this.posHorizontal = pos_horizontal;
        this.color = color;
    }


    public List<Pair<Integer, Integer>> getPossibleMoves() {
        List<Pair<Integer, Integer>> possibleMoves = new ArrayList<>();
            for (int i = 1; i < 8; i++) {
                if (posVertical - i >= 0 && posHorizontal - i >= 0) {
                    if (!ChessBoard.isSameColor(posVertical - i, posHorizontal - i, color)) {
                        if (ChessBoard.board[posVertical - i][posHorizontal - i] != null) {
                            possibleMoves.add(new Pair<>(posVertical - i, posHorizontal - i));
                            break;
                        } else possibleMoves.add(new Pair<>(posVertical - i, posHorizontal - i));
                    }
                    else break;
                }
            }
            for (int i = 1; i < 8; i++) {
                if (posVertical + i < 8 && posHorizontal - i >= 0) {
                    if (!ChessBoard.isSameColor(posVertical + i, posHorizontal - i, color)) {
                        if (ChessBoard.board[posVertical + i][posHorizontal - i] != null) {
                            possibleMoves.add(new Pair<>(posVertical + i, posHorizontal - i));
                            break;
                        } else possibleMoves.add(new Pair<>(posVertical + i, posHorizontal - i));
                    }
                    else break;
                }
            }
            for (int i = 1; i < 8; i++) {
                if (posVertical - i >= 0 && posHorizontal + i < 8) {
                    if (!ChessBoard.isSameColor(posVertical - i, posHorizontal + i, color)) {
                        if (ChessBoard.board[posVertical - i][posHorizontal + i] != null) {
                            possibleMoves.add(new Pair<>(posVertical - i, posHorizontal + i));
                            break;
                        } else possibleMoves.add(new Pair<>(posVertical - i, posHorizontal + i));
                    }
                    else break;
                }
            }
            for (int i = 1; i < 8; i++) {
                if (posVertical + i < 8 && posHorizontal + i < 8) {
                    if (!ChessBoard.isSameColor(posVertical + i, posHorizontal + i, color)) {
                        if (ChessBoard.board[posVertical + i][posHorizontal + i] != null) {
                            possibleMoves.add(new Pair<>(posVertical + i, posHorizontal + i));
                            break;
                        } else possibleMoves.add(new Pair<>(posVertical + i, posHorizontal + i));
                    }
                    else break;
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
