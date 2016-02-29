import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());

		
		for(int i=0;i<n;i++){
			String[] line= s.nextLine().split(" ");
			System.out.println(line[0].substring(0,3)+line[1]+"*"+line[2]+"*"+line[3]+line[0].substring(3));
		}
	}
}	