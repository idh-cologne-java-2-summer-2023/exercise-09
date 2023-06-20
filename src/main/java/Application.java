import org.apache.commons.collections4.list.TreeList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        List<Integer> treeList = new TreeList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
        List<Integer> arrayList = new ArrayList<Integer>();
        
        Random random = new Random();
        //Erstellen von 100000 Zufallszahlen
        generateRandomNumbers(treeList, random, 100000);
        generateRandomNumbers(linkedList, random, 100000);
        generateRandomNumbers(arrayList, random, 100000);
        
        //Erstellen von 10000 Zufallszahlen und Einfügen
        long durationTreeList = measureInsertionTime(treeList, random, 10000);
        long durationLinkedList = measureInsertionTime(linkedList, random, 10000);
        long durationArrayList = measureInsertionTime(arrayList, random, 10000);
        
        System.out.println("Dauer der Einfügeoperationen in TreeList: " + durationTreeList + " ms");
        System.out.println("Dauer der Einfügeoperationen in LinkedList: " + durationLinkedList + " ms");
        System.out.println("Dauer der Einfügeoperationen in ArrayList: " + durationArrayList + " ms");
    }
    
    private static void generateRandomNumbers(List<Integer> list, Random random, int count) {
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt();
            list.add(randomNumber);
        }
    }
    
    private static long measureInsertionTime(List<Integer> list, Random random, int insertCount) {
        //Festlegen der Startzeit/Messen der Operationszeit
    	long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < insertCount; i++) {
            int randomNumber = random.nextInt();
            int randomIndex = random.nextInt(list.size());
            list.add(randomIndex, randomNumber);
        }
        //Festlegen der Endzeit
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
