package sample.model;

import java.util.ArrayList;
import java.util.List;

import static sample.model.FigureColor.black;
import static sample.model.FigureColor.white;

public class Queen extends Figure {

    public Queen(int pos_vertical, int pos_horizontal, FigureColor color) {
        this.posVertical = pos_vertical;
        this.posHorizontal = pos_horizontal;
        this.color = color;
    }


    public List<Pair<Integer, Integer>> getPossibleMoves() {
        List<Pair<Integer, Integer>> possibleMoves = new ArrayList<>();
        for (int i = 1; i < 8 - posVertical; i++) {
            if (!ChessBoard.isSameColor(posVertical + i, posHorizontal, color)) {
                if (ChessBoard.board[posVertical + i][posHorizontal] != null) {
                    possibleMoves.add(new Pair<>(posVertical + i, posHorizontal));
                    break;
                } else possibleMoves.add(new Pair<>(posVertical + i, posHorizontal));
            }
            else break;
        }
        for (int i = 1; i < posVertical + 1; i++) {
            if (!ChessBoard.isSameColor(posVertical - i, posHorizontal, color)) {
                if (ChessBoard.board[posVertical - i][posHorizontal] != null) {
                    possibleMoves.add(new Pair<>(posVertical - i, posHorizontal));
                    break;
                } else possibleMoves.add(new Pair<>(posVertical - i, posHorizontal));
            }
            else break;
        }
        for (int i = 1; i < posHorizontal + 1; i++) {
            if (!ChessBoard.isSameColor(posVertical, posHorizontal - i, color)) {
                if (ChessBoard.board[posVertical][posHorizontal - i] != null) {
                    possibleMoves.add(new Pair<>(posVertical, posHorizontal - i));
                    break;
                } else possibleMoves.add(new Pair<>(posVertical, posHorizontal - i));
            }
            else break;
        }
        for (int i = 1; i < 8 - posHorizontal; i++) {
            if (!ChessBoard.isSameColor(posVertical, posHorizontal + i, color)) {
                if (ChessBoard.board[posVertical][posHorizontal + i] != null) {
                    possibleMoves.add(new Pair<>(posVertical, posHorizontal + i));
                    break;
                } else possibleMoves.add(new Pair<>(posVertical, posHorizontal + i));
            }
            else break;
        }
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

    public void setPos_horizontal(int posHorizontal) {
        this.posHorizontal = posHorizontal;
    }
}
