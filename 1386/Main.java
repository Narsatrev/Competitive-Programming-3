import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int p=s.nextInt();
		int q=s.nextInt();
		int[] arrp= new int[p];
		int[] arrq= new int[q];

		int c1=0;
		int c2=0;

		for(int i=1;i<=p;i++){
			if(p%i==0){
				arrp[c1]=i;
				c1++;
			}
		}
		for(int i=1;i<=q;i++){
			if(q%i==0){
				arrq[c2]=i;
				c2++;
			}
		}
		for(int i=0;i<p;i++){
			for(int j=0;j<q;j++){
				if(arrp[i]!=0&&arrq[j]!=0){
					System.out.println(arrp[i]+" "+arrq[j]);
				}
			}
		}

	}
}	