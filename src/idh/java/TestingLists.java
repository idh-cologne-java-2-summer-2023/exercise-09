package idh.java;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

//exercise 02 is incomplete in regards to timing and such

public class TestingLists {

	static TreeList<Integer> tree = new TreeList<Integer>();
	static LinkedList<Integer> link = new LinkedList<Integer>();
	static ArrayList<Integer> array = new ArrayList<Integer>();

	public static void randomlist() {
		Random random = new Random();

		for (int i = 0; i < 100000; i++) {
			int randomnum = random.nextInt(100000);
			tree.add(randomnum);
			link.add(randomnum);
			array.add(randomnum);
//			System.out.println("Testing Random number: " + randomnum);
		}
	}

	public static void printtree() {
		for (int randomnumber : tree) {
			System.out.println("Tree: " + randomnumber);
		}
	}

	public static void printlink() {
		for (int randomnumber : link) {
			System.out.println("Linked List: " + randomnumber);
		}
	}

	public static void printarray() {
		for (int randomnumber : array) {
			System.out.println("Array: " + randomnumber);
		}
	}

	public static void main(String[] args) {
		// adding random numbers to the lists
		randomlist();

		// output of lists without timing
		printtree();
//		printlink();
//		printarray();
	}

}
