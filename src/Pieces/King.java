package Pieces;

public class King extends Piece {

    public King(boolean white, int position){
        super(white, position);
    }

    @Override
    public boolean isValid(int to, boolean capture, boolean castle) {
        return false;
    }

    public String toString(){
        return this.isWhite() ? "K" : "k";
    }
    public boolean isValid(int to){
        return false;
    }
}
