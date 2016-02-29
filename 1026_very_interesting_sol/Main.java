import java.util.*;
import java.io.*;

public class Main{
	public static int R;
	public static int C;
	public static int[][] mont;
	public static int[][] explorado;

	public static int explorar(int x,int y){
		if(explorado[x][y]!=-1){
			return explorado[x][y];
		}
		int arr,abj,der,izq;
		arr=abj=der=izq=0;

		if(x!=0&&mont[x-1][y]<mont[x][y]){
			arr=explorar(x-1,y)+1;
		}
		if(x!=R-1&&mont[x+1][y]<mont[x][y]){
			abj=explorar(x+1,y)+1;
		}
		if(y!=0&&mont[x][y-1]<mont[x][y]){
			der=explorar(x,y-1)+1;
		}
		if(y!=C-1&&mont[x][y+1]<mont[x][y]){
			izq=explorar(x,y+1)+1;
		}

		return explorado[x][y]=Math.max(arr,Math.max(abj,Math.max(der,izq)));
	}

	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		for(int o=0;o<n;o++){
			String name= s.next();
			
			C=s.nextInt();
			R=s.nextInt();

			mont=new int[R][C];
			explorado=new int[R][C];
			
			for(int i=0;i<R;i++){
				for(int j=0;j<C;j++){	
					mont[i][j]=s.nextInt();
				}
			}

			for(int i=0;i<R;i++){
				for(int j=0;j<C;j++){	
					explorado[i][j]=-1;
				}
			}

			int max_surf=-1000000;

			for(int i=0;i<R;i++){
				for(int j=0;j<C;j++){	
					int surf=explorar(i,j);
					if(surf>max_surf){
						max_surf=surf;
					}
				}
			}

			System.out.println(name+": "+(max_surf+1));
			
		}
	}
}	