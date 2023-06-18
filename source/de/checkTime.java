package de;

import org.apache.commons.collections4.list.TreeList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class checkTime {
    public static void main(String[] args) {
        List<Integer> treeList = new TreeList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
        List<Integer> arrayList = new ArrayList<Integer>();

        // Generate a list with 100,000 random numbers
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int randomNumber = random.nextInt();
            treeList.add(randomNumber);
            linkedList.add(randomNumber);
            arrayList.add(randomNumber);
        }

        // Measure the time taken for insertion in TreeList
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int randomIndex = random.nextInt(treeList.size());
            treeList.add(randomIndex, random.nextInt());
        }
        long endTime = System.currentTimeMillis();
        long treeListInsertionTime = endTime - startTime;

        // Measure the time taken for insertion in LinkedList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int randomIndex = random.nextInt(linkedList.size());
            linkedList.add(randomIndex, random.nextInt());
        }
        endTime = System.currentTimeMillis();
        long linkedListInsertionTime = endTime - startTime;

        // Measure the time taken for insertion in ArrayList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int randomIndex = random.nextInt(arrayList.size());
            arrayList.add(randomIndex, random.nextInt());
        }
        endTime = System.currentTimeMillis();
        long arrayListInsertionTime = endTime - startTime;

        // Print the insertion times
        System.out.println("TreeList insertion time: " + treeListInsertionTime + "ms");
        System.out.println("LinkedList insertion time: " + linkedListInsertionTime + "ms");
        System.out.println("ArrayList insertion time: " + arrayListInsertionTime + "ms");
    }
}

