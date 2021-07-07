package Pieces;

public abstract class Piece {
    private boolean color;
    private String id;

    public Piece(boolean color){
        this.color = color;
    }

    boolean getColor(){
        return this.color;
    }

}
