package de.uk.java;

import org.apache.commons.collections4.list.TreeList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Application {
	
	
	public static void main(String[] args) {
		
		List<Integer> treeList = new TreeList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> arrList = new ArrayList<Integer>();
		
		Random random = new Random();
		
		//Zufallszahlen an Listen anhängen:
		for (int i = 0;i <= 100000; i++) {	
			treeList.add(random.nextInt());
			linkedList.add(random.nextInt());
			arrList.add(random.nextInt());
		}
		
		
		//Timer TreeList:
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0;i <= 10000; i++) {
			treeList.add(random.nextInt(100000), random.nextInt()); //Zufällige Zahlen an zufälligen Stellen im Index(0-100000)
		}
		
		long endTime = System.currentTimeMillis();

		System.out.println("The TreeList took " + (endTime - startTime) + " milliseconds");
		
		
		
		//Timer LinkedList: 
		
		long startTime2 = System.currentTimeMillis();
		
		for (int i = 0;i <= 10000; i++) {
			linkedList.add(random.nextInt(100000), random.nextInt()); //Zufällige Zahlen an zufälligen Stellen im Index(0-100000)
		}
		
		long endTime2 = System.currentTimeMillis();

		System.out.println("The LinkedList took " + (endTime2 - startTime2) + " milliseconds");
		
		
		
		//Timer ArrayList: 
		
		long startTime3 = System.currentTimeMillis();
		
		for (int i = 0;i <= 10000; i++) {
			arrList.add(random.nextInt(100000), random.nextInt()); //Zufällige Zahlen an zufälligen Stellen im Index(0-100000)
		}
		
		long endTime3 = System.currentTimeMillis();

		System.out.println("The ArrayList took " + (endTime3 - startTime3) + " milliseconds");
		
	}

}
