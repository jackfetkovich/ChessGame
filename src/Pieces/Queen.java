package Pieces;

public class Queen extends Piece {
    public Queen(boolean white, int position){
        super(white, position);
    }

    public String toString(){
        return this.isWhite() ? "Q" : "q";
    }
    public boolean isValid(int to){
        return false;
    }
}
