package kata2;

public class ArrayMostFrequent {

	/**
	 * Given an array of ints, the program finds and prints the most frequently
	 * occurring element and its number of occurrences. If there is more than
	 * one such element, any one of them may be printed. in this example 1 is
	 * the most frequent element, it appears 7 times:
	 **/
	public static void main(String[] args) {
		int[] elements = { 1, 3, 4, 1, 5, 2, 3, 6, 6, 6, 4, 1, 2, 6, 2, 3, 1, 2, 1, 5, 5, 1, 1, 5, 4 };
		int[] frequencies = { 0, 0, 0, 0, 0, 0 };

		for (int index = 0; index < elements.length; index++)
			frequencies[elements[index] - 1]++;

		int number = 0;
		int times = 0;
		for (int index = 0; index < frequencies.length; index++)
			if (frequencies[index] > times) {
				number = index + 1;
				times = frequencies[index];
			}

		System.out.println("The most frequent element is " + number + " and it occurs " + times + " times");
	}
}
