import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class Application {

	public static void main(String[] args) {
		//Aufgabe 2
		
		//eine Liste mit 100.000 Zufallszahlen erzeugen
		List<Integer> list = randomList(100000);
		
		//eine Liste mit  10.000 zufälligen Zahlen 
		//ich wusste nicht genau wie ich an zufälligen Stellen 10.000 weitere Zahlen einfügen soll
		List<Integer> additionalList = randomList(10000);
	
						
		//TreeListe erzeugen und Zeit messen
		 List<Integer> treeList = new TreeList<>(list);
		 long treeListstarten = System.currentTimeMillis();	        
		 long treeListzuEnde = System.currentTimeMillis();
		 long treeListDauer = treeListzuEnde- treeListstarten;
		 System.out.println("die TreeList braucht " + treeListDauer + " Millisekunden");
		
		 //linkedList erzeugen und Zeit messen
		 List<Integer> linkedList = new LinkedList<>(list);
		 long linkedListstarten = System.currentTimeMillis();
	     long linkedListzuEnde = System.currentTimeMillis();
	     long linkedListDauer = linkedListzuEnde - linkedListstarten;
	     System.out.println("Die LinkedList braucht " + linkedListDauer + " Millisekunden");

	     //ArrayList erzeugen und Zeit messen
	     List<Integer> arrayList = new ArrayList<>(list);
	        long arrayListstarten = System.currentTimeMillis();
	        long arrayLististzuEnde = System.currentTimeMillis();
	        long arrayListDauer= arrayLististzuEnde- arrayListstarten;
	        System.out.println("die ArrayList braucht " + arrayListDauer + " Millisekunden");
	    }

				
				
				}
		    }
		    //Methode für die LIste mit 100.000 zufälligen Zahlen
		    private static List<Integer> randomList(int size) {
		        List<Integer> list = new ArrayList<>(size);
		        Random random = new Random();
		        for (int i = 0; i < size; i++) {
		            list.add(random.nextInt());
		        }
		        return list;
		    }
		}