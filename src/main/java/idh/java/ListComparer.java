package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.apache.commons.collections4.list.TreeList;



public class ListComparer {

	TreeList<Integer> tList;
	LinkedList<Integer> nList;
	ArrayList<Integer> aList;

	public ListComparer() {
		tList = new TreeList<Integer>();
		nList = new LinkedList<Integer>();
		aList = new ArrayList<Integer>();
	}
	
	public void fillList(List<Integer> pList) {
		Random randomInt = new Random();
		long t1 = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			pList.add(randomInt.nextInt());
		}
		for(int i=0; i<10000; i++) {
			pList.add(randomInt.nextInt(10000), randomInt.nextInt());
		}
		long t2 = System.currentTimeMillis();
		long tDiff = t2-t1;
		System.out.println(tDiff);
	}
	
	public static void main(String[] args) {
		ListComparer lc = new ListComparer();
		lc.fillList(lc.nList);
		lc.fillList(lc.aList);
		lc.fillList(lc.tList);

	}
}
