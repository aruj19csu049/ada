
public class Dijkstra {

	public static void main(String[] args) {
		int G[][] = new int[][] { { 100, 3, 100, 100, 5 }, 
            {  100, 100, 8, 5,3 }, 
            { 100, 100, 100, 100, 100 }, 
            { 100, 100, 2, 100, 100 }, 
            { 100, 100, 100, 4, 100 } }; 

int ver[]= {0,1,2,3,4};
int tv[]=new int[5];
tv[0]=0;
int i=0;
int min=100;
int v=0;
int tvc=1;
int dist[]={0,100,100,100,100};

while(tvc<5){
min= G[tv[i]][0]+dist[i];
v=0;
for(int j=0; j<ver.length;j++){
if(dist[j]>G[tv[i]][j]+dist[i]) {
	dist[j]=G[tv[i]][j]+dist[i];
}
if(min>G[tv[i]][j]+dist[i]) {
	v=j;
	min=G[tv[i]][j]+dist[i];
}

	}
for(int l=0;l<ver.length;l++) {
	if(dist[v]>dist[i]+min) {
		dist[v]=dist[i]+min;
	}
}
tvc++;
tv[tvc-1]=ver[v];
i++;
}
System.out.println("MST:");
for(int n=0;n<5;n++) {
	if(tv[n]==0) {
		System.out.print("a ");
	}
	else if (tv[n]==1) {
		System.out.print("b ");
	}
	else if (tv[n]==2) {
		System.out.println("c ");
	}
	else if (tv[n]==3) {
		System.out.print("d ");
	}
	else if (tv[n]==4) {
		System.out.print("e ");
	}
}
System.out.println( "Cost: ");
for ( i=0;i<ver.length;i++){
System.out.print(dist[i] + " ");
}
}
}
