package Pieces;

public class Knight extends Piece{
    public Knight(boolean white){
        super(white);
    }

    public String toString(){
        return this.getColor() ? "N" : "n";
    }
}
