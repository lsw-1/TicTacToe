import java.util.Scanner;

public class TicTacToe {

	private static Scanner scanner;

	public static void main(String[] args) {
				
		Spelplan spelplan = new Spelplan();
		spelplan.reset();

		System.out.println("V√§lkommen ange namn spelare 1");
		
		scanner = new Scanner(System.in);
		String spelareUno = scanner.nextLine(); 
		Spelare spelare1 = new Spelare(spelareUno, 'X', 1);
		System.out.println(spelare1);

		
		//SPELARE 2 INITIERAS
		System.out.println("Ange namn p√• spelare nummer 2");
		String spelareDos = scanner.nextLine();
		Spelare spelare2 = new Spelare(spelareDos, 'O', 2);
		System.out.println(spelare2);

		
		//VISA SPELPLAN
		System.out.println(spelplan);
		

		//VARIABLER F÷R LOOPEN
		int omgang = 0;
		Spelare nuvarandeSpelare;
		boolean forsattspela = true;


		// FUNKTION F÷R ATT H≈LLA SPELET RULLANDE ÷VER OMG≈NGAR 
		while(forsattspela){			

			if(omgang % 2 == 0){				
				nuvarandeSpelare = spelare1;							
			} else {
				nuvarandeSpelare = spelare2;
			}
			omgang++;
			
			
			
			do{
			System.out.println("Placera " + nuvarandeSpelare.getMarkor() + " pa ruta  1 - 9 \n");
			int svar = scanner.nextInt();
			spelplan.setBoard(nuvarandeSpelare.getMarkor(), svar - 1);
			System.out.println(spelplan);
			} while (spelplan.‰rEjKorrekt(svar));

			if(omgang == 9){
				System.out.println("Oavgjort!");
				forsattspela = false;
			}	

			

			
		}

	}	




}