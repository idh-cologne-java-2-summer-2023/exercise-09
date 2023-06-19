import java.util.Random;

import java.util.ArrayList;
import java.util.LinkedList;
import com.sun.tools.javac.util.List;
import org.apache.commons.collections4.list.TreeList;

public class TreeListExperiment {
	
	public static void main(String[] args) {
		
		//Liste mit 100.000 Zufallszahlen
		List<Integer> randomList = new ArrayList<>();
		Random random = new Random();
		
		for (int i = 0; i < 100000; i++) {
			randomList.add(random.nextInt());
		}
		
		//Zeitmessung bei Start
		long startTime = System.currentTimeMillis();
		
		//10.000 Zahlen an zufällige Stelle einfügen TreeList
		TreeList<Integer> treeList = new TreeList<>(randomList);
		
		for (int i = 0; i < 10000; i++) {
			int randomIndex = random.nextInt(treeList.size());
			treeList.add(randomIndex, random.nextInt());
		}
		
		//Zeitmessung am Ende von TreeList
		long endTime = System.currentTimeMillis();
        long durationTreeList = endTime - startTime;
		
		//10.000 Zahlen an zufällige Stelle einfügen LinkedList
		LinkedList<Integer> linkedList = new LinkedList<>(randomList);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int randomIndex = random.nextInt(linkedList.size());
            linkedList.add(randomIndex, random.nextInt());
        }
        endTime = System.currentTimeMillis();
        long durationLinkedList = endTime - startTime;
        
     //10.000 Zahlen an zufälliger Stelle einfügen ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(randomList);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int randomIndex = random.nextInt(arrayList.size());
            arrayList.add(randomIndex, random.nextInt());
        }
        endTime = System.currentTimeMillis();
        long durationArrayList = endTime - startTime;
		
        System.out.println("Dauer TreeList: " + durationTreeList + " Millisekunden");
        System.out.println("Dauer LinkedList: " + durationLinkedList + " Millisekunden");
        System.out.println("Dauer ArrayList: " + durationArrayList + " Millisekunden");
		
		
	}

}
