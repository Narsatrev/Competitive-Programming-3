import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){

		String b="6.789";
		double[] arr= new double[10000];
		int c=0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){	
				arr[c]=Double.parseDouble(i+b+j)/72;
				c++;
			}
		}
		int i=0;
		double comp=0;
		while(arr[i]!=0){
			double m=Math.round(arr[i] * 100.0) / 100.0;
			if(comp!=m){
				System.out.println(m);	
				comp=m;
			}			
			i++;
		}
				
	}
}