package graham.ervin.code;


import java.io.*; 
class BubbleSort {
	  
	  
	public static void bubbleSort(int[] a) {
	    boolean sorted = false;
	    int temp;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] > a[i+1]) {
	                temp = a[i];
	                a[i] = a[i+1];
	                a[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
	}

	static void printArray(int arr[], int arr_size) 
	{ 
	    for (int i = 0; i < arr_size; i++) 
	        System.out.print(arr[i] + " "); 
	    System.out.println(""); 
	} 
    /* Driver function to check for above functions*/
    public static void main (String[] args) 
    { 
        int arr[] = {23, 10, 20, 11, 12, 6, 7, 1}; 
        int n = arr.length; 
          
        bubbleSort(arr); 
          
        System.out.println("Sorted Array: "); 
        printArray(arr, n); 
    } 
} 