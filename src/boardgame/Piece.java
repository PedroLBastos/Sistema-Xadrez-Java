package boardgame;

/**
 *
 * @author pedro
 */
public class Piece {
    
    protected Position position;
    private Board board;
    
    public Piece(Board board){
        this.board=board;
        position=null;
    }

  
    protected Board getBoard() {
        return board;
    }      
}
