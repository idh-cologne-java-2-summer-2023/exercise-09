import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class Aufgabe2 {


	Random random = new Random();
	List<Integer> arrayList = new ArrayList<Integer>();
	List<Integer> treeList = new TreeList<Integer>();
	List<Integer> linkedList = new LinkedList<Integer>();
	
	public static void insert(List<Integer> list, int insertions) {
        Random random = new Random();
        for (int i = 0; i < insertions; i++) {
            int index = random.nextInt(list.size());
            list.add(index, random.nextInt());
        }
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> treeList = new TreeList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		for (int i = 0; i <= 100000; i++) {
			arrayList.add(random.nextInt());
			treeList.add(random.nextInt());
			linkedList.add(random.nextInt());
		}
		
		long arrayListStartTime = System.currentTimeMillis();
		insert(arrayList, 10000);
		long arrayListEndTime = System.currentTimeMillis();
		long arrayTimer = arrayListEndTime - arrayListStartTime;
		System.out.println("ArrayList needed " + arrayTimer + " ms.");
		
		long treeListStartTime = System.currentTimeMillis();
		insert(treeList, 10000);
		long treeListEndTime = System.currentTimeMillis();
		long treeTimer = treeListEndTime - treeListStartTime;
		System.out.println("TreeList needed " + treeTimer + " ms.");
		
		long linkedListStartTime = System.currentTimeMillis();
		insert(linkedList, 10000);
		long linkedListEndTime = System.currentTimeMillis();
		long linkedTimer = linkedListEndTime - linkedListStartTime;
		System.out.println("LinkedList needed " + linkedTimer + " ms.");
	}
}
