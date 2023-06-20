import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class Application{
	
	public static void main(String[] args){

	//	System.out.println("test");
		
		//TreeListe erzeugen
		TreeList<Integer> baumliste = new TreeList<Integer>();
		LinkedList<Integer> linkedliste = new LinkedList<Integer>();
		ArrayList<Integer> arrayliste = new ArrayList<Integer>();

		
		//Liste mit 100000 (einhunderttausend) Zufallszahlen zw. 0 und 100000 füllen
		for (int i = 0; i< 100000; i++) {
			//Randomzahl erstellen
			Random zufall = new Random();
			int randomzahl = zufall.nextInt(0, 100000);		
		//Baumliste befüllen	
			baumliste.add(randomzahl);

		//Linked List befüllen
			linkedliste.add(randomzahl);
			
		//Arrayliste befülle
			arrayliste.add(randomzahl);
		}
		
		//++++ Listen Befüllen ++++
		
		//System.out.println("TreeList: " + baumliste);		
		//Treelist dauert ca 0,478 Sekunden SECOND
		
	
		//System.out.println("linked List: " +linkedliste);
		//Linked List dauert ca 0,334 Sekunden WINNER
		
		//System.out.println("ARRAYLISTE: " + arrayliste);
		//Dauer der Ausgabe, der ArrayListe: 0,513 Sekunden THIRD
				
		
		//System.out.println("TreeList Größe Ursprung: " + baumliste.size()); //Prüfung, ob es wirklich 100000 Stellen sind
		
		//jede Liste um 10000 Stellen ergänzen
		for (int j = 0; j<10000; j++) {
			Random zufall = new Random();
			int randomzahl = zufall.nextInt(0, 100000);		

			baumliste.add(randomzahl);
			linkedliste.add(randomzahl);
			arrayliste.add(randomzahl);

		}
		//++++ Listen um 100000 vergrößern +++++
		//System.out.println("Neue TreeListe " + baumliste);
		//Dauer TreeListe+10000: 0,392 sekunden WINNER
	
	
		//System.out.println("linkedList + 10000: " + linkedliste);
		//dauer LinkedListe+10000: 0,468 Sekunden SECOND
		
		//System.out.println("Arrayliste + 10000: " + arrayliste);
		//Dauer Arrayliste+10000: 0,484 Sekunden THIRD
}
	
	
}