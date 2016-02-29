import java.util.*;
import java.io.*;
import java.text.*;

public class Main{
	public static long fib(int n){
		long temp=0;
		long i=0;
		long j=1;
		for(int k=1;k<n;k++){
			temp=i+j;
			i=j;
			j=temp;
		}
		return j;
	}

	public static void main(String[] args){
		Scanner s= new Scanner(System.in);

		long[] fib_arr=new long[61];

		for(int i=1;i<61;i++){
			String x=(fib(i)+"");
			fib_arr[i]=Integer.parseInt(x.charAt(x.length()-1)+"");
		}
		
		
		while(s.hasNextLong()){
			long n=s.nextLong();
			int y=(int)(n%60);
			System.out.println(fib_arr[y]);
		}
	}
}	