package Pieces;

public class Bishop extends Piece{
    public Bishop(boolean white){
        super(white);
    }

    public String toString(){
        return this.getColor() ? "B" : "b";
    }
}


