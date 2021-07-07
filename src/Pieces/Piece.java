package Pieces;

public abstract class Piece {
    private boolean color;
    private int position;

    public Piece(boolean color, int position){
        this.color = color;
        this.position = position;
    }

    public abstract boolean isValid(int to, boolean capture, boolean castle, Piece[] squares);

    public boolean isWhite(){
        return this.color;
    }

    int getPosition(){
        return this.position;
    }

    public void setPosition(int position){
        this.position = position;
    }
}
