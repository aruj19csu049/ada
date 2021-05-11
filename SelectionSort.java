import java.util.*;

public class SelectionSort {
	int c=0;
	int d=0;

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
    
     void selectionSort(int[] arr, int i, int n)
    {   c = c+1;
        
        int min = i;
        for (int j = i + 1; j < n; j++)
        {
            
            if (arr[j] < arr[min]) {
                min = j;    
            }
        }
 
        
        swap(arr, min, i);
 
        if (i + 1 < n) {
            selectionSort(arr, i + 1, n);
        }
    }
    void selectionSortd(int[] arr, int i, int n)
    {d=d+1;
        
        int min = i;
        for (int j = i + 1; j < n; j++)
        {
            
            if (arr[j] > arr[min]) {
                min = j;    
            }
        }
 
        
        swap(arr, min, i);
 
        if (i + 1 < n) {
            selectionSortd(arr, i + 1, n);
        }
    }
    
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Random rand = new Random();
     int x = 50;
     int arr[] = new int[x];
     SelectionSort ss= new SelectionSort();
     for(int i = 0; i<x; i++)
     {
    	 arr[i] = rand.nextInt(1000);
     }
     
     long startT = System.nanoTime();
     ss.selectionSort(arr,0,arr.length);
     long endT = System.nanoTime();
     double time = (endT - startT);
     System.out.println("Time taken by selection sort(ascending) is " +time+ " nano seconds.");
     
     for(int i = 0; i<x; i++) {
    	 System.out.print(arr[i] + " ");
     }
     System.out.println("\nFunction has been called " +ss.c+ " times");
     
     long startTd = System.nanoTime();
     ss.selectionSortd(arr,0,arr.length);
     long endTd = System.nanoTime();
     double timed = (endTd - startTd);
     System.out.println("\nTime taken by selection sort is(descending) " +timed+ " nano seconds.");
     
     for(int i = 0; i<x; i++) {
    	 System.out.print(arr[i] + " ");
     }
     System.out.println("\nFunction has been called " +ss.d+ " times");
}
     

}
