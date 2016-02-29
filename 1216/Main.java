import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		for(int i=0;i<x;i++){
			int n=s.nextInt();
			int[] arr= new int[n];
			for(int j=0;j<n;j++){
				arr[j]=s.nextInt();
			}

			int c=1;
			int sum=0;
			int u=0
			for(int f=0;f<n;f++){
				for(int j=0;j<n;j++){
					for(int k=u;k<c;k++){
						sum+=arr[k];
					}
				}
			}
		}
	}
}	