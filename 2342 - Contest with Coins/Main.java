import java.util.*;
import java.io.*;
import java.text.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();	
		int m=0;
		String name1,name2;
		name1=name2="";
		for(int i=0;i<n;i++){
			m=s.nextInt();
						

			int[] arr_a=new int[m];
			int[] arr_b=new int[m];

			name1=s.next();
			for(int w=0;w<m;w++){
				arr_a[w]=s.nextInt();
			}
			name2=s.next();
			for(int w=0;w<m;w++){
				arr_b[w]=s.nextInt();
			}

			int sum1,sum2,max1,max2;
			sum1=sum2=0;
			max1=max2=-99999999;

			for(int j=m;j>0;j--){
				for(int k=0;k<(m-j)+1;k++){
					for(int q=0;q<j;q++){
						sum1+=arr_a[q];					
						System.out.println("j: "+j+" k: "+k+" sum1: "+sum1);
					}
				}
				if(sum1>max1){
					max1=sum1;
				}

			}			
			for(int j=m;j>0;j--){
				for(int k=0;k<(m-j)+1;k++){
					for(int q=0;q<j;q++){
						sum2+=arr_b[q];
						System.out.println("j: "+j+" k: "+k+" sum2: "+sum2);
					}					
				}
				if(sum2>max2){
					max2=sum2;
				}
				
			}			
			if(max1==max2){
				System.out.println("Tied "+max1);		
			}else if(max1>max2){
				System.out.println(name1+" "+max1);
			}else{
				System.out.println(name2+" "+max2);
			}
			
		}
		
	}
}	