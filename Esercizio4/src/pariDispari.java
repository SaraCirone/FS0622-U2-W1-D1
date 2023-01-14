import java.util.Scanner;

public class pariDispari {
	
	public static void pariDispari() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Il numero è pari o dispari?");
		System.out.println("Inserisci un numero");
		int number = scanner.nextInt();
		
		
		if(number % 2 == 0) {
			System.out.println("Il numero è pari");
		} else {
			System.out.println("Il numero è dispari");
		}
		
	}
	
}
