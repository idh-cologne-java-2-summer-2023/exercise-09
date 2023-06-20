package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.apache.commons.collections4.list.TreeList;

public class experiment {

	static Random gen = new Random();
	static List<Integer> tree = new TreeList<Integer>();
	static List<Integer> arr = new ArrayList<Integer>();
	static List<Integer> linked = new LinkedList<Integer>();

	public static void main(String[] args) {
		treeList();
		arrayList();
		linkedList();

	}

	public static void treeList() {
		for (int i = 0; i < 100000; i++) {
			tree.add(gen.nextInt(100000) + 1);
		}
		long timerStart = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			tree.set(gen.nextInt(tree.size()), gen.nextInt(10000) + 1);
		}
		long timerEnd = System.currentTimeMillis();
		long timeDuration = timerEnd - timerStart;
		System.out.println("Die Tree-Liste braucht: " + timeDuration + "ms um 10000 Zahlen hinzuzufügen.");
	}

	public static void arrayList() {
		for (int i = 0; i < 100000; i++) {
			arr.add(gen.nextInt(100000) + 1);
		}
		long timerStart = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			arr.set(gen.nextInt(arr.size()), gen.nextInt(10000) + 1);
		}
		long timerEnd = System.currentTimeMillis();
		long timeDuration = timerEnd - timerStart;
		System.out.println("Die Array-Liste braucht: " + timeDuration + "ms um 10000 Zahlen hinzuzufügen.");

	}

	public static void linkedList() {
		for (int i = 0; i < 100000; i++) {
			linked.add(gen.nextInt(100000) + 1);
		}
		long timerStart = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			linked.set(gen.nextInt(linked.size()), gen.nextInt(10000) + 1);
		}
		long timerEnd = System.currentTimeMillis();
		long timeDuration = timerEnd - timerStart;
		System.out.println("Die Linked-Liste braucht: " + timeDuration + "ms um 10000 Zahlen hinzuzufügen.");

	}

}
