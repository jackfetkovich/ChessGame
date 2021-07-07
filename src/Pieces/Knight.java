package Pieces;

public class Knight extends Piece{
    public Knight(boolean white, int position){
        super(white, position);
    }
    public boolean isValid(int to){
        return false;
    }

    public String toString(){
        return this.isWhite() ? "N" : "n";
    }
}
