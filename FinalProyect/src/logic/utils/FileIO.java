/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package logic.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

	private static ArrayList highScores;
	private static PrintWriter pw;
	private static Scanner sc;

	public static void init() {

		highScores = new ArrayList<String>();

	}

	public static void readFile(String path) {


		try {
			FileInputStream fis = new FileInputStream(path);
			sc = new Scanner(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (sc.hasNext()) {

			highScores.add(sc.nextLine());

		}

		sc.close();
	}
	
	
	public static void printArray() {

		for (int i = 0; i < highScores.size(); i++) {

				System.out.println(highScores.get(i));
		}

	}

	public static void WriteFile(String path) {

		try {
			FileOutputStream fos = new FileOutputStream(path);
			pw = new PrintWriter(fos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < highScores.size(); i++) {

			
			pw.write((String)highScores.get(i) + "\n");

			
		}

		pw.close();

	}

	public static void writeScore(String name, int score) {
			
		int aux2;
		boolean flag = true;
		
		for(int i = 1; i < highScores.size(); i+=2) {
			
			
			aux2 = Integer.parseInt((String) highScores.get(i));
			
			if(score > aux2) {
				
				highScores .set(i, Integer.toString(score));
				highScores .set(i - 1, name);
				flag = false;
				break;
				
			}
			
		}
		
		if(highScores.size() < 20 && flag) {
			highScores.add(name);
			highScores.add((String)Integer.toString(score));
			
		}
			
		
		WriteFile(".\\src\\Scores");
		
		
	}

	public static ArrayList getHighScores() {
		return highScores;
	}

	public static void setHighScores(ArrayList highScores) {
		FileIO.highScores = highScores;
	}
	
	

}
