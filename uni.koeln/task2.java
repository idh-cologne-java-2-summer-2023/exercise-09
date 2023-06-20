
	import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;
	public class task2 {
	
	    public static void main(String[] args) {
	        TreeList treeList = new TreeList();
	        List<Integer> linkedList = new LinkedList<Integer>();
	        List<Integer> arrayList = new ArrayList<Integer>();

	        
	        Random random = new Random();
	        for (int i = 0; i < 100000; i++) {
	            int randomNumber = random.nextInt();
	            treeList.add(randomNumber, randomNumber);
	            linkedList.add(randomNumber);
	            arrayList.add(randomNumber);
	        }

	        long treeListStartTime = System.nanoTime();
	        long linkedListStartTime = System.nanoTime();
	        long arrayListStartTime = System.nanoTime();

	       
	        for (int i = 0; i < 10000; i++) {
	            int randomNumber = random.nextInt();
	            int randomIndex = random.nextInt(treeList.size() + 1);

	            treeList.add(randomIndex, randomNumber);
	            linkedList.add(randomIndex, randomNumber);
	            arrayList.add(randomIndex, randomNumber);
	        }

	       
	        long treeListEndTime = System.nanoTime();
	        long linkedListEndTime = System.nanoTime();
	        long arrayListEndTime = System.nanoTime();

	       
	        long treeListDuration = treeListEndTime - treeListStartTime;
	        long linkedListDuration = linkedListEndTime - linkedListStartTime;
	        long arrayListDuration = arrayListEndTime - arrayListStartTime;

	        
	        System.out.println("Dauer des Einfügens in TreeList: " + treeListDuration );
	        System.out.println("Dauer des Einfügens in LinkedList: " + linkedListDuration);
	        System.out.println("Dauer des Einfügens in ArrayList: " + arrayListDuration );
	    }
	}


