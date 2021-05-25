package Programs;

import java.util.*;

public class Q1
{
    public static final int X = 515;
 
    public static void Sort(int[] arr)
    {
        int[] times = new int[X];
        for (int i: arr) {
            times[i]++;
        }
        
        int a = 0;
        for (int i = 0; i < X; i++)
        {
            while (times[i]-- > 0) {
                arr[a++] = i;
            }
        }
    }
 
    public static void main(String[] args)
    {

        int[] arr = {76,231,187,512,45,45,187,231,512,76,187,512,
       		         76,231,187,512,45,45,187,231,512,76,187,512,
       		         76,231,187,512,45,45,187,231,512,76,187,512,
       		         76,231,187,512,45,45,187,231,512,76,187,512};

        long startTime = System.nanoTime();
        Sort(arr);
        long endTime = System.nanoTime();
        double Time = endTime - startTime;
        System.out.println();

        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("Time take to sort the array is : " + Time + " nanoseconds");
    }

}
