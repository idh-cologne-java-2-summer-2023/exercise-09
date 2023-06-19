package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class App 
{
    public static void random_tree_list(int seed) {
        System.out.println("Tree List:");
        long startTime, endTime, duration;
        TreeList tl = new TreeList<Integer>();
        Random r = new Random(seed);

        for(int i = 0; i < 100000; i++) {
            int rand = r.nextInt();
            tl.add(rand);
        }

        System.out.println("Zufallzahlen einfügen:");
        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            int rand = r.nextInt();
            int pos = r.nextInt(100000);
            tl.add(pos, rand);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Zufallszahlen wurden in " + duration + "ms eingeführt.");
    }

    public static void random_linked_list(int seed) {
        System.out.println("LinkedList:");
        long startTime, endTime, duration;
        LinkedList ll = new LinkedList<Integer>();
        Random r = new Random(seed);

        for(int i = 0; i < 100000; i++) {
            int rand = r.nextInt();
            ll.add(rand);
        }

        System.out.println("Zufallzahlen einfügen:");
        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            int rand = r.nextInt();
            int pos = r.nextInt(100000);
            ll.add(pos, rand);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Zufallszahlen wurden in " + duration + "ms eingeführt.");
    }

    public static void random_array_list(int seed) {
        System.out.println("ArrayList:");
        long startTime, endTime, duration;
        ArrayList al = new ArrayList<Integer>();
        Random r = new Random(seed);

        for(int i = 0; i < 100000; i++) {
            int rand = r.nextInt();
            al.add(rand);
        }

        System.out.println("Zufallzahlen einfügen:");
        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            int rand = r.nextInt();
            int pos = r.nextInt(100000);
            al.add(pos, rand);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Zufallszahlen wurden in " + duration + "ms eingeführt.");
    }

    public static void main( String[] args )
    {
        // Nutzung eines Samens um die
        // Zufallszahlen möglichst
        // deterministisch zu machen.
        int seed = 1;
        random_tree_list(seed);
        random_linked_list(seed);
        random_array_list(seed);
    }
}
