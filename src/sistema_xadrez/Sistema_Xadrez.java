package sistema_xadrez;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Sistema_Xadrez {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner sc = new Scanner(System.in);

        while  (true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            
            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);
            
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
       
    }
    
}
