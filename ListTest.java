
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class ListTest {

	public static void main(String[] args) {
		TreeList<Integer> treeList = new TreeList<Integer>();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		LinkedList<Integer> linkList = new LinkedList<Integer>();
		
		Random rand = new Random();
		
		for (int i = 0; i < 100000; i++) {
			treeList.add(rand.nextInt());
			arrList.add(rand.nextInt());
			linkList.add(rand.nextInt());
		}
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			int index = rand.nextInt(treeList.size());
			treeList.add(index, rand.nextInt());
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Die TreeList benötigt " + (endTime - startTime) + " Millisekunden.");
		
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			int index = rand.nextInt(arrList.size());
			arrList.add(index, rand.nextInt());
		}
		endTime = System.currentTimeMillis();
		System.out.println("Die ArrayList benötigt " + (endTime - startTime) + " Millisekunden.");
		

		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			int index = rand.nextInt(linkList.size());
			linkList.add(index, rand.nextInt());
		}
		endTime = System.currentTimeMillis();
		System.out.println("Die LinkedList benötigt " + (endTime - startTime) + " Millisekunden.");
		
	}

}
