public class Spelare {

	private String mNamn;
	private char mMarkor;
	private int mSpelare;

	public Spelare(String namn, char markor, int spelare){
		mNamn = namn;
		mMarkor = markor;
		mSpelare = spelare;
	}

	public String toString(){
		return "Spelare nr: " + mSpelare + " namn: " + mNamn + " markor: " + mMarkor;
	}

	public String getNamn(){
		return mNamn;
	}

	public char getMarkor(){
		return mMarkor;
	}

	/*public int placeraMarkor(int placering){
		
		char markoren = getMarkor();
		mBoard[placering] = markoren;
	}*/





	
}
