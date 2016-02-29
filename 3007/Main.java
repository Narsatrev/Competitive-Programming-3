import java.util.*;
import java.io.*;

public class Main{
	public static String[][] tablero=new String[8][8];

/*TOOOO SLOW BUT CORRECT
	public static boolean abajoDer(int x1,int y1){
		int i=x1+1;
		int j=y1+1;
		while(i<8&&j<8){				
			if(tablero[i][j].equals("*")){
				return false;
			}
			i++;
			j++;
		}
		return true;
	}
	public static boolean arribaIzq(int x1,int y1){
		int i=x1-1;
		int j=y1-1;
		while(i>=0&&j>=0){				
			if(tablero[i][j].equals("*")){
				return false;
			}
			i--;
			j--;
		}
		return true;
	}
	public static boolean arribaDer(int x1,int y1){
		int i=x1-1;
		int j=y1+1;
		while(i>=0&&j<8){				
			if(tablero[i][j].equals("*")){
				return false;
			}
			i--;
			j++;
		}
		return true;
	}

	public static boolean abajoIzq(int x1,int y1){
		int i=x1+1;
		int j=y1-1;
		while(i<8&&j>=0){				
			if(tablero[i][j].equals("*")){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String line;
			

		for(int i=0;i<8;i++){
			line=s.nextLine();	
			for(int j=0;j<8;j++){	
				tablero[i][j]=line.charAt(j)+"";
			}
		}
		//revisar hacia abajo derecha 			
		boolean flag=true;
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){	
				if(tablero[i][j].equals("*")){
					// System.out.println("abajoIzq: "+abajoIzq(i,j)+" abajoDer: "+abajoDer(i,j)||!!arribaDer(i,j)||!arribaIzq(i,j)))
					if(!abajoIzq(i,j)||!abajoDer(i,j)||!arribaDer(i,j)||!arribaIzq(i,j)){						
						flag=false;
						break;
					}
				}
			}
			if(!flag){
				break;
			}
		}
		if(!flag){
			System.out.println("invalid");		
		}else{
			System.out.println("valid");	
		}
		
	}
}	
*/
public static int[] arr_reinas=new int[9];

public static boolean isValid(){
	for(int i = 0; i < 8; i++){
        for(int j = 0; j < 8; j++){
            if(i != j){
                if(arr_reinas[i] == arr_reinas[j] || Math.abs(arr_reinas[j] - arr_reinas[i]) == Math.abs(j - i)){                	
                    return false;
                }
            }
        }
    }
    return true;
}

public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String line;

		String[][] tablero=new String[8][8];
		
			

		for(int i=0;i<8;i++){
			line=s.nextLine();	
			for(int j=0;j<8;j++){	
				tablero[i][j]=line.charAt(j)+"";
				if(tablero[i][j].equals("*")){
					arr_reinas[j]=i;
				}
			}
		}

		if(isValid()){
			System.out.println("valid");		
		}else{
			System.out.println("invalid");	
		}

	}
}


