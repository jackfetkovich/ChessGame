package Pieces;

public class Rook extends Piece{
    public Rook(boolean white, int position){
        super(white, position);
    }

    public String toString(){
        return this.isWhite() ? "R" : "r";
    }

    public boolean isValid(int to){
        return false;
    }
}
