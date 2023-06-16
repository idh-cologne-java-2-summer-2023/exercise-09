package de.halft;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Tree<T> {


	T value;
	Set<Tree<T>> children;
	int weightedsum = 0;
	
	public Tree(T value) {
		this.value = value;
		this.children = new HashSet<Tree<T>>();
	}
	
	public Tree(T value, Collection<Tree<T>> children) {
		this.value = value;
		this.children = new HashSet<Tree<T>>(children);
	}
		
	public T get() {
		return value;
	}

	public void set(T value) {
		this.value = value;
	}

	public Set<Tree<T>> children() {
		return children;
	}
	
	
	public void dfs() {
		dfs(0);
	}
	
	public void dfs(int indent) {
		for (int i = 0; i < indent; i++) 
			System.out.print(' ');
		System.out.println(this.value);
		for (Tree<T> child : children) {
			child.dfs(indent+1);
		}
	}
	
	public int wsum(int number) {
       
		for (Tree<T> child : children) {
			
			if(number == 0) {
				weightedsum = weightedsum + (Integer) this.value * 0;
				number++;
			}
				if(number == 1) {
				weightedsum = weightedsum + (Integer) child.value * 1;
				System.out.println("test2 " + weightedsum);
			}else if(number == 2) {
				weightedsum = weightedsum + (Integer) child.value * 2;
				System.out.println("test3 " + weightedsum);
			}

			child.wsum(number+1);
	}
		
       return weightedsum;
	}
	
	
	public static void main(String[] args) {
		
		Tree<Integer> vierundvierzig = new Tree<Integer>(44);
		Tree<Integer> zweiundzwanzig = new Tree<Integer>(22);
		Tree<Integer> zwei = new Tree<Integer>(2);
		Tree<Integer> vierhundertvierundvierzig = new Tree<Integer>(444);
		Tree<Integer> vier = new Tree<Integer>(4);
		Tree<Integer> nuuull = new Tree<Integer>(0);

		
		vier.children().add(vierundvierzig);
		vier.children().add(vierhundertvierundvierzig);
		zwei.children().add(zweiundzwanzig);
		nuuull.children().add(zwei);
		nuuull.children().add(vier);
		
		nuuull.dfs();
		System.out.println();
		System.out.println("Summe: " + nuuull.wsum(0));
	}

}
