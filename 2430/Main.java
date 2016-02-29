import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		long x=s.nextLong();

		while(x!=0){
			
			long m= (long)Math.sqrt(x*2);
			if(((m*(m+1))/2)==x){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			x=s.nextLong();
		}

	}
}	