package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;

import org.apache.commons.collections4.list.TreeList;

public class Task2 {
	static TreeList<Integer> TList = new TreeList<Integer>();
	static LinkedList<Integer> LList = new LinkedList<Integer>();
	static ArrayList<Integer> AList = new ArrayList<Integer>();

	public static void main(String[] args) {
		fillLists(100000);
		timeTList();
		timeLList();
		timeAList();
	}

	public static void fillLists(int amount) {
		for (int i = 0; i < amount; i++) {
			TList.add(((int) (Math.random() * amount)));
			LList.add(((int) (Math.random() * amount)));
			AList.add(((int) (Math.random() * amount)));
		}
	}

	public static void timeTList() {
		final long timeStart = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			TList.set((int) (Math.random() * 100000), (int) (Math.random() * 100000));
		}
		final long timeEnd = System.currentTimeMillis();
		System.out.println("Berechnungszeit der TreeList beträgt " + (timeEnd - timeStart) + " Millisekunden.");
	}

	public static void timeLList() {
		final long timeStart = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			LList.set((int) (Math.random() * 100000), (int) (Math.random() * 100000));
		}
		final long timeEnd = System.currentTimeMillis();
		System.out.println("Berechnungszeit der LinkedList beträgt " + (timeEnd - timeStart) + " Millisekunden.");
	}

	public static void timeAList() {
		final long timeStart = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			AList.set((int) (Math.random() * 100000), (int) (Math.random() * 100000));
		}
		final long timeEnd = System.currentTimeMillis();
		System.out.println("Berechnungszeit der ArrayList beträgt " + (timeEnd - timeStart) + " Millisekunden.");
	}
}
