package Pieces;

public abstract class Piece {
    private boolean color;
    private int position;

    public Piece(boolean color, int position){
        this.color = color;
        this.position = position;
    }

    public boolean isValid(int to){
        return false;
    }

    boolean isWhite(){
        return this.color;
    }

    int getPosition(){
        return this.position;
    }

    void setPosition(int position){
        this.position = position;
    }
}
