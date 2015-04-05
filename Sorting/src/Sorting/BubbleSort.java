package Sorting;

public class BubbleSort {
  /**
   * bubbleSort sorts an array of integers using bubble sort
   * @param unsortedArray
   *          an unsorted array of integers
   * @return the input array, sorted least to greatest
   */
  public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
    int[] out = new int[unsortedArray.length];
    int len = unsortedArray.length;
    
    for(int i = 0; i < len; i++){
      out[i] = unsortedArray[i];
    }
    
		boolean swapped = false;
		do{
		  swapped = false;
		  for(int i = 1; i<len; i++){
		    if(out[i-1] > out[i]){
		      int temp = out[i-1];
		      out[i-1] = out[i];
		      out[i] = temp;
		      swapped = true;
		    }
		  }
		}while(swapped);
		
		return out;
	}
}
