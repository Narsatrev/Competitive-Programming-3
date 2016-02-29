import java.util.*;
import java.io.*;
import java.text.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();	
		double x1,y1,x2,y2,dist;
		List<Double[]> dists; 
		while(n!=0){
			dists= new ArrayList<Double[]>();
			
			for(int i=0;i<n;i++){
				Double[] x = new Double[2];
				x[0]=s.nextDouble();
				x[1]=s.nextDouble();
				dists.add(x);
			}
			double min=99999999;
			for(int i=0;i<n;i++){
				x1=dists.get(i)[0];
				y1=dists.get(i)[1]; 
				for(int j=i+1;j<n;j++){
					x2=dists.get(j)[0];
					y2=dists.get(j)[1];
					dist=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
					if(dist<min){
						min=dist;
					}
					// System.out.println(" i: "+i+" j: "+j+" P1: ("+x1+","+y1+") P2: ("+x2+","+y2+")");
				}
				// System.out.println();
			}
			DecimalFormat df= new DecimalFormat("#0.0000");
			if(min<10000){
				System.out.println(df.format(min));	
			}else{
				System.out.println("INFINITY");	
			}
			
			n=s.nextInt();
		}
	
	}
}	