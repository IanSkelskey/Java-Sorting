
public class Main {

	public static void main(String[] args) {
		//Declare Sorter Objects
		MergeSorter ms = new MergeSorter();
		HeapSorter hs = new HeapSorter();
		InsertionSorter is = new InsertionSorter();
		SelectionSorter ss = new SelectionSorter(); 
		
		//Test Merge Sort
		System.out.println("Sorting with merge sort...");
        int arr[] = { 9, 3, 1, 5, 13, 12 };
        ms.mergeSort(arr, 0, arr.length - 1);
        display(arr);
        
        //Test Heap Sort
        System.out.println("Sorting with heap sort...");
        int arr2[] = { 1, 12, 9 , 3, 10, 15 };             
        hs.heapSort(arr2);
        display(arr2);
        
        //Test Insertion Sort
        System.out.println("Sorting with insertion sort...");
        int arr3[] = {22, 21, 11, 15, 16};         
        is.insertionSort(arr3, arr3.length); 
        display(arr3); 
        
        //Test Selection Sort
        System.out.println("Sorting with selection sort...");        
        int arr4[] = {64,25,12,22,11}; 
        ss.selectionSort(arr4); 
        display(arr4); 
        
        //Test Bubble Sort
        System.out.println("Sorting with bubble sort...");  
        BubbleSorter bs = new BubbleSorter();
        int arr5[] = {6, 4, 5, 12, 2, 11, 9};    
        bs.bubbleSort(arr5, arr5.length);
        display(arr5);
		
	}

    static void display(int arr[])                 //display the array
    {  
        for (int i=0; i<arr.length; ++i) 
        {
            System.out.print(arr[i]+" ");
        } 
        System.out.println();
    } 
    
}
