import java.util.Scanner;

public class perimetroRettangolo {
		
	public static void calcolaPerimetro() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calcolo del perimetro del Rettangolo");
		System.out.println("Inserisci la base del rettangolo: ");
		double bR = scanner.nextDouble();
		
		System.out.println("Inserisci l'altezza del rettangolo: ");
		double hR = scanner.nextDouble();
		
		System.out.println("Il perimetro del rettangolo è : " + ((bR + hR)*2));
		
	}
	
}
