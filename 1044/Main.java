import java.util.*;
import java.io.*;
import java.text.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int d1,m1,d2,m2;
		d1=s.nextInt();
		m1=s.nextInt();
		d2=s.nextInt();
		m2=s.nextInt();
		while(d1!=0&&m1!=0&&d2!=0&&m2!=0){
			// System.out.println(d1+":"+m1+":"+d2+":"+m2);
			char is_doomsday='S';

			if((d1==m1&&d2==m2)||(d1==m2&&d2==m1)){
				int init_year=1900;
				
				for(int i=1;i<=115;i++){
					Calendar c1=new GregorianCalendar();
					c1.set(init_year,m1-1,d1);
					Calendar c2=new GregorianCalendar();				
					c2.set(init_year,m2-1,d2);
					int dw1=c1.get(Calendar.DAY_OF_WEEK);
					int dw2=c2.get(Calendar.DAY_OF_WEEK);
					if(dw1!=dw2){
						is_doomsday='N';
						break;
					}					
					// System.out.println(init_year+": dw1 : "+dw1+" : dw2 : "+dw2+" c1: "+c1.getTime()+" c2: "+c2.getTime());				
					init_year++;
				}
			}else{
				// System.out.println("(d1==m1&&d2==m2)"+" : "+(d1==m1&&d2==m2));
				// System.out.println("d1 : "+d1+" : d2 : "+d2+"\n"+"m1 : "+m1+" : m2 : "+m2);				
				// System.out.println("(d1==m2&&d2==m1)"+" : "+(d1==m2&&d2==m1));
				
				is_doomsday='N';
			}

			System.out.println(is_doomsday+"");
			
			
			d1=s.nextInt();
			m1=s.nextInt();
			d2=s.nextInt();
			m2=s.nextInt();
		}
	}
}	