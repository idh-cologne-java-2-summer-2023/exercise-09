package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class ListTest {
		
public static void testMethod(List<Integer> list, Random random)	{
	// Startzeit vor Listenerzeugung
    long startTime = System.nanoTime();

    // Füllen der List mit 100.000 Zufallszahlen im Bereich von 0-1000
    for (int i = 0; i < 100000; i++) {
        list.add(random.nextInt(1000));
    }

    // Zeit nach der Listenerstellung
    long endTime = System.nanoTime();
    
    //Ausgabe der Dauer für Füllen der List in ms
    System.out.println("Runtime für initiale Füllung der Liste: " + (endTime - startTime) / 1000000 + " ms");
    
    //An 10.000 Stellen random Werte setzen
    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
    	list.set(random.nextInt(100000), random.nextInt(1000));
    }
    endTime = System.nanoTime();
    System.out.println("Runtime für Werte an random Stellen: " + (endTime - startTime) / 1000000 + " ms");
}

public static void main(String[] args) {

	Random random = new Random();
	TreeList<Integer> treeListTest = new TreeList<>();
	ArrayList <Integer> arrayListTest = new ArrayList<>();
	LinkedList<Integer> linkedListTest = new LinkedList<>();
	
	System.out.println("TEST TreeList --------------\n");
	testMethod(treeListTest, random);
	System.out.println();
	
	System.out.println("TEST ArrayList --------------\n");
	testMethod(arrayListTest, random);
	System.out.println();
	
	System.out.println("TEST LinkedList --------------\n");
	testMethod(linkedListTest, random);
	
	
	
	
}


}


