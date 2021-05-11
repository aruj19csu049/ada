
import java.util.Scanner;

public class Knapsack {

	
	public static void main(String[] args) {
		
        int i,max_qty,n,j=0;
        int m;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no of items");  
        n=sc.nextInt(); 
        int weight[]=new int[n];
        int value[]=new int[n]; 
        System.out.println("Enter capacity of knapsack :");  
        max_qty=sc.nextInt();  
 
        System.out.print("Weights of each item:");
        for(i = 0; i < n; i++){
           weight[i] = (int)(Math.random() * 100);
        }
        for( j = 0; j < n; j++)
        System.out.print(" " +weight[j]);
 
        System.out.print("\nValues of each item:");
        for(i = 0; i < n; i++){
           value[i] = (int)(Math.random() * 1000)+100;
        }
        for(j = 0; j < n; j++)
        System.out.print(" "+value[j]);
        
        int [][] profit = new int[n+1][max_qty+1];
        int [] A= new int[max_qty+1];
        int [] B= new int[max_qty+1]; 
         for(int d=0;d<=max_qty;d++) {
        	 B[d]=0;
         }
         for(int k=0;k<n;k++) {
        	 for(int l=0;l<=max_qty;l++) {
        		 A[l]=B[l];
        	 }
        	 for(int x=weight[k];x<=max_qty;x++) {
        		 if(A[x-weight[k]]+ value[k]>A[x]) {
        			 B[x]=A[x-weight[k]]+value[k];
        			 
        		 }
        	 }
        	 for(int l=0;l<=max_qty;l++) {
        		 profit[k+1][l]=B[l];
        	 }
         }
         System.out.println();
         System.out.println("Result Table:");
         for(int y=0;y<n;y++) {
        	 for(int z=0;z<=max_qty;z++) {
        		 System.out.print(profit[y][z]+" ");
        	 }
        	 System.out.println();
         }
         int l=n;
          m=max_qty;
         int w=0;
         int total=0;
         while(l>0 && m>0) {
        	 if(profit[l][m]!= profit[l-1][m]) {
        		 System.out.println("Item added in KnapSack: "+l);
        		 w=w + weight[l-1];
        		 total=total + value[i-1];
        		 m=m-weight[l-1];
        		 l=l-1;
        	 }
        	 else {
        		 l=l-1;
        	 }
         }
         System.out.println("Total weight:" +w);
         System.out.println("Total profit:"+total);
         
	}

}
