package Pieces;

public class Queen extends Piece {
    public Queen(boolean white){
        super(white);
    }

    public String toString(){
        return this.getColor() ? "Q" : "q";
    }
}
