import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class Application {

	public static void main(String[] args) {
		//eine Liste mit 100.000 Zufallszahlen erzeugen
		List<Integer> list = randomList(100000);
		//eine Liste erzeugen,die zusätzlich 10.000 Zahlen einfügt
		List<Integer> additionalList = randomList(10000);
	
						
		//TreeListe erzeugen und Zeit messen
		 List<Integer> treeList = new TreeList<>(list);
		 treeListtime starten = System.currentTimeMillis();
		 	        
		 long treeListEndTime = System.currentTimeMillis();
		 long treeListDuration = treeListEndTime - treeListStartTime;
		 System.out.println("die TreeList braucht " + treeListDuration + " Millisekunden");
		
		 //linkedList erzeugen und Zeit messen
		 List<Integer> linkedList = new LinkedList<>(list);
	     long linkedListStartTime = System.currentTimeMillis();
	     insertNumbers(linkedList, additionalList);
	     long linkedListEndTime = System.currentTimeMillis();
	     long linkedListDuration = linkedListEndTime - linkedListStartTime;
	     System.out.println("Die LinkedList braucht " + linkedListDuration + " Millisekunden");

	     //ArrayList erzeugen und Zeit messen
	     List<Integer> arrayList = new ArrayList<>(list);
	        long arrayListStartTime = System.currentTimeMillis();
	        insertNumbers(arrayList, additionalList);
	        long arrayListEndTime = System.currentTimeMillis();
	        long arrayListDuration = arrayListEndTime - arrayListStartTime;
	        System.out.println("die ArrayList braucht " + arrayListDuration + " Millisekunden");
	    }

				
				
				}
		    }

		    private static List<Integer> randomList(int size) {
		        List<Integer> list = new ArrayList<>(size);
		        Random random = new Random();
		        for (int i = 0; i < size; i++) {
		            list.add(random.nextInt());
		        }
		        return list;
		    }
		}