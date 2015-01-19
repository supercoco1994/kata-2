package kata2;

import java.util.ArrayList;

public class ArrayListMostFrequent {

	/**
	 * Given an array of ints, the program finds and prints the most frequently
	 * occurring element and its number of occurrences. If there is more than
	 * one such element, any one of them may be printed. in this example 1 is
	 * the most frequent element, it appears 7 times:
	 **/
	public static void main(String[] args) {
		int[] elements = { 1, 3, 4, 1, 5, 2, 3, 6, 6, 6, 4, 1, 2, 6, 2, 3, 1, 2, 1, 5, 5, 1, 1, 5, 4 };
		ArrayList<Integer> frequencyList = new ArrayList<>();

		for (int index = 0; index < elements.length; index++){
			Integer frequency;
			try{
				frequency = frequencyList.get(elements[index]);
			}
			catch(IndexOutOfBoundsException e){
				frequency = 0;
			}
			try{
				frequencyList.add(elements[index], frequency + 1);
			}
			catch(IndexOutOfBoundsException e){
				for(int arrayListIndex = frequencyList.size(); arrayListIndex < elements[index]; arrayListIndex++)
					frequencyList.add(arrayListIndex, 0);
				frequencyList.add(elements[index], frequency + 1);
			}
		}

		int number = 0;
		int times = 0;
		for (int index = 0; index < frequencyList.size(); index++)
			if (frequencyList.get(index) > times) {
				number = index;
				times = frequencyList.get(index);
			}

		System.out.println("The most frequent element is " + number + " and it occurs " + times + " times");
	}
}
