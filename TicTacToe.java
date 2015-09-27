import java.util.Scanner;

public class TicTacToe {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		//INITIERING AV SPELPLAN		
		Spelplan spelplan = new Spelplan();
		spelplan.återställ();

		System.out.println("Välkommen ange namn spelare 1");
		
		//SPELARE 1 INITIERAS
		scanner = new Scanner(System.in);
		String spelareUno = scanner.nextLine(); 
		Spelare spelare1 = new Spelare(spelareUno, 'X', 1);
		System.out.println(spelare1);

		
		//SPELARE 2 INITIERAS
		System.out.println("Ange ett namn på spelare nummer 2");
		String spelareDos = scanner.nextLine();
		Spelare spelare2 = new Spelare(spelareDos, 'O', 2);
		System.out.println(spelare2);

		
		//VISA SPELPLAN
		System.out.println(spelplan);
		
		//VARIABLER FÖR LOOPEN
		int omgång = 0;
		Spelare nuvarandeSpelare;
		boolean forsättspela = true;


		// METOD FÖR ATT HÅLLA SPELET RULLANDE ÖVER OMGÅNGAR 
		while(true){
		while(forsättspela){				
			
			
			//IF-SATS FÖR ATT VÄXLA MELLAN DE TVÅ SPELARENA
			if(omgång % 2 == 0){				
				nuvarandeSpelare = spelare1;							
			} else {
				nuvarandeSpelare = spelare2;
			}
			omgång++;
			
			spelplan.frågaSpelaren(nuvarandeSpelare.getMarkör());
			System.out.println(spelplan);
			
			if(spelplan.kollaVinnare() == true){
				System.out.println("Grattis! " + nuvarandeSpelare.getNamn() + " har vunnit!");
				forsättspela = false;
				nuvarandeSpelare.setVinster(1);
			}
			
			if(omgång == 9){
				System.out.println("Oavgjort!");
				forsättspela = false;
			}
		}
			
		System.out.println(spelare1.getNamn() + " har " + spelare1.getVinster() + " vinster och " 					
				 + spelare2.getNamn() + " har " + spelare2.getVinster() + " vinster \n");
		omgång = 0;	
		spelplan.återställ();
		forsättspela = true;
		System.out.println("Ny omgång! \n");
		System.out.println(spelplan);
	}
			
			
					

			
		

	}	


}