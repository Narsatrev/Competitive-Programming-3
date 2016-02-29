import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		


		int[] criba= new int[1505];
		criba[0]=1;
		// int i=1;
		int k=0;

		for(int i=1;i<1000000000;i++){
			int temp=i;
			if(temp%30==0||temp%15==0||temp%6==0||temp%2==0||temp%3==0||temp%5==0||){
				if(temp%5==0){
					while(temp%5==0){
							temp=temp/5;
					}
				}
				if(temp%3==0){
					while(temp%3==0){
							temp=temp/3;
					}
				}
				if(temp%2==0){	
					while(temp%2==0){
						temp=temp/2;
					}
				}
				if(temp==1){
					System.out.println(i);
					k++;
				}
			}
		}
		System.out.println("k: "+k);

		// while(criba[1500]==0){

			
		// 	if(temp==1){
		// 		criba[i]=k;
		// 		i++;
		// 	}				
		// 	k++;			

		// }

		// int n= s.nextInt();	
		// while(n!=0){
		// 	System.out.println(criba[n-1]);
		// 	n= s.nextInt();
		// }
		
	}
}	