package Pieces;

public class King extends Piece {

    public King(boolean white, int position){
        super(white, position);
    }

    public String toString(){
        return this.isWhite() ? "K" : "k";
    }
    public boolean isValid(int to){
        return false;
    }
}
