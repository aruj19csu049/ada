
import java.util.*;
import java.lang.*;

public class QuickSort {
	int c=0;
	  int partition(int arr[], int low, int high) {
	    int pivot = arr[high];
	    int i = (low - 1);

	    for (int j = low; j < high; j++) {
	      if (arr[j] <= pivot) {
	        i++;
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	      }
	    }
	    int temp = arr[i + 1];
	    arr[i + 1] = arr[high];
	    arr[high] = temp;
	    return (i + 1);
	  }
	  
	  int partitiond(int arr[], int low, int high) {
		    int pivot = arr[high];
		    int i = (low - 1);

		    for (int j = low; j < high; j++) {
		      if (arr[j] >= pivot) {
		        i++;
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		      }
		    }
		    int temp = arr[i + 1];
		    arr[i + 1] = arr[high];
		    arr[high] = temp;
		    return (i + 1);
		  }

	  void quickSort(int array[], int low, int high) {
		  c=c+1;
	    if (low < high) {
	      int q = partition(array, low, high);

	      quickSort(array, low, q - 1);

	      quickSort(array, q + 1, high);
	    }
	  }

	  void quickSortd(int array[], int low, int high) {
		  c=c+1;
	    if (low < high) {
	      int q = partitiond(array, low, high);

	      quickSortd(array, low, q - 1);

	      quickSortd(array, q + 1, high);
	    }
	  }
	  public static void main(String args[]) {
		     Random rand = new Random();
		     int x = 10;
		     int arr[] = new int[x];
		     for(int i = 0; i<x; i++)
		     {
		    	 arr[i] = rand.nextInt(1000);
		     }
	    QuickSort qs = new QuickSort();
	   
	    
	    long startT = System.nanoTime();
	    qs.quickSort(arr, 0, x - 1);
	     long endT = System.nanoTime();
	     double time = (endT - startT);
	     System.out.println("Time taken by quick sort(ascending) is " +time+ " ns.");
	     
	     for(int i = 0; i<x; i++) {
	    	 System.out.print(arr[i] + " ");
	     }
	     System.out.println("\nFunction has been called " +qs.c+ " times");
	     
	     
	     
	     long startTd = System.nanoTime();
	     qs.quickSortd(arr, 0, x-1);
	     long endTd = System.nanoTime();
	     double timed = (endTd - startTd);
	     System.out.println("\nTime taken by quick sort(descending) is " +timed+ " ns.");
	     
	     for(int i = 0; i<x; i++) {
	    	 System.out.print(arr[i] + " ");
	     }
	     System.out.print("\nFunction has been called " +qs.c+ " times");
	  }
	}
