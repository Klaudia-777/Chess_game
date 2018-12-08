package sample.model;

import java.util.List;

public abstract class Figure {
    protected int posVertical;
    protected int posHorizontal;
    protected FigureColor color;

    protected void move(int toPosVertical, int toPosHorizontal){
            if(ChessBoard.board[this.getPosVertical()][this.getPosHorizontal()].getPossibleMoves().contains(new Pair<> (toPosVertical,toPosHorizontal))){

                ChessBoard.board[this.getPosVertical()][this.getPosHorizontal()]=null;
                this.posVertical=toPosVertical;
                this.posHorizontal=toPosHorizontal;
                ChessBoard.board[toPosVertical][toPosHorizontal]=this;

            }
        }




    public abstract List<Pair<Integer, Integer>> getPossibleMoves();

    public int getPosVertical() {
        return posVertical;
    }

    public int getPosHorizontal() {
        return posHorizontal;
    }

    public FigureColor getColor() {
        return color;
    }

}
