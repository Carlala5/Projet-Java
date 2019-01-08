package AnaisCarla;

public class GameBoard {

/* 
 * 
 * INITIALISATION PLATEAU
 * 
 */

	public enum Cell {E,C}; // E for Empty, C for Castle
	
	private Cell [][] board;
	
	public GameBoard() {
		board = new Cell [5][5];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board [i][j] = Cell.E;
			}
		}
	}
	
	public String toString() {
		String result = "";
		for (Cell[]row : board) { // a for for each loop
			for (Cell c : row) {
				result += c;
			}
			result += "\n";
		}
		return result;
	}
	
	
	public void setCell(int row, int col, Cell value) { //particular method to change a particular cell
		board[row][col] = value;		
	}
	
	
	 public static void main(String[] args) {
		 GameBoard b = new GameBoard();
		 //System.out.println(b);
		 
		 
		 /*We put a C in the middle, because at the beginning each castle of each player
		  * is placed in the middle of the board
		  */
		 b.setCell(0, 0, Cell.C); // va de 0 à 8 (ligne,colonne)
		 System.out.println(b);
			
	 }
}
