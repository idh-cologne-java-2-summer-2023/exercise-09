package idh.java;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Tree<T> {

	T value;
	Set<Tree<T>> children;
	static int sum = 0;

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
		for (int i = 0; i < indent; i++) {
			System.out.print('	');
		}
		System.out.println(this.value);
		for (Tree<T> child : children) {
			child.dfs(indent + 1);
		}
	}

	public static void main(String[] args) {
		Tree<Integer> hundert = new Tree<Integer>(100);
		Tree<Integer> dreißig = new Tree<Integer>(30);
		Tree<Integer> zwölf = new Tree<Integer>(12);
		Tree<Integer> achtzehn = new Tree<Integer>(18);
		Tree<Integer> siebzig = new Tree<Integer>(70);
		Tree<Integer> fünf = new Tree<Integer>(5);
		Tree<Integer> einundzwanzig = new Tree<Integer>(21);
		Tree<Integer> vierundvierzig = new Tree<Integer>(44);

		hundert.children().add(dreißig);
		hundert.children().add(siebzig);
		siebzig.children().add(einundzwanzig);
		siebzig.children().add(fünf);
		siebzig.children().add(vierundvierzig);
		dreißig.children().add(achtzehn);
		dreißig.children().add(zwölf);

		hundert.dfs();
		hundert.wsum();
		System.out.println("Die weighted sum beträgt " + sum + ".");
	}

	public void wsum(int indent) {

		for (int i = 0; i < indent; i++) {
			sum = sum + (Integer) this.value;
		}
		for (Tree<T> child : children) {
			child.wsum(indent + 1);
		}
	}

	private void wsum() {
		wsum(0);
	}

}