package kata2;

import java.util.HashMap;

public class HashMapMostFrequent {

	/**
	 * Given an array of ints, the program finds and prints the most frequently
	 * occurring element and its number of occurrences. If there is more than
	 * one such element, any one of them may be printed. in this example 1 is
	 * the most frequent element, it appears 7 times:
	 **/
	public static void main(String[] args) {
		int[] elements = { 1, 3, 4, 1, 5, 2, 3, 6, 6, 6, 4, 1, 2, 6, 2, 3, 1, 2, 1, 5, 5, 1, 1, 5, 4 };
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		for (int index = 0; index < elements.length; index++){
			Integer frequency = frequencyMap.get(elements[index]);
			if(frequency == null)
				frequencyMap.put(elements[index], 1);
			else
				frequencyMap.put(elements[index], frequency + 1);
		}

		int number = 0;
		int times = 0;
		for (Integer key : frequencyMap.keySet())
			if (frequencyMap.get(key) > times) {
				number = key;
				times = frequencyMap.get(key);
			}

		System.out.println("The most frequent element is " + number + " and it occurs " + times + " times");
	}
}
