package idh.java;

import org.apache.commons.collections4.list.TreeList;


import java.util.*;
import java.util.List;

public class Main {
    static TreeList<Integer> treeList = new TreeList<>();
    static LinkedList<Integer> linkedList = new LinkedList<>();
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args){
        fillList(100000, treeList);
        fillList(100000, linkedList);
        fillList(100000, arrayList);

        long startTimeTreeList = System.currentTimeMillis();
        long startTimeLinkedList = System.currentTimeMillis();
        long startTimeArrayList = System.currentTimeMillis();

        insertInToList(10000, treeList);
        insertInToList(10000, linkedList);
        insertInToList(10000, arrayList);

        long endTimeTreeList = System.currentTimeMillis();
        long endTimeLinkedList = System.currentTimeMillis();
        long endTimeArrayList = System.currentTimeMillis();

        long durationTreeList = endTimeTreeList - startTimeTreeList;
        long durationLinkedList = endTimeLinkedList - startTimeLinkedList;
        long durationArrayList = endTimeArrayList - startTimeArrayList;

        System.out.println("Dauer für das Einfügen von " + treeList.size() + " Zahlen:");
        System.out.println("TreeList: " + durationTreeList + " ms");
        System.out.println("LinkedList: " + durationLinkedList + " ms");
        System.out.println("ArrayList: " + durationArrayList + " ms");
    }



    public static void fillList(int size, List<Integer> listPlaceholder) {
        Random rand = new Random();
        for (int i = 0; i <= size; i++) {
            listPlaceholder.add(rand.nextInt());
        }
    }
    public static void insertInToList(int amount, List<Integer> listPlaceholder){
        Random rand = new Random();
        for (int i = 0; i <= amount; i++){
            listPlaceholder.add(rand.nextInt(0, listPlaceholder.size()), rand.nextInt());
        }
    }

}
