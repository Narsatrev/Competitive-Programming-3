import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int z=s.nextInt();
		for(int i=0;i<z;i++){
			int a=s.nextInt();
			int b=s.nextInt();

			for(int j=a;j<=b+1;j++){
				if(j > 1){
					for(int k=2;k<=j;k++){
						if(j%k==0){
							break;
						}else{
							System.out.println(j);
						}
					}
				}
			}
			System.out.println();	
		}		
	}
}	

// for num in range(lower,upper + 1):
//    # prime numbers are greater than 1
//    if num > 1:
//        for i in range(2,num):
//            if (num % i) == 0:
//                break
//        else:
//            print(num)