import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());		
		HashMap<String,List<Integer>> cursos= new HashMap<String,List<Integer>>();
		List<List<String>> alumnos= new ArrayList<List<String>>();

		for(int m=0;m<n;m++){			
			if(m==0){
				String g=s.nextLine();
				while(s.hasNextLine()&&!g.equals("")){
					String[] vals=g.split(" ");				
					List<Integer> valores_curso=new ArrayList<Integer>();
					valores_curso.add(Integer.parseInt(vals[vals.length-2]));
					valores_curso.add(Integer.parseInt(vals[vals.length-1]));
					String nombre_curso="";
					for(int i=0;i<vals.length-2;i++){
							nombre_curso+=vals[i]+" ";
					}	
					cursos.put(nombre_curso,valores_curso);
					g=s.nextLine();
				}

				while(s.hasNextLine()){
					g=s.nextLine();
					String[] vals=g.split(" ");
					List<String> alumno_curso=new ArrayList<String>();		
					alumno_curso.add(vals[0]+" "+vals[1]);
					String curso="";
					for(int i=3;i<vals.length;i++){
						curso+=vals[i]+" ";
					}
					alumno_curso.add(curso);
					alumno_curso.add(vals[2]);
					alumnos.add(alumno_curso);								
				}
			}
			for(int i=0;i<alumnos.size();i++){
				List<String> alumno_actual=alumnos.get(i);
				int puntuacion_actual=Integer.parseInt(alumno_actual.get(2));
				int puntuacion_requerida=cursos.get(alumno_actual.get(1)).get(1);

				if(puntuacion_actual>=puntuacion_requerida){
					int puntos_otorgados=cursos.get(alumno_actual.get(1)).get(0);
					puntuacion_actual+=puntos_otorgados;
					alumnos.get(i).set(2,puntuacion_actual+"");
					System.out.println("Accepted "+alumno_actual.get(0)+" "+alumno_actual.get(2));
				}else{
					System.out.println("Refused "+alumno_actual.get(0)+" "+alumno_actual.get(2));
				}				
			}
			if(n>1){
				System.out.println();	
			}			
		}
	}
}	