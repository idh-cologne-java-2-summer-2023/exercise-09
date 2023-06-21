import org.apache.commons.collections4.list.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		TreeList<Integer> temp = new TreeList<Integer>();
		LinkedList<Integer> linked = new LinkedList<Integer>();
		ArrayList<Integer> arrayL = new ArrayList<Integer>();
		long start1 = System.nanoTime();
		temp.addAll(randomNumbers(100000));
		temp.addAll(438, randomNumbers(10000));
		temp.addAll(89, randomNumbers(10000));
		long end1 = System.nanoTime();
		System.out.println(end1-start1);
		long start2 = System.nanoTime();
		linked.addAll(randomNumbers(100000));
		linked.addAll(432, randomNumbers(10000));
		linked.addAll(45, randomNumbers(10000));
		long end2 = System.nanoTime();
		System.out.println(end2-start2);
		long start3 = System.nanoTime();
		arrayL.addAll(randomNumbers(100000));
		arrayL.addAll(456, randomNumbers(10000));
		arrayL.addAll(20, randomNumbers(100000));
		long end3 = System.nanoTime();
		System.out.println(end3-start3);
		

	}
	
	public static List<Integer> randomNumbers(int amount) {
		Random rd = new Random();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < amount+1; i++) {
			arr.add(rd.nextInt());
		}
		return arr;
	}

}
