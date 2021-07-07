package Pieces;

public class Bishop extends Piece{
    public Bishop(boolean white, int position){
        super(white, position);
    }

    public String toString(){
        return this.isWhite() ? "B" : "b";
    }
    public boolean isValid(int to){
        return false;
    }
}


