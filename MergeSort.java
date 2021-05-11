import java.util.*;
public class MergeSort {
     int c=0;
     int d=0;
void mergeSort(int[] array, int low, int high) {
	c=c+1;
    if (high <= low) return;

    int mid = (low+high)/2;
    mergeSort(array, low, mid);
    mergeSort(array, mid+1, high);
    merge(array, low, mid, high);
}


void merge(int[] array, int low, int mid, int high) {
    
    int leftArray[] = new int[mid - low + 1];
    int rightArray[] = new int[high - mid];

    
    for (int i = 0; i < leftArray.length; i++)
        leftArray[i] = array[low + i];
    for (int i = 0; i < rightArray.length; i++)
        rightArray[i] = array[mid + i + 1];

    
    int leftIndex = 0;
    int rightIndex = 0;

   
    for (int i = low; i < high + 1; i++) {
        
        if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
               array[i] = leftArray[leftIndex];
               leftIndex++;
            } else {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        } else if (leftIndex < leftArray.length) {
            
            array[i] = leftArray[leftIndex];
            leftIndex++;
        } else if (rightIndex < rightArray.length) {
            
            array[i] = rightArray[rightIndex];
            rightIndex++;
        }
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int x = 10;
    int arr[] = new int[x];
    for(int i = 0; i<x; i++)
    {
        arr[i] = rand.nextInt(100);
    }
    
    MergeSort ms= new MergeSort();
    ms.mergeSort(arr, 0, x-1);
    
    
long startTime = System.nanoTime();
ms.mergeSort(arr, 0, arr.length-1);
long endTime = System.nanoTime();
double time = (endTime - startTime);

for (int i = 0; i < arr.length; i++) {
   System.out.print(arr[i] + " ");
}


System.out.println("\nTime taken by merge sort(ascending) is " +time+ " ns. ");

System.out.println("Function has been called " +ms.c+ " times");
}
}