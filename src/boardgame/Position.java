
package boardgame;

/**
 *
 * @author pedro
 */
public class Position {
    private int row;
    private int column;
    
    public Position(int row, int column){
        this.column=column;
        this.row=row;
    }

    public int getRow() {
        return row;
    }

    
    public void setRow(int row) {
        this.row = row;
    }

    
    public int getColumn() {
        return column;
    }

    
    public void setColumn(int column) {
        this.column = column;
    }
    
    @Override
    public String toString(){
        return row+", "+column;
    }
    
    
}
