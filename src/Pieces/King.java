package Pieces;

public class King extends Piece {
    public King(boolean white){
        super(white);
    }

    public String toString(){
        return this.getColor() ? "K" : "k";
    }
}
