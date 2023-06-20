package main;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.list.TreeList;

public class Aufgabe2<E> extends AbstractList<E>{





	
	public static void main(String[] args) {
		  TreeList<Integer> treeList = new TreeList<Integer>();
		  LinkedList<Integer> linkedList = new LinkedList<Integer>();
		  ArrayList<Integer> arrayList = new ArrayList<Integer>();
	      
	      System.out.println("time in ms");
	  	long a = System.nanoTime() ;
	  	System.out.println(a);
	      fill(treeList);     
	      System.out.println(System.nanoTime());
	    long b =  System.nanoTime() - a;
	    System.out.println("time to fill treelist ");
	     System.out.println(TimeUnit.MILLISECONDS.convert(b, TimeUnit.NANOSECONDS));
	    
	    a = System.nanoTime() ;
	    randadd(treeList);
	    b = System.nanoTime() - a;
	    System.out.println("time to mod treelist ");
	    System.out.println(TimeUnit.MILLISECONDS.convert(b, TimeUnit.NANOSECONDS));

	      a = System.nanoTime() ;
	     fill(linkedList); 
	      b = a = System.nanoTime() - a;
	      System.out.println("time to fill Linkedlist ");
	      System.out.println(TimeUnit.MILLISECONDS.convert(b, TimeUnit.NANOSECONDS));
	  

	      a = System.nanoTime() ;
	     randadd(linkedList);
	       b = a = System.nanoTime() - a;
	       System.out.println( "time to mod Linkedlist ");
	       System.out.println(TimeUnit.MILLISECONDS.convert(b, TimeUnit.NANOSECONDS));
	       
	     
	      a = System.nanoTime() ;
	      fill(arrayList); 
	      b = a = System.nanoTime() - a;
	      System.out.println( "time to fill arraylist ");
	      System.out.println(TimeUnit.MILLISECONDS.convert(b, TimeUnit.NANOSECONDS));

	      a = System.nanoTime() ;
	      randadd(arrayList);
	      b = a = System.nanoTime() - a;
	      System.out.println( "time to mod arraylist ");
	      System.out.println(TimeUnit.MILLISECONDS.convert(b, TimeUnit.NANOSECONDS));
	      
	     
	}

	public static int getrand() {
		Random rand = new Random();
		int n = rand.nextInt(100000-1);
	return n;
	}

	public static void fill(List<Integer> a){
		for(int i = 0; i < 100000; i++) {
		//	System.out.println("filling" + i);
			a.add(i,getrand());
			}
	}

	public static void randadd(List<Integer>a ) {
		for(int i = 0; i < 10000; i++) {
			int aa = getrand();
			int aaa = getrand();
			a.set(aa,aaa);
			}
	}
		

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

