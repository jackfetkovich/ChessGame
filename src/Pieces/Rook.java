package Pieces;

public class Rook extends Piece{
    public Rook(boolean white){
        super(white);
    }

    public String toString(){
        return this.getColor() ? "R" : "r";
    }
}
