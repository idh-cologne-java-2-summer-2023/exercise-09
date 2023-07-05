package idh.java;
import org.apache.commons.collections4.list.TreeList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;



public class ListComparison {

	public static void main(String[] args) {
		
		LinkedListTest();
		TreeListTest();
		ArrayListTest();
	}		
	public static void TreeListTest() {
		
		TreeList<Integer> treelist = new TreeList <Integer>();
		Random random = new Random();
		
		for (int i = 0; i<100000; i++) {
			treelist.add(random.nextInt());
		}
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i<10000; i++) {
			int position = random.nextInt(100000);
			treelist.add(position, random.nextInt());
		}
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println("Generating TreeList took " + timeElapsed + " milliseconds.");
	}
		
	public static void LinkedListTest() {
		
		LinkedList<Integer> linked = new LinkedList <Integer>();
		Random random = new Random();
		
		for (int i = 0; i<100000; i++) {
			linked.add(random.nextInt());
		}
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i<10000; i++) {
			int position = random.nextInt(100000);
			linked.add(position, random.nextInt());
		}
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println("Generating LinkedList took " + timeElapsed + " milliseconds.");
	}
	
	public static void ArrayListTest() {
		
		ArrayList<Integer> arraylist = new ArrayList <Integer>();
		Random random = new Random();
		
		for (int i = 0; i<100000; i++) {
			arraylist.add(random.nextInt());
		}
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i<10000; i++) {
			int position = random.nextInt(100000);
			arraylist.add(position, random.nextInt());
		}
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println("Generating ArrayList took " + timeElapsed + " milliseconds.");
	}

}
