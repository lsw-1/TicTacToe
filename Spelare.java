public class Spelare {

	private String mNamn;
	private char mMarkör;
	private int mSpelare;
	private int mVinster = 0;

	public Spelare(String namn, char markör, int spelare){
		mNamn = namn;
		mMarkör = markör;
		mSpelare = spelare;
	}

	public String toString(){
		return "Spelare nr: " + mSpelare + " namn: " + mNamn + " markor: " + mMarkör;
	}

	public String getNamn(){
		return mNamn;
	}

	public char getMarkör(){
		return mMarkör;
	}
	
	public int getVinster() {
		return mVinster;
	}
	
	public void setVinster(int vinster) {
		mVinster += vinster;
	}
	






	
}
