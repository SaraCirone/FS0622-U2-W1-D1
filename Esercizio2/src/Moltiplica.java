/*
 Implementare i seguenti metodi: 
 
 -  Moltiplica: accetta due interi e ritorna il loro prodotto; 
 

 */

public class Moltiplica {

	//Main. in questo punto andiamo solo ad inserire il print che richiama i metodo moltiplica e passa i parametri x e y
	public static void main(String[] args) {
		System.out.println(moltiplica(10,30));
	}
	
	
	//Chiamata del Metodo, bisogna mettere return altrimenti non funziona. 
	public static int moltiplica (int x, int y ) {
		return x * y; 	
	}

}


