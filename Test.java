import org.apache.commons.collections4.list.TreeList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ZeitBerechnen {
    public static void main(String[] args) {
        TreeList<Integer> treeList = new TreeList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int randomNumber = random.nextInt();
            treeList.add(randomNumber);
            linkedList.add(randomNumber);
            arrayList.add(randomNumber);
        }

        long treeListStartTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            int randomNumber = random.nextInt();
            int randomIndex = random.nextInt(treeList.size());

            treeList.add(randomIndex, randomNumber);

        }

        long treeListEndTime = System.nanoTime();
        long treeListDuration = treeListEndTime - treeListStartTime;

        long linkedListStartTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            int randomNumber = random.nextInt();
            int randomIndex = random.nextInt(linkedList.size());

            linkedList.add(randomIndex, randomNumber);
        }

        long linkedListEndTime = System.nanoTime();
        long linkedListDuration = linkedListEndTime - linkedListStartTime;

        long arrayListStartTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            int randomNumber = random.nextInt();
            int randomIndex = random.nextInt(arrayList.size());

            arrayList.add(randomIndex, randomNumber);
        }

        long arrayListEndTime = System.nanoTime();
        long arrayListDuration = arrayListEndTime - arrayListStartTime;

        System.out.println("TreeList Zeit: " + treeListDuration + " ns");
        System.out.println("LinkedList Zeit: " + linkedListDuration + " ns");
        System.out.println("ArrayList Zeit: " + arrayListDuration + " ns");
    }
}

