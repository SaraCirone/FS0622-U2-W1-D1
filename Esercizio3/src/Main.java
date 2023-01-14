import java.util.Scanner;

/*
 * Implementare un metodo main che chiede all'utente di inserire tre stringhe da tastiera e scrive in console la concatenazione delle stringhe in ordine di inserimento ed in ordine inverso. 
 */

public class Main {

	public static void main(String[] args) {
		
		//viene inizializzato lo scanner e viene importato
		
		Scanner scanner = new Scanner(System.in);
		
		//vengono create le rige per l'input: due di tipo stringa, uno di tipo int
		//riga 1
				System.out.println("Come ti chiami?");
				String data1 = scanner.nextLine();	
		
		//riga 2
				System.out.println("Dove sei nato?");
				String data2 = scanner.nextLine();
				
		//riga 3
				System.out.println("Quanti anni hai?");
				int data3 = scanner.nextInt();	

				
		//vengono stampati i risultati uno in senso di inserimento e l'altro in ordine inverso 		
		System.out.println(data1 + " " + data2 + " " + data3);
		System.out.println(data3 + " " + data2 + " " + data1);
				
				
	}

}
