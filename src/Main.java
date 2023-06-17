import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.Random;

import org.apache.commons.collections4.list.TreeList;


class Main {

	static Random r = new Random();
	static int[] ranNums = new int[100000];

	public static void main(String[] args) {
		
		TreeList<Integer> treeList = new TreeList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		for (Integer i : ranNums) {
			ranNums[i] = r.nextInt(10000);
		}

		addRanNums(treeList, 100000, true);
		addRanNums(arrayList, 100000, true);
		addRanNums(linkedList, 100000, true);
		
		long start = System.nanoTime();
		addRanNums(treeList, 10000, false);
		System.out.println("treeList took " + ((System.nanoTime() - start) / 1000000.f) + " ms to execute");
		
		start = System.nanoTime();
		addRanNums(arrayList, 10000, false);
		System.out.println("arrayList took " + ((System.nanoTime() - start) / 1000000.f) + " ms to execute");
		
		start = System.nanoTime();
		addRanNums(linkedList, 10000, false);
		System.out.println("linkedList took " + ((System.nanoTime() - start) / 1000000.f) + " ms to execute");
	

	}

	private static void addRanNums(List l, int amount, boolean first) {

		if (first) {
			for (int i = 0; i < amount; i++) {
				l.add(ranNums[i]);
			}
		} else {
			for (int i = 0; i < amount; i++) {
				l.add(ranNums[i], ranNums[i]);
			}

		}
	}

}