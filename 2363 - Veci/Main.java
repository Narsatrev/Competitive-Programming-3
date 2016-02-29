// Description

// Your program will be given an integer X. Find the smallest 
//number larger than X consisting of the same digits as X.
// Input specification

// The first line of input contains the integer X (1 <= X <= 999 999). 
// The first digit in X will not be a zero.
// Output specification

// Output the result on a single line. If there is no such number, output 0.
// Sample input

// 156
// Sample output

// 165
// Hint(s)
import java.util.*;
import java.io.*;
import java.text.*;

public class Main{
	public static int[] nextPermutation(int[] arr){
		int i=arr.length-1;
		while(i>0&&arr[i-1]>arr[i]){
			i--;
		}
		if(i<0){
			return arr;
		}
		int j=arr.length-1;
		while(arr[j]<=arr[i-1]){
			j--;
		}
		int temp=arr[j-1];
		arr[j-1]=arr[i];
		arr[i]=temp;

		j=arr.length-1;
		while(i<j){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}

		return arr;
	}

	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String n=s.next();
		int c=0;
		int[] arr=new int[n.length()];

		for(int i=0;i<n.length();i++){
			arr[i]=Integer.parseInt(n.charAt(i)+"");
		}
		boolean flag=true;
		while(flag){
			String x="";
			for(int i=0;i<n.length();i++){
				x+=arr[i];
			}
			int u=Integer.parseInt(x);
			x="";
			int[] arr2=nextPermutation(arr);
			for(int i=0;i<n.length();i++){
				x+=arr2[i];
			}

			int w=Integer.parseInt(x);
			System.out.println(u+" "+w);
			if(u<w){

				flag=false;
				System.out.println(w);
			}

				
		}


		
	}
}	