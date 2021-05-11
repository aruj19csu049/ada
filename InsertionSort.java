import java.util.*;

class InsertionSort {
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
 
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }

    public static void main(String args[])
    {
    	Random rand = new Random();
        InsertionSort ob = new InsertionSort();
        int x = 100;
        int arr[] = new int[x];
        for(int i = 0; i<x; i++)
        {
       	 arr[i] = rand.nextInt(1000);
        }
        
       
        
        long startT = System.nanoTime();
        ob.sort(arr);
        long endT = System.nanoTime();
        double time = (endT - startT);
        System.out.println("Time taken by insertion sort is " +time+ " ns.");
        printArray(arr);
    }
}