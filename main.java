import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Integer> ArrayList = new ArrayList<Integer>();
		LinkedList<Integer> LinkList = new LinkedList<Integer>();
		TreeList<Integer> TreeList = new TreeList<Integer>();
		
		long TimeBeforeAdd, TimeAfterAdd;
		
		Random rand = new Random();
		
		for (int i = 0; i < 100000; i++) {
			TreeList.add(rand.nextInt());
			ArrayList.add(rand.nextInt());
			LinkList.add(rand.nextInt());
		}
		
		//Zeitmessung ArrayList
		TimeBeforeAdd = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			int index = rand.nextInt(ArrayList.size());
			ArrayList.add(index, rand.nextInt());
		}
		
		TimeAfterAdd = System.currentTimeMillis();
		System.out.println("Die ArrayList benötigt " + (TimeAfterAdd - TimeBeforeAdd) + " Millisekunden zum Hinzufügen der Elemente.");
		
		
		//Zeitmessung LinkList
		TimeBeforeAdd = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			int index = rand.nextInt(LinkList.size());
			LinkList.add(index, rand.nextInt());
		}
		TimeAfterAdd = System.currentTimeMillis();
		System.out.println("Die LinkList benötigt " + (TimeAfterAdd - TimeBeforeAdd) + " Millisekunden zum Hinzufügen der Elemente.");
		

		//Zeitmessung TreeList
		TimeBeforeAdd = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			int index = rand.nextInt(TreeList.size());
			TreeList.add(index, rand.nextInt());
		}
		
		TimeAfterAdd = System.currentTimeMillis();
		System.out.println("Die TreeList benötigt " + (TimeAfterAdd - TimeBeforeAdd) + " Millisekunden zum Hinzufügen der Elemente.");
		
	}

}