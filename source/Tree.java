

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Tree<T>  {

	int value;
	Set<Tree<Integer>> children;
	String space = "";
	
	public Tree(int value) {
		this.value = value;
		this.children = new HashSet<Tree<Integer>>();
	}
	
	public Tree(int value, Collection<Tree<Integer>> children) {
		this.value = value;
		this.children = new HashSet<Tree<Integer>>(children);
	}
		
	public int get() {
		return value;
	}

	public void set(int value) {
		this.value = value;
	}

	public Set<Tree<Integer>> children() {
		return children;
	}
	
	public void dfs() {
		System.out.println(space + this.value);
		for (Tree<Integer> child: children) {
			child.space = space + " ";
			child.dfs();
		}
	}
	
	public int wsum(int hold, int depth){
		System.out.println("Depth: " + depth);
			hold = hold + (depth * value);
			System.out.println("Hold: " + hold);
			for(Tree<Integer> child: children) {
				child.wsum(hold, depth + 1);
			}
			return hold;
	}
	
	
	public static void main(String[] args) {
		
//		Tree<String> ebike = new Tree<String>("e-bike");
//		Tree<String> tandem = new Tree<String>("tandem");
//		Tree<String> bike = new Tree<String>("bike");
//		Tree<String> buggy = new Tree<String>("buggy");
//		Tree<String> wheeled_vehicle = new Tree<String>("wheeled vehicle");
//		Tree<String> babyBuggy = new Tree<String>("babyBuggy");
//
//		wheeled_vehicle.children().add(bike);
//		wheeled_vehicle.children().add(buggy);
//		bike.children().add(tandem);
//		bike.children().add(ebike);
//		buggy.children().add(babyBuggy);
//		
//		wheeled_vehicle.dfs();
		
		Tree<Integer> book = new Tree<Integer>(1);
		Tree<Integer> chapter = new Tree<Integer>(5);
		Tree<Integer> pages = new Tree<Integer>(210);
		Tree<Integer> paragraphes = new Tree<Integer>(24);
		Tree<Integer> words = new Tree<Integer>(51);
		
		book.children().add(chapter);
		chapter.children().add(paragraphes);
		chapter.children().add(pages);
		book.children().add(words);
		
		book.dfs();
		System.out.println("Weighted sum: " + book.wsum(0, 0));
		
	}

}
