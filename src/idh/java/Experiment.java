
package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class Experiment {

	
	public static void doExperiment(List<Integer> list) {
		Random random = new Random(0);
		for (int i = 0; i < 100000; i++)
			list.add(random.nextInt());
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			list.add(random.nextInt(list.size()), random.nextInt());
		}
		
		long endTime = System.currentTimeMillis();
		
		System.err.println(list.getClass().getCanonicalName() + " took " + String.valueOf(endTime - startTime) + " ms.");
		
	};
	
	public static void main(String[] args) {
		doExperiment(new ArrayList<Integer>());
		doExperiment(new LinkedList<Integer>());
		doExperiment(new TreeList<Integer>());
	}

}
