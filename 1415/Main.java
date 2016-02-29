import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);

		List<List<Double>> arr_m= new ArrayList<List<Double>>();
		List<Double> list= new ArrayList<Double>();
		String line=s.nextLine();
		String[] x;


		
		while(!line.equals("*")){
			list= new ArrayList<Double>();			
			x=line.split(" ");

			for(int i=1;i<5;i++){
				list.add(Double.parseDouble(x[i]));
			}
			arr_m.add(list);
			line=s.nextLine();
		}

		double d1=s.nextDouble();
		double d2=s.nextDouble();
		double x1,x2,y1,y2;
		int numpunto=1;
		boolean contained=false;

		while(d1!=9999.9&&d2!=9999.9){
			int size=arr_m.size();
			contained=false;
			for(int i=0;i<size;i++){
				x1=arr_m.get(i).get(0);
				y1=arr_m.get(i).get(1);
				x2=arr_m.get(i).get(2);
				y2=arr_m.get(i).get(3);
				if((x1<d1&&d1<x2)&&(y2<d2&&d2<y1)){
					System.out.println("Point "+numpunto+" is contained in figure "+(i+1));
					contained=true;
				}
			}
			if(!contained){
				System.out.println("Point "+numpunto+" is not contained in any figure");
			}

			numpunto++;	
			d1=s.nextDouble();
			d2=s.nextDouble();
		}
	}
}	