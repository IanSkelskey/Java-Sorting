/* InsertionSorter Class: Built referencing favtutor.com/blogs/sorting-algorithms-java to practice sorting algorithms.
 * 
 * Approach:
 * 			In every run, compare it with the predecessor. If the current element is not in the correct location, 
 * 			keep shifting the predecessor subarray till the correct index for the element is found.
 * 
 * Big-O:
 * 			O (n)
 * 
 * @author Ian Skelskey
 * @version 02/27/2022
 * 
 * 
*/
public class InsertionSorter {
    void insertionSort(int arr[], int n) 
    { 
        if (n <= 1)                             //passes are done
        {
            return; 
        }

        insertionSort( arr, n-1 );        //one element sorted, sort the remaining array
       
        int last = arr[n-1];                        //last element of the array
        int j = n-2;                                //correct index of last element of the array
       
        while (j >= 0 && arr[j] > last)                 //find the correct index of the last element
        { 
            arr[j+1] = arr[j];                          //shift section of sorted elements upwards by one element if correct index isn't found
            j--; 
        } 
        arr[j+1] = last;                            //set the last element at its correct index
    } 
}
