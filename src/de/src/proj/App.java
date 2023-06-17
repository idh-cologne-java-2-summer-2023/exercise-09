package proj;

import java.util.ArrayList;
import java.util.LinkedList;

import org.apache.commons.collections4.list.TreeList;


public class App {
	
	static TreeList<Integer> tree = new TreeList<Integer>();
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static LinkedList<Integer> link = new LinkedList<Integer>();

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 100000; i++) {
			tree.add((int) (Math.random() * 100000)+ 1);
			arr.add((int) (Math.random() * 100000)+ 1);
			link.add((int) (Math.random() * 100000)+ 1);
		}
		treeTest();
		arrayTest();
		linkedTest();
	}

	public static void treeTest() {
		int startTime = (int) System.currentTimeMillis();
		for(int i = 0; i < 1000; i++) {
			tree.set((int) (Math.random() * 100000)+ 1,(int) (Math.random() * 100000)+ 1);
		}
		int endTime = (int) System.currentTimeMillis();
		int duration = endTime - startTime;
		System.out.println("TreeList braucht: " + duration + "ms zum Ändern von 10000 Werten");
	}
	
	public static void arrayTest() {
		int startTime = (int) System.currentTimeMillis();
		for(int i = 0; i < 1000; i++) {
			arr.set((int) (Math.random() * 100000)+ 1,(int) (Math.random() * 100000)+ 1);
		}
		int endTime = (int) System.currentTimeMillis();
		int duration = endTime - startTime;
		System.out.println("ArrayList braucht: " + duration + "ms zum Ändern von 10000 Werten");
	}
	
	public static void linkedTest() {
		int startTime = (int) System.currentTimeMillis();
		for(int i = 0; i < 1000; i++) {
			link.set((int) (Math.random() * 100000)+ 1,(int) (Math.random() * 100000)+ 1);
		}
		int endTime = (int) System.currentTimeMillis();
		int duration = endTime - startTime;
		System.out.println("LinkedList braucht: " + duration + "ms zum Ändern von 10000 Werten");
	}
	
}
