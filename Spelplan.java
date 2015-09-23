public class Spelplan{
		public static int[] mBoard;

	public Spelplan(){
		mBoard = new int[9];

	}

	


/* 		public String getMark(int status)
	{
		if (status == 3)
		    return "X";
		if (status == 5)
		    return "O";
		return " ";
	}
*/

	public String toString(){
		return " " +
		       mBoard[0] + " | " +
		       mBoard[1] + " | " +
		       mBoard[2] +
		       "\n-----------\n" +
		       " " +
		       mBoard[3] + " | " +
		       mBoard[4] + " | " +
		       mBoard[5] +
		       "\n-----------\n" +
		       " " +
		       mBoard[6] + " | " +
		       mBoard[7] + " | " +
		       mBoard[8];

	}

	
}