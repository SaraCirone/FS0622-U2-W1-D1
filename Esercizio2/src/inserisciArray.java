
/*
 - InserisciArray: accetta un array di stringhe di cinque elmenti ed una stringa e restituisce un array di sei elementi in cui la stringa passa sia al terzo posto e le stringe precedenti in quarta e quinta posizione. 
 */


public class inserisciArray {

	
	//viene creato all'interno del main un array di nome lista1, con 5 elementi. Vengono quindi creati singolarmente, per indice, tutti gli elementi che lo compongono e vengono poi stampati con il System.out.ln i due array.  Nel primo viene stampato con il to.string l'array originale. Nel secondo viene stampato tramite il metodo richiamato putIn lista1 e il parametro che viene chiamato. 
	public static void main(String[] args) {
		
		String[] lista1 = new String[5];
		lista1 [0] = "Mele";
		lista1 [1] = "Pere";
		lista1 [2] = "Banane";
		lista1 [3] = "Zucchero";
		lista1 [4] = "Carta da forno";
		
		System.out.println(java.util.Arrays.toString(lista1));
		System.out.println(putIn(lista1, "Patatine"));
		
		
	}

	/*Metodo putIn. Vengono passati come parametri l'array lista1 e un parametro stringa b
	 * viene creato l'array spesa con sei posti
	 * ad ogni posto vengono assegnati i valori. 
	 * per tutti i posti dell'array spesa vengono assegnati quelli di lsita1, tranne che per il 3 che viene assegnato il valore b
	 * viene stampato il return con il toString per visualizzare l'array spesa
	*/
	public static String putIn(String[] lista1, String b) {
		
		String[] spesa = new String [6];
		spesa[0] = lista1[0];
		spesa[1] = lista1[1];
		spesa[2] = b; 
		spesa[3] = lista1[2];
		spesa[4] = lista1[3];
		spesa[5] = lista1[4];
		
		
		return java.util.Arrays.toString(spesa);
		
	}

}
