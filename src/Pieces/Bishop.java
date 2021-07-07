package Pieces;

public class Bishop extends Piece{
    public Bishop(boolean white, int position){
        super(white, position);
    }

    @Override
    public boolean isValid(int to, boolean capture, boolean castle, Piece[] squares) {
        return false;
    }

    public String toString(){
        return this.isWhite() ? "B" : "b";
    }
    public boolean isValid(int to){
        return false;
    }
}


