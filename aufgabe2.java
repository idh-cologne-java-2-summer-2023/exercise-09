package de.uk.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class Application {

	public static void main(String[] args) {
		
		
		
		List<Integer> treeList = new TreeList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> arrList = new ArrayList<Integer>();

		Random random = new Random();

		
		
		for (int i = 0;i <= 100000; i++) {	
			treeList.add(random.nextInt());
			linkedList.add(random.nextInt());
			arrList.add(random.nextInt());
		}

		

		long startTimeTree = System.currentTimeMillis();

			for (int i = 0;i <= 10000; i++) {
				int insertionIndex = random.nextInt(treeList.size());
				}

		long endTimeTree = System.currentTimeMillis();

       
		

		long startTimeLinked = System.currentTimeMillis();

			for (int i = 0;i <= 10000; i++) {
				int insertionIndex = random.nextInt(linkedList.size());
			}

		long endTimeLinked = System.currentTimeMillis();

		
		

		long startTimeArray = System.currentTimeMillis();

			for (int i = 0;i <= 10000; i++) {
				int insertionIndex = random.nextInt(arrList.size());
				}

		long endTimeArray= System.currentTimeMillis();

		System.out.println("Die TreeList brauchte " + (endTimeTree - startTimeTree) + " Millisekunden");
		System.out.println("Die LinkedList brauchte " + (endTimeLinked - startTimeLinked) + " Millisekunden");
		System.out.println("Die ArrayList brauchte " + (endTimeArray - startTimeArray) + " Millisekunden");

	}

}