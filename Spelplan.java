import java.util.Scanner;

public class Spelplan{
	private char mBräde[];


	//SKAPAR EN ARRAY MED 9 TOMMA RUTOR	
	public void återställ(){
		mBräde = new char[] {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
	}
	
	//SKRIVER UT BRÄDET
	public String toString(){
		return " " +
		       mBräde[0] + " | " +
		       mBräde[1] + " | " +
		       mBräde[2] +
		       "\n---+---+---\n" +
		       " " +
		       mBräde[3] + " | " +
		       mBräde[4] + " | " +
		       mBräde[5] +
		       "\n---+---+---\n" +
		       " " +
		       mBräde[6] + " | " +
		       mBräde[7] + " | " +
		       mBräde[8];

	}
	//PLACERAR MARKÖREN PÅ VALD RUTA
	public boolean placera(char symbol, int placering){
		if(placering >= 0 && placering <= 9){
			if(mBräde[placering] != ' ')
				return false;
			 else {
				 mBräde[placering] = symbol;
				 return true;
			}
		}
		else
			return false;		
	}
	
	
	//LOOPAR FRÅGAN ATT AMGE ETT TAL TILLS DEN FÅR ETT SVAR SOM ÄR KORREKT
	public void frågaSpelaren(char symbol){
		
		Scanner scanner = new Scanner(System.in);
		int svar;

		do{
			System.out.println("Placera markör " + symbol + " pa ruta mellan 1 - 9 \n");
			svar = scanner.nextInt();			
		} while (arEjKorrekt(svar));		
		
		placera(symbol, svar-1);
	}
	
	
	//ETT ARGUMENT SOM FÅR LOOPEN I FRÅGASPELAREN ATT FORTSÄTTA SÅLÄNGE DET EJ ÄR EN KORREKT PLACERING
	public boolean arEjKorrekt(int placering){
		if(placering < 1 || placering > 9 || !arTom(placering)){			
			System.out.println("Det måste vara ett tal mellan 1-9");
			return true;
		}
		else{
			return false;
			}
		
	}
	//KOLLAR OM PLACERING ÄR TOM
	public boolean arTom(int placering){
		if(mBräde[placering-1] == ' '){
			return true;
		} else {
			System.out.println("Ruta upptagen försök igen! \n");
			return false;
		}
			

	}
	
	public boolean kollaVinnare(){
		
			//KOLLAR OM 3 I RAD HOROZONTELLT
			if(mBräde[0] == mBräde[1] && mBräde[1] == mBräde[2] && mBräde[0] != ' '){
				return true;
			} else if (mBräde[3] == mBräde[4] && mBräde[4] == mBräde[5] && mBräde[3] != ' '){
				return true;
			} else if (mBräde[6] == mBräde[7] && mBräde[7] == mBräde[8] && mBräde[6] != ' '){
				return true;
			} 
			//KOLLAR OM 3 I RAD VERTIKALT
			else if (mBräde[0] == mBräde[3] && mBräde[3] == mBräde[6] && mBräde[0] != ' ' ){
				return true;				
			} else if (mBräde[1] == mBräde[4] && mBräde[4] == mBräde[7] && mBräde[1] != ' '){
				return true;
			} else if (mBräde[2] == mBräde[5] && mBräde[5] == mBräde[8] && mBräde[2] != ' '){
				return true;
			} 
			//KOLLAR OM 3 I RAD DIAGONALT
			else if (mBräde[0] == mBräde[4] && mBräde[4] == mBräde[8] && mBräde[0] != ' '){
				return true;
			} else if (mBräde[2] == mBräde[4] && mBräde[4] == mBräde[6] && mBräde[2] != ' '){
				return true;
			} else
				return false;		
		
	}
	
	/*
	public boolean avslutaSpel(){
		if (spelplan.kollaVinnare() == true){
			System.out.println(nuvarandeSpelare.getNamn() + " har vunnit!");
			forsättspela = false;
			//nuvarandeSpelare.setmVinster(vinster);
		}
		
		if(omgång == 9){
			System.out.println("Oavgjort!");
			forsättspela = false;
		}
	}
	*/	
		

}