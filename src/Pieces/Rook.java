package Pieces;

public class Rook extends Piece{
    public Rook(boolean white, int position){
        super(white, position);
    }

    @Override
    public boolean isValid(int to, boolean capture, boolean castle, Piece[] squares) {
        return false;
    }

    public String toString(){
        return this.isWhite() ? "R" : "r";
    }

    public boolean isValid(int to){
        return false;
    }
}
