import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class Main {
    public static void main(String[] args) {
        int initialListSize = 100000;
        int insertSize = 10000;
        List<Integer> initialList = generateRandomList(initialListSize);

        // TreeList
        List<Integer> treeList = new TreeList<>(initialList);
        long treeListDuration = measureInsertionTime(treeList, insertSize, "TreeList");

        // LinkedList
        List<Integer> linkedList = new LinkedList<>(initialList);
        long linkedListDuration = measureInsertionTime(linkedList, insertSize, "LinkedList");

        // ArrayList
        List<Integer> arrayList = new ArrayList<>(initialList);
        long arrayListDuration = measureInsertionTime(arrayList, insertSize, "ArrayList");

        System.out.println("TreeList insertion time: " + treeListDuration + " ms");
        System.out.println("LinkedList insertion time: " + linkedListDuration + " ms");
        System.out.println("ArrayList insertion time: " + arrayListDuration + " ms");
    }

    private static List<Integer> generateRandomList(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }
        return list;
    }

    private static long measureInsertionTime(List<Integer> list, int insertSize, String listType) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < insertSize; i++) {
            int index = random.nextInt(list.size());
            list.add(index, random.nextInt());
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
