import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int z=s.nextInt();
		for(int i=0;i<z;i++){
			int days=s.nextInt();
			int n_cities=s.nextInt();
			int[] city_days= new int[n_cities];
			for(int j=0;j<n_cities;j++){
				city_days[j]=s.nextInt();
			}
			Arrays.sort(city_days);

			int n_vis=0;
			for(int j=0;j<n_cities;j++){
				if((days-city_days[j])>=0){
					days-=city_days[j];
					n_vis++;
				}
			}
			System.out.println(n_vis);
		}
	}
}	