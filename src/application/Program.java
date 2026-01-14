package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program { 
	
	public static void main(String args[]) {
		
		String filePath = "C:\\Users\\victor.couto\\OneDrive - ALS Limited\\Desktop\\arquivo.txt";
		
		Scanner sc = null;
		
		try {
			File file = new File(filePath);
			sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
