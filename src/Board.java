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

    private void freshGame(){
        // Sets up white pawns
        for(int i = 48; i < 56; i++){
            squares[i] = new Pawn(true, i, false);
        }
        squares[56] = new Rook(true, 56);
        squares[57] = new Knight(true, 57);
        squares[58] = new Bishop(true, 58);
        squares[59] = new Queen (true, 59);
        squares[60] = new King(true, 60);
        squares[61] = new Bishop(true, 61);
        squares[62] = new Knight(true, 62);
        squares[63] = new Rook(true, 63);

        // Sets up black pawns
        for(int i = 8; i < 16; i++){
            squares[i] = new Pawn(false, i, false);
        }
        squares[0] = new Rook(false, 0);
        squares[1] = new Knight(false,1);
        squares[2] = new Bishop(false, 2);
        squares[3] = new Queen (false, 3);
        squares[4] = new King(false, 4);
        squares[5] = new Bishop(false, 5);
        squares[6] = new Knight(false, 6);
        squares[7] = new Rook(false, 7);

    }

    void display(){
        StringBuilder sb = new StringBuilder();
        boolean color = true;

        for(int i = 0; i < squares.length; i++){

            if(squares[i] != null){
                sb.append(squares[i].toString()).append(" ");
            } else {
                if(color){
                    sb.append("\u25A0 ");
                } else {
                    sb.append("\u25A1 ");
                }

            }
            if(i % 8 == 7){
                System.out.println(sb.toString());
                sb.setLength(0);
            }

            if(i % 8 != 7){
                color = !color;
            }
        }
        System.out.println("\n\n");
    }

    int movePiece(int from, int to){
        // Makes sure the piece you want to move exists
        if(squares[from] == null){
            return -1;
        }
        boolean capture = false;

        // Checks if there is a piece on the square you want to move to
        if(squares[to] != null){
            // If there is a piece on that square, it can't be of the same color as the piece being moved
            if((squares[from].isWhite() && squares[to].isWhite()) || (!squares[from].isWhite() && !squares[to].isWhite())){
                return -1;
            } else {
                capture = true;
            }
        }

        //TODO: Implement en passant moves

        // Checks for en passant pawn moves

        //TODO: Implement castling

        // Checks that the piece is ALLOWED to move in that way
        if(!squares[from].isValid(to, capture, false, this.squares)){
            return -1;
        }

        if(!capture){
            squares[to] = squares[from];
            squares[from] = null;
            squares[to].setPosition(to);

        } else {
            squares[to].setPosition(-1);
            squares[to] = squares[from];
            squares[to].setPosition(to);
            squares[from] = null;
        }

        return 0;
    }
}
