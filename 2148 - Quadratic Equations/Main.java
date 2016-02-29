import java.util.*;
import java.io.*;
import java.text.*;

public class Main{

	public final static double PI=3.141592653589793;
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int a,b,c;
		for(int i=0;i<n;i++){
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			if(b*b>4*a*c){
				System.out.println("SI");
			}else{
				System.out.println("NO");
			}
		}
	}
}	