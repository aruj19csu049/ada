
public class PRIM {

	public static void main(String[] args) {

        int G[][] = new int[][] { { 100, 9, 5, 2, 100 }, 
                                      { 9, 100, 100, 6, 5 }, 
                                      { 5, 100, 100, 4, 5 }, 
                                      { 2, 6, 4, 100, 4 }, 
                                      { 100, 5, 5, 4, 100 } }; 

int ver[]= {0,1,2,3,4};
int tvc=1;
int min=100;
int v=0;
int v1=0;
int tv[]={4,0,0,0,0};

while(tvc<5){
	min = G[tv[0]][0];
for(int i=0; i<tvc;i++){
    
  for(int j=0;j<5;j++){
      
if(min>G[tv[i]][j]){
v=j;
v1=tv[i];
min=G[tv[i]][j];
}
}
}

tvc++;
tv[tvc-1]=v;
System.out.println(v);
G[v][v1]=100;
G[v1][v]=100;
}
  System.out.println(" MST:");
for ( int i=0;i<tv.length;i++){
System.out.print(tv[i] + "");
}
	}

}
