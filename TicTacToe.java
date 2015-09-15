import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
				
		
		System.out.println("Välkommen ange namn spelare 1");
		
		//Spelare 1 initieras
		Scanner scanner = new Scanner(System.in);
		String spelareUno = scanner.nextLine(); 
		Spelare spelare1 = new Spelare(spelareUno, 'X', 1);

		System.out.println(spelare1);

		
		//Spelare 2 initieras
		System.out.println("Ange namn på spelare nummer 2");
		String spelareDos = scanner.nextLine();
		Spelare spelare2 = new Spelare(spelareDos, 'O', 2);

		System.out.println(spelare2);
		

	}

		
	
}