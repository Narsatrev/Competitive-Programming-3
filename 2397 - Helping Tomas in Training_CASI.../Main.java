import java.util.*;
import java.io.*;
import java.text.*;

public class Main{

	public static long diasEntre(Calendar startDate, Calendar endDate){
		Calendar date = (Calendar) startDate.clone();
		long m1=startDate.get((Calendar.MILLISECOND));
		long m2=endDate.get((Calendar.MILLISECOND));
		long diff=Math.abs(m1-m2)/(24*60*60*1000);
		System.out.println(m1+" "+m2+" "+diff);
	  	return diff;
	}

	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n=Integer.parseInt(s.next());
		String date1,date2;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date c1,c2;
		Calendar c11,c22;
		int y1,y2,m1,m2,d1,d2;
		int leap_years;
		for(int i=0;i<n;i++){
			leap_years=0;
			date1=s.next();
			date2=s.next();
			y1=Integer.parseInt(date1.substring(0,4));
			y2=Integer.parseInt(date2.substring(0,4));
			m1=Integer.parseInt(date1.substring(5,7));
			m2=Integer.parseInt(date2.substring(5,7));
			d1=Integer.parseInt(date1.substring(8));
			d2=Integer.parseInt(date2.substring(8));
			c11=new GregorianCalendar();
			c22=new GregorianCalendar();
			c11.set(y1,m1,d1);
			c22.set(y2,m2,d2);
			System.out.println(diasEntre(c11,c22));
		}
	}
}	