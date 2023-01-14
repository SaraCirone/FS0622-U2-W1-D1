import java.util.Scanner;

public class perimetroTriangolo {
	
	public static void calcolaArea() {
		
		Scanner scanner = new Scanner(System.in);
		
	
		
		System.out.println("Calcolo dell'area del triangolo con la formula di Erone");
		System.out.println("Inserisci la misura del primo lato");
		double lato1 = scanner.nextDouble();
		System.out.println("Inserisci la misura del secondo lato");
		double lato2 = scanner.nextDouble();
		System.out.println("Inserisci la misura del terzo lato");
		double lato3 = scanner.nextDouble();
		
		double semiperimetro = (lato1 + lato2 + lato3)/2;
		System.out.println("Il semiperimetro è : " + semiperimetro);
		
		double areaTriangolo = (semiperimetro*(semiperimetro - lato1)*(semiperimetro - lato2)*( semiperimetro - lato3))/4;
		
		System.out.println("L'area del triangolo è: " + areaTriangolo);
		
	}
	
}
