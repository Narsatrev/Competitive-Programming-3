import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int[] arr= new int[1000005];
		int m=1000000;
		arr[0]=1;
		for(int i=1;i<1000000;i++){
			arr[i]=(arr[(int)(i-Math.sqrt(i))]%m+arr[(int)Math.log(i)]%m+arr[(int)(i*Math.sin(i)*Math.sin(i))]%m)%m;
		}
		int x=s.nextInt();

		while(x>=0){
			System.out.println(arr[x]);
			x=s.nextInt();			
		}
		
		
	}
}