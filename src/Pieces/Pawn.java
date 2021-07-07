package Pieces;
// TODO: Figure out how to send whether pawn can move 1 or 2 squares (array?)
public class Pawn extends Piece{
    public boolean hasMoved;

    public Pawn(boolean white){
        super(white);
        hasMoved = false;
    }



    public String toString(){
        return this.getColor() ? "P": "p";
    }
}
