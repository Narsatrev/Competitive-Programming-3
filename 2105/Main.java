import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int height=s.nextInt();
		int width=s.nextInt();
		boolean[][] scanned= new boolean[height][width];
		char[][] map= new char[height][width];
		s.nextLine();
		for(int i=0;i<height;i++){
			String line=s.nextLine();
			for(int j=0;j<width;j++){
				scanned[i][j]=false;				
				map[i][j]=line.charAt(j);
			}
		}
		int coastline=0;
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				if(map[i][j]=='-'){					
					if(j>0&&map[i][j-1]=='+'&&scanned[i][j-1]==false){						
						scanned[i][j-1]=true;
						coastline++;
					}
					if(j<width-1&&map[i][j+1]=='+'&&scanned[i][j+1]==false){
						scanned[i][j+1]=true;
						coastline++;
					}
					if(i>0&&map[i-1][j]=='+'&&scanned[i-1][j]==false){
						scanned[i-1][j]=true;
						coastline++;
					}
					if(i<height-1&&map[i+1][j]=='+'&&scanned[i+1][j]==false){
						scanned[i+1][j]=true;
						coastline++;
					}
				}
			}
		}
		System.out.println(coastline);
	}
}	