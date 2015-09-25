

public class Spelplan{
	private char mBoard[];


	private int vectors [] [] =
	    {
		   {0, 1, 2},    // Row 1
	       {3, 4, 5},    // Row 2
	       {6, 7, 8},    // Row 3
	       {0, 3, 6},    // Column 1
	       {1, 4, 7},    // Column 2
	       {2, 5, 8},    // Column 3
	       {0, 4, 8},    // Diagonal 1
	       {2, 4, 6}     // Diagonal 2
	    };
	

		
	public void reset(){
		mBoard = new char[] {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
	}

	public String toString(){
		return " " +
		       mBoard[0] + " | " +
		       mBoard[1] + " | " +
		       mBoard[2] +
		       "\n---+---+---\n" +
		       " " +
		       mBoard[3] + " | " +
		       mBoard[4] + " | " +
		       mBoard[5] +
		       "\n---+---+---\n" +
		       " " +
		       mBoard[6] + " | " +
		       mBoard[7] + " | " +
		       mBoard[8];

	}

	public char setBoard(char symbol, int placering){
		return mBoard[placering] = symbol;
	}

	


	

	public static boolean avslutaSpel(){
		
		return false ;
	}


}