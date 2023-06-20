package javaII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

public class Application {

	static final int ITERATIONS_TO_MEASURE = 5;
	static final int RANDOM_NUMBERS = 100000;
	static final int ADDITIONAL_RANDOM_NUMBERS = 10000;

	public static void main(String[] args) {
		List<Integer> treeList = new TreeList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> arrayList = new ArrayList<Integer>();

		timeMeasureFor(treeList, "TreeList");
		timeMeasureFor(linkedList, "LinkedList");
		timeMeasureFor(arrayList, "ArrayList");
	}

	public static void timeMeasureFor(List<Integer> list, String listType) {
		System.out.println(String.format("--- Starting measurement procedure for %s ---", listType));
		Random rand = new Random();
		long[] finalTimes = new long[ITERATIONS_TO_MEASURE];

		for (int i = 0; i < ITERATIONS_TO_MEASURE; i++) {
			list.clear();
			long startMeasure = System.currentTimeMillis();

			for (int j = 0; j < RANDOM_NUMBERS; j++) {
				list.add(rand.nextInt(RANDOM_NUMBERS));
			}

			for (int j = 0; j < ADDITIONAL_RANDOM_NUMBERS; j++) {
				list.add(rand.nextInt(list.size()), rand.nextInt(ADDITIONAL_RANDOM_NUMBERS));
			}

			long endMeasure = System.currentTimeMillis();
			long finalTime = endMeasure - startMeasure;
			finalTimes[i] = finalTime;

			System.out.println(
					String.format("Time needed to process %s at Iteration %s: %sms", listType, i + 1, finalTime));
			System.out.println("List size: " + list.size());
		}

		System.out.println(String.format("Average time to process %s in %s Iterations: %sms", listType,
				ITERATIONS_TO_MEASURE, Arrays.stream(finalTimes).average().orElse(Double.NaN)));
		System.out.println("--- End of procedure ---\n");
	}
}
