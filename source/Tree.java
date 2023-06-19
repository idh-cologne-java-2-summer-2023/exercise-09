

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Tree<T>  {

	T value;
	Set<Tree<T>> children;
	String space = "";
	
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
		System.out.println(space + this.value);
		for (Tree<T> child: children) {
			child.space = space + " ";
			child.dfs();
		}
	}
	
	public int wsum(int depth) throws Exception{
		if(value instanceof Integer) {
			
			if(depth == 0)
				return 0;
			else {
				for(Tree<Integer> child: children {
					return (child.value * child.wsum(depth + 1));
				}
			}
		return 0;
		} else {
			throw new Exception();
		}
	}
	
	
	public static void main(String[] args) {
		
		Tree<String> ebike = new Tree<String>("e-bike");
		Tree<String> tandem = new Tree<String>("tandem");
		Tree<String> bike = new Tree<String>("bike");
		Tree<String> buggy = new Tree<String>("buggy");
		Tree<String> wheeled_vehicle = new Tree<String>("wheeled vehicle");
		Tree<String> babyBuggy = new Tree<String>("babyBuggy");

		wheeled_vehicle.children().add(bike);
		wheeled_vehicle.children().add(buggy);
		bike.children().add(tandem);
		bike.children().add(ebike);
		buggy.children().add(babyBuggy);
		
		wheeled_vehicle.dfs();
		
		Tree<Integer> book = new Tree<Integer>(1);
		Tree<Integer> chapter = new Tree<Integer>(5);
		Tree<Integer> pages = new Tree<Integer>(210);
		Tree<Integer> paragraphes = new Tree<Integer>(24);
		
		book.children().add(chapter);
		chapter.children().add(paragraphes);
		chapter.children().add(pages);
		
		try {
			System.out.println(book.wsum(0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
