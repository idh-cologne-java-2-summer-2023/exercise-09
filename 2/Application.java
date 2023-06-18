import java.util.ArrayList;
import java.util.LinkedList;

import org.apache.commons.collections4.list.TreeList;

public class Application {
	
	static TreeList<Integer> t = new TreeList<Integer>();
	static ArrayList<Integer> a = new ArrayList<Integer>();
	static LinkedList<Integer> l = new LinkedList<Integer>();

	public static void main(String[] args) {
		
		for(int i = 0; i < 100000; i++) {
			t.add((int) (Math.random() * 1000)+ 1);
			a.add((int) (Math.random() * 1000)+ 1);
			l.add((int) (Math.random() * 1000)+ 1);
		}
		
		treeTest();
		arrayTest();
		linkedTest();
		
		//System.out.println(a.size());
		// Ich hab es nicht geschafft die Zahlen an zufälligen Stellen einzufügen und 
		//gleichzeitig die Liste um 10000 Zahlen zu erweitern
		
	}
	


		public static void treeTest() {
			int start = (int) System.currentTimeMillis();
			for(int i = 0; i < 10000; i++) {
				int rIndex = (int) (Math.random() * 100000)+ 1;
				t.set(rIndex,((int) (Math.random() * 1000)+ 1));
			}
			int stop = (int) System.currentTimeMillis();
			int result = stop - start;
			System.out.println("The TreeLists speed is: " + result + "ms");
		}
		
		public static void arrayTest() {
			int start = (int) System.currentTimeMillis();
			for(int i = 0; i < 10000; i++) {
				int rIndex = (int) (Math.random() * 100000)+ 1;
				a.set(rIndex,((int) (Math.random() * 1000)+ 1));
			}
			int stop = (int) System.currentTimeMillis();
			int result = stop - start;
			System.out.println("The ArrayLists speed is: " + result + "ms");
		}

		public static void linkedTest() {
			int start = (int) System.currentTimeMillis();
			for(int i = 0; i < 10000; i++) {
				int rIndex = (int) (Math.random() * 100000)+ 1;
				l.set(rIndex,((int) (Math.random() * 1000)+ 1));
			}
			int stop = (int) System.currentTimeMillis();
			int result = stop - start;
			System.out.println("The LinkedLists speed is: " + result + "ms");
		}
	
}
		
		
	