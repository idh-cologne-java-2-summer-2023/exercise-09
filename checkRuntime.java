import java.util.Random;

import com.sun.tools.javac.util.List;

public class checkRuntime {

	public static void main(String[] args) {
		List<Integer> treeList = new TreeList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> arrayList = new ArrayList<Integer>();

		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			int randomNumber = random.nextInt();
			treeList.add(randomNumber);
			linkedList.add(randomNumber);
			arrayList.add(randomNumber);
		}

		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			int randomIndex = random.nextInt(treeList.size());
			treeList.add(randomIndex, random.nextInt());
		}

		long end = System.currentTimeMillis();
		long treeListTime = start - end;

		start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			int randomIndex = random.nextInt(linkedList.size());
			linkedList.add(randomIndex, random.nextInt());
		}

		end = System.currentTimeMillis();
		long linkedListTime = start - end;

		start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			int randomIndex = random.nextInt(arrayList.size());
			arrayList.add(randomIndex, random.nextInt());
		}

		end = System.currentTimeMillis();
		long arrayListTime = start - end;

		System.out.println("TreeList insertion time: " + treeListTime + "ms");
		System.out.println("LinkedList insertion time: " + linkedListTime + "ms");
		System.out.println("ArrayList insertion time: " + arrayListTime + "ms");

	}

}
