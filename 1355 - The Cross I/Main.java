import java.util.*;
import java.io.*;
import java.text.*;

public class Main{

	public final static double PI=3.141592653589793;
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		double n,r;
		DecimalFormat df= new DecimalFormat("#0.0000");		
		while(s.hasNextDouble()){

			n=s.nextDouble();	
			r=n/3;
			System.out.println(df.format((n*n)-((r*n)+(PI*r*r))));			
		}
	}
}	