import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.commons.collections4.list.TreeList;

public class TestingLists {
	static TreeList<Integer> treeList = new TreeList<Integer>();
	static ArrayList<Integer> arrayList = new ArrayList<Integer>();
	static LinkedList<Integer> linkedList = new LinkedList<Integer>();

	public static void main(String[] args) {
		for(int i = 0; i < 100000; i++) {
			treeList.add(i,(int) (Math.random() * 100000));
			arrayList.add(i,(int) (Math.random() * 100000));
			linkedList.add(i,(int) (Math.random() * 100000));
		}
		
		//System.out.println(treeList.size());
		//System.out.println(arrayList.size());
		//System.out.println(linkedList.size());
		
		System.gc();
		
		long treeListTime = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			treeList.add((int) (Math.random() * 100000),(int) (Math.random() * 100000));
		}
		treeListTime = System.currentTimeMillis() - treeListTime;
		
		System.gc();
		
		long arrayListTime = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			arrayList.add((int) (Math.random() * 100000),(int) (Math.random() * 100000));
		}
		arrayListTime = System.currentTimeMillis() - arrayListTime;
		
		System.gc();
		
		long linkedListTime = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			linkedList.add((int) (Math.random() * 100000),(int) (Math.random() * 100000));
		}
		linkedListTime = System.currentTimeMillis() - linkedListTime;
		
		//System.out.println(treeList.size());
		//System.out.println(arrayList.size());
		//System.out.println(linkedList.size());
		
		System.out.println("Time for Tree List: " + treeListTime + "ms.");
		System.out.println("Time for Array List: " + arrayListTime + "ms.");
		System.out.println("Time for Linked List: " + linkedListTime + "ms.");
	}
	
	
	
}
