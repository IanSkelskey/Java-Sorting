/* SelectionSorter Class: Built referencing favtutor.com/blogs/sorting-algorithms-java to practice sorting algorithms.
 * 
 * Approach:
 * 			Find the minimum element in each run of the array and swap 
 * 			it with the element at the current index is compared.
 * 
 * Big-O:
 * 			O(n^2)
 * 
 * @author Ian Skelskey
 * @version 02/27/2022
 * 
 * 
*/

public class SelectionSorter {
    void selectionSort(int arr[]) 
    { 
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) 
        { 
            pos = i; 
            for (int j = i+1; j < arr.length; j++) 
           {
                if (arr[j] < arr[pos])                  //find the index of the minimum element
                {
                    pos = j;
                }
            }

            temp = arr[pos];            //swap the current element with the minimum element
            arr[pos] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
}
