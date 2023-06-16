import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections.list.TreeList;

public class Application {

	public static void main(String[] args) {
		TreeList tr = new TreeList();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ArrayList<Integer>  al = new ArrayList<Integer>();
		
		Random random = new Random();
		
		for(int i = 0; i < 100000; i++) {
			int rnd = random.nextInt();
			tr.add(i, rnd);
		    ll.add(i, rnd);
		    al.add(i, rnd);
		}
		int millis = (int) System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			int rnd = random.nextInt();
			int stellen = random.nextInt(100000);

			tr.add(stellen, rnd);
		}
	 millis = (int) System.currentTimeMillis() - millis;
	 System.out.println(millis);
		
	 int millis2 = (int) System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			int rnd = random.nextInt();
			int stellen = random.nextInt(100000);
			
			ll.add(stellen, rnd);
		}
		millis2 = (int) System.currentTimeMillis() - millis2;
		System.out.println(millis2);
	
		int millis3 = (int) System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			int rnd = random.nextInt();
			int stellen = random.nextInt(100000);
			

			al.add(stellen, rnd);
		}
		millis3 = (int) System.currentTimeMillis() - millis3;
		System.out.println(millis3);
		
		

	}

}
