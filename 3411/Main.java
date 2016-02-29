import java.util.*;
import java.io.*;
import java.text.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int z=s.nextInt();
		for(int i=0;i<z;i++){
			double pi=Math.acos(0)*2.0;
			double r=s.nextDouble();
			double area=(pi-2)*r*r;
			DecimalFormat df= new DecimalFormat("#0.00");
			System.out.println(df.format(area));

		}
	}
}	