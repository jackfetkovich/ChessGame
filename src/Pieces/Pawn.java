package Pieces;
// TODO: Figure out how to send whether pawn can move 1 or 2 squares (array?)
public class Pawn extends Piece{
    public boolean hasMoved;
    public boolean promoted;

    public Pawn(boolean white, int position, boolean promoted){
        super(white, position);

        if (this.isWhite() && (this.getPosition() < 48 || this.getPosition() > 55)) {
            this.hasMoved = true;
        } else if (!this.isWhite() && (this.getPosition() < 8 || this.getPosition() > 15)) {
            hasMoved = true;
        } else if(promoted){
            hasMoved = true;
        } else {
            hasMoved = false;
        }
    }
    public String toString(){
        return this.isWhite() ? "P": "p";
    }

    public boolean isValid(int to, boolean capture, boolean castle, Piece[] squares){

        // Standard pawn moves - if pawn has not moved, it can move 2 squares, else, only 1
        if(!hasMoved && !capture){
            if(this.isWhite()){
                return to == this.getPosition() -8 || to == this.getPosition() - 16;
            } else {
                return to == this.getPosition() + 8 || to == this.getPosition() + 16;
            }
        } else if(!capture) {
            if(this.isWhite()){
                return to == this.getPosition() -8;
            } else {
                return to == this.getPosition() + 8;
            }
        }

        // Capturing
        if(capture){
            if(this.isWhite()){
                return to == this.getPosition() - 9|| to == this.getPosition() - 7;
            } else {
                return to == this.getPosition() + 9 || to == this.getPosition() + 7;
            }
        }

        return false;
    }

    public void moveTo(int pos){
        super.setPosition(pos);
        this.hasMoved = true;
    }
}
