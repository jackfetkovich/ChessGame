package Pieces;

public class Knight extends Piece{
    public Knight(boolean white, int position){
        super(white, position);
    }

    @Override
    public boolean isValid(int to, boolean capture, boolean castle) {
        return false;
    }

    public boolean isValid(int to){
        return false;
    }

    public String toString(){
        return this.isWhite() ? "N" : "n";
    }
}
