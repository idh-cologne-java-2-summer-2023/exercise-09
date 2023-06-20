package java2;

import org.apache.commons.collections4.list.TreeList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//Info: Aufgabe 1 und 2 wurden gemacht 
//Hier handelt es sich um Aufgabe 2 
public class Zufallszahl {
    public static void main(String[] args) {
        // Hier wird die Liste mit 100000 Zufallszahlen erstellt 
        List<Integer> initialList = randomList(100000);

        // Füge 10.000 weitere Zahlen an zufälligen Stellen ein
        List<Integer> treeList = new TreeList<Integer>(initialList);
        List<Integer> linkedList = new LinkedList<Integer>(initialList);
        List<Integer> arrayList = new ArrayList<Integer>(initialList);

        //Hier werden zufällige 10000er Zahlen eingefügt 
        long treeListTime = Time(treeList, 10000);
        long linkedListTime = Time(linkedList, 10000);
        long arrayListTime = Time(arrayList, 10000);

        //Hier wird die Zeit, die benötigt wurde ausgegeben
        System.out.println("TreeList Zeit: " + treeListTime + " ms");
        System.out.println("LinkedList Zeit: " + linkedListTime + " ms");
        System.out.println("ArrayList Zeit: " + arrayListTime + " ms");
    }

    //Hier werden zufällige Zahlen generiert
    private static List<Integer> randomList(int size) {
        List<Integer> list = new ArrayList<Integer>(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

        return list;
    }

    //Hier wird die Zeit in Millisekunden berechnet und mit start gespeichert
    private static long Time(List<Integer> list, int numInsertions) {
        long start = System.currentTimeMillis();

        Random random = new Random();
        int listSize = list.size();

        for (int i = 0; i < numInsertions; i++) {
            int randomIndex = random.nextInt(listSize);
            list.add(randomIndex, random.nextInt());
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
}
