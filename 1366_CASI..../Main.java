import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		
		List<Integer> arr_pow=new ArrayList<Integer>();
		int temp=0;
		int k=0;
		for(int i=0;i<12;i++){
			temp=(int)Math.pow(5,k+1);
			arr_pow.add(temp);
			k++;
		}


		List<Integer> lucky=new ArrayList<Integer>();
		int sum=0;
		//Agregar sumas unicas
		for(int n=0;n<12;n++){			
			sum=arr_pow.get(n);
			for(int i=0;i<n;i++){								
				sum+=arr_pow.get(i);
				for(int j=0;j<i;j++){
					sum+=arr_pow.get(j);
				}
				lucky.add(sum);
			}
		}


		for(int i=0;i<lucky.size();i++){
			System.out.println(lucky.get(i));			
		}
	}
}	