import java.util.*;
import java.io.*;
import java.text.*;

public class Main{
	public static void main(String[] args){
		try{
		Scanner s= new Scanner(System.in);
		int t=Integer.parseInt(s.next());
		int sum=0;
		for(int i=0;i<t;i++){
			String n=s.next();			
			sum=0;
			for(int j=0;j<n.length();j++){
				sum+=Integer.parseInt(n.charAt(j)+"");
			}
			System.out.println(sum);
		}
		}catch(Exception e){
			System.out.println("Exception!");
		}
	}
}	