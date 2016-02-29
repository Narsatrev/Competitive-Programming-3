import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int z=s.nextInt();
		for(int i=0;i<z;i++){
			double x=s.nextDouble();
			double y=s.nextDouble();
			double t=((3.14*(Math.pow(x,2)+Math.pow(y,2)))/100);
			System.out.println("Property "+(i+1)+": This property will begin eroding in year "+t+".");
		}
		System.out.println("END OF OUTPUT.");
	}
}	