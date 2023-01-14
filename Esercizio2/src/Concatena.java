/*
 Implementare i seguenti metodi: 
 
- Concatena: accetta una stringa e un intero e restituisce una stringa che concatena gli elmenti

 */

public class Concatena {

		//vine inserito solamente il System.out con la chiamata al metodo ed i valori di a e b
	public static void main(String[] args) {

		System.out.println(concatena("Sara", 30));

	}
	
	//Metodo. Viene inserito un return e dei parametri da stampare. 
	static String concatena(String a, int b) {
		return a + " ha " + b + " anni"; 
	}

}
