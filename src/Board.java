import Pieces.*;


//TODO: Figure out how to identify individual pieces

public class Board {
    private Piece[] squares;

    public Board(){
        this.squares = new Piece[64];
        for(int i = 0; i < squares.length; i++){
            squares[i] = null;
        }

        this.freshGame();
    }

    private void freshGame() {
        // Sets up white pawns
        for(int i = 48; i < 56; i++){
            squares[i] = new Pawn(true);
        }
        squares[56] = new Rook(true);
        squares[57] = new Knight(true);
        squares[58] = new Bishop(true);
        squares[59] = new Queen (true);
        squares[60] = new King(true);
        squares[61] = new Bishop(true);
        squares[62] = new Knight(true);
        squares[63] = new Rook(true);

        // Sets up black pawns
        for(int i = 8; i < 16; i++){
            squares[i] = new Pawn(false);
        }
        squares[0] = new Rook(false);
        squares[1] = new Knight(false);
        squares[2] = new Bishop(false);
        squares[3] = new King(false);
        squares[4] = new Queen (false);
        squares[5] = new Bishop(false);
        squares[6] = new Knight(false);
        squares[7] = new Rook(false);
    }

    void display(){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < squares.length; i++){

            if(squares[i] != null){
                sb.append(squares[i].toString()).append(" ");
            } else {
                sb.append("x ");
            }

            if(i % 8 == 7){
                System.out.println(sb.toString() + "\n");
                sb.setLength(0);
            }

        }
    }

}
