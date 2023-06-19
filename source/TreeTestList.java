import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class TreeTestList {
	
//	Fills an AbstractList with 100000 random numbers and adds 10000 more. 
//	Measures and prints the time it takes, to add the 10000.
	public static void listTest(AbstractList<Integer> list) {
		Random random = new Random();
		for(int i = 0; i < 100000; i++)
			list.add(i, random.nextInt());
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++)
			list.add(random.nextInt(100000), random.nextInt());
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println("Vergangene Zeit: " + timeElapsed + "ms");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeList<Integer> testTree = new TreeList<Integer>();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		LinkedList<Integer> linkList = new LinkedList<Integer>();
				
		System.out.println("TreeList:");
		listTest(testTree);
		System.out.println("ArrayList:");
		listTest(arrList);
		System.out.println("LinkedList:");
		listTest(linkList);
		
		
	}

}
