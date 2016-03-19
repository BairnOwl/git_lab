package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		
		int n = unsortedArray.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n-i); j++) {
				temp = unsortedArray[j-1];
				unsortedArray[j-1] = unsortedArray[j];
				unsortedArray[j] = temp;
			}
		}
		return unsortedArray;
	}
}
