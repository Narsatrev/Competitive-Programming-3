import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String g=s.nextLine();
		HashMap<Character,Character> map= new HashMap<Character,Character>();
		map.put('`','1');
		map.put('1','2');
		map.put('2','3');
		map.put('3','4');
		map.put('4','5');
		map.put('5','6');
		map.put('6','7');
		map.put('7','8');
		map.put('8','9');
		map.put('9','0');
		map.put('0','-');
		map.put('-','=');

		map.put('Q','W');
		map.put('W','E');
		map.put('E','R');
		map.put('R','T');
		map.put('T','Y');
		map.put('Y','U');
		map.put('U','I');
		map.put('I','O');
		map.put('O','P');
		map.put('P','[');
		map.put('[',']');
		map.put(']','\\');

		map.put('A','S');
		map.put('S','D');
		map.put('D','F');
		map.put('F','G');
		map.put('G','H');
		map.put('H','J');
		map.put('J','K');
		map.put('K','L');
		map.put('L',';');
		map.put(';','\'');

		map.put('Z','X');
		map.put('X','C');
		map.put('C','V');
		map.put('V','B');
		map.put('B','N');
		map.put('N','M');
		map.put('M',',');
		map.put(',','.');
		map.put('.','/');

		map.put(' ',' ');

		HashMap<Character,Character> map_inv= new HashMap<Character,Character>();
		for(Map.Entry<Character,Character> e: map.entrySet()){
			map_inv.put(e.getValue(),e.getKey());
		}

		for(int i=0;i<g.length();i++){
			System.out.print(map_inv.get(g.charAt(i)));
		}
	}
}	