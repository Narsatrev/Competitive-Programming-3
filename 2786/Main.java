import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		boolean[][] tablero= new boolean[N][N];

		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				tablero[i][j]=false;				
			}
		}

		int num_coders=0;
		int a,b,c,d;
		a=b=c=d=0;

		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(tablero[i][j]==false){
					if(j>0&&tablero[i][j-1]==false){
						a=1;
						tablero[i][j-1]=true;
					}
					if(j<N-1&&tablero[i][j+1]==false){
						b=1;
						tablero[i][j+1]=true;
					}
					if(i>0&&tablero[i-1][j]==false){
						c=1;
						tablero[i-1][j]=true;
					}
					if(i<N-1&&tablero[i+1][j]==false){
						d=1;
						tablero[i+1][j]=true;
					}					
					tablero[i][j]=true;
					num_coders++;
				}				
			}
		}

		System.out.println(num_coders);
	}
}	