
public class Aufgabe2 {
	import org.apache.commons.collections4.list.TreeList;

	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Random;

	public class ListPerformance {
	    private static final int INITIAL_SIZE = 100000;
	    private static final int INSERTIONS = 10000;

	    public static void main(String[] args) {
	        List<Integer> treeList = new TreeList<>();
	        List<Integer> linkedList = new LinkedList<>();
	        List<Integer> arrayList = new ArrayList<>();

	        
	        generateRandomNumbers(treeList, INITIAL_SIZE);
	        generateRandomNumbers(linkedList, INITIAL_SIZE);
	        generateRandomNumbers(arrayList, INITIAL_SIZE);

	        
	        long treeListStartTime = System.nanoTime();
	        insertRandomNumbers(treeList, INSERTIONS);
	        long treeListEndTime = System.nanoTime();
	        long treeListDuration = treeListEndTime - treeListStartTime;

	        
	        long linkedListStartTime = System.nanoTime();
	        insertRandomNumbers(linkedList, INSERTIONS);
	        long linkedListEndTime = System.nanoTime();
	        long linkedListDuration = linkedListEndTime - linkedListStartTime;

	        
	        long arrayListStartTime = System.nanoTime();
	        insertRandomNumbers(arrayList, INSERTIONS);
	        long arrayListEndTime = System.nanoTime();
	        long arrayListDuration = arrayListEndTime - arrayListStartTime;

	        System.out.println("TreeList Einfügedauer: " + treeListDuration + " ns");
	        System.out.println("LinkedList Einfügedauer: " + linkedListDuration + " ns");
	        System.out.println("ArrayList Einfügedauer: " + arrayListDuration + " ns");
	    }

	    private static void generateRandomNumbers(List<Integer> list, int size) {
	        Random random = new Random();
	        for (int i = 0; i < size; i++) {
	            list.add(random.nextInt());
	        }
	    }

	    private static void insertRandomNumbers(List<Integer> list, int insertions) {
	        Random random = new Random();
	        for (int i = 0; i < insertions; i++) {
	            int index = random.nextInt(list.size());
	            list.add(index, random.nextInt());
	        }
	    }
	}


}
