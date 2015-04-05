package Sorting;

public class InsertionSort {
	/**
	 * insertionSort sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray
	 *          an unsorted array of integers
	 * @return the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		int[] output = new int[unsortedArray.length];
		int index = 0;
		while (index < unsortedArray.length) {
			int tempNumber = unsortedArray[index];
			int tempIndex = index;
			while (tempIndex > 0) {
				int tempNumber2 = output[tempIndex - 1];
				if (tempNumber2 < tempNumber) {
					break;
				} else {
					output[tempIndex] = tempNumber2;
				}
				tempIndex -= 1;
			}
			output[tempIndex] = tempNumber;
			index += 1;
		}
		return output;
	}
}
