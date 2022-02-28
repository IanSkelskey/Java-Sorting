/* BubbleSorter Class: Built referencing favtutor.com/blogs/sorting-algorithms-java to practice sorting algorithms.
 * 
 * Approach:
 * 			Keep swapping elements that are not in their right location till the array is sorted.
 * 
 * Big-O:
 * 			O (n)
 * 
 * @author Ian Skelskey
 * @version 02/27/2022
 * 
 * 
*/

public class BubbleSorter {
	void bubbleSort(int arr[], int n)
    {                                       
        if (n == 1)                     //passes are done
        {
            return;
        }

        for (int i=0; i<n-1; i++)       //iteration through unsorted elements
        {
            if (arr[i] > arr[i+1])      //check if the elements are in order
            {                           //if not, swap them
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
            
        bubbleSort(arr, n-1);           //one pass done, proceed to the next
    }
}
