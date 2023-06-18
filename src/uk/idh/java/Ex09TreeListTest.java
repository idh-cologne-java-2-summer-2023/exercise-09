package uk.idh.java;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.collections4.list.TreeList;

public class Ex09TreeListTest {
	// Verschiedene Listen angelegt: Tree, Linked, Array
	static TreeList<Integer> treeList = new TreeList<Integer>();
	static LinkedList<Integer> linkedList = new LinkedList<Integer>();
	static ArrayList<Integer> arrayList = new ArrayList<Integer>();


	public static void main(String[] args) {
		
		// Listen werden jeweils mit 100.000 random Integer-Werten befüllt
		for (int i = 0; i < 100000; i++) {
			treeList.add((int) (Math.random() * 10000));
			linkedList.add((int) (Math.random() * 10000));
			arrayList.add((int) (Math.random() * 10000));
		}
		
		test(treeList);
		test(linkedList);
		test(arrayList);
}
	
	// Methode, die testet, wie lange es dauert, 10.000 weitere Integer-Werte in eine Liste hinzuzufügen
	public static void test(List<Integer> list) {
		// Zeit vor dem Hinzufügen
		int start = (int) System.currentTimeMillis();
		
		// 10.000 neue Integer-Werte werden hinzugefügt
		for (int i = 0; i < 10000; i++) {
			list.add((int) (Math.random() * 10000), (int) (Math.random() * 100000));
		}
		
		// Zeit nach dem Hinzufügen
		int end = (int) System.currentTimeMillis();
		int time = end - start;
		System.out.println("Dauer: " + time);
	}
}

	


