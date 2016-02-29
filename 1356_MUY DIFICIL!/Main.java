import java.util.*;
import java.io.*;

public class Main{
	public static int calcTotalVol(List<List<Integer>> tank_data){
		int vol=0;
		for(List<Integer> d: tank_data){
			vol+=(d.get(4));
		}
		return vol;
	}


	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();

		

		
		int b,h,w,d,k,water;
		for(int i=0;i<x;i++){
			Map<Integer, Integer> bl_tn = new TreeMap<Integer, Integer>();
			List<List<Integer>> tank_data= new ArrayList<List<Integer>>();
			k= s.nextInt();			
			for(int j=0;j<k;j++){
				List<Integer> tank= new ArrayList<Integer>();
				b=s.nextInt();
				h=s.nextInt();
				w=s.nextInt();
				d=s.nextInt();
				//base level=0
				tank.add(b);
				//height=1
				tank.add(h);
				//width=2
				tank.add(w);
				//depth=3;
				tank.add(d);	
				//volume=4
				tank.add(h*w*d);	
				//tank number=5
				tank.add(j);			
				tank_data.add(tank);

				bl_tn.put(b,j);

			}

			water=s.nextInt();

			if(water>calcTotalVol(tank_data)){
				System.out.println("OVERFLOW");
			}else{				
  
				ArrayList<Integer> orden_por_nivel = new ArrayList<Integer>(bl_tn.values());
				int agua_restante=water;
				int agua_temp;
				for(int j=0;j<orden_por_nivel.size();j++){
					agua_temp=tank_data.get(orden_por_nivel.get(j)).get(4);
					if(agua_restante-agua_temp>0){

					}
					-=;
				}
				System.out.println(agua_restante);
			}

			
		}

	}
}	