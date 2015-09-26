

public class Spelplan{
	private char mBoard[];


		
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

	public boolean setBoard(char symbol, int placering){
		if(placering > 0 && placering < 10){
			if(mBoard[placering] != ' ')
				return false;
			 else {
				 mBoard[placering] = symbol;
			}
		}
		else{
			return false;
		}
		return false;
	}
	
	public boolean ärEjKorrekt(int placering){
		if(placering > 1 || placering < 9 || !ärTom(placering)){
			return true;
		} else {
			return false;
		}
			
		
	}
	
	public boolean ärTom(int placering){
		if(mBoard[placering] == ' '){
			return true;

		} else{
			System.out.println("Upptagen försök igen! \n");
			return false;
		}
			

	}

	

}