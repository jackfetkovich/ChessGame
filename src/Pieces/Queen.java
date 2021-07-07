package Pieces;

public class Queen extends Piece {
    public Queen(boolean white, int position){
        super(white, position);
    }

    @Override
    public boolean isValid(int to, boolean capture, boolean castle) {
        return false;
    }

    public String toString(){
        return this.isWhite() ? "Q" : "q";
    }


}
