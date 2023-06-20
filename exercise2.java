
package de.uk.java;


	import org.apache.commons.collections4.list.TreeList;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Random;
	import java.util.ArrayList;

	public class exercise2 {
		
		
		public static void main(String[] args) {
			
			List<Integer> treeList = new TreeList<Integer>();
			List<Integer> linkedList = new LinkedList<Integer>();
			List<Integer> arrList = new ArrayList<Integer>();
			
			Random random = new Random();
			

			for (int i = 0;i <= 100000; i++) {	
				treeList.add(random.nextInt());
				linkedList.add(random.nextInt());
				arrList.add(random.nextInt());
			}
			
			
			
			
			long startTime = System.currentTimeMillis();
			
			for (int i = 0;i <= 10000; i++) {
				treeList.add(random.nextInt(100000), random.nextInt()); 
			}
			
			long endTime = System.currentTimeMillis();

			System.out.println("The TreeList took " + (endTime - startTime) + "ms");
			
			
			 
			
			long startTime2 = System.currentTimeMillis();
			
			for (int i = 0;i <= 10000; i++) {
				linkedList.add(random.nextInt(100000), random.nextInt()); 
			}
			
			long endTime2 = System.currentTimeMillis();

			System.out.println("The LinkedList took " + (endTime2 - startTime2) + "ms");
			
			
			
			
			
			long startTime3 = System.currentTimeMillis();
			
			for (int i = 0;i <= 10000; i++) {
				arrList.add(random.nextInt(100000), random.nextInt()); 
			}
			
			long endTime3 = System.currentTimeMillis();

			System.out.println("The ArrayList took " + (endTime3 - startTime3) + "ms");
			
		}

	}

}
