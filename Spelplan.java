import java.util.Scanner;

public class Spelplan{
	private char mBr�de[];


	//SKAPAR EN ARRAY MED 9 TOMMA RUTOR	
	public void �terst�ll(){
		mBr�de = new char[] {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
	}
	
	//SKRIVER UT BR�DET
	public String toString(){
		return " " +
		       mBr�de[0] + " | " +
		       mBr�de[1] + " | " +
		       mBr�de[2] +
		       "\n---+---+---\n" +
		       " " +
		       mBr�de[3] + " | " +
		       mBr�de[4] + " | " +
		       mBr�de[5] +
		       "\n---+---+---\n" +
		       " " +
		       mBr�de[6] + " | " +
		       mBr�de[7] + " | " +
		       mBr�de[8];

	}
	//PLACERAR MARK�REN P� VALD RUTA
	public boolean placera(char symbol, int placering){
		if(placering >= 0 && placering <= 9){
			if(mBr�de[placering] != ' ')
				return false;
			 else {
				 mBr�de[placering] = symbol;
				 return true;
			}
		}
		else
			return false;		
	}
	
	
	//LOOPAR FR�GAN ATT AMGE ETT TAL TILLS DEN F�R ETT SVAR SOM �R KORREKT
	public void fr�gaSpelaren(char symbol){
		
		Scanner scanner = new Scanner(System.in);
		int svar;

		do{
			System.out.println("Placera mark�r " + symbol + " pa ruta mellan 1 - 9 \n");
			svar = scanner.nextInt();			
		} while (arEjKorrekt(svar));		
		
		placera(symbol, svar-1);
	}
	
	
	//ETT ARGUMENT SOM F�R LOOPEN I FR�GASPELAREN ATT FORTS�TTA S�L�NGE DET EJ �R EN KORREKT PLACERING
	public boolean arEjKorrekt(int placering){
		if(placering < 1 || placering > 9 || !arTom(placering)){			
			System.out.println("Det m�ste vara ett tal mellan 1-9");
			return true;
		}
		else{
			return false;
			}
		
	}
	//KOLLAR OM PLACERING �R TOM
	public boolean arTom(int placering){
		if(mBr�de[placering-1] == ' '){
			return true;
		} else {
			System.out.println("Ruta upptagen f�rs�k igen! \n");
			return false;
		}
			

	}
	
	public boolean kollaVinnare(){
		
			//KOLLAR OM 3 I RAD HOROZONTELLT
			if(mBr�de[0] == mBr�de[1] && mBr�de[1] == mBr�de[2] && mBr�de[0] != ' '){
				return true;
			} else if (mBr�de[3] == mBr�de[4] && mBr�de[4] == mBr�de[5] && mBr�de[3] != ' '){
				return true;
			} else if (mBr�de[6] == mBr�de[7] && mBr�de[7] == mBr�de[8] && mBr�de[6] != ' '){
				return true;
			} 
			//KOLLAR OM 3 I RAD VERTIKALT
			else if (mBr�de[0] == mBr�de[3] && mBr�de[3] == mBr�de[6] && mBr�de[0] != ' ' ){
				return true;				
			} else if (mBr�de[1] == mBr�de[4] && mBr�de[4] == mBr�de[7] && mBr�de[1] != ' '){
				return true;
			} else if (mBr�de[2] == mBr�de[5] && mBr�de[5] == mBr�de[8] && mBr�de[2] != ' '){
				return true;
			} 
			//KOLLAR OM 3 I RAD DIAGONALT
			else if (mBr�de[0] == mBr�de[4] && mBr�de[4] == mBr�de[8] && mBr�de[0] != ' '){
				return true;
			} else if (mBr�de[2] == mBr�de[4] && mBr�de[4] == mBr�de[6] && mBr�de[2] != ' '){
				return true;
			} else
				return false;		
		
	}
	
	/*
	public boolean avslutaSpel(){
		if (spelplan.kollaVinnare() == true){
			System.out.println(nuvarandeSpelare.getNamn() + " har vunnit!");
			fors�ttspela = false;
			//nuvarandeSpelare.setmVinster(vinster);
		}
		
		if(omg�ng == 9){
			System.out.println("Oavgjort!");
			fors�ttspela = false;
		}
	}
	*/	
		

}