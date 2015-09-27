public class Spelare {

	private String mNamn;
	private char mMark�r;
	private int mSpelare;
	private int mVinster = 0;

	public Spelare(String namn, char mark�r, int spelare){
		mNamn = namn;
		mMark�r = mark�r;
		mSpelare = spelare;
	}

	public String toString(){
		return "Spelare nr: " + mSpelare + " namn: " + mNamn + " markor: " + mMark�r;
	}

	public String getNamn(){
		return mNamn;
	}

	public char getMark�r(){
		return mMark�r;
	}
	
	public int getVinster() {
		return mVinster;
	}
	
	public void setVinster(int vinster) {
		mVinster += vinster;
	}
	






	
}
