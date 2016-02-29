import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n=Integer.parseInt(s.next());
		for(int m=0;m<n;m++){
			String x=s.next();
			int sum=0;
			int i,k;
			if(x.charAt(0)=='-'){
				k=1;
			}else{
				k=0;
			}
			for(i=k;i<x.length();i++){
				sum+=Character.getNumericValue(x.charAt(i));
			}
			System.out.println(sum);
			
		}
	}
}	