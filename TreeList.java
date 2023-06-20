package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class Ding {
	
	static TreeList<Integer> triLisd = new TreeList<Integer>();
	static LinkedList<Integer> linkedLisd = new LinkedList<Integer>();
	static ArrayList<Integer> arrayLisd = new ArrayList<Integer>();
	
	public static void random() {
		Random random = new Random();
		
		for (int i = 0; i < 100000; i++) {
			int randomNumber = random.nextInt(10);
			
		triLisd.add(randomNumber);
		arrayLisd.add(randomNumber);
		linkedLisd.add(randomNumber);
		}
	}
	
	public static void random2() {
		Random random = new Random();
		
		for (int i = 0; i < 10000; i++) {
			int randomNumber = random.nextInt(10);
			
		triLisd.add(randomNumber);
		arrayLisd.add(randomNumber);
		linkedLisd.add(randomNumber);
		}
	}
	
	public static void treeTime() {
		final long startTree = System.currentTimeMillis();
		System.out.println(trilisd);
		double durationTree = System.currentTimeMillis() - startTree;
		System.out.println("_____________________________________");
		System.out.println("Time for the TreeList : " + durationTree + " milliseconds.");
		System.out.println("_____________________________________");
	}
	
	public static void arrayTime() {
		final long startArray = System.currentTimeMillis();
		System.out.println(treeL);
		double durationArray = System.currentTimeMillis() - startArray;
		System.out.println("_____________________________________");
		System.out.println("Time for the ArrayList : " + durationArray + " milliseconds.");
		System.out.println("_____________________________________");
	}
	
	public static void linkedTime() {
		final long startlinked = System.currentTimeMillis();
		System.out.println(treeL);
		double durationlinked = System.currentTimeMillis() - startlinked;
		System.out.println("_____________________________________");
		System.out.println("Time for the LinkedList : " + durationlinked + " milliseconds.");
		System.out.println("_____________________________________");
	}
	
	public static void main(String[] args) {
		random();
		treeTime();
		linkedTime();
		arrayTime();
		random2();
		treeTime();
		linkedTime();
		arrayTime();
		}
	}
	


