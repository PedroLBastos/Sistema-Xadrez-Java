package sistema_xadrez;
import chess.ChessMatch;


/**
 *
 * @author pedro
 */
public class Sistema_Xadrez {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
    
}
