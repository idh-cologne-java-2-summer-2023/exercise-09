import org.apache.commons.collections4.list.TreeList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformanceTest {
	public static void main(String[] args) {
		final int initialSize = 100000;
		final int insertSize = 10000;

		// Erzeugen einer TreeList, LinkedList und ArrayList
		TreeList<Integer> treeList = new TreeList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();

		// Vor dem Einfügen messen
		long startTimeTreeList = System.currentTimeMillis();
		long startTimeLinkedList = System.currentTimeMillis();
		long startTimeArrayList = System.currentTimeMillis();

		// Erzeugen einer Liste mit 100000 Zufallszahlen
		List<Integer> randomNumbers = generateRandomList(initialSize);

		// Elemente zur TreeList, LinkedList und ArrayList hinzufügen
		treeList.addAll(randomNumbers);
		linkedList.addAll(randomNumbers);
		arrayList.addAll(randomNumbers);

		// Einfügen von 10000 weiteren Zahlen an zufälligen Stellen
		insertRandomNumbers(treeList, insertSize);
		insertRandomNumbers(linkedList, insertSize);
		insertRandomNumbers(arrayList, insertSize);

		// Nach dem Einfügen messen
		long endTimeTreeList = System.currentTimeMillis();
		long endTimeLinkedList = System.currentTimeMillis();
		long endTimeArrayList = System.currentTimeMillis();

		// Berechnen der Dauer für jede Liste
		long durationTreeList = endTimeTreeList - startTimeTreeList;
		long durationLinkedList = endTimeLinkedList - startTimeLinkedList;
		long durationArrayList = endTimeArrayList - startTimeArrayList;

		// Ergebnisse anzeigen
		System.out.println("Dauer für das Einfügen von " + insertSize + " Zahlen:");
		System.out.println("TreeList: " + durationTreeList + " ms");
		System.out.println("LinkedList: " + durationLinkedList + " ms");
		System.out.println("ArrayList: " + durationArrayList + " ms");
	}

	private static List<Integer> generateRandomList(int size) {
		Random random = new Random();
		List<Integer> list = new ArrayList<>(size);
		for (int i = 0; i < size; i++) {
			list.add(random.nextInt());
		}
		return list;
	}

	private static void insertRandomNumbers(List<Integer> list, int insertSize) {
		Random random = new Random();
		int size = list.size();
		for (int i = 0; i < insertSize; i++) {
			int index = random.nextInt(size);
			list.add(index, random.nextInt());
		}
	}
}
