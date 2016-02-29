import java.util.*;
import java.io.*;
import java.text.*;

public class Main{

	public final static double PI=3.141592653589793;
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n=Integer.parseInt(s.next());
		for(int i=0;i<n;i++){

			int x=Integer.parseInt(s.next());
			String str=s.next();
			int p=Integer.parseInt(s.next());
			int[] arr=new int[x];
			int c=0;

			if(str.equals("even")){				
				for(int j=0;j<x;j++){
					if(j%2!=0){
						arr[c]=j;
						c++;
					}
				}
			}else{
				for(int j=0;j<x;j++){
					if(j%2==0){
						arr[c]=j+2;
						c++;
					}						
				}
			}
			System.out.println(arr[p-1]);			
		}
	}
}	