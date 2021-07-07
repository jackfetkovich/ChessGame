package Tests;

import Pieces.Pawn;
import Pieces.Piece;

public class Test {
    public static void main(String[] args) {
        Pawn p = new Pawn(true, 50, false);
        System.out.println(p.isValid(43, true, false));
    }
}