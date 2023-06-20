
public class Treelist {
	import import org.apache.commons.collections4.list.TreeList;


	public class Main {
	    public static void main(String[] args) {
	        List<Integer> randomNumbers = generateRandomNumbers(100000);
	        
	        List<Integer> treeList = new TreeList<>(randomNumbers);
	        List<Integer> linkedList = new LinkedList<>(randomNumbers);
	        List<Integer> arrayList = new ArrayList<>(randomNumbers);
	        
	        long treeListInsertionTime = measureInsertionTime(treeList, 10000);
	        long linkedListInsertionTime = measureInsertionTime(linkedList, 10000);
	        long arrayListInsertionTime = measureInsertionTime(arrayList, 10000);
	        
	        System.out.println("TreeList Insertion Time: " + treeListInsertionTime + " ms");
	        System.out.println("LinkedList Insertion Time: " + linkedListInsertionTime + " ms");
	        System.out.println("ArrayList Insertion Time: " + arrayListInsertionTime + " ms");
	    }
	    
	    private static long measureInsertionTime(List<Integer> list, int numberOfInsertions) {
	        long startTime = System.currentTimeMillis();
	        
	        Random random = new Random();
	        for (int i = 0; i < numberOfInsertions; i++) {
	            int randomNumber = random.nextInt();
	            int randomIndex = random.nextInt(list.size());
	            list.add(randomIndex, randomNumber);
	        }
	        
	        long endTime = System.currentTimeMillis();
	        return endTime - startTime;
	    }
	    
	    private static List<Integer> generateRandomNumbers(int count) {
	        List<Integer> randomNumbers = new ArrayList<>(count);
	        Random random = new Random();
	        
	        for (int i = 0; i < count; i++) {
	            randomNumbers.add(random.nextInt());
	        }
	        
	        return randomNumbers;
	    }
	}

}
